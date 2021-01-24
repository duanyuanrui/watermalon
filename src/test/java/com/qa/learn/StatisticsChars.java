package com.qa.learn;

import java.util.HashMap;

public class StatisticsChars {

    public static void  main(String args[]){
        String s="hello world hello word hell d d d d de d ei dheue dhh";
        fun(s);
    }

    public static  void fun(String s){
        String a[] = s.split(" ");
        HashMap<String,Integer> hashMap = new HashMap();
        for(int i=0;i<a.length;i++){
            if(hashMap.containsKey(a[i])){
                hashMap.put(a[i],hashMap.get(a[i]).intValue()+1);
            }else{
                hashMap.put(a[i],1);
            }
        }
        for(String ss:hashMap.keySet()){
            System.out.println(ss+"====="+hashMap.get(ss).intValue());
        }
    }
}
