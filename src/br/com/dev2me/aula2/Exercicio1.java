package br.com.dev2me.aula2;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite uma opção: 1) Cadastrar Aluno, 2) Cadastrar Professor, 9) Sair do Programa."));

			if (opcao == 1) {
				System.out.println("Cadastrar Aluno");
			}
			if (opcao == 2) {
				System.out.println("Cadastrar professor");
			}

		} while (opcao != 9);
		
		/**		while (opcao != 9) {
		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite uma opção: 1) Cadastrar Aluno, 2) Cadastrar Professor, 9) Sair do Programa."));

		if (opcao == 1) {
			System.out.println("Cadastrar Aluno");
		}
		if (opcao == 2) {
			System.out.println("Cadastrar professor");
		}*/


	System.out.println("Programa Finalizado");



	}

}
