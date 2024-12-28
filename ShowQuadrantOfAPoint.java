package Conditionals;

import java.util.Scanner;

public class ShowQuadrantOfAPoint {
    public static void main(String[] args) {
        System.out.print(">Enter the x-coordinate : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(">Enter the y-coordinate : ");
        int y=sc.nextInt();
        if (x>0) {
            if (y>0) System.out.println("The point belongs to 1st quadrant");
            else if(y<0) System.out.println("The point belongs to 4th quadrant");
            else System.out.println("The point lies on the x-axis");
        } else if (x<0) {
            if (y>0) System.out.println("The point belongs to 2nd quadrant");
            else if(y<0) System.out.println("The point belongs to 3rd quadrant");
            else System.out.println("The point lies on the x-axis");
        } else {
            if (x == 0) {
                if (y != 0) System.out.println("The point lies on the y-axis");
                else System.out.println("The point lies on the origin");
            }
        }
    }
}