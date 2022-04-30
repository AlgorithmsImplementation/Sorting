package com.array;

public class MaxProductSubArray {

    public int maxProduct(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        int maxProductSoFar = nums[0];
        int minProductSoFar = nums[0];

        int maxProduct = nums[0];
        // -2 3 -4

        for(int i=1 ; i< nums.length; i++){
            int product = nums[i];
            int tempMaxProductSoFar = Math.max(product, Math.max(minProductSoFar*product,
                    maxProductSoFar*product));
            minProductSoFar = Math.min(product, Math.min(minProductSoFar*product,
                    maxProductSoFar*product));

            maxProductSoFar = tempMaxProductSoFar;
            maxProduct = Math.max(maxProductSoFar, maxProduct);
        }

        return maxProduct;
    }
}
