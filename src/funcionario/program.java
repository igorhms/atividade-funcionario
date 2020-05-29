package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int horaTrabalhadas;
		double valorHora;
		char repetir;
		
		do {
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Horas trabalhadas: ");
		horaTrabalhadas = sc.nextInt();
		while (horaTrabalhadas < 0){
			System.out.println("O valor deve ser positivo. Tente novamente.");
			horaTrabalhadas = sc.nextInt();
		}
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		while (valorHora < 0){
			System.out.println("O valor deve ser positivo. Tente novamente.");
			valorHora = sc.nextInt();
		}
		System.out.print("Digitar outro (S/N)? ");
		repetir = sc.next().charAt(0);
		sc.nextLine();
		} while (repetir == 'S' || repetir == 's');
		
		
	
		sc.close();
	}

}
