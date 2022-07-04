import java.util.Scanner;
public class Exerc4lista3 {
	public static void main(String args[]){
	float n_real, inteiro, fracionaria, arredondamento ; 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("dê um número real: ");
	n_real = sc.nextFloat();
	
	inteiro = (int)n_real;
	fracionaria = n_real-inteiro;
	arredondamento = (float)Math.ceil(n_real);
	
	System.out.println("A parte inteira desse número: " + inteiro);
	System.out.println("A parte fracionária desse número: " + fracionaria);
	System.out.println("O arredondamento desse número: " + arredondamento);
	
	
	}
}