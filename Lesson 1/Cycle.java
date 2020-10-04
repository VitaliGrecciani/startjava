public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int  value = 6; 
		while ( value >= -6) {
			System.out.println("Result" +  value);
			 value -= 2;
		}

		 value = 10;
		int summ = 0;
		do {
			if (value % 2 != 0) {
				summ += value;
			}
			value++;
		} while(value != 20);
		System.out.println("Sum = " + summ);
	}
}