import java.util.*;
class Employee 
{
    int id;
    String name;
    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    void display() 
    {
        System.out.println("ID: " + id + " Name: " + name);
    }
}
public class ArrayListMain 
{
    public static void main(String[] args) 
    {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Ravi"));
        empList.add(new Employee(2, "Sita"));
        empList.add(new Employee(3, "Ram"));
        System.out.println("Employee List:");
        for (Employee e : empList) 
        {
            e.display();
        }
        empList.remove(1);
        System.out.println("After Removal:");
        for (Employee e : empList) 
        {
            e.display();
        }
    }
}
