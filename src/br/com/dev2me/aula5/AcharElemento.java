package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AcharElemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> elementos = new ArrayList<Integer>();
		
		
		for (int i= 0; i < 10; i++) {
			elementos.add(Integer.valueOf(JOptionPane.showInputDialog("Elemento " + i + " a ser inserido:")));
			System.out.println("Numero " +elementos.get(i)+" inserido");
		}
		
		int posicao = Integer.valueOf(JOptionPane.showInputDialog("Qual posição deseja ler?"));
		
					
		if (posicao > 0 && posicao <10) {
		 System.out.println(elementos.get(posicao));		
		}else {
		System.out.println("Posição invalida");
			}
		
		
		
			
		
	}

}
