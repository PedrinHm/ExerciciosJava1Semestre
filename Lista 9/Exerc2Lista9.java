import java.util.Scanner;
public class Exerc2Lista9 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int i=0,andares, npessoas=0, psair=0,sair=0, npessoast=0;
	
	System.out.println("Digite o número de andares do prédio: ");
	andares = sc.nextInt();
	for(i=1;i<=andares;i++){
		System.out.printf("\nNúmero de pessoas no elevador: %d \nDigite quantas pessoas entraram no elevador no andar %d: ",npessoast,i);
		npessoas = sc.nextInt();
		npessoast = npessoast+npessoas;
		System.out.printf("\nNúmero de pessoas no elevador: %d \nDigite quantas pessoas sairam do elevador no andar %d: ",npessoast,i);
		psair = sc.nextInt();
		npessoast = npessoast-psair;
		
		if(npessoast>15){
			do{
			sair=15-npessoast;
			System.out.printf("\n!!EXCESSO DE PESSOAS!!\n %d pessoas devem sair do elevador.\nDigite quantas pessoas sairam do elevador: ",sair);
			psair = sc.nextInt();
			npessoast=npessoast-psair;
		}
		while(npessoast>15);
		}
		
	}
	System.out.printf("Número de pessoas que sairam no ultimo andar: %d.",npessoast);
	}

}