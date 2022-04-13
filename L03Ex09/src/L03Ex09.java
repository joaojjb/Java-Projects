import java.util.Scanner;
public class L03Ex09 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int dia, tipo;
		float preco;
		
		System.out.print("Insira o preço normal da fita: ");
		preco = input.nextFloat();
		System.out.print("Insira o dia da semana, sendo 1 para domingo e 7 para sábado: ");
		dia = input.nextInt();
		System.out.print("Insira a categoria, sendo 1 para comum e 2 para lançamento: ");
		tipo = input.nextInt();
		
		if(tipo == 1 || tipo == 2 ){
			if(tipo == 2) {
				preco = preco + (preco * 15/100);
			}
		}
		else {
			System.out.print("Categoria Inválida");
		}
		
		if(dia >= 1 && dia <= 7) {
			if(dia == 2 || dia ==3 || dia ==5) {
				preco = preco - (preco * 40/100);
				System.out.print("O preço à pagar é de: R$ " + preco );
			}
			else {
				System.out.print("O preço à pagar é de: R$ " + preco );
			}
		}
		else {
			System.out.print("Insira um dia Inválido");
		}
		
	}
}
