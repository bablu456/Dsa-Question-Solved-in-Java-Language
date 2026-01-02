package BinarySearchQuestions;

public class isSequence {
    public static boolean check(String n,String str){
        int i = 0;
        int j = 0;
        while(i<n.length() && j<str.length()){
            if(n.charAt(i) == str.charAt(j)){
                i++;
                j++;
            }else j++;
        }
        return i == n.length();
    }
    public static void main(String[] args){
        String n = "abc";
        String str = "ahbgdc";
        System.out.println(check(n,str));
    }
}
