import java.util.Scanner;
public class Exerc6lista8 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num=1, quantpar=0, maior=0, menor=9999999, soma=0, quant=0, mediapar=0;
	float  media, porcimpar,quantimpar=0;
	System.out.printf("\nCalculos: \n• A soma dos números digitados; \n• A quantidade de números digitados; \n• A média dos números digitados; \n• O maior número digitado; \n• O menor número digitado; \n• A média dos números pares; \n• A porcentagem dos números ímpares entre todos os números digitados.");
	do{
		num=0;
		System.out.printf("\nDigite um número: ");
		num = sc.nextInt();
		if(num>0){
		soma = soma+num;//certo
		quant++;
		if(num>maior)
			maior=num;//certo
		if(num<menor)
			menor=num;//certo
		if(num % 2 == 0){
			quantpar++;
		    mediapar=mediapar+num;
		}
		else
            quantimpar++;	
		}		
		
	}
	while(num != 0);
	media=soma/quant;//certo
	mediapar=(mediapar/quantpar);
    porcimpar= (quantimpar*100)/quant;
	
	System.out.printf("\nA soma dos números digitados: %d \na quantidade de números digitados: %d \nA média dos números digitados: %f \nO maior número digitado: %d \nO menor número digitado: %d \nA média dos números pares: %d \nA porcentagem dos números ímpares entre todos os números digitados: %f",soma,quant,media,maior,menor,mediapar,porcimpar);
	
	}
}