import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio_feedback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		DecimalFormat formataMoeda = new DecimalFormat("R$ ###0.00");

		// variaveis
		String nome, novaVenda = "sim";
		int contador = 0, codigo = 0, formaPag = 0, parcelas = 0, vendaVista = 0, vendaPrazo = 0;
		double valor, SomaValores = 0, valorTotal = 0, valorTotal2 = 0, desconto = 0, juros = 0;
		char continuar = 'S';

		while (novaVenda.equalsIgnoreCase("sim")) {
			contador++;

			System.out.println("Digite os dados da " + contador + "� conta:");

			System.out.print("Nome do cliente: ");
			nome = entrada.next();
			
			continuar='S';

			while (!(continuar == 'N')) {
				
				System.out.print("C�gido do produto: ");
				codigo = entrada.nextInt();

				System.out.print("Valor do produto: ");
				valor = entrada.nextDouble();

				SomaValores += valor;
				valorTotal = SomaValores;

				System.out.println("Deseja continuar? (S/N)");
				continuar = entrada.next().charAt(0);
				continuar = Character.toUpperCase(continuar);

			}

			System.out.println("Valor da compra: " + formataMoeda.format(valorTotal));

			System.out.println("Formas de pagamento: ");
			System.out.println("1 - � vista");
			System.out.println("2 - prazo");
			System.out.print("Digite a forma de pagamento: ");
			formaPag = entrada.nextInt();

			while ((formaPag != 1) && (formaPag != 2)) {
				System.out.print("Digite uma forma de pagamento v�lida: ");
				formaPag = entrada.nextInt();
			}

			if (formaPag == 1) {
				desconto = 0.85;
				vendaVista++;

				System.out.println("Valor da compra: " + formataMoeda.format(valorTotal * desconto));

			} else if (formaPag == 2) {
				System.out.print("quantidade m�xima de parcelas que voc� deseja pagar: ");
				parcelas = entrada.nextInt();

				vendaPrazo++;

				while ((parcelas > 12) || (parcelas <= 0)) {
					System.out.print("Digite a quantidade m�xima de parcelas que voc� deseja pagar: ");
					parcelas = entrada.nextInt();
				}

				for (int i = 2; i < parcelas+1; i++) {
					juros = 0.04;
					valorTotal2 = valorTotal*juros+valorTotal;
					System.out.println("Em " + i + "x parcelas: " + formataMoeda.format(valorTotal2/i));
				}
			}

			codigo = 0;
			valor = 0;
			SomaValores=0;
			valorTotal=0;
			
			System.out.println("Deseja cadastrar nova venda? ");
			novaVenda = entrada.next();
			
			while(!(novaVenda.equalsIgnoreCase("n�o")) && !(novaVenda.equalsIgnoreCase("sim"))) {
				System.out.println("Digite se Deseja cadastrar nova venda? ");
				novaVenda = entrada.next();
			}

		}

		System.out.println("Quantidade de vendas � Vista e vendas � Prazo");
		System.out.println("� Vista: " + vendaVista);
		System.out.println("� Prazo: " + vendaPrazo);

	}

}
