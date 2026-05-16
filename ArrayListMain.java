import java.util.*;
// Step 1: Create Employee class
class Employee 
{
    int id;
    String name;
    // Constructor
    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    // Display method
    void display() 
    {
        System.out.println("ID: " + id + " Name: " + name);
    }
}
// Main class
public class ArrayListMain 
{
    public static void main(String[] args) 
    {
        // Step 2: Create ArrayList
        ArrayList<Employee> empList = new ArrayList<>();
        // Step 3: Insert employees
        empList.add(new Employee(1, "Ravi"));
        empList.add(new Employee(2, "Sita"));
        empList.add(new Employee(3, "Ram"));
        // Step 4: Display employees
        System.out.println("Employee List:");
        for (Employee e : empList) 
        {
            e.display();
        }
        // Step 5: Remove employee (index 1 → Sita)
        empList.remove(1);
        // Step 6: Display after removal
        System.out.println("After Removal:");
        for (Employee e : empList) 
        {
            e.display();
        }
    }
}
