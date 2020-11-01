package Day8.Q4;

public class Main {
    public static void main(String[] args) {

        Employee[] emp = new Employee[3];

        emp[0] = new Principal();
        emp[0].getDetails();
        emp[0].displayDetails();
        System.out.println("------------------------------------");
        emp[1] = new Teacher();
        emp[1].getDetails();
        emp[1].displayDetails();
        System.out.println("------------------------------------");
        emp[2] = new Accountant();
        emp[2].getDetails();
        emp[2].displayDetails();


    }
}
