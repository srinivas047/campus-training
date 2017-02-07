package srinivas;

import java.io.*;
import java.util.Scanner;

public class Zemoso_Java {
	public static void main(String args[]) throws IOException
	{
		String file = "D:\\Eclipse\\p067_triangle.txt";
		Scanner s = new Scanner(new File(file));
		
		int lines = 0;
        while(s.hasNextLine()) {
            lines++;
            s.nextLine();
        }
        
        System.out.println("Lines:"+lines);
        
        int[][] dp = new int[lines][lines];
        Scanner sc = new Scanner(new File(file));
        for(int i=0;i<lines;i++){
            int j=0;
            while(j<i+1){
                if(sc.hasNextInt()) dp[i][j] = sc.nextInt();
                //System.out.println(dp[i][j]);
                j++;
            }
        }
        for(int i=lines-1;i>0;i--){
            int j=0;
            while(j<i){
                dp[i-1][j]+=Math.max(dp[i][j],dp[i][j+1]);
                j++;
            }
        }
        System.out.println("the maximum total from top to bottom of the triangle is " +dp[0][0]);
    }
		
	}


