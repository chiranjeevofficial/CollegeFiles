class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Program_12 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Narayan");
        p.setAge(24);
        System.out.println("Person Name: "+p.getName());
        System.out.println("Person Age : "+p.getAge());
    }
}
