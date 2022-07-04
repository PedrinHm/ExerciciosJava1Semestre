import java.util.Scanner;
public class Exerc4lista7 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int  i, diarias;
	float valor=0, total=0;
	String nome;
	
	for (i = 1; i <16; i++){
		System.out.printf("\nTabela de diárias \nNúmero de diárias \tMenor que 15 dias \tR$ 4,00 \n\nNúmero de diárias \tigual a 15 dias \tR$ 3,60 \nNúmero de diárias \tMaior que 15 dias \tR$ 3,00 \nDigite o nome do cliente e o total de diárias: ");
		nome = sc.next();
		diarias = sc.nextInt();
		
		if(diarias<15){
			valor = (float)diarias*54;
			System.out.println("O cliente "+nome+" ficou ospedado "+diarias+" dias e deve pagar: "+valor);
			total +=valor;
		}
		else if(diarias>15){
 			valor = (float)diarias*53;
			System.out.println("O cliente "+nome+" ficou ospedado "+diarias+" dias e deve pagar: "+valor);
			total +=valor;
		}
		else{
			valor = 804;
			System.out.println("O cliente "+nome+" ficou ospedado "+diarias+" dias e deve pagar: "+valor);
			total +=valor;
		}	
	}
	System.out.println("Total arrecadado pelo hotel: "+total);
	}
}