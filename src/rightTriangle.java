import java.util.Scanner;

public class rightTriangle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = in.nextDouble() ;
        in.nextLine();
        System.out.print("Enter height: ");
        double height = in.nextDouble() ;
        in.nextLine();
        System.out.print("Enter hypotenuse: ");
        double hypotenuse = in.nextDouble() ;
        in.nextLine();

        if (Math.pow(base, 2) + Math.pow(height, 2) ==  Math.pow(hypotenuse, 2)){
            System.out.println("Yes, that's a right triangle!");
        } else {
             System.out.println("Nope...not a right triangle.");
        }



        
    
    
    
    }
}