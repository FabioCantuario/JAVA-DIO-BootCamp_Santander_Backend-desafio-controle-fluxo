import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		int parametroUm, parametroDois;

		System.out.print("Digite o primeiro numero: ");
		parametroUm = terminal.nextInt();
		terminal.nextLine();
		System.out.print("Digite o segundo numero: ");
		parametroDois = terminal.nextInt();
		terminal.nextLine();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}

		terminal.close();

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

		} else {
			int contagem = (parametroDois - parametroUm);
			for (int i = 0; i < contagem; i++) {
				System.out.println(
						"Imprimindo o número1: " + parametroUm++ + ", Imprimindo o número2: " + parametroDois++);
			}

		}

	}

}