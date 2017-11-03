package cod_ej;

import java.util.Scanner;

public class COD_EJ {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca o nome da primeira persoa:");
        String nome1 = sc.next();
        System.out.println("Introduzca o peso primeira persoa:");
        float peso1 = sc.nextFloat();
        System.out.println("Introduzca o nome da segunda persoa:");
        String nome2 = sc.next();
        System.out.println("Introduzca o peso da segunda persoa:");
        float peso2 = sc.nextFloat();
        
        if (peso1>peso2){
            System.out.println("Nome: "+nome1+" Peso: "+peso1);
            System.out.println("DIferencia: "+(peso1-peso2));
        }
        else{
            System.out.println("Nome: "+nome2+" Peso: "+peso2);
            System.out.println("DIferencia: "+(peso2-peso1));
        }
        System.out.println("hola caracola");
    }
    
}
