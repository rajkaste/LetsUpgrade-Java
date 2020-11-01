package Day8.Q1;

public class Main {
    public static void main(String[] args) {

        Principal p  = new Principal();
        p.getDetails();
        p.displayDetails();

        System.out.println("-------------------------------------------------");

        Teacher t = new Teacher();
        t.getDetails();
        t.displayDetails();

        System.out.println("-------------------------------------------------");

        Accountant a = new Accountant();
        a.getDetails();
        a.displayDetails();

    }
}
