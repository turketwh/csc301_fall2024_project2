public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < j; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j = j - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("aabbaa");
        System.out.println(result);
    }
}
