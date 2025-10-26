package controlador;

import java.util.Scanner;

public class Cita_Medica {
    public static void main(String[] args) {
        //Programa para gestionar los dos tipos de cita.
        //Sumar cuantas citas tuvieron cada una y sacar la cuenta de cuánto se generó

        //Funciones del programa:
        /*
            1. Al iniciar el programa se iniciará un contador para los diferentes tipos de consultas en: 1.
            2. Cada ves que se realice una consulta, introducirán un 1 si se trata de análisis de sangre y un 2 si se trata de la prueba del COVID.
            3. Cada vez que indiquen el tipo de consulta, el programa imprimirá el número de turno siguiente.

            Ejemplo:

            - Pulsa 1, el programa imprime el siguiente número de turno.
                Análisis - turno 2...

            - Pulsa 2, el programa imprime el siguiente número de turno.
                Prueba COVID, turno2...

             Cuando terminen las consultas pulsando el 0, el programa terminará e informa de cuántos pacientes ha tenido cada consulta y lo que han facturado.

             El análisis de sangre cuesta 60 euros y la prueba del covid 120.
         */

        //Scanner para poder obtener la respuesta el usuario.
        Scanner sc = new Scanner(System.in);

        //Variables para almacenar la suma se asistencias para cada prueba.
        int pruebaPCR = 0, pruebaAnalisisDeSangre = 0, respuestaUsuario;

        //Precio de cada consulta:
        double precioPCR = 120, precioADS = 60;

        //Total
        double totalPCR = 0, totalADS = 0;

        do {

            System.out.println("Bienvenido a la consulta médica. \n¿Cuál es su motivo de asistencia?: [Número 1: ANÁLISIS DE SANGRE / Número 2: PRUEBA COVID-19]");
            respuestaUsuario = sc.nextInt();


            switch (respuestaUsuario) {
                case 1:
                    pruebaAnalisisDeSangre++;
                    System.out.println("Diríjase a la sala de análisis de sangre, por favor.");
                    break;

                case 2:
                    pruebaPCR++;
                    System.out.println("Diríjase a la sala de prueba PCR, por favor.");
                    break;
            }

            System.out.println("¿Hay más pacientes en la fila? [1: SI / 0: NO");
            respuestaUsuario = sc.nextInt();

        } while (respuestaUsuario != 0);

        //Caulcular cuántas citas ha tenido cada consulta.
        totalADS = pruebaAnalisisDeSangre * precioADS;
        totalPCR = pruebaPCR * precioPCR;

        //Indicamos cuánto ha generado cada consulta:
        System.out.println("La prueba de análisis de sangre ha obtenido un total de: " + totalADS + "€\nLa prueba de COVID-19 ha obtenido un total de: " + totalPCR + "€");

    }
}
