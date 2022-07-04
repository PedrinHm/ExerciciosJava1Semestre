//pronto:) 
import java.util.Scanner;
public class Exerc4Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float nota1, nota2, nota3, media, exame;
	
    System.out.printf("\nEscreva as três notas do aluno: ");
	nota1 = sc.nextFloat();
	nota2 = sc.nextFloat();
	nota3 = sc.nextFloat();
	media = (nota1+nota2+nota3)/3;
	
	if((media>=0)&&(media<3)){
		System.out.println("O aluno foi reprovado");
	}
	else if(media<7){
		System.out.println("O aluno deve fazer o exame");
		System.out.println("Digite a nota do exame: ");
		exame = sc.nextFloat();
		if(exame>5.9){
			System.out.println("Aluno aprovado com a nota do exame.");
		}
		else{
			System.out.println("Aluno reprovado.");
		}
	}
	else if((media>6.9)&&(media<10.1)){
		System.out.println("Aluno aprovado.");
	}
	
	}
}