
import java.util.Scanner;

public class Aniversariantes2 {
    

	public static void main(String[] args) {
		
		String nome;
		int dia, mes , ano, resposta;
		

		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Digite seu nome:\n ");
		nome=sc.next();
System.out.println("Digite o dia do seu nascimento: ");
dia=sc.nextInt();
System.out.println("Digite o mês do seu nascimento: ");
mes=sc.nextInt();
System.out.println("Digite o ano do seu nascimento: ");
ano=sc.nextInt();
switch(mes) {
	case 01: System.out.println("Não há "+"aniversariantes em Janeiro.");
		break;
	case 02: if (dia ==8 || dia ==15 || dia == 28){
				if (dia == 8) {
					System.out.println("Parabéns Rafael!!");
				}else if(dia == 15) {
					System.out.println("Parabéns Nauan!!");
				}else if (dia == 28) {
					System.out.println("Parabéns Rebecca!!");
				}else {
					System.out.println("Não há aniversariantes nesta data.");
		
				}
			}
		break;
	

	case 3: if (dia==25) {
				System.out.println("Parabéns Sarah!!");
			}else {
				System.out.println("Não há aniversariantes nesta data.");
	
			}
		break;
	
	case 4: if(dia==13) {
				System.out.println("Parabéns para mim!;)");
			}else {
				System.out.println("Não há aniversariantres neste mês.");
	
			}
		break;

	case 5: System.out.println("Não há aniversariantes nesta data.");
			
		break;
	
	case 6:
			if (dia == 16) {
				System.out.println("Parabéns Tais!!");
			}else if(dia == 19) {
				System.out.println("Parabéns Murilo!!");
			}else {
				System.out.println("Não há aniversariantes nesta data.");
			}
			break;
	case 7: 
		if(dia == 17) {
			System.out.println("Parabéns Matheus!!");
		}else {
			System.out.println("Não há aniversariantes nesta data.");
		}
		break;
	case 8:
		if (dia == 19) {
			System.out.println("Parabéns Murillo!!");
		}else if(dia == 31) {
			System.out.println("Parabéns Eduarda!!");
		}else {
			System.out.println("Não há aniversariantes nesta data.");
		}
		break;
	case 9:
		if(dia == 25) {
			System.out.println("Parabéns Wallas!!");
		
}else{
	System.out.println("Não há aniversariantes nesta data.");
}
		break;
		
	case 10:
		if(dia == 20) {
			System.out.println("Parabéns Pedro!!");
		}else if(dia == 30) {
			System.out.println("Parabéns Yuri!!");
		}else {
			System.out.println("Não há aniversariantes nesta data.");
		}
		break;
	case 11:
		if(dia == 3) {
			System.out.println("Parabéns Nikolas!!");
		}else if(dia == 16 ) {
			System.out.println("Parabéns Thiago!!");
		}else if(dia == 24) {
			System.out.println("Parabéns Valdir!!");
		}else {
			System.out.println("Não há aniversariantes nesta data.");
			
		}
		break;
	case 12: 
		if(dia == 6) {
			System.out.println("Parabéns Maxsuel!!");
		}else if(dia == 10) {
			System.out.println("Parabéns Maria!!");
		}else {
			System.out.println("Não há aniversariantes nesta data.");
			
		}
		break;
		default: System.out.println("OPÇÃO INVÁLIDA");
		break;
		
		}
System.out.println("Digite [1] para continuar ou [0] para sair.");
resposta=sc.nextInt();
		}while (resposta!=0);		
		
	}
}


