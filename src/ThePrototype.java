import java.util.Scanner;

public class ThePrototype {
    public static void main(String[] args) {
        System.out.println("type je nummer");
        Scanner myObj = new Scanner(System.in);

        int number;
        number = myObj.nextInt();

        do {
          if (number < 1 || number > 100) {
            System.out.println(number);
            System.out.println("is niet binnen 100");
            number = myObj.nextInt();
          }
          else {
              System.out.println("is binnen 100");
          }
        }
        while (number < 1 || number > 100);

        System.out.println("raad");
        int guess;
        guess = myObj.nextInt();
        while  (number != guess) {
           if (number > guess) {
               System.out.println("hoger raden");
           }
           else {
             System.out.println("lager raden");
           }
            guess = myObj.nextInt();
            System.out.println(guess);
        }

            System.out.println("goed");
        }
    }



