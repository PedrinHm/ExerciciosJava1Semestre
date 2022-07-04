import java.util.Scanner;
public class Exerc2Lista6 {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int cod;
	float preco;
	
System.out.printf("\nCódigo de origem \tPrecedência \n1 \tSul \n2 \tNorte \n3 \tLeste \n4 \tOeste \n5 ou 6 \tNordeste \n7 ou 8 ou 9 \tSudeste \n10 a 20 \tCentro-oeste \n21 a 30 \tNordeste \nEntre com o preço do produto e seu código:");
preco = sc.nextFloat();
cod = sc.nextInt();

switch(cod){
case(1):
	System.out.printf("A procedência do produto é: Sul ");
break;
case(2):
	System.out.printf("A procedência do produto é: Norte ");
break;
case(3):
	System.out.printf("A procedência do produto é: Leste ");
break;
case(4):
	System.out.printf("A procedência do produto é: Oeste ");
break;
case(5):
 case(6):
  case(21):
   case(22):
    case(23):
     case(24):
      case(25):
	   case(26):
	    case(27):
	     case(28):
	      case(29):
           case(30):
	System.out.printf("A procedência do produto é: Nordeste ");
break;
case(7):
 case(8):
  case(9):
	System.out.printf("A procedência do produto é: Sudeste ");
break;
case(10):
 case(11):
  case(12):
   case(13):
    case(14):
	 case(15):
	  case(16):
	   case(17):
	    case(18):
		 case(19):
          case(20):
	System.out.printf("A procedência do produto é: Centro-oeste ");

default:
	System.out.println("Código inesistente");
}
}
}