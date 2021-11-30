
public class Ej05 {

    public static void main(String[] args) {
        int num, i, suma, perf = 0;
        System.out.println("First 3 perfect numbers: ");
        for (num = 1; perf < 3; num++) {      // num es el número que vamos a analizar para ver si es o no perfecto.
            //creamos un bucle for que tiene por condición parar cuando tengamos 3 números perfectos. 
            //Hasta entonces irá analizando números ya que en cada iteración a numl se le suma 1.
            suma = 0; //variable que suma los divisores de los num.
            //al inicio de cada iteracion, donde num cambia, la inicializamos a 0 para que empiece a sumar divisores desde 0
            for (i = 1; i < num; i++) {    // i son los divisores. Repetiremos el buche hasta que i llegue a num. 
                if (num % i == 0) {//miramos los divisores
                    suma = suma + i; // si es divisor se suma
                }
            }
            if (num == suma) {             // si el número es igual a la suma de sus divisores es perfecto              
                System.out.println(i);
                perf++;//en tal caso le sumamos +1 al contador de números perfectos
            }
        }
    }

}
