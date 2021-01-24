package com.qa.learn;

import java.util.Arrays;

public class MergeArray {
    public static  void main(String args[]){
        int a[]={-9,0,1,2,2};
        int b[]={-10,-7,6,89};
        fun(a,b);
    }

    public static void fun(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            c[a.length+j]=b[j];
        }
        Arrays.sort(c);
        for(int k=0;k<c.length-1;k++){
            System.out.println(a[k]);
        }

    }
}
