// criar um programa que leia informações sobre estudantes, calcule a média das notas de cada estudante e escreva as informações

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Preencha o cadastro de estudante");
		
		double media;
		
		System.out.print("Nome: ");
		String nome;
		nome = sc.next();
		
		System.out.print("Idade: ");
		int idade;
		idade = sc.nextInt();
		
		System.out.print("Notas na 1° disciplina: ");
		double nota01;
		nota01 = sc.nextDouble();
		System.out.print("Notas na 2° disciplina: ");
		double nota02;
		nota02 = sc.nextDouble();
		System.out.print("Notas na 3° disciplina: ");
		double nota03;
		nota03 = sc.nextDouble();
		
		sc.close();
		
		media = (nota01 + nota02 + nota03) / 3;
		System.out.println(" ");
		System.out.printf("%nCadastro realizado com sucesso...%n"
				+ "%nNome do estudante - %s%n"
				+ "Idade do estudante - %d%n"
				+ "Notas:%nDisciplina 01 - %.1f%nDisciplina 02 - %.1f%nDisciplina 03 - %.1f%n"
				+ "Média das notas - %.1f%n", 
				nome, idade, nota01, nota02, nota03, media);

	}

}
