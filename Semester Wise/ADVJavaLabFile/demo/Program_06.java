//6.  Write a java program to create user defined package.
package demo;

class Demo {
    String message;
    public Demo(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}

public class Program_06 {
    public static void main(String[] args) {
        Demo object = new Demo("Namaste Coder");
        System.out.println(object.getMessage());
    }
}
