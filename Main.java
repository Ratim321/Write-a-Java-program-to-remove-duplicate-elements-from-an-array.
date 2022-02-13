package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] ar={0,0,1,1,1,2,2,3,3,4};
 int l=ar.length;
    for(int i=0;i<l;i++){

        for(int j=i+1;j<l;j++){
            if(ar[i]==ar[j]){
              for(int k=j;k<l;k++){
                  if(k<l-1) {
                      ar[k] = ar[k + 1];
                  }
              }
              l--;

            }



        }


    }


        System.out.println(ar.length);

        for (int i = 0; i < l; i++) {
            System.out.print(ar[i]+" ");
        }


    }
}

