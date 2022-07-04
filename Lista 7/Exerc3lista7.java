import java.util.Scanner;
public class Exerc3lista7 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i, idade, mediaidade=0, quanta=0,quanti=0;
	float altura, mediaaltura=0;
	
	for (i = 1 ;i <46; i++){
		System.out.printf("Digite a idade e a altura do aluno n°&d:",i);
		idade = sc.nextInt();
		altura = sc.nextFloat();
		
		if (altura>1.70)
			mediaidade = mediaidade + idade;
		    quanta++;
		if (idade>20)
			mediaaltura = (float)mediaaltura + altura;
		    quanti++;
	}
    mediaidade = mediaidade/quanti;
	mediaaltura = (float)mediaaltura/quanta;
	
	System.out.printf("\nA média de idade dos alunos com mais de 1,70 é: %d \nA média de altura dos alunos com mais de 20 anos é: %f \nQuantidade de alunos: %d",mediaidade, mediaaltura,i);
	}
}