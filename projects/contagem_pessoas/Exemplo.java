import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		//Shift + Ctrl + O
		
		//Declarar Vari�veis
		int idade=0,contador=0,qtd50=0,contAlt=0,contPeso=0;
		double altura=0,peso=0,somaAlt=0;
		String sexo, pergunta = "s";
		int contM=0;
		

		System.out.println("Exemplo 01 Java");
		//Ctrl + Barra de Espa�o
		
		while (pergunta.equalsIgnoreCase("s")) {
			
			System.out.println("                       ");
			System.out.println((contador+1)+ "� Pessoa");
			
			System.out.print("Digite a idade: ");
			idade=entrada.nextInt();
			
			System.out.print("Digite a altura (Ex: 0,00): ");
			altura=entrada.nextDouble();
			
			System.out.print("Digite o peso: ");
			peso=entrada.nextDouble();
			
			System.out.print("Digite o sexo: ");
			sexo = entrada.next();
			
			contador++;
			
			//Estruturas de sele��o
			
			//A) quantidade pessoas > 50 anos
			if(idade > 50) {
				qtd50++;
			}
			
			//B) M�dia das alturas entre 10 e 20 anos
			if(idade>10 && idade<20) {
				contAlt++;
				//somaAlt <- somaAlt + altura 
				somaAlt += altura;
			}
			
			//C) porcentagem pessoas peso < 40
			if(peso<40) {
				contPeso++;
			}
			//d) Compara��o String .equalsIgnoreCase
			if(sexo .equalsIgnoreCase("m")) {
				contM++;
			}
			
			System.out.print("Deseja cadastrar mais uma pessoa (S/N)? ");
			pergunta = entrada.next();
			
		}//fecha repeti��o principal
		
		//Sa�das
		System.out.println("                       ");
		System.out.println("Quantidade de pessoas com idade maior que 50: "+ qtd50);
		if(contAlt!=0){
			System.out.println("M�dia das alturas: "+somaAlt/contAlt);
		}else {
			System.out.println("M�dia das alturas: 0");
		}
		
		System.out.println("Porcentagem de pessoas com peso menor que 40: "+(double)(contPeso/contador)*100+"%");
		System.out.println("N�mero de homens: "+contM);
		
		
	}//Fecha main 

}//Fecha class
