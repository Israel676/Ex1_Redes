package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redecontrol = new RedesController();
		int op = 0;
		while(op != 9) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1- Saber nome do sistema \n 2- fazer chamada de ip \n 3- ver o ping do google \n 9 - finalizar navegação"));
			switch(op){
				case 1: String os = redecontrol.os();
						System.out.println("O sistema atual é o "+ os);
					break;
				case 2: String process = "IPCONFIG";
						redecontrol.ip(process);
					break;
				case 3: String processo = "PING -4 -n 10 www.google.com.br";
						redecontrol.ping(processo);
					break;
				case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
					break;  
			}
		}
	}

}
