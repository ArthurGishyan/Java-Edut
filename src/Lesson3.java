public class Lesson3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        printArray(array);

        int sum = sum(5, 6);

        System.out.println(sum);

        System.out.println(increment(5));
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static Integer increment(int x) {
        return ++x;
    }

    public static Integer sum(int x, int y) {
        return x + y;
    }
}