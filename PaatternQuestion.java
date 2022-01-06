package com.company;

public class PaatternQuestion {
    public static void main(String[] args) {
        /*
            ****
            ****
            ****
            ****
         */
//        for(int i=1;i<5;i++)
//        {
//            for(int j=0;j<5;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
        *
        * *
        * **
        * ***
        * ****
         */
//        for(int i=1;i<4;i++)
//        {
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
        *   *****
        *   ****
        *   ***
        *   **
        *   *
        *
         */
//        for(int i=1;i<5;i++)
//        {
//            for(int j=5-i;j>0;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
            1
            12
            123
            1234
            12345
         */
        for(int i=1;i<100;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }

    }

}
