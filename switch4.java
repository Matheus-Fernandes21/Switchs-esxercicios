
import java.util.Scanner;

public class switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int opc;
		double media;
		double nota1, nota2, nota3;
		int peso1 = 3;
		int peso2 = 3;
		int peso3 = 4;
		
		System.out.println("Opcao 1: média aritmética.\n"
				+ "Opcao 2: ponderada (pesos 3,3,4).");
		opc = leitor.nextInt();
		
		switch (opc){
		case 1 :
			System.out.println("Qual foram suas notas");
			
			System.out.println("Nota1:");
			nota1 = leitor.nextInt();
			System.out.println("Nota2:");
			nota2 = leitor.nextInt();
			System.out.println("Nota3:");
			nota3 = leitor.nextInt();
			
			
			media = (nota1+nota2+nota3 /3);
			System.out.printf("Nota final:%.2f\n", media);
			break;
			
		case 2 :
			System.out.println("Qual foram suas notas:");
			
			System.out.println("Nota1:");
			nota1 = leitor.nextInt();
			System.out.println("Nota2:");
			nota2 = leitor.nextInt();
			System.out.println("Nota3:");
			nota3 = leitor.nextInt();
			
			
			media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
			System.out.printf("Nota final:%.2f\n",media);
			break;
			
			
			
		}
		
		
		
		

	}
}
