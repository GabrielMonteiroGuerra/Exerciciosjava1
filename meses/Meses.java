
package meses;

import java.util.Scanner;
public class Meses {

  
    public static void main(String[] args) {
      
       float meses, dias, resultado;
       Scanner entrada;
       entrada = new Scanner(System.in);
        System.out.println("Digite o número em meses:");
        meses = entrada.nextFloat();
        
        dias = 30;
        
        
        resultado = (meses * dias);
        
        System.out.println("O resultado em dias é "+resultado);
     
        
    }
    
}
