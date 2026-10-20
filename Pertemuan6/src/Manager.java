public class Manager extends Karyawan {
    private double bonus;
    
    @Override 
    public String getDetails() {
        return super.getDetails() + "Bonus = " + bonus + "\n";

    }
    
    public Manager(String id, String nama, double gajiPokok, double bonus) {
        super(id, nama, gajiPokok);
        this.bonus = bonus;
    }
}