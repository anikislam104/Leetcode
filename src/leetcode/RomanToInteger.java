package leetcode;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int len=s.length();
        int value=0;
//        System.out.println(len);
        if(len==1){

            if(s.equals("I")){
                value=1;
            }

            else if (s.equals("V")){
                value=5;
            }

            else if(s.equals("X")){
                value=10;
            }

            else if (s.equals("L")){
                value=50;
            }

            else if (s.equals("C")){
                value=100;
            }

            else if (s.equals("D")){
                value=500;
            }

            else if (s.equals("M")){
                value=1000;
            }

            else {
                System.out.println("Invalid Input");
            }
            System.out.println(value);
        }
    }
}
