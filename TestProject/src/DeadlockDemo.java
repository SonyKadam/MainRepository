class Division {
   String str1 = "cse";  // resource 1
   String str2 = "geek"; // resource 2

   void div1() { // compute str1 + str2
      synchronized(str1) { // acquire a lock on str1
         System.out.println("Thread1 : Acquired lock on str1");
         try {
            Thread.sleep(100);
         } catch(Exception e) { }
         synchronized(str2) { // acquire a lock on str2
            System.out.println("Thread1 : Acquired lock on str2");
            String str = str1 + str2;
            System.out.println(str1 + "+" + str2 + " = " + str);
         }
      }
   }

   void div2() { // computes str2 + str1
      synchronized(str2) { // acquire a lock on str2
         System.out.println("Thread2 : Acquired lock on str2");
         try {
            Thread.sleep(100);
         } catch(Exception e) { }
         synchronized(str1) { // acquire a lock on str1
            System.out.println("Thread2 : Acquired lock on str1");
            String str = str2 + str1;
            System.out.println(str2 + "+" + str1 + " = " + str);
         }
      }
   }
}

public class DeadlockDemo {
   public static void main(String args[]) {
      final Division dv = new Division();

      /* instantiate a Thread object to call div1() method */
      Thread dh1 = new Thread() {
         public void run() {
            dv.div1();
         }
      };

      /* instantiate another Thread object to call div2() method */
      Thread dh2 = new Thread() {
         public void run() {
            dv.div2();
         }
      };

      dh1.start();
      dh2.start();
   }
}