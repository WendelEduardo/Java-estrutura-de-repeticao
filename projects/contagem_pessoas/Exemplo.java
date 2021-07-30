import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		//Shift + Ctrl + O
		
		//Declarar Variáveis
		int idade=0,contador=0,qtd50=0,contAlt=0,contPeso=0;
		double altura=0,peso=0,somaAlt=0;
		String sexo, pergunta = "s";
		int contM=0;
		

		System.out.println("Exemplo 01 Java");
		//Ctrl + Barra de Espaço
		
		while (pergunta.equalsIgnoreCase("s")) {
			
			System.out.println("                       ");
			System.out.println((contador+1)+ "° Pessoa");
			
			System.out.print("Digite a idade: ");
			idade=entrada.nextInt();
			
			System.out.print("Digite a altura (Ex: 0,00): ");
			altura=entrada.nextDouble();
			
			System.out.print("Digite o peso: ");
			peso=entrada.nextDouble();
			
			System.out.print("Digite o sexo: ");
			sexo = entrada.next();
			
			contador++;
			
			//Estruturas de seleção
			
			//A) quantidade pessoas > 50 anos
			if(idade > 50) {
				qtd50++;
			}
			
			//B) Média das alturas entre 10 e 20 anos
			if(idade>10 && idade<20) {
				contAlt++;
				//somaAlt <- somaAlt + altura 
				somaAlt += altura;
			}
			
			//C) porcentagem pessoas peso < 40
			if(peso<40) {
				contPeso++;
			}
			//d) Comparação String .equalsIgnoreCase
			if(sexo .equalsIgnoreCase("m")) {
				contM++;
			}
			
			System.out.print("Deseja cadastrar mais uma pessoa (S/N)? ");
			pergunta = entrada.next();
			
		}//fecha repetição principal
		
		//Saídas
		System.out.println("                       ");
		System.out.println("Quantidade de pessoas com idade maior que 50: "+ qtd50);
		if(contAlt!=0){
			System.out.println("Média das alturas: "+somaAlt/contAlt);
		}else {
			System.out.println("Média das alturas: 0");
		}
		
		System.out.println("Porcentagem de pessoas com peso menor que 40: "+(double)(contPeso/contador)*100+"%");
		System.out.println("Número de homens: "+contM);
		
		
	}//Fecha main 

}//Fecha class
