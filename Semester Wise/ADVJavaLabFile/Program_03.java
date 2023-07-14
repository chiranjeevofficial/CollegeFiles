class ParentClass {
    private final String parentMessage;
    public ParentClass() {
        this.parentMessage = "Hello from ParentClass";
    }
    public void displayMessage() {
        System.out.println(parentMessage);
    }
}

class ChildClass extends ParentClass {
    private final String childMessage;
    public ChildClass() {
        super(); // Invoking the parent class constructor
        this.childMessage = "Hello from ChildClass";
    }

    @Override
    public void displayMessage() {
        super.displayMessage(); // Invoking the parent class method
        System.out.println(childMessage);
    }
}

public class Program_03 {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayMessage();
    }
}
