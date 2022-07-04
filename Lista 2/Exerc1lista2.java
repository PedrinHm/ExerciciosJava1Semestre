import java.util.Scanner;
public class Exerc1lista2 {
		public static void main(String args[]){
        int peso_sacokg, quantia_racao1, quantia_racao2, restante_racao, racaokg;
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Qual o peso do saco de ração?(em kg)");
		peso_sacokg = sc.nextInt();
		System.out.println ("Qual a quantida de ração fornecida para o primeiro gato?(em gramas)");
		quantia_racao1 = sc.nextInt();
		System.out.println ("Qual a quantida de ração fornecida para o segundo gato?(em gramas)");
		quantia_racao2 = sc.nextInt();
		
		racaokg = ((quantia_racao1 + quantia_racao2)/1000)*5;
		restante_racao = peso_sacokg - racaokg;
		
		System.out.println ("Ainda restam " + restante_racao + "kg de ração.");
		}

}