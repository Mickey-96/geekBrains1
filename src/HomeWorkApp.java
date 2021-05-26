public class HomeWorkApp {
    public static void main(String[] args) {
//        printThreeWords();
        //checkSumSign(5, -6);
        printColor(5);

    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value < 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
//test
    }
}
