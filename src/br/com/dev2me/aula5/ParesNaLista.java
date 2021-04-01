package br.com.dev2me.aula5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ParesNaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> pares = new ArrayList<Integer>();
		int qtdPares = 0;
		for (int i = 0; i < 20; i++) {
			
			lista.add(Integer.valueOf(JOptionPane.showInputDialog("Indique o elemento " + i + " a ser inserido: ")));
			System.out.println("Numero " + lista.get(i)+ " inserido");
			if (i % 2 == 0) {
				qtdPares++;
				pares.add(lista.get(i));
				
			}
			
		}
		
		System.out.println("Temos " + qtdPares+ " numeros pares na lista, seguem os mesmos: "+pares);

	}

}
