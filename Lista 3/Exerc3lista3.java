import java.util.Scanner;
public class Exerc3lista3 {
	public static void main(String args[]){
	float distancia, tam_escada, altura ; 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual o tamanho da escada? ");
	tam_escada = sc.nextFloat();
	System.out.println("Qual a altura em que se deseja pregar o quadro? ");
	altura = sc.nextFloat();
	
	
	distancia = (float)(Math.pow(tam_escada, 2)-Math.pow(altura, 2));
	distancia = (float)(Math.sqrt(distancia));
	
	System.out.println("A distância a escada deve estar da parede é: " + distancia);
	}
}