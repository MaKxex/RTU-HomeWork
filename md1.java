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

        float circleA = (x-5)*(x-5)+(y-7)*(y-7);
        float circleB = (x-9)*(x-9)+(y-7)*(y-7);
        float circleC = (x-7)*(x-7)+(y-9)*(y-9);

        if ((circleA <=4 || circleB <=4)  && y >= 7 || circleC <= 4 && y > 9)
                System.out.println("green");
        else if (y>=3 && y < 7 && y>= 10 -x && y <= y +3)
                System.out.println("blue");
            else
                if (x > 5 && x <9 && y > 7 && y < 9 && !(circleA <=4 && circleB <=4  && y > 7 || circleC <= 4 && y > 9))
                        System.out.println("red");
                else
                        System.out.println("white");
    }
}



// (x-5)(x-5)+(y-7)(y-7)<=2 &&y>=7
// x =3 y =7 y = 10 - x
//y <= x + 3
