package com.company;

public class MergeSortArray {

    public static void main(String args[]) {
        int[] n1 = { 1,2,3,0,0,0 };
        int[] n2 = { 2,5,6 };
        merge(n1, 3, n2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m + n -1 ;
        while( k >= 0 ){
            if( n-1 < 0 || ( m-1 >= 0 && nums1[m-1] > nums2[n-1])){
                nums1[k--] = nums1[m-1];
                m--;
            } else {
                nums1[k--] = nums2[n-1];
                n--;
            }
        }
    }
}