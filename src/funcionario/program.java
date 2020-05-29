package funcionario;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int horaTrabalhadas, opcao, totalHoras = 0;
		double valorHora, custoTotal = 0;
		char repetir = 0;

		while (repetir != 'n' && repetir != 'N') {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Horas trabalhadas: ");
			horaTrabalhadas = sc.nextInt();
			while (horaTrabalhadas < 0) {
				System.out.println("O valor deve ser positivo. Tente novamente.");
				horaTrabalhadas = sc.nextInt();
			}
			System.out.print("Valor por hora: ");
			valorHora = sc.nextDouble();
			while (valorHora < 0) {
				System.out.println("O valor deve ser positivo. Tente novamente.");
				valorHora = sc.nextInt();
			}
			System.out.print("Digitar outro (S/N)? ");
			repetir = sc.next().charAt(0);
			totalHoras = totalHoras + horaTrabalhadas;
			custoTotal = custoTotal + horaTrabalhadas * valorHora;
			
		}

		do {
			System.out.println();
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			System.out.println();
			
			if (opcao == 1){
				System.out.printf("Total de horas = %d%n", totalHoras);
			}
			else if (opcao == 2) {
				System.out.printf("Custo total = %.2f%n", custoTotal);
			}

		} while (opcao != 4);

		sc.close();
	}

}
