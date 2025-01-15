package mypackage;

public class Employee extends Person {
    //"Maxim", "maxchakanov@gmail.com",44," + 7 961 437 24 81"
    public Employee(String name, String email, int age, String phone) {
        super(name, email, age, phone);

    }

    void displayPhone() {
        System.out.println("Phone:" + phone);
    }
}
