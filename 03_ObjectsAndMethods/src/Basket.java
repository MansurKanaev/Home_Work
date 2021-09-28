public class Basket {

    private static int count = 0;
    private static double totalPrice = 0; // 1ая статистическая переменная общая стоимость всех товаров
    private static int totalCount = 0; // 2ая статистическая переменная  количесвто всех товаров
    private double totalWeight = 0; // общий вес товаров
    private static double averagePrice = 0; // средняя цена товара в корзине
    private static double averageCount = 0; // средняя стоимость корзины
    private String items = "";
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
    // статистический метод который увеличивет значения переменных при добавлении в корзину новых товаров
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
            System.out.println("ошибка, превышен лимит! ");
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. - " + price + " р.- " + weight + " г.";
        totalPrice  = totalPrice + price * count;
        totalWeight = totalWeight + weight * count;
        totalCount = totalCount  + count;
        // формула отношение общей стоимости всех корзин к общему количеству всех товаров
        averagePrice = totalPrice / totalCount;
        // формула отношение общей стоимости всех корзин к количеству корзин
        averageCount = totalPrice / Basket.count;


    }
    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
        averagePrice =0;
        averageCount= 0;
    }
    // Статистический метод  возвращающий отношение общей стоимости всех корзин к общему количеству всех товаров
    public static double getAveragePrice(){
        return averagePrice;
    }
    public static   double getAverageCount(){
        return  averageCount;
    }
    public static int getCount() {
        return count;
    }
    public static int getTotalCount(){
        return totalCount;
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
                System.out.println(
                        "Общая цена всех товаров: " + getTotalPrice() + " р." + "\n" +
                        "Общий вес всех товаров: " + getTotalWeightPrice() + " г." + "\n" +
                        "Общее количество всех товаров: " + getTotalCount() + " шт." +"\n" +
                        "Средняя цена товара в  корзине: " + getAveragePrice() + " р." + "\n" +
                        "Средняя стоимость корзины: " + getAverageCount() + " р.");
                        System.out.println();

            }

    }
}
