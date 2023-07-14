class OuterClass {
    private int outerData;
    public OuterClass(int data) {
        this.outerData = data;
    }
    public class InnerClass {
        private int innerData;
        public InnerClass(int data) {
            this.innerData = data;
        }
        public void displayData() {
            System.out.println("Outer Data: " + outerData);
            System.out.println("Inner Data: " + innerData);
        }
    }
}

public class Program_02 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass(20);
        inner.displayData();
    }
}
