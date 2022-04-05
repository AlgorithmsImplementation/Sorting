package com.sorting.problems;

import java.util.Arrays;

/**
 * Two integer arrays both sorted a has memory to hold b. Merge b into a in sorted order
 */
public class SortedMerge {
    public int[] mergeSorted(int[] a, int[] b){
        //Option 1: Create a new array and iterate till the end and keep inserting to the new array
        //This won't work because we need a new array

        // 1 5 7 0 0 0
        // -1 2 3

        //Basically as the arrays are sorted the idea is to start from the end of each array to reduce the shifting

        //first calculate non zero elements in the a

        int size = 0;
        for(int i = 0 ; i< a.length; i++){
            if (a[i] !=0){
                size++;
            }
        }

        return inPlaceMerge(a, size, b, b.length);
    }

    /**
     * One of the implementation is to merge the arrays by making a copy and then insert
     * @param a
     * @param m
     * @param b
     * @param n
     * @return
     */
    private int[] merge(int[] a, int m , int[] b, int n){
        int i =0 ;
        int j =0;
        int k =0;

        int copy[] = Arrays.copyOf(a, a.length);

        while(i < m && j < n){
            if(a[i] > b [j]){
                copy[k] = a[i];
                i++;
            }else {
                copy[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < m){
            copy[k]= a[i];
            i++;
            k++;
        }

        while(j < n){
            copy[k]= a[i];
            i++;
            k++;
        }

        return copy;
    }

    public int[] inPlaceMerge(int[] nums1, int m, int[] nums2, int n){
        // 1 3 9 0 0 0
        // 6 11 13

        // 1 3 9 0 0 13
        // 1 3 9 0 11 13
        // 1 3 6 9 11 13
        // 1 3 13 11 6 9

        int i = m-1;
        int j = n-1;

        for(int p=m+n-1; p>=0 ; p--){

            if(j<0){
                break;
            }

            if(i>=0 && nums1[i] > nums2[j]){
                nums1[p] = nums1[i];
                i--;
            }else{
                nums1[p] = nums2[j];
                j--;
            }
        }

        return nums1;
    }
}
