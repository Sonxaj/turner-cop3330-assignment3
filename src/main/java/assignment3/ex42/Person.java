package assignment3.ex42;

public class Person {
    private String firstName;
    private String lastName;
    private int salary;

    public Person(String lastName, String firstName, int salary){
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }


    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getSalary(){
        return this.salary;
    }

}
