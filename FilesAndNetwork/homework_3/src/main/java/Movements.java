import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Movements {
    private double income;
    private double expense;
    private int key;
    private final HashMap<Integer, Double> amountExpenses = new HashMap<>();
    private final HashMap<Integer, Double> amountIncome = new HashMap<>();
    private final HashMap<Integer, String> nameOperations = new HashMap<>();


    public Movements(String pathMovementsCsv) {
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(pathMovementsCsv));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            String line = null;
            try {
                assert file != null;
                line = file.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line == null) {
                break;
            }
            String[] words = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            if (key > 0) {
                String nameOperation = words[5].substring(16, 70).trim();
                double amountMoneyExpenses = Double.parseDouble(words[7]
                        .replace("\"", "").replace(",", "."));
                double amountMoneyIncome = Double.parseDouble(words[6]
                        .replace("\"", "").replace(",", "."));
                if (amountMoneyExpenses == 0) {
                    amountIncome.put(key, amountMoneyIncome);
                } else {
                    amountExpenses.put(key, amountMoneyExpenses);
                }
                nameOperations.put(key, nameOperation);
            }
            key++;
        }
        for (Map.Entry<Integer, Double> money : amountIncome.entrySet()) {
            income += money.getValue();
        }
        for (Map.Entry<Integer, Double> money : amountExpenses.entrySet()) {
            expense += money.getValue();
        }
    }

    public double getExpenseSum() {
        return expense;
    }

    public double getIncomeSum() {
        return income;
    }

    public void getListExpenses() {
        for (Map.Entry<Integer, Double> l : amountExpenses.entrySet()) {
            String listExpenses = nameOperations.get(l.getKey())
                    .replaceAll("[\\\\/\\d_>]", " ")
                    .replaceAll("\\s{2,}", " ").trim();
            System.out.println(listExpenses + " " + l.getValue() + " руб.");
        }
    }

    public void getListIncome() {
        for (Map.Entry<Integer, Double> l : amountIncome.entrySet()) {
            String listIncome = nameOperations.get(l.getKey())
                    .replaceAll("[\\\\/\\d_>]", " ")
                    .replaceAll("\\s{2,}", " ").trim();
            System.out.println(listIncome + " " + l.getValue() + " руб.");
        }
    }
}
