import java.util.Scanner;
public class media{
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    float nota1,nota2,media,somar_media, mediageral=0; 
    int i;

    

        for(i = 1; i < 6; i++ ){

            System.out.printf("Digite a primeira Nota do aluno %d: ",i);
            nota1 = sc.nextFloat();

            System.out.printf("Digite a segunda Nota do aluno %d: ",i);
            nota2 = sc.nextFloat();

            media = (nota1 + nota2) / 2;
			mediageral +=media;

        System.out.println("A média do aluno é = " + media);
		if(media>6)
			System.out.println("aluno aprovado!");
		else
			System.out.println("Aluno reprovado.");
        }
System.out.println("A média geral é: "+mediageral/5);

    }
}