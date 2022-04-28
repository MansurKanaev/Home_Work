
public class Main {

    public static void main(String[] args) {

    }

    public static int calculateSalarySum(String text) {
        String result = text.replaceAll("[^0-9,]", "");
        int salaryAmount = 0;
        String[] salary = result.split(",");

        if (result.isEmpty()) {
            return 0;
        }
        for (String s : salary) {
            salaryAmount += Integer.parseInt(s);
        }
        System.out.println(salaryAmount);
        return salaryAmount;
    }
}




