import java.util.Scanner;
public class Exerc2lista3 {
	public static void main(String args[]){
	float preco_fabrica, lucro_distribuidor, impostos, preco_final ; 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual o preço de fábrica do veículo?");
	preco_fabrica = sc.nextFloat();
	System.out.println("Qual o o percentual de lucro do distribuidor?");
	lucro_distribuidor = sc.nextFloat();
	System.out.println("Qual o o percentual de impostos?");
	impostos = sc.nextFloat();
	
	impostos = preco_fabrica*lucro_distribuidor/100;
	lucro_distribuidor = preco_fabrica*impostos/100;
	preco_final = preco_fabrica+impostos+lucro_distribuidor;
	
	System.out.println("O valor correspondente ao lucro do distribuidor: " + lucro_distribuidor);
	System.out.println("O valor correspondente aos impostos: " + impostos);
	System.out.println("O preço final do veículo: " + preco_final);
	
	
	
	}
}