//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       TwoSum t = new TwoSum();
       int n[] = {1,2,3,4,5,6};
       int target = 5;
       int[] result = t.twoSum(n,target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}