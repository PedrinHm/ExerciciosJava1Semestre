//pronto:) 
import java.util.Scanner;
public class Exerc1Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String nome;
	int idade=0;
	
	System.out.printf("\nIdade  \tCategoria \n05 a 10 \tInfantil \n11 a 15 \tJuvenil \n16 a 20 \tJunior \n21 a 25 \tProfissional \nEscreva o nome do atleta e sua idade:");
	nome = sc.nextLine();
	idade = sc.nextInt();
	if(idade<5){
		System.out.println("O atleta é muito novo, não pertence a nenhuma categoria.");
	}
	else if((idade>=5)&&(idade<11)){
		System.out.printf("\nO atleta "+nome+" pertence a categoria infantil.");
	}
	else if(idade<=15){
		System.out.printf("\nO atleta "+nome+" pertence a categoria juvenil.");
	}
	else if(idade<=20){
		System.out.printf("\nO atleta "+nome+" pertence a categoria junior.");
	}
	else if(idade<=25){
		System.out.printf("\nO atleta "+nome+" pertence a categoria profissional.");
	}
	else{
		System.out.println("O atleta não pertence a nenhuma categoria.");
	}
}
}