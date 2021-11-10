public class Arithmetic {
    private final int a;
    private final int b;

    public Arithmetic (int a, int b){
        this.a = a;
        this.b = b;
    }
    public int amount(){

        return a + b;
    }
    public int multiplication(){

        return a * b;
    }
    public int max(){
        return Math.max(a, b);
    }
    public int min(){
        return Math.min(a, b);
    }

    public void print(){
        System.out.print("Сумма чисел: " + amount() + "\n" +"Произведение чисел:" +multiplication() +
                "\n" + "Максимальное число:" +max() + "\n" + "Минимальное число:" + min());
    }
}

