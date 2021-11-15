public class IndividualBusinessman extends Client {

    @Override
    protected void put(double amountToPut) {

        double maxTaxAmount = amountToPut - ((amountToPut * 1.01) - amountToPut);
        double minTaxAmount = amountToPut - ((amountToPut * 1.005) - amountToPut);

        if (amountToPut < 1000 && amountToPut > 0) {
            System.out.println("Пришла сумма: +" + amountToPut + " Руб.");
            super.put(maxTaxAmount);
        } else if (amountToPut >= 1000) {
            System.out.println("Пришла сумма: +" + amountToPut + " Руб.");
            super.put(minTaxAmount);
        }
    }
}
