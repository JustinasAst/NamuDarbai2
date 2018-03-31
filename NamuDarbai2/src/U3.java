import java.util.Scanner;

public class U3 {
	public static void main(String[] args) {
	Scanner klv = new Scanner(System.in);
	System.out.println("Iveskite 10 kartu skaiciu nuo 1 iki 10 ");
   int [] mas = new int[10];
   for(int i = 0; i < mas.length; i++) {
	   int sk = klv.nextInt(10)+1;
	   mas[sk]++;
   }
		for(int i = 1; i < mas.length; i++) {
			System.out.println(i + " skaicius " + "pasikartojo " + mas[i] + " kartu");
		}
	}

}
