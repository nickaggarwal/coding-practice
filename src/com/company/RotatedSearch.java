package com.company;

public class RotatedSearch {


    public static void main(String[] args) {
        // write your code here
        int arr[] = { 5, 7, 8, 9, 2, 3, 4 } ;
        System.out.println(findInRotatedSorted(arr,0 , 6 , 2));
    }

    public static int findInRotatedSorted(int arr[], int l, int r, int target) {

        if( l > r)
            return -1 ;
        int mid = l + (r-l)/2 ;
        if( target == arr[mid])
            return mid ;

        if(arr[l] <= arr[mid])
        {
            if(  arr[l]<= target && target <= arr[mid])
                return findInRotatedSorted(arr, l , mid-1, target) ;
            else
                return findInRotatedSorted(arr, mid+1, r , target);
        } else
        {
            if( arr[mid] <= target && target <= arr[r] )
                return findInRotatedSorted(arr, mid+1, r , target);
        }

        return findInRotatedSorted(arr, l , mid-1, target) ;
    }
}
