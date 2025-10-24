package controlador;

import java.util.Scanner;

public class Centro_De_Estudios {
    public static void main(String[] args) {
       /*

        Un centro de estudios nos ha solicitado que realicemos un algoritmo para saber la motivación
        que tienen los alumnos para estudiar programación.

        Para ello quiere realizar una serie de preguntas y según la respuesta
        valorar su interés por estos estudios.

        Cada respuesta tendrá un valor de 0 o 1 siendo el resultado el procentaje
        total la suma de los valores obtenidos.

        Si el valor obtenido en el primer intento es superiror al 80% el ejercico le dará
        la enhorabuena, si es inferior le pedirá volver a realizar el test
        con todas las preguntas hasta dos veces más. (El alumno solo podrá realizar la prueba tres veces).

        Si el alumno ha tenido que realizar el test las tres veces, y si la media de los
        resultados es inferior al 50%, se le pedirá que se lo comente a su profesor.
        Si es superior el programa terminará y le dará la enhorabuena.

        Las preguntas para realizar son:
        1. ¿Te gustan las computadoras?
        2. ¿Disfrutas con la resolución de problemas?
        3. ¿Quieres trabajar en equipo?
        4. ¿Te agrada aprender por descubrimiento o prefieres que te indiquen las cosas paso a paso?
        5. ¿Eres creativo?
        6. ¿Eres resolutivo?
        7. ¿Te riendes al primer intento?
        8. Estás dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida?

         */

        //Creación del Scanner para obtener las respuestas del Usuario.
        Scanner sc = new Scanner(System.in);

        //Variables que se usarán en el programa.
        int puntos, respuestaRecibida, numPreguntas = 8, numIntentos = 3; //Variable para acumular puntos, almacenar la respuesta del usuario, los numeros de intentos y el número de preguntas.
        double porcentaje, puntosObtenidos; //Variables para calcular el porcentaje y para almacenar los puntos obtenidos.

        //Variable para sacar el porcentaje si el número de intentos se acaba.
        int respuestaAcumulativo = 0;

        //Variable que almacena la cantidad total de preguntas en el número de intentos que quieras.
        int numeroTotalDePreguntas = numPreguntas * numIntentos;


        //Variable para almacenar el nombre del usuario.
        String nombreUsuario;


        //--------------------------------------------------------------------

        //Le preguntamos al usuario su nombre
        System.out.println("Bienvenido. Indicanos tu nombre, por favor.");
        nombreUsuario = sc.nextLine(); //Almacenamos el nombre del usuario en una variable.

        //Saluda al usuario y le da un mensaje para realizar el test.
        System.out.println("¡Hola " + nombreUsuario + "! Hoy realizarás un cuestionario para saber la motivación que tienes para aprender programación.");

        //Iniciamos un bucle que se repetirá hasta que el porcentaje sea menor a 80% y el número de itentos sea mayor a 0.
        do {

            numIntentos--; //Por cada vuelta del bucle, se le resta al número de intentos un -1.
            puntos = 0; //Inicializamos la variable "puntos" a 0 cada vez que se repita el bucle.

            System.out.println("1. ¿Te gustan las computadoras? (SI: [1] /NO: [2])"); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }


            System.out.println("2. ¿Disfrutas con la resolución de problemas? (SI: [1] /NO: [2])"); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }


            System.out.println("3. ¿Quieres trabajar en equipo? (SI: [1] /NO: [2])"); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }

            System.out.println("4. ¿Te agrada aprender por descubrimiento o prefieres que te indiquen las cosas paso a paso? (POR DESCUBRIMIENTO: [1] /PASO A PASO: [2])."); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }


            System.out.println("5. ¿Eres creativo? (SI: [1] /NO: [2])"); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }

            System.out.println("5. ¿Eres resolutivo? (SI: [1] /NO: [2])"); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }

            System.out.println("6. ¿Te riendes al primer intento? (SI: [1] /NO: [2])."); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "No" se le suma un punto.
            if (respuestaRecibida == 2) {
                puntos++;
            }

            System.out.println("7. ¿Estás dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida? (SI: [1] /NO: [2])."); //Pregunta
            respuestaRecibida = sc.nextInt(); //Almacena la respuesta del usuario.

            //Si la respuesta es "Si" se le suma un punto.
            if (respuestaRecibida == 1) {
                puntos++;
            }

            //Si utiliza todas las oportunidades, se usará todo a continuación:
            respuestaAcumulativo = respuestaAcumulativo + puntos; //Variable que almacena los puntos totales obtenidos de los tres intentos.


            //Si no se utiliza todas las oportunidades, se usará todo a continuación:
            puntosObtenidos = puntos; //Variable que almacena los puntos obtenidos de cada bucle.
            porcentaje = ((double) puntosObtenidos / numPreguntas) * 100; //Se hace la operación para poder obtener el porcentaje según las respuestas correctas.

            //Condición que verifica si el porcentaje es menor a "80" y si no se ha acabado los tres intentos.
            if (porcentaje < 80.0 && numIntentos > 0) {
                System.out.println("Puntos hasta ahora: " + respuestaAcumulativo);
            }

            //Si es mayor a 80%, felicitamos al usuario y termina el programa.
            if (porcentaje > 80.0 && numIntentos > 1) {
                System.out.println("¡Enhorabuena " + nombreUsuario + "! Has superado el test. Felicidades.");

                //Si el porcentaje es menor a 80% y el número de intentos es mayor a 0: Advertimos al usuario que no tiene los puntos suficientes para pasar la prueba y se le avisa del número de intentos.
            } else if (porcentaje < 80.0 && numIntentos > 0) {
                System.out.println(nombreUsuario + ", no cumpliste con los requisitos, te daremos otra oportunidad. \nTe quedan: " + numIntentos + " intentos.\n-----------------------------------------");
            }

        } while (porcentaje < 80.0 && numIntentos > 0);

        //Operación que calcula el porcentaje si el usuario utiliza los tres intentos.
        porcentaje = ((double) respuestaAcumulativo / numeroTotalDePreguntas) * 100;

        //Redondeo el resultado del porcentaje para que únicamente contenga un decimal.
        double redondeado = Math.round(porcentaje * 10.0) / 10.0;

        /*
        Al salir del bucle, si el porcentaje es menor a 50% y si utilizó todos los intentos, sale un mensaje en consola
        que le comunica que tiene que hablar con su profesor.
         */
        if (porcentaje < 50.0 && numIntentos == 0) {
            System.out.println("No has superado el test " + nombreUsuario + ". Por favor, comunicaselo a tu profesor. \nTu porcentaje fue de: " + redondeado + "% y acabaste con todos los intentos...");
        }

    }
}