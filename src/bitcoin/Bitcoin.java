
package bitcoin;
public class Bitcoin {

   

   
    public static void main(String[] args) throws InterruptedException {
       //simple miner
       start();
    }
    
       public  static void start() {
            System.out.println("Welcome to miner Erfan");
            for (double i =0 ; i<= 12.0;i+=0.000001) {

                try{   Thread.sleep(10000);
                  }catch(InterruptedException e){
                   System.out.println(e.getMessage());
                  }
            System.out.format("%f satoshi\n", i);
         }
               
       }
}
