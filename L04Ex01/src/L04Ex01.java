import java.util.Scanner;
public class L04Ex01 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int idade1, idade2, idade3, idadeMonica;
		
		System.out.print("Insira a idade de Dona Mônica: ");
		idadeMonica = input.nextInt();
		System.out.print("Insira a idade de um filho: ");
		idade1 = input.nextInt();
		System.out.print("Inisra a idade de outro filho: ");
		idade2 = input.nextInt();
		
		idade3 = idadeMonica - (idade1 + idade2);
		
		if(idadeMonica == idade1 + idade2 + idade3) {
			if(idade1 > idade2 && idade1 > idade3) {
				System.out.print("O filho mais velho tem: " + idade1);
			}
			else {
				if(idade2 > idade1 && idade2 > idade3) {
					System.out.print("O filho mais velho tem: " + idade2);
				}
				else {
					System.out.print("O filho mais velho tem: " + idade3);
				}
			}
		}
		else {
			System.out.print("Insira idades válidas");
		}
	}
}

