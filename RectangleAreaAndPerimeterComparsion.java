package Conditionals;

import java.util.Scanner;

public class RectangleAreaAndPerimeterComparsion {
    public static void main(String[] args) {
        System.out.print(">Enter the length of the rectangle : ");
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        System.out.print(">Enter the breadth of the rectangle : ");
        int b=sc.nextInt();
        double area = l*b;
        double peri = 2*(l+b);
        if (area>peri) System.out.println(">Area of the rectangle is greater than perimeter.");
        if (area<peri) System.out.println(">Area of the rectangle is smaller than perimeter.");
        if (area==peri) System.out.println(">Area of the rectangel is equal to perimeter.");
    }
}
