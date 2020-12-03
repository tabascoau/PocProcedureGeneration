import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

class HelloWorld {
    public static void main(String[] args) {
        int rowSize = 10;
        int columnSize = 8;
        int tileSize = 5;
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                if (row > 0) {
                    
                } else {
                    System.out.print("#");
                }
            }
           
        }

    }
}
