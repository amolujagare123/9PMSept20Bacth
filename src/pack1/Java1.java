package pack1;

import ClassesAndConstructors.ClassDemo;
import FinalAndStatic.StaticMethodDemo;

import static FinalAndStatic.StaticMethodDemo.*;
//import static FinalAndStatic.StaticMethodDemo.setCollegeName;

public class Java1 extends Java2{

    // default access  specifier
       public int a1;
        protected double d1;
       private char c1;
        String str1;

        void display1()
        {
            System.out.println("a="+a1);
            System.out.println("d="+d1);
            System.out.println("c="+c1);
            System.out.println("str="+str1);
        }

        public static void main(String[] args) {

          /*  Java1 ob = new Java1();
            ob.a1 =10;
            ob.c1='h';

            ob.a2=10;*/

            setCollegeName("myCollege");

            System.out.println(college);
    }
}
