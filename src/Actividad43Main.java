import java.util.Random;
import java.util.Arrays;
public class Actividad43Main {
    public static void main(String[] args) {
        // Crea un array con 10 números aleatorios
        System.out.println("1. Creamos un array con 10 numeros aleatorios");
        int[]a=new int[10];
        arrayRandom(a);
        System.out.println(Arrays.toString(a));
        System.out.println();

        // Imprime el array anterior empezando por la última posición
        System.out.println("2. Imprime el array anterior empezando por la última posición");
        imprimeLast(a);
        System.out.println();

        // Ordena el array utilizando la clase de utilidades Arrays
        System.out.println("3. Ordena el array utilizando Array.sort");
        int []arrayOrdenado=ordenArray(a);
        System.out.println(Arrays.toString(arrayOrdenado));
        System.out.println();

        // Busca un número recibido como parámetro dentro del array. Por dos metodos diferentes:
        // Manual
        System.out.println("4.1. Busqueda de un numero de forma manual");
        System.out.println(manualSearch(a,25));
        System.out.println();
        // Clase Arrays de Java
        System.out.println("4.2. Busqueda de un numero usando el metodo binarySearch");
        System.out.println(Arrays.binarySearch(a,25));
        System.out.println();

        // Compara dos arrays recibidos por parametros, devolviendo si son iguales o no
        System.out.println("5. Comparación entre dos arrays");
        int[]b=a;
        System.out.println("Los arrays son iguales? "+compararArrays(a,b));
        System.out.println();

        // Realiza 4 copias del array en nuevo array de cuatro posiciones
        // Crearemos un metodo por cada tipo de copia
        System.out.println("6. Realizamos 4 copias del array en un nuevo array");
        int [][] clonArray=new  int[4][0];
        System.out.println();

        //Usamos primero el metodo clone
        System.out.println("6.1. Copia de array usando el metodo clone");
        clonacionArrays(a,clonArray);
        System.out.println();

        //Usamoos el metodo copyOf
        System.out.println("6.2. Copia de array usando el metodo copyOf");
        copyOfArrays(a, clonArray);
        System.out.println();

        //Usamos el metoodo copyOfRange
        System.out.println("6.3. Copia de un array usandoo el metodo copyOfRange");
        copyOfRangeArrays(a,clonArray);
        System.out.println();

        //Usamos el metodo Arraycopy
        System.out.println("6.4. Copia del array usando el metodo Arraycopy de la clase System");
        systemArrayCopy(a,clonArray);
        System.out.println();

        //Ahora imprimimos el contenido del array
        System.out.println("Resultadoo del ejercicio 6: ");
        imprimirArrayClonado(clonArray);

    }
    // Metodo numero aleatorio
    public static int [] arrayRandom(int[]a){
        Random r1=new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]= (int) r1.nextInt(50);
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

    // Metodo ordenar array
    static int[] ordenArray (int[]a){
        int[] b=a.clone();
        Arrays.sort(b);
        return b;
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

    // Metodo comparar arrays
    static boolean compararArrays(int[]a, int[]b){
        boolean xd=Arrays.equals(a,b);
        return xd;
    }

    // Metodo copia de arrays
    static void clonacionArrays(int []original,int[][]copia){
        copia[0]=original.clone();
        System.out.println(Arrays.toString(copia[0]));
    }
    static void copyOfArrays(int []original,int[][]copia){
        copia[1]=Arrays.copyOf(original,original.length);
        System.out.println(Arrays.toString(copia[1]));
    }
    static void copyOfRangeArrays(int []original,int[][]copia){
        copia[2]=Arrays.copyOfRange(original,0,original.length);
        System.out.println(Arrays.toString(copia[2]));
    }
    static void systemArrayCopy(int []original,int[][]copia){
        int[] systemCopy=new int[original.length];
        System.arraycopy(original,0,systemCopy,0,original.length);
        copia[3]=systemCopy;
        System.out.println(Arrays.toString(copia[3]));
    }
    static void imprimirArrayClonado(int[][]clon){
        System.out.println(Arrays.toString(clon[0])+", "+Arrays.toString(clon[1])+", "+Arrays.toString(clon[2])+", "+Arrays.toString(clon[3]));
    }
}