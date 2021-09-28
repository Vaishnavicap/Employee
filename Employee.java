/*Write a program that would print the information (name, year of joining, salary, address) 
of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address Robert 1994 64C- WallsStreet Sam 2000 68D- WallsStreet John 1999 26B- WallsStreet*/


package employee;

public class Employee 
{
    String name = new String();
    String address = new String();
    int year ,salary;
    Employee(String name ,int year ,int salary ,String address)
    {
        this.name = name;
        this.address = address;
        this.year = year;
        this.salary = salary;
    }
    

    public static void main(String[] args) 
    {
        
        Employee first = new Employee("Varun Kamble",2020,30000,"Pune");
        Employee second = new Employee("Poorva Shinde",2012,100000,"Napur");
        Employee third = new Employee("Payal Agarwal",2012,100000,"Kholapur");
        
        System.out.println("Information of Three Employees are as follows : ");
        System.out.println(first.name + " Year of joining " + first.year + ", Current salary : " + first.salary + "Rs and Address : " + first.address);
        System.out.println(second.name + " Year of joining " +second.year + ", Current salary : " + second.salary + "Rs and Address : " + second.address);
        System.out.println(third.name + " Year of joining " +third.year + ", Current salary : " + third.salary + "Rs and Address : " + third.address);
        

    }
    
}
