package triangle;

import a.IllegalTriangleException;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        try { System.out.println("nhập cạnh thứ nhât");
            double a= sc.nextDouble();
            System.out.println(" nhập cạnh thứ 2");
            double b=sc.nextDouble();
            System.out.println(" nhập cạnh thứ 3");
            double c= sc.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMesenge());

        }catch (Exception e){
            System.out.println("luc an c");
        }
    }
}
