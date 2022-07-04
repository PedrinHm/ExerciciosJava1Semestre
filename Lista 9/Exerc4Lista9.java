import java.util.Scanner;
public class Exerc4lista9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x, qnt, i;
		float result = 0, fracao, numerador, denominador;
		
		System.out.println("Digite um valor: ");
		x = sc.nextInt();
		System.out.println("Digite o número de termos da série: ");
		qnt = sc.nextInt();
		for (i = 1; i <= qnt ; i++){
			if (i % 2 == 0)
				numerador = (int)(Math.pow(x,i + 1));
			else
				numerador = (int)(- Math.pow(x,i + 1));
			if (i == 1 || i % 6 == 1)
				denominador = 1;
			else 
				if (i == 2 || i % 6 == 0 || i % 6 == 2)
					denominador = 2;
				else 
					if (i == 3 || i == 5 || i % 6 == 3 || i % 6 == 5)
						denominador = 6;
					else 
						denominador = 24;
			fracao = (float)(numerador / denominador);
			result += fracao;
		}
		System.out.println("Resultado: " + result);
	}
}