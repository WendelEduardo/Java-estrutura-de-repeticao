import java.text.DecimalFormat;
import java.util.Scanner;

public class exemploDivida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat fmMoeda = new DecimalFormat ("##00.00");
		
		//variaveis
		double valorDivida = 0, valorParcelas=0, valorJuros=0;
		int parcelas=0, juros=10;
		
		System.out.print("Digite o valor da divida: ");
		valorDivida = entrada.nextDouble();
		
		System.out.println("                                                                                         ");
		System.out.println("Total: "+valorDivida+", Juros: 0%, Números de parcelas: 1, Valor da Parcela: "+valorDivida);
		
		while(parcelas<12) {
					
			parcelas+=3;
			
			valorJuros = valorDivida+(valorDivida* juros)/100; 
			valorParcelas = valorJuros/parcelas;
			
			System.out.println("Total: "+valorJuros+" , Juros: "+juros+"%, Números de parcelas: "+parcelas+", Valor da Parcela: "+ fmMoeda.format(valorParcelas));
			
			juros+=5;
		}
	
	}

}
