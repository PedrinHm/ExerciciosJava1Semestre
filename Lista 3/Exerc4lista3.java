import java.util.Scanner;
public class Exerc4lista3 {
	public static void main(String args[]){
	float n_real, inteiro, fracionaria, arredondamento ; 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("d� um n�mero real: ");
	n_real = sc.nextFloat();
	
	inteiro = (int)n_real;
	fracionaria = n_real-inteiro;
	arredondamento = (float)Math.ceil(n_real);
	
	System.out.println("A parte inteira desse n�mero: " + inteiro);
	System.out.println("A parte fracion�ria desse n�mero: " + fracionaria);
	System.out.println("O arredondamento desse n�mero: " + arredondamento);
	
	
	}
}