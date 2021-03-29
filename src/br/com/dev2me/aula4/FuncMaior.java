package br.com.dev2me.aula4;

import javax.swing.JOptionPane;

public class FuncMaior {
	
	public static void main(String[] args) {
	
	int n1 = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero 1: "));
	int n2 = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero 2: "));
	int n3 = Integer.valueOf(JOptionPane.showInputDialog("Informe o numero 3: "));

	int result = acharMaior(n1, n2, n3); 
	if (result == 0) {
		JOptionPane.showMessageDialog(null,"Não há um numero maior entre os 3");
	}else {
		JOptionPane.showMessageDialog(null,"O maior numero é " + result);
	}
	}
	
	public static int acharMaior(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			
			return n1;
			
		}else if(n2 > n1 && n2 > n3){
			
			return n2;
		}else if(n3 > n1 && n3 > n2) {
			
			return n3;
		}else {
			int res = 0;
			return res;
		}
	}
}
