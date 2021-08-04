
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0, numMaior = 0, numMenor = 0;

		for (int i = 1; i < 11; i++) {

			System.out.println("Digite " + i + "º número:");
			num = entrada.nextInt();

			if (i == 1) {
				numMaior = num;
				numMenor = num;
			} else {
				// Compara os próximos valores
				if (num > numMaior) {
					numMaior = num;
				} else if (num < numMenor) {
					numMenor = num;
				}
			}

		}
		System.out.println("Maior Número:" + numMaior);
		System.out.println("Menor Número:" + numMenor);

	}

}