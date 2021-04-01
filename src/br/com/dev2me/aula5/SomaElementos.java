package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class SomaElementos {
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		int qtElementos = Integer.valueOf(JOptionPane.showInputDialog("Indique quantos elementos serão inseridos: ")); 
		int soma = 0;	
		for (int i = 0; i < qtElementos; i++) {
			
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Elemento "+i+ " a ser inserido:")));
			soma = soma + lista.get(i);
			System.out.println("Numero " +lista.get(i)+" inserido");
			
		}
		System.out.println("Soma total dos elementos: "+soma);
	}

}
