public class Arithmetic {
    private int a;
    private int b;

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
        if (a > b)
            return a;
        else return b;
    }
    public int min(){
        if (a < b)
            return a;
        else return b;
    }


    public void print(){
        System.out.print("Сумма чисел: " + amount() + "\n" +"Произведение чисел:" +multiplication() +
                "\n" + "Максимальное число:" +max() + "\n" + "Минимальное число:" + min());
    }
}

