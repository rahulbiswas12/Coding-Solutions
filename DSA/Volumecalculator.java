import java.util.Scanner;
class Shape{
	double calculateVolume(double radius){
		return (4.0/3.0)*Math.PI*(radius*radius*radius);  
	}
	double calculateVolume(double radius, double height){
		return (Math.PI*radius*radius*(height/3));
	}
	double calculateVolume(double length, double breadth, double height){
		return (length*breadth*height);
	}
}
public class Volumecalculator{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		Shape sp = new Shape();
		while(true){		
			System.out.println("For sphere Press 1\n For Cone press 2\n For Box press 3\n for Exit press 4");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println(" Enter radius of Sphere: ");
					double radius = sc.nextDouble(); 
					double res = sp.calculateVolume(radius);
					System.out.printf("The volume of the sphere is = %.2f\n",res);
					break;
				case 2:
					System.out.println("Enter radius of Cone: ");
					double radius1 = sc.nextDouble();
					System.out.println("Enter height of Cone: ");
					double height = sc.nextDouble();
					double res1 = sp.calculateVolume(radius1,height);
					System.out.printf("The volume of the cone is = %.2f\n",res1);
					break;
				case 3:
					System.out.println("Enter lenght of Box: ");
					double length = sc.nextDouble();
					System.out.println("Enter breadth of Box: ");
					double breadth = sc.nextDouble();
					System.out.println("Enter height of Box: ");
					double height1 = sc.nextDouble();
					double res2 = sp.calculateVolume(length,breadth,height1);
					System.out.println("The volume of box is = "+res2);
					break;
				case 4: 
				    return;
				default:

					System.out.println("Wrong Input");
					break;
			}
		}
	}
}
