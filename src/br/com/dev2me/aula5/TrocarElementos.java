package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TrocarElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {
			
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Indique o elemento " + i + " a ser inserido: ")));
			System.out.println("Numero " + lista.get(i)+ " inserido");
		}
		int primeiro = lista.get(0);
		int ultimo = lista.get(19);
		System.out.println(lista);
		System.out.println("Primeiro: " +lista.get(0) +", Ultimo: "+ lista.get(19));
		
		lista.remove(19);
		lista.remove(0);
		
		
		lista.add(0, ultimo);
		lista.add(19, primeiro);
		System.out.println(lista);
		System.out.println("Primeiro: " +lista.get(0) +", Ultimo: "+ lista.get(19));
	}

}
