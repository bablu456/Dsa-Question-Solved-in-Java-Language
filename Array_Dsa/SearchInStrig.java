package Array_Dsa;
import java.util.Scanner;
public class SearchInStrig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String here : ");
        String name = sc.nextLine();
        System.out.println("Enter the character for the search : ");
        char search =sc.next().charAt(0);
        System.out.println(search(name,search));
    }
    static boolean search(String str,char search){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == search){
                return true;
            }
        }
        return  false;
    }
}
