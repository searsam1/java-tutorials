// FROM 
//  *** https://edabit.com/challenge/EiTYFd9jwghDz3aoG ***


import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
// def reorder_digits(lst, direction):
//  return [int("".join(sorted(str(i), 
//          reverse = direction == "desc"))) for i in lst]
public class Challenge {    
    public static String numToString(int n) {
        String res = Integer.toString(n);
        return res;
    }
    public static int sortNum(String original, String orderBy) {
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if (orderBy == "desc"){
            sorted = new StringBuilder(sorted).reverse().toString();
        }
        return Integer.parseInt(sorted);
    }
    public static int[] reorderDigits(int[] arr, String orderBy) {
        for (int i=0; i<arr.length; i++){
            arr[i] = sortNum(  numToString(arr[i]),orderBy  );
        }
        return arr;
    }
    public static void main(String[] args) {
        for (int i : reorderDigits(new int[]{515, 341, 98, 44, 211}, "desc")){
            System.out.println(i);
        }
    }
}
// 