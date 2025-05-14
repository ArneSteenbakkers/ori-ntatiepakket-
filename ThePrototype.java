import java.util.Scanner;

public class ThePrototype {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
askForNumberInRange(1,100,"Type je nummer");

        System.out.println("50 lege lines");
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

    public static int askForNumberInRange(int min, int max, String text){
        System.out.print(text);
        boolean stop = false;
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        do {
            if (number < min || number > max){
                System.out.println(number + " is niet binnen de range");
                System.out.println("geef een nummer tussen de range");
                number = myObj.nextInt();
            }
            else {
                System.out.println(number + " is binnen de range");
                stop = true;
            }
        }
        while (!stop);
        return max;
    }
}



