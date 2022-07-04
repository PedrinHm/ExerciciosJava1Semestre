/*Pronto*/
import java.util.Scanner;
public class Exerc5Lista5 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float preco, preconovo;

System.out.println("Digite o preço do produto: ");
preco = sc.nextFloat();

preconovo = 0;

if(preco<51){
	preconovo = (float)(preco+(preco*0.05));
	System.out.println("O novo preço do produto é: " + preconovo);
}
if((preco>50)&&(preco<101)){
	preconovo = (float)(preco+(preco*0.1));
	System.out.println("O novo preço do produto é: " + preconovo);
}
if(preco>100){
	preconovo = (float)(preco+(preco*0.15));
	System.out.println("O novo preço do produto é: " + preconovo);
}

if(preconovo<81){
	System.out.println("Classificação: Barato");
}
if((preconovo>80)&&(preconovo<121)){
	System.out.println("Classificação: Normal");
}
if((preconovo>120)&&(preconovo<201)){
	System.out.println("Classificação: Caro");
}
if(preconovo>200){
	System.out.println("Classificação: Muito caro");
}




}
}