public class Employee {
    public String id;
    public String name;
    public double salary;

    public Employee() {
        id = "00";
        name = "noname";
        salary = 25000.0;
    }

    public Employee(String id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getGajiBersih() {
        double gb = salary - (salary * (5.0/100.0));
        return gb;
    }
}
