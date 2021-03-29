package br.com.dev2me.aula4;

import javax.swing.JOptionPane;

public class VerificaSinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero para verificar seu sinal: "));
		
		JOptionPane.showMessageDialog(null,String.valueOf(verificarSinal(n1)));
		
		
		

	}
	
	public static int verificarSinal(int n1) {
		int sinal = 0;
		if (n1 < 0) {
			 sinal = -1; 
		}else {
			 sinal = 1;
		}
		return sinal;
	}

}
