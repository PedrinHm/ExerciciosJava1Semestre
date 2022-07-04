import java.util.Scanner;
public class Exerc6{
	public static void main(String args[]){
		float milhas, pes, jardas, polegadas;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com a medida em pes: ");
		pes = sc.nextFloat();
		polegadas = pes*12;
		jardas = pes/3;
		milhas = jardas/1760;
		
		System.out.println("resultado em podelagas " + polegadas);
		System.out.println("resultado em jardas: " + jardas);
		System.out.println("resultado em milhas " + milhas);
		
		
	}
}