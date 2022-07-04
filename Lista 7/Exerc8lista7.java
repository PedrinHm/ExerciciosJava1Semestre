/*Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série a seguir: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...*/
                     /*2 3 4*/
import java.util.Scanner;
public class Exerc8lista7 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i , x=0 , a , b , c;
	
    System.out.println("Digite o número de termos: ");
	x = sc.nextInt();
    System.out.println("Digite 3 valores: ");	
    a = sc.nextInt();
    b = sc.nextInt();
	c = sc.nextInt();
	
	for(i=1; i<=x; i++){
		a = a*2;
		b = b*3;
		c = c*4;
		System.out.printf("\n"+a+"\t"+b+"\t"+c);
	}
	}
}