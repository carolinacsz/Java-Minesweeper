package minesweeper;

import java.util.Scanner;
import java.util.Arrays;
public class Exigy {

    public static void main(String args[])

    {


        Scanner user_input = new Scanner(System.in);

        int i;
        int j;
        int rows, columns;
        String mn = " ";
        System.out.println("Enter the field dimensions in one line\n");

        rows = user_input.nextInt();
        columns = user_input.nextInt();

        char[][] fieldMatrix = new char[rows][columns];
        for (i=0;i<rows;i++) {
        mn = user_input.next();
        char[] tmpChar = mn.toCharArray();
            for (j=0;j<columns;j++)
            fieldMatrix[i][j] = tmpChar[j];


        }

        System.out.println();
        System.out.println();


   /*     //printing the matrix
        for (i=0;i<rows;i++) {
             for (j=0;j<columns;j++)
             {
                 System.out.print(fieldMatrix[i][j]);
             }
           System.out.println();
        }  */




     //calculating the matrix
        for (i=0;i<rows;i++) {
            for (j=0;j<columns;j++)
            {
                int mine=0;
                if (fieldMatrix[i][j]=='.')
                {



                    // row above
                    if ((i-1 >=0) && (j-1>=0))
                       if (fieldMatrix[i-1][j-1]=='*') mine++;
                     if ((i-1 >=0) && (j>=0))
                        if (fieldMatrix[i-1][j]=='*') mine++;
                     if ((i-1 >=0) && (j+1<columns))
                         if (fieldMatrix[i-1][j+1]=='*') mine++;

                   // same row
                    if (j-1>=0)
                        if (fieldMatrix[i][j-1]=='*') mine++;
                    if (j+1<columns)
                        if (fieldMatrix[i][j+1]=='*') mine++;

                  // row below
                  if ((i+1<rows) && (j-1>=0))
                        if (fieldMatrix[i+1][j-1]=='*') mine++;
                    if ((i+1<rows) && (j>=0))
                        if (fieldMatrix[i+1][j]=='*') mine++;
                   if ((i+1<rows) && (j+1<columns))
                       if (fieldMatrix[i+1][j+1]=='*') mine++;

                    fieldMatrix[i][j] = Integer.toString(mine).charAt(0);

                }



            }

        }

        //printing the calculated  matrix
        for (i=0;i<rows;i++) {
            for (j=0;j<columns;j++)
            {
                System.out.print(fieldMatrix[i][j]);
            }
            System.out.println();
        }

    }
}