
package milhas;

import java.util.Scanner;

public class Milhas {

  
    public static void main(String[] args) {
        float km, milhas, resultado;
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero em km: ");
        km = entrada.nextFloat();
        
        milhas = (float) 1.609;
        
        resultado = km/milhas;
        
        System.out.println("O resultado em milhas é: "+resultado);
        
        
    }
    
}
