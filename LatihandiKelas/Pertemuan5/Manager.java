public class Manager extends Employee {
    private double bonus;
    
    public Manager() {
    }

public Manager(String id, String name, double bonus) {
    super(id, name);
    this.bonus = bonus;
}
public double getBonus() {
    return bonus;
}
}