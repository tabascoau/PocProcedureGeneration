import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

class HelloWorld {
    public static void main(String[] args) {
        int array1[] = {1,2,1};
        int array2[] = {4,3};
        String operator = "*";
        String answer1 = "";
        String answer2 = "";
        int finalAnswer = 0;

        for (int i=0; i<array1.length; i++) {
            answer1 += String.valueOf(array1[i]);
        }
        for (int i=0; i<array2.length;  i++)  {
            answer2 += String.valueOf(array2[i]);
        }

        if (operator == "+") {
            finalAnswer = Integer.parseInt(answer1) + Integer.parseInt(answer2);
        } else if (operator == "-") {
            finalAnswer = Integer.parseInt(answer1) - Integer.parseInt(answer2);
        } else if (operator == "*") {
            finalAnswer = Integer.parseInt(answer1) * Integer.parseInt(answer2);
        }
        System.out.println("finalAnswer: " + finalAnswer);
       
    }

    
}
