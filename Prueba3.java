public class Prueba3 {
    public static void main(String[] args) {
        // Creo un array
        int[] numeros = new int[100];
        // Declaro las variables necesarias
        int suma = 0;
        double media;
        // Recorro el array, asigno números y sumo
        for (int i = 0; i < numeros.length; i++) { // se iguala i=0 y se quita -1 de length
            numeros[i] = i + 1;
            suma += numeros[i];
        }
        // Calculo la media y muestro la suma y la meda
        System.out.println("La suma es " + suma);
        media = (double) suma / numeros.length; // se quita -1 de lenght
        System.out.println("La media es " + media);
    }
}