//package dip107;

import java.util.Scanner;

public class md1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x=0, y=0;
        System.out.println("211RDB284 Gandžumjans Maksims 2");
        
        System.out.print("x=");
        if (sc.hasNextFloat())
                x = sc.nextFloat();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        System.out.print("y=");
        if (sc.hasNextFloat())
                y = sc.nextFloat();
        else {
                System.out.println("input-output error");
                sc.close();
                return;
        }
        sc.close();

        System.out.println("result:");

        if ((x-5)*(x-5)+(y-7)*(y-7)<=9 && y > 7)
                System.out.println("green");
        else if (y>3 && y <=7 && ) 
                System.out.println("blue");
            else
                if (y>=8 && y<=x+6 && y<=20-x)
                        System.out.println("blue");
                else
                        System.out.println("white");
    }
}



// (x-5)(x-5)+(y-7)(y-7)<=2 &&y>=7
// x =3 y =7 y = 10 - x
