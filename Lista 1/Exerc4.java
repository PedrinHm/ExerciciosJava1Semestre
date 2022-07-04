import java.util.Scanner;
public class Exerc4{
	public static void main(String args[]){
		float nota1, nota2, nota3, mediaa, peso1, peso2, peso3, mediap;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a primeira nota?" );
		nota1 = sc.nextFloat();
		System.out.println("Qual a segunda nota?" );
		nota2 = sc.nextFloat();
		System.out.println("Qual a terceira nota?" );
		nota3 = sc.nextFloat();
		mediaa = (nota1 + nota2 + nota3)/3;
		System.out.println("A media e: " + mediaa);

		
		System.out.println("Qual a primeira nota?" );
		nota1 = sc.nextFloat();
		System.out.println("qual o peso da primeira nota?");
		peso1 = sc.nextFloat();
		System.out.println("Qual a segunda nota?" );
		nota2 = sc.nextFloat();
		System.out.println("qual o peso da segunda nota?");
		peso2 = sc.nextFloat();
		System.out.println("Qual a terceira nota?" );
		nota3 = sc.nextFloat();
		System.out.println("qual o peso da terceira nota?");
		peso3 = sc.nextFloat();
		mediap = (nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
		System.out.println("A media ponderada e: " + mediap);
	}

}
//pronto e funcionando
	