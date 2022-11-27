import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // Pido al usuario que escriba una frase
        System.out.println("Escriba una frase");
        // Recomiendo usar nextLine en lugar de next por los espacios
        String frase = sn.nextLine();
        // Creamos un array de caracteres usando el metodo de String
        char caracteres[] = frase.toCharArray();
        // Recorremos la frase y cogemos cada caracter y lo metemos en el array
        for (int i = 0; i < frase.length(); i++) { // se iguala i=0
            System.out.println("En la posicion del array : " + i + " tenemos el caracter : " // quitamos el +1 para que
                                                                                             // no lo muestre en
                                                                                             // pantalla
                    + caracteres[i]); // se quita el +1 de la variable, para que muestre la posición real
        }
    }
}