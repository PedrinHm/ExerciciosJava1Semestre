import java.util.Scanner;
public class Exer2{
	public static void main(String args[]){
		int a, b, c, d, e, soma;
		float divisao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite três números");
		a = sc.nextInt;
		b = sc.nextInt;
		c = sc.nextInt;
		soma = a + b + c;
		System.out.println("a soma é: " + soma);
		
		System.out.println("Digite dois números: ");
		d = sc.nextInt();
		e = sc.nextInt();
		divisao = d/e;
		System.out.println("Resultado da divisão: " + divisao);
	}
}

