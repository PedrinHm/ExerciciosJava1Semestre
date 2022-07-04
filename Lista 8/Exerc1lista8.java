import java.util.Scanner;
public class Exerc1lista8 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i;
	float num, quadrado, cubo, raiz;
	
	do{
		System.out.println("Digite um número: \nPara finalizar digite 0 ou um número negativo, para continuar digite um número positivo:");
		num = sc.nextFloat();
		
		raiz = (float)Math.sqrt(num);
		cubo = (float)Math.pow(num,3);
		quadrado = (float)Math.pow(num,2);
		System.out.printf("Quadrado: %f \nCubo: %f \nRaiz: %f",quadrado, cubo, raiz);
		
		
	}
	while(num>0);
	}
}