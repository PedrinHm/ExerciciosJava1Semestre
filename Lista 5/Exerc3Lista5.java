/*Pronto*/
import java.util.Scanner;
public class Exerc3Lista5 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int x, y, z, somaxy,somaxz, somayz;	

System.out.printf("\nDigite três números: ");
x = sc.nextInt();
y = sc.nextInt();
z = sc.nextInt();
somaxy = x+y;
somaxz = x+z;
somayz = y+z;

	if((x>somayz)||(y>somaxz)||(z>somaxy)){
	System.out.println("o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados. Não formam um triângulo.");
	}
	else{
	
		if ((x==y)&&(y==z)&&(x==z)){
			System.out.println("Triângulo equilátero(tem os comprimentos dos três lados iguais).");
		}
		else{
		if ((x==y)||(x==z)||(y==z)){
			System.out.println("triângulo isóscele (tem os comprimentos de dois lados iguais)");
		}
	    if ((x!=y)&&(y!=z)){
			System.out.println(" triângulo escaleno (tem os comprimentos dos três lados diferentes)."); 
		 }
		}
	}

	}
}