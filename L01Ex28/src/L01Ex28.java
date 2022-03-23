import java.util.Scanner;
public class L01Ex28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*Explicando o programa: recebo o valor do peso dos peixes, verifico se tem mais que 50 quilos, se tiver eu multiplico o excesso por 4
		 * se não eu aviso que não tme excesso.*/
		//Declarando Variáveis
		int pesoPeixe, valorExce ;
		
		System.out.print("Insira o peso dos peixes: ");
		pesoPeixe = input.nextInt();
		
		//Processando de Dados
		valorExce = (pesoPeixe % 50) * 4;
		
		//Saída de Dados
		if(pesoPeixe <=50 ) {
			System.out.print("Nenhuma multa à pagar");
		} else if (pesoPeixe > 50) {
			System.out.print("O valor excedente à ser pago: R$ " +  valorExce + ",00 reais");
		}
	};
}
