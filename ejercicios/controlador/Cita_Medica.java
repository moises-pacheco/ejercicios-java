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
        //Variable para almacenar la respuesta del usuario.
        int respuestaUsuario;

        //Variables para almacenar la suma se asistencias para cada prueba.
        int pruebaPCR = 0, pruebaAnalisisDeSangre = 0;

        //Precio de cada consulta:
        double precioPCR = 120, precioADS = 60;

        //Total
        double totalPCR = 0, totalADS = 0;

        System.out.println("Bienvenido a la cita médica");

        //El bucle se repetirá siempre que exista algún paciente en la fila.
        do {

            //Se le pregunta al paciente cuál es el motivo de sus asistencia.
            System.out.println("⬇ ¿Cuál es el motivo de asistencia? ⬇ \n1 -> Análisis de sangre \n2 -> Prueba COVID-19\nIntroduzca el número dependiendo de lo que necesite: ");

            //Restringimos las respuestas que no sean dadas por el programa y se repitará hasta que se introduzca un dato válido.
            do {
                //Se almacena la respuesta del usuario.
                respuestaUsuario = sc.nextInt();

                //Dependiendo de lo que seleccione el usuario, se realizará alguna acción.
                switch (respuestaUsuario) {
                    //Si selecciona la prueba de 'Análisis de sangre' se le sumará una asistencia a la consulta.
                    case 1:
                        pruebaAnalisisDeSangre++;
                        System.out.println("Usted viene por 'analisis de sangre'.\nDiríjase a la sala 200 por favor.");
                        break;

                    //Si selecciona la prueba de 'PCR' se le sumará una asistencia a la consulta.
                    case 2:
                        pruebaPCR++;
                        System.out.println("Usted viene por 'prueba de PCR'.\nDiríjase a la sala 204 por favor.");
                        break;

                    //Si no es ninguna de las anteriores, le indicamos al usuario que tiene que introducir un valor válido.
                    default:
                        System.out.println("Introduce un número válido, por favor.");
                }

            } while (respuestaUsuario != 1 && respuestaUsuario != 2); //El bucle se repetirá  hasta que el usuario introduzca un valor válido.

            //Se le pregunta al usuario si existen más pacientes en la fila.
            System.out.println("----");
            System.out.println("¿Hay más pacientes en la fila?\n1 -> Si\n0 -> No");

            //El bucle se repetirá siempre y cuando el usuario introduzca un dato inválido.
            do {

                //Se almacena la respuesta del usuario.
                respuestaUsuario = sc.nextInt();

                //Si la respuesta no es un valor válido, se le comunicará al usuario que seleccione un dato válido.
                if (respuestaUsuario != 1 && respuestaUsuario != 0) {
                    System.out.println("Introduce un número válido. Por favor.");
                }

            } while (respuestaUsuario != 1 && respuestaUsuario != 0); //El bucle se repetirá siempre y cuando el usuario introduzca un dato inválido.

        } while (respuestaUsuario != 0); //El bucle se repetirá siempre que exista algún paciente en la fila.

        //Calcular cuántas citas ha tenido cada consulta y las ganancias de las mismas.
        totalADS = pruebaAnalisisDeSangre * precioADS;
        totalPCR = pruebaPCR * precioPCR;

        //Indicamos cuánto ha generado cada consulta:
        System.out.println("-------------------------\n");
        System.out.println("ANÁLISIS DE SANGRE: Total de citas: " + pruebaAnalisisDeSangre + ". Ganancias: " + totalADS + "€\nPRUEBA COVID-19: Total de citas: " + pruebaPCR + ". Ganancias: " + totalPCR + "€");

    }
}
