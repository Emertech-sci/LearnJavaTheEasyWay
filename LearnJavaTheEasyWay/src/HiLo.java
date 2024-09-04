// (ES) La clase Scaner permite tener varias propiedades que ayudan a nuestro codigo como nextLine()
import java.util.Scanner;
// (ES) La clase HiLo es publica lo que significa que significa que se puede correr desde la terminal.
// (EN) The class HiLo is public, meaning we can run it from the terminal or command line.

public class HiLo {
    //El metodo main() es el que correra cuando se ejecute la clase HiLo.
    //The method main() will run when we execute the class HiLo.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /* (ES) Crear un numero aleatorio para que el usuario adivine, haremos uso de la clase Math.
            Primero creamos una variable de tipo int para almacenar el numero aleatorio.
            El metodo Math.random() genra un numero entre 0 y 0..99999 por eso lo multiplicamos por 100
            y posteriormente sumamos 1 para obtener el valor de 100, los decimales son descartados gracias
            a que almacenamos el valor en una variable de tipo int que se elimina los decimales (este proceso
            es llamado casting).
            Despues de ello imprimamos el numero!

            (EN)Create a random number to the user to guess, we will use the Math class.
            First, we create a vvariable of type int to save the random number.
            The method AMth.random() generates a number between 0 and 0.99999 the we times it by 100,
            then we add a 10 to obtain the value 100. The decimal are eliminated by saving the value
            of the variable into a int type (this process is called a cast).
            After that let's print the number!
         */
        int theNumber = (int) (Math.random() * 100 + 1);
        //System.out.println(theNumber);

        //(ES) Prueba generar un numero entre 1-10 y 1-1,000
        //(EN) Try to generate a number between 1-10 & 1-1,000
        /*
        int oneToTen = (int) (Math.random() * 10 + 1);
        System.out.println(oneToTen);

        int oneToThousand = (int) (Math.random() * 1000 +1);
        System.out.println(oneToThousand);
         */
        int guess = 0;
        System.out.println("Please guess a number between 1 and 100: ");
        guess = scan.nextInt();
        System.out.println(String.format("You entered %d", guess));

        // (ES) A partir de aquí usaremos loops para poder darle interactividad al juego
        // (EN) From here, we will use loops to add interactivity to the game
    }
}