import java.util.Scanner;
public class L01Ex28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*Explicando o programa: recebo o valor do peso dos peixes, verifico se tem mais que 50 quilos, se tiver eu multiplico o excesso por 4
		 * se n�o eu aviso que n�o tme excesso.*/
		//Declarando Vari�veis
		int pesoPeixe, valorExce ;
		
		System.out.print("Insira o peso dos peixes: ");
		pesoPeixe = input.nextInt();
		
		//Processando de Dados
		valorExce = (pesoPeixe % 50) * 4;
		
		//Sa�da de Dados
		if(pesoPeixe <=50 ) {
			System.out.print("Nenhuma multa � pagar");
		} else if (pesoPeixe > 50) {
			System.out.print("O valor excedente � ser pago: R$ " +  valorExce + ",00 reais");
		}
	};
}
