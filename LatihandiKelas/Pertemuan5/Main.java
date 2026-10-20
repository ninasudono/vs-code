public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("E001", "Andi");

        System.out.println("ID: " + emp.getId());
        System.out.println("Nama: " + emp.getName());
        System.out.println("Gaji bersih: " + emp.getGajiBersih());

        Manager mgr = new Manager("M001", "Budi", 1000000);

        System.out.println("Nama Manager: " + mgr.getName());
        System.out.println("Bonus: " + mgr.getBonus());
    }
}