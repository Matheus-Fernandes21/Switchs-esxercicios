import java.util.Scanner;
public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner leitor = new Scanner(System.in);
		
		String codigo;
		int quantidade;
		double cachorro = 3.20;
		double bauroS = 4.30;
		double bauroO = 5.50;
		double hamburguer = 3.20;
		double cheeseburguer = 4.30;
		double refrigerante = 4.00;
		
		double soma;
		int resposta =1;
		
		while(resposta ==1) {
			System.out.println("Produto |Código|Preço");
	        System.out.println("Cachorro quente|100   |3,20");
	        System.out.println("Bauru simples  |101   |4,30");
	        System.out.println("Bauru com ovo  |102   |5,50");
	        System.out.println("Hambúrger      |103   |3,20");
	        System.out.println("Cheeseburguer  |104   |4,30");
	        System.out.println("Refrigerante   |105   |4,00");
	        
	        System.out.println("digite o codigo do seu pedido");
	        codigo = leitor.next();
	        
	            switch (codigo){
	        	case"100":
	        		System.out.println("Quantidade: ");
	                quantidade = leitor.nextInt();
	                soma = quantidade * cachorro;
	                System.out.printf("Valor a pagar: R$%.2f\n", soma);
	                break;
	                
	        	case"101":
	        		System.out.println("Quantidade: ");
	                quantidade = leitor.nextInt();
	                soma = quantidade * bauroS;
	                System.out.printf("Valor a pagar: R$%.2f\n", soma);
	                break;
	        	
	        	case"102":
	        		System.out.println("Quantidade: ");
	                quantidade = leitor.nextInt();
	                soma = quantidade * bauroO;
	                System.out.printf("Valor a pagar: R$%.2f\n", soma);
	        	    break;
	        	
	        	case"103":
	        		System.out.println("Quantidade: ");
	                quantidade = leitor.nextInt();
	                soma = quantidade * hamburguer;
	                System.out.printf("Valor a pagar: R$%.2f\n", soma);
	                break;
	                
	        	case"104":
	        		System.out.println("Quantidade: ");
	                quantidade = leitor.nextInt();
	                soma = quantidade * cheeseburguer;
	                System.out.printf("Valor a pagar: R$%.2f\n", soma);
	                break;
	        	
	        	case"105":
	        	System.out.println("Quantidade: ");
                quantidade = leitor.nextInt();
                soma = quantidade * refrigerante;
                System.out.printf("Valor a pagar: R$%.2f\n", soma);
                break;
                
                default:
                	System.out.println("codigo invalido");
	              	            
	            
	            
	            
	            
	            
	            
	            
	            }
		
		
		
	            System.out.println("Deseja compra mais [1] caso não [2]");
	            resposta = leitor.nextInt();
	            
	            if(resposta <1 ){
	                
	            } else{
	                System.out.println("ate a proxima.");
	            }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
		
	}

