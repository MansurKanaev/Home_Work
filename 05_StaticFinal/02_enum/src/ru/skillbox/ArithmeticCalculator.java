package ru.skillbox;

public class ArithmeticCalculator {
    public  int x;
    public  int y;

    public ArithmeticCalculator(int x, int y) {
      this.x = x;
      this.y = y;
    }
    public   int  calculateAdd(){
        return x + y;
    }
    public int calculateSubtract(){
        return x - y;
    }
    public int calculateMultiply(){

        return x * y;
    }
    public int getX(){
        return x;
    }
    public  int getY(){
        return y;
    }
    public void  Print(){
        System.out.print("Переменная X = " + getX() + "\n" +
                "Переменная Y = " +  getY() +"\n" +
                Operation.ADD + " = " + calculateAdd() + "\n" +
                Operation.SUBTRACT + " = " + calculateSubtract() + "\n" +
                Operation.MULTIPLY + " = " + calculateMultiply());
    }
}
