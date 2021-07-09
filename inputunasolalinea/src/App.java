import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // algoritmo que lea datos digitados en una sola linea y los almacene en un
        // array
        // 123 45 67 7 56.3
        int i;
        Scanner leer = new Scanner(System.in);
        String dato_entrada = "", dato_salida = "";
        System.out.println("Digite los datos");
        dato_entrada = leer.nextLine();
        System.out.println(dato_entrada);
        String[] datos_Arreglo = dato_entrada.split(" ");
        System.out.println(datos_Arreglo.length);
        for (i = 0; i < datos_Arreglo.length; i++) {
            System.out.println(datos_Arreglo[i]);
        }
        for (i = 0; i < datos_Arreglo.length; i++) {
            if (i > 0) {
                dato_salida = dato_salida + "," + datos_Arreglo[i];
            } else {
                dato_salida = datos_Arreglo[i];
            }
        }
        System.out.println("los datos concatenados son:  " + dato_salida);

    }
}
