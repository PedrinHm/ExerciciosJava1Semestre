import java.util.Scanner;
public class Exerc1Lista5 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float port, mat, infor, conhecg, media;
	String nome;

	System.out.printf("\nEscreva o nome do aluno. \nEm seguida escreva as quatro notas do aluno \n(ordem: Português, Matemática, Informática e Conhecimentos Gerais): \n ");
	nome = sc.nextLine();
	port = sc.nextFloat();
	mat = sc.nextFloat();
	infor = sc.nextFloat();
	conhecg = sc.nextFloat();
	
	media = (port+mat+infor+conhecg)/4;
	
	if (port<=5 || mat<=5 || infor<=5 || conhecg<=5 || media<=6){
		System.out.println("Candidato reprovado.");
	}
	else{
		System.out.println("Candidato aprovado");
	}
	System.out.println("Nome: "+nome);
	System.out.println("nota em Português: "+port);
	System.out.println("nota em Matemática: "+mat);
	System.out.println("nota em Informática: "+infor);
	System.out.println("nota em Conhecimentos Gerais: "+conhecg);
	System.out.println("media: "+media);
	
	
	}
	
}