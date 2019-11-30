public class Table3 extends Thread {

     public void run() {
         for (int i = 1; i <=10; i++) {
             int n = 3;
             int result = n * i;
             System.out.print(n+"*"+i+"="+result+"\n");
         }
     }


    public static void main(String[] args) throws InterruptedException {

        Table3  t3=new Table3();
        t3.start();

        }

}