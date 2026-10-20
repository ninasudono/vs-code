public class Person {
    private String name;
    private int age;

    //constructor tanpa param
    public Person() {
        this.name = "NONAME";
        this.age=20;
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+"-"+age + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
        }

    public int getAge() {
        return age;
    }
}