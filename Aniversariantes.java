import javax.swing.JOptionPane;

public class Aniversariantes {

	public static void main(String[] args) {
		String DiaNas,MesNas, AnoNas, Nome, Snome;
		int iDiaNas, iMesNas, iAnoNas, iNome, iSnome;
		
		Nome=JOptionPane.showInputDialog("Digite o seu nome: ");
		
		Snome= JOptionPane.showInputDialog("Digite o seu sobrenome: ");
		
		DiaNas=JOptionPane.showInputDialog("Digite o dia do seu nascimento: ");
		iDiaNas= Integer.parseInt(DiaNas);
		MesNas=JOptionPane.showInputDialog("Digite o mês do seu nascimento: ");
		iMesNas=Integer.parseInt(MesNas);
		AnoNas= JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
		iAnoNas= Integer.parseInt(AnoNas);
		
		JOptionPane.showMessageDialog(null,  Nome +" "+ Snome +"\n"
				+"Sua data de nascimento é " + DiaNas+"/" +MesNas+ "/"+ AnoNas );
		if(iMesNas == 9) {
		JOptionPane.showMessageDialog(null, "FELIZ ANIVERSÁRIO " + Nome);
	}

}
}