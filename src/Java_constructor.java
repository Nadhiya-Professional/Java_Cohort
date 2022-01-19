


//CONSTRUCTORS:
//
//Constructors are a special Method, that is called when an object is instantiated,using the new keyword. It initializes the newly created object for further use.
//
//  Class obj = new Class();

import java.util.Scanner;

public class Java_constructor {

            private final int a; // variable 'a' defined in the default constructor.
            private final int b;

            //In default constructor the instance variables are set. These variables can be accessed by the methods with in this class.
            // this is used to refer to current object or instance of the class. This is mainly used to differentiate between the class variables
            // and the attributes that are passed in the constructor, if they have same name.

            public Java_constructor(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public void addition() {
                int c = a + b;
                System.out.println("c is :" + c);
            }

            public void subtraction() {
                int c = a - b;
                System.out.println("c is :" + c);
            }

            public void multiplication() {
                int c = a * b;
                System.out.println("c is :" + c);
            }

            public void division() {
                int c = a / b;
                System.out.println("c is :" + c);
            }

        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the first number to do the arithmetic operations:");
            int a = in.nextInt();
            System.out.println("Please enter the second number:");
            int b = in.nextInt();
            Java_constructor jc = new Java_constructor(a,b); // default constructor is called whenever the object is created.
            jc.addition(); // using the object of the class operation we are accessing the methods of the class.
            jc.subtraction();
            jc.multiplication();
            jc.division();
        }
    }






