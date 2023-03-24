
package ex_ev02_01;
//Marcos
 import java.util.Scanner;//Se importan scaneres
 import java.util.Arrays;// se importan arrays
public class EX_EV02_01_Marcos {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);// se inserta un scanner
        System.out.println("Escriba cuantos numeros va a tener su tabla");// se le pide al usuario la cantidad de numero en su tabla
        int numnum = sc.nextInt();// se le asigna a una variable el numero de numeros que se quiere
        int t[] = new int [numnum];// se le asigna la cantidad de numeros a la longitud de la tabla
        int contI = 0;
        for (int i = 0; i< t.length;  ){// se recorre la tabla
            System.out.println("Introduzca un numero par");// se le pide al usuario que introduzca numeros pares
            int num = sc.nextInt();// se obtiene un numero
            if (num % 2 == 0){// si se introduce un numero par
            t[i] = num;// se añade a la tabla
            i++;
            }
            else{// si es impar
            contI++;// no se añade y aumenta el contador de impares
            }
        }
        System.out.println("Tu tabla es:");// se muestra la tabla al usuario
        System.out.println(Arrays.toString(t));// se usa Arrays.toString para no tener que volver a recorrer la tabla
        System.out.println("Y introduciste esta cantidad de numeros impares: " + contI);// se muestra el contador de impares
    }
    
}
