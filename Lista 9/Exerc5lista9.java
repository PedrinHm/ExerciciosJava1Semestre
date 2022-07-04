import java.util.Scanner;
public class Exerc5lista9 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i, j, idade, quantmenor18=0;
	float peso, altura, mediaaltura=0, maisde80=0, mediaidade;
	String time;
	
	for(i=1;i<3;i++){
		System.out.printf("\nDigite o nome do time: ");
        time = sc.next();
		mediaidade=0;
		for(j=1;j<12;j++){
			System.out.printf("\nTime "+time+" \nDigite a idade do jogador %d: ",j);
			 idade = sc.nextInt();
			System.out.printf("Digite o peso do jogador %d: ",j);
			 peso = sc.nextFloat();
			System.out.printf("Digite a altura do jogador %d: ",j);
			 altura = sc.nextFloat();
			 mediaidade = mediaidade + idade;
			 mediaaltura =mediaaltura + altura;
			  if(idade<18)
				quantmenor18++;
			  if(peso>80)
				maisde80++;
		}
		mediaidade = (float)(mediaidade/11);
		System.out.printf("A média de idade do time "+time+" é: %f",mediaidade);
	}
	maisde80=(float)((maisde80*100)/22);
	mediaaltura = (float)(mediaaltura/22);
	System.out.printf("\nO número de jogadores com menos de 18 anos é: %d \nA /Média de altura de todos os jogadores do campeonato é: %f \nA porcentagem de jogadores com mais de 80Kg é: %f ",quantmenor18,mediaaltura,maisde80);
	}	
}
	