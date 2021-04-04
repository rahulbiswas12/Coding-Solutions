import java.lang.Math;
import java.util.Scanner;

class Shape{
    // sphere
    double volume(double r){
        return ((4.0/3)*Math.PI)*(Math.pow(r, 3));
    }

    // cone
    double volume(double r, double h) {
        return ((Math.PI * Math.pow(r, 2))*(h/3));
    }

    // box
    double volume(double len,double h, double width) {
        return (len * h * width);
    }
}


public class CalculateVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape sp = new Shape();
        System.out.println("Calculate Volume\nEnter Option:\n1.Sphere\n2.Cone\n3.Box");
        int ch = sc.nextInt();
        double r, h, len, w, vol;
        if (ch == 1) {
            System.out.print("Enter Radius of sphere: ");
            r = sc.nextDouble();
            vol = sp.volume(r);
            System.out.printf("Vol of sphere is: %.2f", vol);
        }else if(ch == 2) {
            System.out.print("Enter Radius of Cone: ");
            r = sc.nextDouble();
            System.out.print("Enter Height of cone: ");
            h = sc.nextDouble();
            vol = sp.volume(r, h);
            System.out.printf("Vol of cone is: %.2f", vol);
        } else if(ch  == 3) {
            System.out.print("Enter Length of cone: ");
            len = sc.nextDouble();
            System.out.print("Enter Height of cone: ");
            h = sc.nextDouble();
            System.out.print("Enter Width of cone: ");
            w = sc.nextDouble();
            vol = sp.volume(len, h, w);
            System.out.printf("Vol of Box is: %.2f", vol);
        } else {
            System.out.println("something Went wrong!");
        }
    }
}
