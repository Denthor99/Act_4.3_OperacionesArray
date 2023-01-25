import java.util.Random;
import java.util.Arrays;
public class Actividad43Main {
    public static void main(String[] args) {
        // Crea un array con 10 números aleatorios
        int[]a=new int[10];
        arrayRandom(a);
        System.out.println(Arrays.toString(a));
        // Imprime el array anterior empezando por la última posición
       imprimeLast(a);

        // Ordena el array utilizando la clase de utilidades Arrays
        Arrays.sort(a);

        // Busca un número recibido como parámetro dentro del array. Por dos metodos diferentes:
        // Manual
        System.out.println(manualSearch(a,25));
        // Clase Arrays de Java
        System.out.println(Arrays.binarySearch(a,25));

        // Compara dos arrays recibidos por parametros, devolviendo si son iguales o no
        int[]b=new int[10];
        arrayRandom(b);
        System.out.println(Arrays.equals(a,b));

        // Realiza 4 copias del array en nuevo array de cuatro posiciones
        int[][]copy=new int[10][3];
        copyArrays(a,copy);
    }
    // Metodo numero aleatorio
    public static int [] arrayRandom(int[]a){
        Random r1=new Random();
        for (int i = 0; i < a.length; i++) {
            int b = (int) r1.nextInt(50);
            a[i] = b;
        }
        return a;
    }

    // Metodo imprimir el array al réves
    public static int [] imprimeLast(int[]a){
        System.out.print("[");
        for (int i = a.length-1; i >= 0; i--) {
            if(a[i]!=a[0]) {
                System.out.print(a[i]);
                System.out.print(", ");
            }else if (a[i]<=a[0]) {
                System.out.print(a[i]);
                System.out.print("");
             }
            }
        System.out.print("]");
        System.out.println("");
        return a;

    }

    // Metodo de busqueda manual
     static int manualSearch(int[]a, int x){
        for (int i = 0; i < a.length; i++) {
            if(x==a[i]){
                return i;
            }
        }
        return -1;
    }

    // Metodo copia de arrays
    static int copyArrays(int []a,int[][]s){
        for (int i = 0; i < s.length; i++) {
            s[i][0]=a.clone();
            s[i][1]=Arrays.copyOf(a,10);
            s[i][2]=Arrays.copyOfRange(a,0,9);
            s[i][3]=System.arraycopy(a,0,s,0,a.length);
        }
        return a;
    }
}