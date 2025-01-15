package mypackage;

public class Person {
    private String name;
    public String email;
    int age;
    protected String phone;

    public Person(String name, String email, int age, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    protected String getPhone() {
//        return phone;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone :" + phone);

    }
}

