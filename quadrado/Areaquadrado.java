import java.util.*;
import java.util.Scanner;
package areaquadrado;


public class Areaquadrado {


    public static void main(String[] args) {
        float base, altura, area;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        System.out.println("Digite a base do quadrado:");
        
        base = entrada.nextFloat();
        
        System.out.println("Digite a altura do quadrado");
        
        altura = entrada.nextFloat();
        
        area = (altura * base)/1;
        
        System.out.println("Area do quadrado:"+area);
                
        
        
        
    }
    
}
