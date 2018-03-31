import java.util.Random;
import java.util.Scanner;

public class U2 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scr = new Scanner(System.in);
		String [] produktai = {"duona", "suris", "jogurtas", "ketcupas", "sviestas"};
		String darzove;
		
		
		System.out.println("Iveskite darzoves pavadinima");
		darzove = scr.nextLine();
		System.out.println(darzove + "labai skanu su " + produktai[new Random().nextInt(produktai.length)]);
	
	}

}
