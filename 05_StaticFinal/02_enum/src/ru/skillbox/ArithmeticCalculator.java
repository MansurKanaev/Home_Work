package ru.skillbox;

public class ArithmeticCalculator {
    public  int X;
    public  int Y;

    public ArithmeticCalculator(int x, int y) {
      this.X = x;
      this.Y = y;
    }
    public   int  calculateAdd(){
        return X + Y;
    }
    public int calculateSubtract(){
        return X - Y;
    }
    public int calculateMultiply(){

        return X * Y;
    }
    public int getX(){
        return X;
    }
    public  int getY(){
        return Y;
    }
    public void  Print(){
        System.out.print("Переменная X = " + getX() + "\n" +
                "Переменная Y = " +  getY() +"\n" +
                Operation.ADD + " = " + calculateAdd() + "\n" +
                Operation.SUBTRACT + " = " + calculateSubtract() + "\n" +
                Operation.MULTIPLY + " = " + calculateMultiply());
    }
}
