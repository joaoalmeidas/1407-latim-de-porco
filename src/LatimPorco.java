import java.util.Scanner;

public class LatimPorco {

	public static void main(String[] args) {
		
		String frase;
		String fraseLatimPorco = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a sua frase:");
		frase = input.nextLine();
		
		fraseLatimPorco += frase.split(" ");
		System.out.println(fraseLatimPorco);
		
	}
	
	public static String traduzLatimPorco(String a){
		
		return a.substring(1) + a.charAt(0) + "ay";
		
	}

}
