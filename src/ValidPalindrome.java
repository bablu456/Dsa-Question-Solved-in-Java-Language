public class ValidPalindrome {
    public boolean isPalindrome(String s){
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(clean).reverse().toString();

        return clean.equals(reversed);
    }
}
