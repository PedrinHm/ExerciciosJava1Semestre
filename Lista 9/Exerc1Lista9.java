import java.util.Scanner;
public class Exerc1Lista9 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    int sexo, olhos, cabelo, idade=0, maioridade=0, mulher1835=0, habitanteVC=0;
    do{
      System.out.println("Digite a idade do habitante: ");
       idade = sc.nextInt();
      System.out.printf("\nQual o sexo do habitante? \nMasculino(Digite 1) \nFeminino(Digite 2)");
       sexo = sc.nextInt();
      System.out.printf("\nQual a cor do cabelo do habitante? \nPretos(Digite 1) \nCastanhos(Digite 2) \nLoiros(Digite 3)");
       cabelo = sc.nextInt();
      System.out.printf("Qual a cor dos olhos do habitante? \nVerdes(Digite 1) \nAzuis(Digite 2) \nCastanhos(Digite 3) ");
       olhos = sc.nextInt();
         if(idade>maioridade) 
             maioridade = idade;
         if((sexo==2) && (idade>17 && idade<36))
             mulher1835++;
         if((olhos==1)&&(cabelo==2))
             habitanteVC++;
}
while(idade != -1);
    
	System.out.printf("\nO habitante de maior idade tem %d anos. \nO número de mulheres com idade entre 18 e 35 é %d. \nO número de habitantes com olhos verdes e cabelos castanhos é %d",maioridade,mulher1835,habitanteVC);
}
}