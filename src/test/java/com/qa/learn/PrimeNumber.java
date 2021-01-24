package com.qa.learn;

public class PrimeNumber {

    public static  void main(String args[]){
        System.out.println(fun(6));;
    }

    public static boolean fun(int n){
        if(n==2){
            return  true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
