package br.com.dev2me.aula4;


import javax.swing.JOptionPane;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int qtdeAlunos = Integer.valueOf(JOptionPane.showInputDialog("Indique a quantidade de alunos: "));
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		String nomeAluno = "";
	
		for (int i = 0; i < qtdeAlunos; i++) {
			
			nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			nota1 = Integer.valueOf(JOptionPane.showInputDialog("Informe a nota 1: "));
			nota2 = Integer.valueOf(JOptionPane.showInputDialog("Informe a nota 2: "));
			nota3 = Integer.valueOf(JOptionPane.showInputDialog("Informe a nota 3: "));
			int result = calcularMedia(nota1,nota2,nota3);
			
			
			JOptionPane.showMessageDialog(null,"A media do " + nomeAluno + " é: " + result);
					
		}
		
		
		}
	

	public static int calcularMedia(int nota1, int nota2, int nota3) {
		int resultado = ((nota1 + nota2 + nota3) /3);
		return resultado;

	}



}
