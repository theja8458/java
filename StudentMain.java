class Student 
{
    String name;
    int rollNo;
    float marks;
    // Constructor
    Student(String n, int r, float m) //constructor with parameters
    {
        name = n;
        rollNo = r;
        marks = m;
    }
    // Method to display details
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
public class StudentMain 
{
    public static void main(String[] args) 
    {
        // Creating object using constructor
        Student s1 = new Student("Lahari", 101, 85.5f);
        s1.display();
    }
}
