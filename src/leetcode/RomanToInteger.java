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

        else{
            int lastOneChecked=0;
            for(int i=0;i<len-1;i++){
                char c1=s.charAt(i);
                char c2=s.charAt(i+1);
                if(c1==73 && c2==86){
                    value+=4;
                    lastOneChecked=1;
                    i++;
                }

                else if (c1==73 && c2==88){
                    value+=9;
                    lastOneChecked=1;
                    i++;
                }

                else if(c1==88 && c2==76){
                    value+=40;
                    lastOneChecked=1;
                    i++;
                }

                else if (c1==88 && c2==67){
                    value+=90;
                    lastOneChecked=1;
                    i++;
                }

                else if (c1==67 && c2==68){
                    value+=400;
                    lastOneChecked=1;
                    i++;
                }

                else if (c1==67 && c2==77){
                    value+=900;
                    lastOneChecked=1;
                    i++;
                }

                else if(c1==73){
                    value+=1;
                }

                else if (c1==86){
                    value+=5;
                }

                else if(c1==88){
                    value+=10;
                }

                else if (c1==76){
                    value+=50;
                }

                else if (c1==67){
                    value+=100;
                }

                else if (c1==68){
                    value+=500;
                }

                else if (c1==77){
                    value+=1000;
                }

            }
            if(lastOneChecked==0){
                char c1=s.charAt(len-1);
                if(c1==73){
                    value+=1;
                }

                else if (c1==86){
                    value+=5;
                }

                else if(c1==88){
                    value+=10;
                }

                else if (c1==76){
                    value+=50;
                }

                else if (c1==67){
                    value+=100;
                }

                else if (c1==68){
                    value+=500;
                }

                else if (c1==77){
                    value+=1000;
                }
            }
            System.out.println(value);
        }
    }
}
