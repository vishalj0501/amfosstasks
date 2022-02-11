package com.company;

import java.util.Scanner;

public class the_game_i_must_lose {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner num= new Scanner(System.in);
            int g= num.nextInt();
            if(g%2==0){
                int b1=num.nextInt();
                if(b1%2==0){
                    System.out.println(b1/2);
                }
                else if(b1%2!=0){
                    System.out.println(((b1-1)/2)+1);
                }
                for (int i = 1; i <= b1; i++) {

                    if (i % 2 != 0) {

                        System.out.print(i+" ");
                    }
                }

            }
            else if(g%2!=0){
                int b2=num.nextInt();
                if(b2%2==0){
                    System.out.println(b2/2);
                }
                else if(b2%2!=0){
                    System.out.println(((b2-1)/2)+1);
                }
                for (int i = 1; i <= b2; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i);
                    }
                }
            }
        }
    }
