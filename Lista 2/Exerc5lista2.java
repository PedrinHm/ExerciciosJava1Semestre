import java.util.Scanner;
public class Exerc5lista2 {
	public static void main(String args[]){
	double base, expoente, resultado;
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Dê a base: ");
	base = sc.nextFloat();
	System.out.println("Dê o expoente: ");
	expoente = sc.nextFloat();
		
	resultado = Math.pow(base, expoente);
		
	System.out.println("resultado: " + resultado);
		
		}

}
