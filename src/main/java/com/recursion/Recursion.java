package com.recursion;

import java.util.HashMap;
import java.util.Map;

public class Recursion {

    Map<Integer, Integer> cache = new HashMap<>(Map.of(0, 0, 1, 1));

    public int findSum(int n){
        if(n==0){
            return 0;
        }

        return n%10 + findSum(n/10);
    }

    public int fibonacci(int n){

        if(cache.containsKey(n)){
            return cache.get(n);
        }

        cache.put(n, fibonacci(n-1) + fibonacci(n-2));
        return cache.get(n);
    }

    public int reverse(int n, int base){
        // 12
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        n = n/10;

        return (int) (rem * Math.pow(10, base-1) + reverse(n , base-1));
    }

    public int reverseInteger(int n){
        int digits = (int) Math.log10(Math.abs(n)) + 1;

        return reverse(n ,digits);
    }

    public int reverse(int x) {
        if(x==0) return 0;

        int rev = 0 ;

        while(x !=0){
            int rem = x%10;
            x = x /10;

            if(rev > Integer.MAX_VALUE /10 ||
                    (rev == Integer.MAX_VALUE && rem > Integer.MAX_VALUE % 10)){
                return 0;
            }


            if(rev < Integer.MIN_VALUE /10 ||
                    (rev == Integer.MIN_VALUE && rem < Integer.MIN_VALUE % 10)){
                return 0;
            }

            rev = rev*10 + rem;
        }

        return rev;
    }

    public boolean isPalindrome(int n){
        if(n == reverseInteger(n)){
            return true;
        }else {
            return false;
        }
    }

    public int zeroCount(int num){
        return countZeros(num, 0);
    }

    public int countZeros(int num, int zeroCount){
        if(num==0){
            return zeroCount;
        }

        int rem = num%10;
        if(rem==0) zeroCount++;
        return countZeros(num/10, zeroCount);
    }
}
