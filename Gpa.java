/*Write a Java program that uses if-else statements to 
convert the 100 point grades into the letter grades. 
Use the below table as a reference.
 */

 /*Letter Grade        Percentage        GPA

A                      90-100             4.0
A−                     85-89              3.7
B+                     80-84              3.3
B                      75-79              3.0
B−                     70-74              2.7
C+                     65-69              2.3
C                      60-64              2.0
C-                     55-59              1.7
D                      50-54              1.0
F                      0-49               0.0 */

//Lets Start!

import java.util.Scanner;

public class Gpa {
    public static void main(String[] args) {
        System.out.println("please enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0 && n<=100){
            String Grade;
            double Gpa;

            if(n>=90){
                Grade ="A";
                Gpa = 4.0;
            } else if(n>=85){
                Grade ="A-";
                Gpa = 3.7;
            } else if(n>=80){
                Grade ="B+";
                Gpa = 3.3;
            } else if(n>=75){
                Grade ="B";
                Gpa = 3.0;
            }else if(n>=70){
                Grade ="B-";
                Gpa = 2.7;
            }else if (n>=65){
                Grade ="C+";
                Gpa = 2.3;
            } else if (n>=60){
                Grade ="C";
                Gpa = 2.0;
            } else if(n>=55){
                Grade ="C-";
                Gpa = 1.7;
            } else if(n>=50){
                Grade ="D";
                Gpa = 1.0;
            } else {
                Grade ="F";
                Gpa =0.0;
            }

            System.out.println(Grade+":"+ Gpa);
            
        }else{
            System.out.println("Please enter a valid number form(0-100)");
            sc.close();
        }
        

    }
}

//The problem is solved. Thank for watching. Good luck!