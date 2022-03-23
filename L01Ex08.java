import java.util.Scanner;
public class L01Ex08 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		/*Explicando o programa: basicamente ele recebe qualquer n�mero de tr�s d�gitos, separa cada d�gito (CDU) e inverte o d�gito (UDC).
		 logo depois soma o n�mero e seu inverso. O resultado dessa soma � separado em CDU novamente, em seguida cada dig�to � multiplicado
		 pela sua respectiva posi��o, e todos s�o somados logo depois.  */
		//Declarando Vari�veis
		int numCdu, numUdc, numC, numD, numU;
		int somaUdcCdu, numSomaC, numSomaD,numSomaU,numSomaM, digitV, digitVm;
		
		System.out.print("Insira um n�mero de tr�s d�gitos: ");
		numCdu = input.nextInt();
		
		//Processamento de Dados
		numC = numCdu / 100;
		numD = (numCdu % 100) / 10;
		numU = (numCdu % 100) % 10;
		
		numUdc = (numU *100) + (numD *10) + numC;
		
		somaUdcCdu = numCdu + numUdc;
		
		//Sa�da de Dados
		if(somaUdcCdu/1000 == 1) {
			numSomaM = somaUdcCdu /1000;
			numSomaC = (somaUdcCdu % 1000)/100;
			numSomaD = (somaUdcCdu % 100) / 10;
			numSomaU = (somaUdcCdu % 100) % 10;
			digitVm = (numSomaM +(numSomaC * 2) + (numSomaD * 3) + (numSomaU * 4)) % 10;
			System.out.print("Seu dig�to de verifica��o �: " + digitVm);
		} else if (somaUdcCdu/1000 == 0) {
			numSomaC = somaUdcCdu /100;
			numSomaD = (somaUdcCdu % 100) / 10;
			numSomaU = (somaUdcCdu % 100) % 10;
			digitV = (numSomaC + (numSomaD * 2) + (numSomaU * 3)) % 10;
			System.out.print("Seu dig�to de verifica��o �: " + digitV);
		}
	}
}
	
