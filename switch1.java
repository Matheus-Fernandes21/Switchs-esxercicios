
import java.util.Scanner;


public class switch1{

   
	public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        String codigo;
        
        
        System.out.println("Digite código do produto: ");
        codigo = leitor.next();
        
        
        switch(codigo){
            case "001":
                System.out.println("Parafuso");
                break;
            case "002":
                System.out.println("Porca");
                break;
            case "003":
                System.out.println("Prego");
                break;
            case "004":
                System.out.println("Ferramenta");
                break;
                
            default:
                System.out.println("Codigo invalido tente outra vez.");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}