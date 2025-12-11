package Skillbuilders;

public class Reverse {

	public static void main(String[] args) {
		int[] countdown = new int[10];


		for (int i=0; i<10; i++) {
			countdown[i]= 10-i;
		}
		System.out.println("Countdown:");
		
		for (int i=0; i<10; i++) {
			System.out.println(countdown[i]);
		}
		

	}

}

