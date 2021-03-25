package br.com.dev2me.urnaEletronica;

import javax.swing.JOptionPane;

public class UrnaEletronica {

	public static void main(String[] args) {

		int pmdb = 0;
		int pt = 0;
		int dem = 0;
		int nulo = 0;
		int branco = 0;
		int totVotos = 0;
		int voto = 0;
		int opcao = 0;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para votar ou 2 para finalizar votação."));

			if (opcao == 1) {
				voto = Integer.parseInt(
						JOptionPane.showInputDialog("Digite seu voto:\n" + "Código 1 - PMDB - Angela Pepino \n"
								+ "Código 2 - PT - Gean da Silva \n" + "Código 3 - DEM - Cesar Souza Neto \n"
								+ "Código 4 - Voto Nulo \n" + "Código 5 - Voto em Branco"));

				switch (voto) {
				case 1:
					pmdb++;
					totVotos++;
					break;
				case 2:
					pt++;
					totVotos++;
					break;
				case 3:
					dem++;
					totVotos++;
					break;
				case 4:
					nulo++;
					totVotos++;
					break;
				case 5:
					branco++;
					totVotos++;
					break;
				default:
					voto = Integer.parseInt(JOptionPane.showInputDialog("Voto errado, digite novamente \n" 
									+ "Código 1 - PMDB - Angela Pepino \n"
									+ "Código 2 - PT - Gean da Silva \n" 
									+ "Código 3 - DEM - Cesar Souza Neto \n"
									+ "Código 4 - Voto Nulo \n" 
									+ "Código 5 - Voto em Branco"));
				}
			}

		} while (opcao != 2);
		String ganhador = "";

		if (pmdb > pt && pmdb > dem && pmdb > nulo && pmdb > branco) {
			ganhador = "Ganhador: Angela Pepino - PMDB ";
		} else if (pt > pmdb && pt > dem && pt > nulo && pt > branco) {
			ganhador = "Ganhador: Gean da Silva - PT ";
		} else if (dem > pmdb && dem > pt && dem > nulo && dem > branco) {
			ganhador = "Ganhador: Cesar Souza Neto - DEM ";
		} else {
			ganhador = "Não tivemos ganhador, votos em nulo ou branco foram superior";
		}

		JOptionPane.showMessageDialog(null, "\n" + "Resultado da votação: \n" + "Total de votos: " + totVotos + "\n"
				+ "Código 1 - Angela Pepino - PMDB - Votos: " + pmdb + "\n" + "Código 2 - Gean da Silva - PT - Votos: "
				+ pt + "\n" + "Código 3 - Cesar Souza Neto - DEM - Votos: " + dem + "\n" + "Código 4 - Nulo - Votos: "
				+ nulo + "\n" + "Código 5 - Branco - Votos: " + branco + "\n" + ganhador);

	}
}
