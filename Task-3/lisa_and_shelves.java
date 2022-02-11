package com.company;

import java.util.Scanner;

public class lisa_and_shelves {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        System.out.print(count);
    }
}
