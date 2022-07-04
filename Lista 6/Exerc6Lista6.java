//pronto
import java.util.Scanner;
public class Exerc6Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int dia1, dia2, mes1, mes2, ano1, ano2;
	
	System.out.printf("informe a primeira data na ordem dia, mês e ano: ");
	dia1 = sc.nextInt();
	mes1 = sc.nextInt();
	ano1 = sc.nextInt();
	System.out.printf("informe a segunda data na ordem dia, mês e ano: ");
	dia2 = sc.nextInt();
	mes2 = sc.nextInt();
	ano2 = sc.nextInt();
	if ((ano1>ano2)||((ano1==ano2)&&(mes1>mes2))||(ano1==ano2)&&(mes1==mes2)&&(dia1>dia2)){
		System.out.printf("\nA data maior é: "+dia1+"/"+mes1+"/"+ano1+".");
	}
	else if((ano1==ano2)&&(mes1==mes2)&&(dia1==dia2)){
		System.out.printf("As datas são iguais.");
	}
	else{
		System.out.printf("\nA data maior é: "+dia2+"/"+mes2+"/"+ano2+".");
	}
	
	}
	
	}
