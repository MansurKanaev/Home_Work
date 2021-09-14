public class Printer {
     private static String queue;
     private int amountPage;
     private int pendingPagesCount;
     private int totalAmountPage ;

     public void append(String nameDoc){
         append(nameDoc, "");
     }
     public void append(String nameDoc, String textDoc){
         append(nameDoc, textDoc, 0);
     }
     public void append(String nameDoc, String texDoc, int amountPage){
         queue ="";
         queue = queue + "\n" + "Имя документа: " + nameDoc + "\n" + "Текст документа: "
                 + texDoc + "\n" + "Количество страниц: " + amountPage;

     }
     public void clear(){
         queue = "";
         pendingPagesCount = 0;
     }
     public void print(){
         if (queue.isEmpty()){
             System.out.println("Очередь очищена");
         }else {
             System.out.println(queue);
             System.out.println("Количество страниц в очереди: " + getPendingPagesCount());
             System.out.println("Печать документа!");
             System.out.println("Общее количество распечатанных страниц: " + getTotalAmountPage());

         }
     }
     public int getPendingPagesCount(){
         pendingPagesCount = pendingPagesCount + amountPage ;
         return  pendingPagesCount;
     }
     public int getTotalAmountPage(){
         totalAmountPage = totalAmountPage + amountPage;
         return totalAmountPage;
     }
}
