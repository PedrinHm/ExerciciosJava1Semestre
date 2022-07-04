import java.util.Scanner;
public class Exerc6lista2 {
	public static void main(String args[]){
	double numero, quadrado, cubo, rquadrado, rcubo;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dê um número: ");
	numero = sc.nextFloat();
	
	quadrado = Math.pow(numero, 2);
	cubo = Math.pow(numero, 3);
	rquadrado = Math.sqrt(numero);
	rcubo = Math.cbrt(numero);
	
	System.out.println("O número elevado ao quadrado: " + quadrado);
	System.out.println("O número elevado ao cubo: " + cubo);
	System.out.println("A raiz quadrada do número: " + rquadrado);
	System.out.println("A raiz cubica do número: " + rcubo);
	
	}
}
