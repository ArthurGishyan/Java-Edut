public class Main {
    public static void main(String[] args) {
        String message = "Hello friend, how are you?";

        String palindrom = "radar";
        letterCounter(message);

        System.out.println(isPalindrome(palindrom));
    }

    public static void letterCounter(String message) {
        int count = 0;
        char[] letters = message.toCharArray();

        for (int i : letters) {
            if (i == 'a') {
                count++;
            }
        }
        System.out.println("'a' letter count: " + count);
    }

    public static boolean isPalindrome(String word) {

        word = word.toLowerCase();

        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != letters[letters.length - 1 - i]) return false;
        }
        return true;
    }
}