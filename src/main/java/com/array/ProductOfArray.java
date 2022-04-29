package com.array;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        //prefix calculation
        for(int i=0; i< nums.length; i++){
            if(i==0){
                prefix[i] = nums[i];
            }else{
                prefix[i] = nums[i] * prefix[i-1];
            }
        }

        //postfix calculation
        for(int i= nums.length-1; i>=0; i--){
            if(i==nums.length-1){
                postfix[i] = nums[i];
            }else{
                postfix[i] = nums[i] * postfix[i+1];
            }
        }

        //build the output
        for(int i=0; i< nums.length; i++){
            int pre = 1;
            int post = 1;
            if(i==0){
                post = postfix[i+1];
            }else if(i==nums.length-1){
                pre = prefix[i-1];
            }else{
                pre = prefix[i-1];
                post = postfix[i+1];
            }

            nums[i] = pre * post;
        }

        return nums;
    }
}
