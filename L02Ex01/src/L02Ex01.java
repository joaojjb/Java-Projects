import java.util.Scanner;
public class L02Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*Explicando o programa: basicamente, recebe a quantidade de tomadas das 4 reguas, diminui uma das tr�s primeiras e soma o restante,
		 * para saber quantos aparelhos podems er conectados.*/
		
		//Declarando Vari�veis
		int ruler1, ruler2, ruler3, ruler4, maxApare;
		
		System.out.print("Insira a quantidade de tomadas da r�gua 1 : ");
		ruler1 = input.nextInt();
		System.out.print("Insira a quantidade de tomadas da r�gua 2 : ");
		ruler2 = input.nextInt();
		System.out.print("Insira a quantidade de tomadas da r�gua 3 : ");
		ruler3 = input.nextInt();
		System.out.print("Insira a quantidade de tomadas da r�gua 4 : ");
		ruler4 = input.nextInt();
		
		//Processando dados
		maxApare = (ruler1 -1) + (ruler2 - 1) + (ruler3 -1) + (ruler4);
		
		//Sa�da de Dados
		System.out.println("O n�mero m�ximo de aparelhos que voc�s podem conectar � de: " + maxApare);
	}
}
