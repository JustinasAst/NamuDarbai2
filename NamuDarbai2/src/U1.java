import java.util.Scanner;

public class U1 {
 public static void main(String[] args) {
	 Scanner klavetura = new Scanner(System.in);
	 System.out.println("iveskite sakini is 6 zodziu");
	
	String sakinys;
	
	 sakinys = klavetura.nextLine();
	 
	
	String[] sakinysParts = sakinys.split(" ");
	String firstWord = sakinysParts[0];
	sakinysParts[0] = sakinysParts[sakinysParts.length - 1];
	sakinysParts[sakinysParts.length - 1] = firstWord;
	System.out.println("Sukeisti zodziai: " + String.join(" ", sakinysParts));
	
	
	String secondWord = sakinysParts[1];
	sakinysParts[1] = sakinysParts[sakinysParts.length - 2];
	sakinysParts[sakinysParts.length - 2] = secondWord;
	System.out.println("Sukeisti zodziai: " + String.join(" ", sakinysParts));
	
	String thirdWord = sakinysParts[2];
	sakinysParts[2] = sakinysParts[sakinysParts.length - 3];
	sakinysParts[sakinysParts.length - 3] = thirdWord;
	System.out.println("Sukeisti zodziai: " + String.join(" ", sakinysParts));
	
	}


 
}


