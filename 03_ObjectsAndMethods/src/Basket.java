public class Basket {

    private static int count = 0;
    private String items = "";
    private double totalPrice = 0;
    private double totalWeight = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket( int limit){
            this();
            this.limit = limit;
        }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;


    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price, double weight) {
        add(name, price, count, weight);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;


        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price + " р.- " + weight + " г.";

        totalPrice = (totalPrice + price * count);
        totalWeight= (totalWeight + weight * count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight =0;
    }

    public int getTotalPrice() {
        return (int) totalPrice;
    }
    public int getTotalWeightPrice(){
        return (int) totalWeight;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title){
            System.out.println(title);

            if (items.isEmpty()) {
                System.out.println("Корзина пуста");
            } else {
                System.out.println(items);
                System.out.println("Общая сумма товаров:" + getTotalPrice()+"р.");
                System.out.println("Общий вес товаров:"+ getTotalWeightPrice()+"г.");
            }

    }
}