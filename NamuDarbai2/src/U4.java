import java.util.Scanner;

     public class U4 {
	public static void main(String[] args) {
		System.out.println("Irasykite asmens koda:");
		Scanner klv = new Scanner(System.in);
		String asmensKodas = klv.nextLine();

		if (asmensKodas.length()==11) {
		
		String lytiesNr = asmensKodas.substring(0, 1);
		
		String metai = asmensKodas.substring(1, 3);
		String menesiai = asmensKodas.substring(3, 5);
		String dienos = asmensKodas.substring(5, 7);
		if(lytiesNr.equals("3") || lytiesNr.equals("4")) {
			System.out.print("19");
		}else {
			System.out.print("20");
		}
		System.out.println( metai + "-" + menesiai + "-" + dienos);

		switch (lytiesNr) {
		case "5": 
			System.out.print("Vyras"); 	
		    break;	    
		case "6": 
			System.out.print("Moteris"); 	
		    break;
		
		case "4": 
			System.out.print("Moteris"); 	
		    break;
		case "3":
			System.out.println("Vyras");
		}
		
		}else {
			System.out.println("Asmens kodas blogas");
		}
	}
	
}	
     	
	
     



		
	
     
     