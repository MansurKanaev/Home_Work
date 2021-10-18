import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

    public static void main(String[] args) {

    }

    public static int calculateSalarySum(String text) {
       String result = text.replaceAll("[^0-9,]","");
       int salaryAmount = 0;
       String[] salary;
       salary = result.split(",");
       if(result.isEmpty()){
           return 0;
       }
       for(String s : salary){
           salaryAmount += Integer.parseInt(s);
       }
        return salaryAmount;
    }
}