import java.util.Scanner;

public class LatimPorco {

	public static void main(String[] args) {
		
		String frase;
		//String fraseLatimPorco = "";
		String[] tokens;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a sua frase:");
		frase = input.nextLine();
		frase = frase.toLowerCase();
		if(frase.contains(".")) {
			frase.replace(".", "");
		}
		
		System.out.println("Frase original:");
		
		System.out.println(frase.substring(0, 1).toUpperCase() + frase.substring(1) + ".");
		
		System.out.printf("%nFrase traduzida para Latim Porco:%n");
		
		imprimeLatimPorco(frase);	

		
	}
	
	public static void imprimeLatimPorco(String a){
		
		String[] tokens = a.split(" ");
		
		for(int i = 0; i < tokens.length; i++) {
			
			//System.out.printf(tokens[i].substring(1) + tokens[i].charAt(0) + "ay");
			
			if(i == 0) {
				
				System.out.printf((tokens[i].substring(1) + tokens[i].charAt(0) + "ay").substring(0, 1).toUpperCase() +
						(tokens[i].substring(2) + tokens[i].charAt(0) + "ay"));
				
			}else {
				
				System.out.printf(tokens[i].substring(1) + tokens[i].charAt(0) + "ay");
				
			}
			
			if(i == tokens.length - 1) {
				
				System.out.printf(".");
				
			}else {
				
				System.out.printf(" ");
				
			}
			
		}
		
		
	}

}


