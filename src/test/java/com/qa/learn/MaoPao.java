package com.qa.learn;

public class MaoPao {
    public static  void main(String args[]){
        int a[]={3,67,12,0,-90,-8,34,126};
        fun(a);
    }

    public static void fun(int a[]){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }

    }
}
