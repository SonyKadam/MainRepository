
class Range {
   /* method is not synchronized.
    * context switch can occur at any point within the method body.
    * More than one thread can be inside the method at any point.
    */
	synchronized void display(int low, int high) {
      System.out.println("Display between " + low + " and " + high);
      for(int i = low; i <= high; i++) {
         System.out.print(i + " ");
      }
      System.out.println();
   }
}

/* Helper class to print the range */
class Helper extends Thread {
   Range r;
   int low, high;
   Helper(Range r_obj, int low_limit, int high_limit) {
      r = r_obj;
      low = low_limit; high = high_limit;
   }
   public void run() {
      r.display(low, high);
   }
}

public class SyncProblemDemo {
   public static void main(String args[]) {
      /* we create one object to print different ranges */
      Range obj = new Range();
      /* create a thread to print between 1 to 10 */
      Helper th1 = new Helper(obj, 1, 10);
      /* create another thread to print between 51 to 60 */
      Helper th2 = new Helper(obj, 51, 60);
      th1.start();
      th2.start();
   }
}
