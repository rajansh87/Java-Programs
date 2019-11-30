public class Table2 extends Thread {

     public void run() {
         for (int i = 1; i <=10; i++) {
             int n = 2;
             int result = n * i;
             System.out.print(n+"*"+i+"="+result+"\n");
         }
     }


    public static void main(String[] args) throws InterruptedException {

        Table2  t2=new Table2();
        t2.start();

        }

}