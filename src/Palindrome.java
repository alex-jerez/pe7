import java.util.*;

import static java.lang.System.*;

/**
 * Created by Alex Jerez on 3/20/15.
 */
public class Palindrome {

    public static void main(String[] args){

        int num1 = 999;
        ArrayList<Integer> palindromes = new ArrayList<Integer>();
        for(int u=num1;u>99;u--){
            for(int i=u;i>99;i--){
                //System.out.printf("Checking %dX%d...%n", num1, i);
                if (twoNums(u,i)){
                    palindromes.add(u*i);
                }
            }
        }
        Collections.sort(palindromes);
        System.out.println("Palindromes:" + palindromes);
    }

    public static boolean twoNums(Integer integer, Integer integer2){
        return isPalindrome(integer*integer2);
    }

    public static boolean isPalindrome(Integer integer){
        Queue<Integer> first = new LinkedList<Integer>();
        Stack<Integer> last = new Stack<Integer>();
        String temp = integer.toString();
        for(int i=0;i<temp.length();i++){
            first.add((int) Character.getNumericValue(temp.charAt(i)));
            last.push((int) Character.getNumericValue(temp.charAt(i)));
        }
        return compareFrontBack(first, last);
    }
    public static boolean compareFrontBack(Queue<Integer> one, Stack<Integer> two){
        if(one.isEmpty()){
            System.out.println("Error: array is empty");
            return false;
        }
        else{
            for (int i=0;i<=two.size();i++) {
                int first1 = one.remove();
                int second1 = two.pop();
                if (first1 != second1) {
                    //System.out.println("No Palindrome.");
                    return false;
                }
            }
        }
    return true;
    }
}
