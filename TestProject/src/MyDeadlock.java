public class MyDeadlock {
	
	String name;
	Integer age;
	
	public MyDeadlock(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	
	public void set(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Name :- " + name + " Age :- "+ age;
		
	}
	
	public MyDeadlock(){
		
	}
	 public int reverseNumber(int number){
         
	        int reverse = 0;
	        while(number != 0){
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	            System.out.println("..."+reverse);
	            System.out.println("***"+number);
	        }
	        return reverse;
	    }
	     
	    public static void main(String a[]){
	    	MyDeadlock nr = new MyDeadlock();
	        System.out.println("Result: "+nr.reverseNumber(17868));
	    }
}
// 
//    String str1 = "Java";
//    String str2 = "UNIX";
//     
//    Thread trd1 = new Thread("My Thread 1"){
//        public void run(){
//            while(true){
//                synchronized(str1){
//                    synchronized(str2){
//                        System.out.println(str1 + str2);
//                        try {
//							wait();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//                    }
//                }
//            }
//        }
//    };
//     
//    Thread trd2 = new Thread("My Thread 2"){
//        public void run(){
//            while(true){
//                synchronized(str2){
//                    synchronized(str1){
//                        System.out.println(str2 + str1);
//                        
//                    }
//                }
//            }
//        }
//    };
//     
//    public static void main(String a[]){
//        MyDeadlock mdl = new MyDeadlock();
//        mdl.trd1.start();
//        mdl.trd2.start();
//    }
//}
