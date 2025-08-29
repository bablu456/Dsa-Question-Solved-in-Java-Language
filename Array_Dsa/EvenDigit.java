package Array_Dsa;

import java.util.Scanner;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12, 2};
        int store = findNumbers(arr);
        System.out.println(store);

    }

    static int findNumbers(int[] arr) {
        int ans = 0;
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 0;
        }
        return count;
    }
}
