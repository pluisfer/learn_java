import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejemplos de Ciclos");
        Scanner leer = new Scanner(System.in);
        int numero = 0;

        //Ejemplo del mientras
        //Mostrar el mensaje hola mientras no se digite un número entero negativo
        
        /*
        while(numero>=0){ //Mientras
            System.out.println("Hola");
            System.out.print("Digite un número");
            numero = leer.nextInt();
        }
        */

        //Mostrar los números del 0 al 10 empleando el ciclo mientras
        numero = 11;
        while(numero<11){//Mientras numero sea menor a 11
            System.out.println(numero);
            numero++; //Incrementa en 1 la variable numero. Es igual a numero = numero + 1
            //numero = numero +1;
            //numero +=4; //Incrementos de 4
        }

        //Mostrar los números del 0 al 10 empleando el ciclo para
        for(numero=0;numero<11;numero++){//Ciclo para. numero=0 Limite inferior: donde inicia. Hasta donde va: numero<11. numero ++: incrementar
            System.out.println(numero); 
        }

        //Mostrar los números del 10 al 0 empleando el ciclo para
        System.out.println("Algoritmo Ciclo Para Decremento");
        for(numero=10;numero>=0;numero--){//Ciclo para. numero=0 Limite inferior: donde inicia. Hasta donde va: numero<11. numero ++: incrementar
            System.out.println(numero); 
        }

        //Mostrar los números del 0 al 10 con el ciclo do-while
        System.out.println("Ejemplo Do-While");
        numero = 11;
        do{ //Hacer
            System.out.println(numero);
            numero++;
        }while(numero<11);//Siempre se ejecuta una vez independientemente de la condición
    }
}