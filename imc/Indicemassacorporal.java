
package indicemassacorporal;

import java.util.Scanner;

public class Indicemassacorporal {

  
    public static void main(String[] args) {
        float altura, peso, resultado;
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu peso em kg: ");
        peso = entrada.nextFloat();
        
        
        System.out.println("Digite a sua altura em metros(Exemplo:1,7): ");
        altura = entrada.nextFloat();
        
        resultado = peso/(altura*altura);
        
        System.out.println("O seu IMC é: "+resultado);
        
        System.out.println("Menor que 18,5: Abaixo do peso");
        System.out.println("Entre 18,6 e 24,9: Peso normal");
        System.out.println("Entre 25,0 e 29,9: Levemente acima do peso");
        System.out.println("Entre 30,0 e 34,9: Obesidade grau 1");
        System.out.println("Entre 35, 0 e 39,9: Obesidade grau 2");
        System.out.println("Acima de 40: Obesidade grau 3");
        
      
    }
    
}
