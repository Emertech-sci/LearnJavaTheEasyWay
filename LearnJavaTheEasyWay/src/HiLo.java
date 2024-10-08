// (ES) La clase Scaner permite tener varias propiedades que ayudan a nuestro codigo como nextLine()
import java.util.Scanner;
// (ES) La clase HiLo es publica lo que significa que significa que se puede correr desde la terminal.
// (EN) The class HiLo is public, meaning we can run it from the terminal or command line.

public class HiLo {
    //El metodo main() es el que correra cuando se ejecute la clase HiLo.
    //The method main() will run when we execute the class HiLo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            /* (ES) El metodo Math.random() genra un numero entre 0 y 0..99999 por eso lo multiplicamos por 100
            y posteriormente sumamos 1 para obtener el valor de 100.

            (EN) The method Math.random() generates a number between 0 and 0.99999 then times it by 100,
            then we add a 10 to obtain the value 100. The decimal are eliminated by saving the value
            of the variable into an int type (this process is called a cast).
            */
            int theNumber = (int) (Math.random() * 100 + 1);
            //System.out.println(theNumber);

            //(ES) Prueba generar un numero entre 1-10 y 1-1,000
            //(EN) Try to generate a number between 1-10 & 1-1,000
            int guess = 0;
            // (ES) A partir de aquí usaremos loops para poder darle interactividad al juego
            // (EN) From here, we will use loops to add interactivity to the game
            while (guess != theNumber) {
                System.out.println("Please guess a number between 1 and 100: ");
                guess = scan.nextInt();
                //(ES) Añadimos un if-else statement para decirle al usuario si es un numero muy grande o muy pequeño.
                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. try again.");
                else
                    System.out.println(guess + " is correct. You win!");
            }
            System.out.println("would you like to play again? (y/n)");
            playAgain = scan.next();
        } while(playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye");
        scan.close();
    }
}
