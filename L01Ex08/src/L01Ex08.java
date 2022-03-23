import java.util.Scanner;
public class L01Ex08 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		/*Explicando o programa: basicamente ele recebe qualquer número de três dígitos, separa cada dígito (CDU) e inverte o dígito (UDC).
		 logo depois soma o número e seu inverso. O resultado dessa soma é separado em CDU novamente, em seguida cada digíto é multiplicado
		 pela sua respectiva posição, e todos são somados logo depois.  */
		//Declarando Variáveis
		int numCdu, numUdc, numC, numD, numU;
		int somaUdcCdu, numSomaC, numSomaD,numSomaU,numSomaM, digitV, digitVm;
		
		System.out.print("Insira um número de três dígitos: ");
		numCdu = input.nextInt();
		
		//Processamento de Dados
		numC = numCdu / 100;
		numD = (numCdu % 100) / 10;
		numU = (numCdu % 100) % 10;
		
		numUdc = (numU *100) + (numD *10) + numC;
		
		somaUdcCdu = numCdu + numUdc;
		
		//Saída de Dados
		if(somaUdcCdu/1000 == 1) {
			numSomaM = somaUdcCdu /1000;
			numSomaC = (somaUdcCdu % 1000)/100;
			numSomaD = (somaUdcCdu % 100) / 10;
			numSomaU = (somaUdcCdu % 100) % 10;
			digitVm = (numSomaM +(numSomaC * 2) + (numSomaD * 3) + (numSomaU * 4)) % 10;
			System.out.print("Seu digíto de verificação é: " + digitVm);
		} else if (somaUdcCdu/1000 == 0) {
			numSomaC = somaUdcCdu /100;
			numSomaD = (somaUdcCdu % 100) / 10;
			numSomaU = (somaUdcCdu % 100) % 10;
			digitV = (numSomaC + (numSomaD * 2) + (numSomaU * 3)) % 10;
			System.out.print("Seu digíto de verificação é: " + digitV);
		}
	}
}
	
