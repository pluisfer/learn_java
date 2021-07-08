import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception { //Método por defecto que se ejecutará al compilar el algoritmo
       
        Scanner leer = new Scanner(System.in);//Definición de una variable de tipo Scanner para leer datos 
        int edad = 0; //Definición e inicialización de variables
        
        //Leer una edad y determinar si es mayor o menor de edad
        System.out.println("Ejemplo de Condicional");
        System.out.println("Digite una edad"); //Mostrar un mensaje
        System.out.println("Digite una edad 2"); //Mostrar un mensaje
        edad = leer.nextInt(); //Leer un dato y convertirlo a entero.

        if(edad >= 18 && edad <=120 ){
            System.out.println(edad+" Es mayor de edad"); //Mostrando un mensaje
            if(edad > 90){
                System.out.println(edad+" Es longevo"); //Mostrando un mensaje
            }
        }
        else if(edad < 0 || edad >=121 ){
            System.out.println("Edad incorrecta"); //Mostrando un mensaje
        }
        else{
            System.out.println(edad+" Es menor de edad"); //Mostrando un mensaje
        }
    }
}
