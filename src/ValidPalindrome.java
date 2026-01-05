public class ValidPalindrome {
    public boolean isPalindrome(String s){
//        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

//        String reversed = new StringBuilder(clean).reverse().toString();

//        return clean.equals(reversed);
        int left = 0;
        int right = s.length() -1;
        while(left < right){
            char start = s.charAt(left);
            char end = s.charAt(right);

            if(!Character.isLetterOrDigit(start)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                right--;
                continue;
            }
            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return  false;
            }

            left++;
            right--;
        }
        return true;
    }
}
