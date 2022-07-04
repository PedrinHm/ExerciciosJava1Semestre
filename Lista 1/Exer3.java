/*Faça um programa que leia o nome e a idade do usuário e escreva esses dados com mensagem indicando qual a informação mostrada.*/

import java.util.Scanner; 
public class Exer3{
	public static void main(String args[]){
		int idade;
		String nome;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade do usuário: ");
		idade = sc.nextInt();
		System.out.println("Digite o nome do usuário: ");
		nome = sc.nextLine();
		System.out.println("a idade do usuário é: " + idade);
		System.out.println("o nome do usuário é: " + nome);
		
	}
}