import java.util.Scanner;

public class L03Ex06{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;

		System.out.print("Insira um número inteiro: ");
		num = input.nextInt();

       if(num > 0){
    	   if(Math.sqrt(num) * Math.sqrt(num) == num){
    		   System.out.print("Quadrado Perfeito");
    		   }
    	   else{
    		   System.out.print("Quadrado Imperfeito");
    	   }
       }
       else{
    	   System.out.println("Insira um número válido");
       }
	}
}