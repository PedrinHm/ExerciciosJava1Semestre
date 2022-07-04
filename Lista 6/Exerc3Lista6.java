//pronto:)
import java.util.Scanner;
public class Exerc3Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num1,num2,num3;
	
	System.out.println("Escreva três números distintos, o menor será retornado: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	
	if((num1<num2)&&(num1<num3)){
		System.out.println("O menor número é: "+num1);
		}
	else if(num2<num3){
	    System.out.println("menor número é: "+num2);
	}
	else{
		System.out.println("menor número é: "+num3);
	}
	}
	
	
	
}
