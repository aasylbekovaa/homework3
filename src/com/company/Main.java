package com.company;

public class Main {

    public static void main(String[] args) {
        double[] sweet = {2.4, 1.8, 3.9, 2.9, 5.7, 7.9, 4.5, 2.5, 4.2, 6.9, 2.8, 4.6, 1.5, 3.6, 4.9};
        double ech = 0;
        double num = 0;
        int foot = 0;

        for (double d:sweet ){
            if ( d > 0 && foot > 0 ) {
                ech += d;
                num ++;
            }else if ( d<0){
                foot++;


            }


        }
        System.out.println("среднее арифметическое"+ ech / num);
        }

    }

