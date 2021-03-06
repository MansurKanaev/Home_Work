public class Printer {
     private static String queue;
     private int amountPage;
     private int pendingPagesCount;
     private int totalAmountPage ;
     private int a;

     public void append(String nameDoc){
         append(nameDoc, "");
     }
     public void append(String nameDoc, String textDoc){
         append(nameDoc, textDoc, 0);
     }
     public void append(String nameDoc, String texDoc, int amountPage){
         totalAmountPage = totalAmountPage + amountPage ;
         pendingPagesCount = pendingPagesCount + amountPage;
         queue ="";
         queue = queue + "\n" + "Имя документа: " + nameDoc + "\n" + "Текст документа: "
                 + texDoc + "\n" + "Количество страниц: " + amountPage;
         for (a = 0; amountPage >= 0; amountPage = amountPage - 1){
             System.out.println("Количество страниц в очереди: " + amountPage);

         }
         System.out.println("Очередь очищена");

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
             System.out.println("Общее количество распечатанных страниц: " + getTotalAmountPage());
             System.out.println("Общее количество страниц: " + getPendingPagesCount());

         }
     }
    public int getPendingPagesCount() {
        return pendingPagesCount;

    }
    public int getTotalAmountPage(){
        return totalAmountPage;
    }
}
