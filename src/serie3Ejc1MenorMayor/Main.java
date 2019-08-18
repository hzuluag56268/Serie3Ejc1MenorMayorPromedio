/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie3Ejc1MenorMayor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, numero;

        Metodos metodos = new Metodos();

        do {
            System.out.println("\n\n\tSeleccione una de las siguientes opciones: \n\n1. Ingresar un numero"
                    + "\n2. mostrar numero mayor \n3. Mostrar numero menor. \n4. Indicar promedio \n5. Mostrar los numeros ingresados hasta ahora"
                    + "\n6. Salir del sistema" + "\n\n");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese un nuevo numero------ ");
                    numero = teclado.nextInt();
                    metodos.insertarNumero(numero);
                    break;
                case 2:
                    metodos.mostrarDatoMayor();
                    break;
                case 3:
                    metodos.mostrarMenorValor();
                    break;
                case 4:
                    metodos.promedio();
                    break;
                case 5:
                    metodos.mostrarTodo();
                    break;
                case 6:
                    System.out.println("Bye bye");
                    break;
                   

                default:
                    System.out.println("El numero que ingresaste no esta disponible en el momento, intenta nuevamente");
                    break;
            }
        } while (opcion != 6);
    }

}
