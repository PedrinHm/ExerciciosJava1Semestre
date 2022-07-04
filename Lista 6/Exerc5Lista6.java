import java.util.Scanner;
public class Exerc5Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float  result, num1, num2;
	char operador;

System.out.println("\nSoma \t+  \nSubtracao \t- \nMultiplicacao \t* \nDivisao  \t/ \nPotenciacao \t^ \nResto da divisao inteira \t% \nRaiz \t#\nEscreva dois números e em seguida escreva o operador desejado(+ - * / ^ % #): ");
num1 = sc.nextFloat();
num2 = sc.nextFloat();
operador = sc.next().charAt(0);

switch(operador){
	case'+':
	result = num1+num2;
	System.out.printf("\nO resultado da soma é: "+result);
	break;
	case'-':
	result = num1-num2;
	System.out.printf("\nO resultado da subtração é: "+result);
	break;
	case'*':
	result = num1*num2;
	System.out.printf("\nO resultado da multiplicação é: "+result);
	break;
	case '/':
	result = num1/num2;
	System.out.printf("\nO resultado da divisão é: "+result);
	break;
	case '^':
	result =  (float)Math.pow(num1,num2);
	System.out.printf("\nO resultado da potenciação é: "+result);
	break;
	case '%':
	result = (float)(num1%num2);
	System.out.printf("\nO resultado do resto da divisão inteira é: "+result);
	break;
	case'#':
	result = (float)Math.pow(num1,(1/num2));
	System.out.printf("\nO resultado da raiz é: "+result);
	break;
	default:
	System.out.printf("\nCódigo invalido.");
}

	}
}