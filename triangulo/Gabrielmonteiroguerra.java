import java.util.*;
import java.util.Scanner;


package gabrielmonteiroguerra;


public class Gabrielmonteiroguerra {

 
    public static void main(String[] args) {
    float base, altura, area;
    Scanner entrada;
    
    entrada = new Scanner(System.in);
    
        System.out.println("Digite a base do triangulo:");
        
        base = entrada.nextFloat();
        
        
        System.out.println("Digite a altura do triangulo:");
        
        altura = entrada.nextFloat();
        
        area = (base*altura)/2;
        
        System.out.println("Area do triangulo="+area);
        
    
    
    }
    
}
