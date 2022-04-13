import java.util.Scanner;
public class L03Ex07 {
	public static void main(String[] args) {
		//Professora o código acabou ficando enorme demais.
		Scanner input = new Scanner(System.in);
		
		String nameOfAccount = "";
		int typeOfAccount;
		float qtdMcubicos, valorPagoEmReal = 0;
		
		System.out.print("Insira o tipo da sua conta: ");
		typeOfAccount = input.nextInt();
		System.out.print("Insira o consumo de água em metros cúbicos: ");
		qtdMcubicos = input.nextFloat();
		
		if(typeOfAccount == 1) {
			valorPagoEmReal =(float)(5 + 0.05 * qtdMcubicos);
			nameOfAccount = "Residencial";
			System.out.print("O seu tipo de conta é " + nameOfAccount + " e o valor a ser pago em Reais é R$: " + valorPagoEmReal );
		}
		else {
			if(typeOfAccount == 2 && qtdMcubicos >= 80) {
				valorPagoEmReal = (float)(500 + (qtdMcubicos - 80) * 0.25);
				nameOfAccount = "Comercial";
				System.out.print("O seu tipo de conta é " + nameOfAccount + " e o valor a ser pago em Reais é R$: " + valorPagoEmReal );
			}
			else{
				if(typeOfAccount == 2) {
					valorPagoEmReal = 500;
					nameOfAccount = "Comercial";
					System.out.print("O seu tipo de conta é " + nameOfAccount + " e o valor a ser pago em Reais é R$: " + valorPagoEmReal );
				}
				else {
					if(typeOfAccount == 3 && qtdMcubicos >= 100) {
						valorPagoEmReal = (float)(800 + (qtdMcubicos - 100) * 0.04);
						nameOfAccount = "Industrial";
						System.out.print("O seu tipo de conta é " + nameOfAccount + " e o valor a ser pago em Reais é R$: " + valorPagoEmReal );
					}
					else {
						if(typeOfAccount == 3) {
							valorPagoEmReal = 800;
							nameOfAccount = "Industrial";
							System.out.print("O seu tipo de conta é " + nameOfAccount + " e o valor a ser pago em Reais é R$: " + valorPagoEmReal );
						}
						else {
							System.out.print("Insira um tipo de conta válido");
						}
					}
				}
			}
		}
	}	
}
