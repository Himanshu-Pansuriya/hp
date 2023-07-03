import java.util.Scanner;
public class MethodOverriding {
    public static void main(String[] args) {
    B i = new B();
    i.abc();
    }
}
    class A{
        void abc(){
            System.out.println("this method is abc of class A");
        }
    }
    class B extends A{

        void abc(){
            super.abc();
            System.out.println("this method is abc of class B");
        }
    }
