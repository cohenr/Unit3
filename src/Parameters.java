public class Parameters {
    public static final int SIZE = 7;

    public static void main(String[] args) {
        drawSquare(2);
        drawSquare(4);
        drawSquare(6);
        for (int i = 1; i <= 3; i++) {
            drawSquare(2*i);
        }
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSquare() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
