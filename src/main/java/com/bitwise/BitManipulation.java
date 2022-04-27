package com.bitwise;

public class BitManipulation {

    public boolean isOdd(int n){
        return (n&1) == 1;
    }

    public int findUnique(int[] nums){
        int unique =0;

        for(int num : nums){
            unique = unique^num;
        }

        return unique;
    }

    public int findBit(int n , int position){
        int mask = 1;
        return (n & mask << position);
    }

    /**
     * Find the nth magic number
     *
     * @param n
     * @return
     */
    public int findMagicNumber(int n){
        if(n==0){
            return 1;
        }

        int sum =0;
        int base = 5;
        while(n>0){
            int lastBit = n&1;
            sum = sum + base*lastBit;
            base = base * 5;
            n = n >> 1;
        }

        return sum;
    }

    public int noOfDigits(int n, int base){
        return (int) (Math.log(n) / Math.log(base)) + 1;
    }

    public boolean isPow2(int n){
        if(n==0) return false;

        return  ((n & (n-1)) == 0) ? true: false;
    }

    public int pow(int base, int pow){
        if(pow==0){
            return 1;
        }
        // 1 0

        int sum = 0;
        while(pow > 0){
            int lastbit = pow & 1;
            sum = sum + base * lastbit;
            base = base * base;

            pow = pow >> 1;
        }

        return sum;
    }
}
