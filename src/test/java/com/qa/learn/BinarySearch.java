package com.qa.learn;

public class BinarySearch {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9};
        int index = BinaryFun(a,3,0,a.length);
        System.out.println(index);

    }

    public static int BinaryFun(int a[],int target,int low,int high){
        int mid =(low+high)/2;
        if(target<a[mid]){
            high=mid-1;
            return BinaryFun(a,target,low,high);
        }else if (target>a[mid]){
            low=mid+1;
            return BinaryFun(a,target,low,high);
        }else{
            return mid;
        }
    }

}
