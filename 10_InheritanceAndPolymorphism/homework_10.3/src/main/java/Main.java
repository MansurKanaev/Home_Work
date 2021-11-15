public class Main {
    public static void main(String[] args) {
        PhysicalPerson physicalPerson = new PhysicalPerson();
        LegalPerson legalPerson = new LegalPerson();
        IndividualBusinessman individualBusinessman = new IndividualBusinessman();

        // Снятие и пополнение без процента
        physicalPerson.take(50);
        physicalPerson.put(100);
        physicalPerson.take(50);
        physicalPerson.take(200);
        physicalPerson.getAmount();
        System.out.println();

        // снятие с 1% ставкой пополнение без процента
        legalPerson.take(50);
        legalPerson.put(100);
        legalPerson.take(50);
        legalPerson.take(200);
        legalPerson.getAmount();
        System.out.println();

        // пополнение с процентом снятие без процента
        individualBusinessman.take(50);
        individualBusinessman.put(100);
        individualBusinessman.put(1000);
        individualBusinessman.getAmount();
    }
}
