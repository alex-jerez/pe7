//import java.util.Scanner;
//import java.util.ArrayList;
import java.lang.System;
import java.util.Stack;

/**
 * Created by ajerez on 3/19/15.
 */
public class Sieve {


    public static void main(String[] args) {

        //long N = 100000000;
        //Scanner sc = new Scanner(System.in);
        //System.out.print("enter the prime number: ");
        //N = sc.nextLong();
        //sc.close();
        long goal = 10001;
        long start = 1;
        boolean goalReached = false;

        //boolean[] isPrime = new boolean[1];
        //ArrayList<Long> primeNums = new ArrayList<Long>();
        //ArrayList<Long> factors = new ArrayList<Long>();
        Stack<Long> stack = new Stack<Long>();

        //isPrime[0] = false;

        //for (long i = 1; i==N; i++) {

        while(!goalReached){
            if (isItPrime(start)) {
                stack.add(start);
                start++;
                if(stack.size()==goal){
                    goalReached=true;
                }
                else if(start>10000 && start%1000==0){
                    System.out.println(start);
                    if(stack.peek()==100){
                        System.out.println("At " + stack.peek());
                    }
                }
            }
            else{
                start++;
            }
        }
        System.out.println("All numbers done.");
        System.out.println("Prime number: " + stack.peek());
    }

    public static boolean isItPrime(long n){
        if (n==1) return true;
        if (n%2==0) return false;
        for (int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        //System.out.print(" -- Prime!");
        return true;
    }
    public static void printNums(Stack<Long> st){
        for (long num:st){
            if(isItPrime(num)){
		System.out.print("Prime Factor: ");
                System.out.println(num);
            }
        }
    }

}
