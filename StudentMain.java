class Student 
{
    String name;
    int rollNo;
    float marks;
    Student(String n, int r, float m)
    {
        name = n;
        rollNo = r;
        marks = m;
    }
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
        Student s1 = new Student("Lahari", 101, 85.5f);
        s1.display();
    }
}
