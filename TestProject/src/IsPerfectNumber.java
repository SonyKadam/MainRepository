
public class IsPerfectNumber {
	
	/**
	 * This method will check whether number is perfect or not. 	
	 * @param number - number which needs to be checked.
	 */
	public void isPerfectNumber(int number) {

		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}

	}

	/**
	 * This method will check whether number is Armstrong number or not.
	 * @param number - number which needs to be checked.
	 * @return - true if number is Armstrong else false.
	 */
	public boolean isArmstrongNumber(int number) {
		int tmp = number;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;
		int div = 0;
		while (tmp > 0) {
			div = tmp % 10;
			int temp = 1;
			for (int i = 0; i < noOfDigits; i++) {
				temp *= div;
			}
			sum += temp;
			tmp = tmp / 10;
		}
		if (number == sum) {
			System.out.println("Aemstrong Number : " + number);
			return true;
		} else {
			return false;
		}
	}

	public static void main(String a[]) {
		IsPerfectNumber ipn = new IsPerfectNumber();
		for (int i = 100; i < 1000; i++) {
			ipn.isArmstrongNumber(i);
		}
		
		//create an object by passing in a name and age:
		MyDeadlock variable1 = new MyDeadlock("Mary", 32);

		MyDeadlock variable2;

		// Both variable2 and variable1 now both name the same object
		variable2 = variable1; 

		/*this also changes variable1, since variable 2 and variable1
		   name the same exact object: */

		variable2.set("Jack", 22);

		System.out.println(variable1);
	}

}
