# OOPs Lab - Viva Questions (Units I to V)

## UNIT I – Viva Questions

**What is Java?**
Java is a high-level, object-oriented programming language. It is platform-independent because it runs on JVM.

**What are features of Java?**
Platform independent, object-oriented, secure, robust, multithreaded. It also supports portability and automatic memory management.

**What is JVM?**
Java Virtual Machine executes Java bytecode. It converts bytecode into machine-level instructions.

**What is JDK?**
Java Development Kit is used to develop Java programs. It includes compiler (`javac`), JVM, and libraries.

**What is JRE?**
Java Runtime Environment provides runtime support. It contains JVM and required libraries to run programs.

**What is OOP?**
Object-Oriented Programming is based on objects and classes. It improves code reusability and modularity.

**What is a Class?**
A class is a blueprint for creating objects. It contains variables and methods.
*Syntax:*
```java
class A {}
```

**What is an Object?**
An object is an instance of a class. It represents real-world entities.
*Syntax:*
```java
A obj = new A();
```

**What is Encapsulation?**
Binding data and methods into a single unit. It is achieved using classes and access modifiers.

**What is Abstraction?**
Hiding internal details and showing only functionality. It is achieved using abstract classes and interfaces.

**What is Inheritance?**
Acquiring properties from parent class to child class. It promotes code reuse.
*Syntax:*
```java
class B extends A
```

**What is Polymorphism?**
One name, many forms. It is achieved through method overloading and overriding.

**What are Java keywords?**
Reserved words with predefined meaning. They cannot be used as identifiers.

**What is an Identifier?**
Name given to variable, class, or method. It must follow naming rules.

**What are Data Types?**
Define the type of data a variable can store. Example: `int`, `float`, `char`, `boolean`.

**What are Operators?**
Symbols used to perform operations on data. Example: arithmetic, relational, logical operators.

**What are Control Statements?**
Used to control the flow of execution. Examples: `if`, `for`, `while`.

---

## UNIT II – Viva Questions

**What is a Method?**
A method is a block of code that performs a specific task. It improves code reusability.
*Syntax:*
```java
void show(){}
```

**What is Constructor?**
A special method used to initialize objects. It is automatically called when object is created.

**Types of Constructor?**
Default constructor and parameterized constructor. Default has no arguments, parameterized accepts values.

**What is Array?**
Collection of similar data elements stored in contiguous memory. Accessed using index.
*Syntax:*
```java
int a[] = new int[5]; 
```

**What is Multidimensional Array?**
Array of arrays used to store data in tabular form.
*Syntax:*
```java
int a[][] = new int[2][2]; 
```

**What is String?**
A sequence of characters enclosed in double quotes. Strings are immutable in Java.

**What is Inheritance?**
Child class acquires properties of parent class. It supports code reuse.

**Types of Inheritance?**
Single, Multilevel, Hierarchical. Multiple inheritance is achieved using interfaces.

**What is super keyword?**
Refers to parent class object. Used to call parent constructor or variables.
*Syntax:*
```java
super(); 
```

**What is Member Access?**
Accessing variables and methods using objects. Controlled using access modifiers.

**What are Access Modifiers?**
Control visibility of class members. Types: `public`, `private`, `protected`, `default`.

**What is final keyword?**
Used to restrict modification. Final variable becomes constant and final method cannot be overridden.

**What is Object class?**
Root class of all Java classes. Every class implicitly extends Object class.

**What is Method Overriding?**
Redefining parent class method in child class. It supports runtime polymorphism.

**What is Dynamic Binding?**
Method call is resolved at runtime. Also called late binding.

**What is Abstract Class?**
A class that contains abstract and concrete methods. It cannot be instantiated.

**What is Abstract Method?**
Method without body. Must be implemented by subclass.
*Syntax:*
```java
abstract void show();
```

---

## UNIT III – Viva Questions

**What is an Interface?**
An interface is a collection of abstract methods and constants. It is used to achieve abstraction and multiple inheritance.

**What is implementing an interface?**
Providing definition for interface methods using a class. A class must override all abstract methods of interface.

**What is interface reference?**
Interface reference can hold object of implementing class. It is used to achieve runtime polymorphism.

**Can a class implement multiple interfaces?**
Yes, a class can implement multiple interfaces. This supports multiple inheritance in Java.

**What are constants in interface?**
Variables in interface are `public`, `static`, and `final` by default. They cannot be changed once assigned.

**Can an interface extend another interface?**
Yes, using `extends` keyword. It allows inheritance between interfaces.

**What is a package?**
A package is a collection of related classes and interfaces. It helps in organizing and avoiding name conflicts.

**What is exception handling?**
Handling runtime errors to maintain normal execution. It prevents program from crashing.

**What is try-catch?**
Used to handle exceptions. Try block contains risky code and catch handles error.

**What is finally block?**
Block that always executes whether exception occurs or not. Used for cleanup operations.

**What is throw?**
Used to explicitly throw an exception. It is used inside method body.

**What is throws?**
Used to declare exceptions in method signature. It informs caller about possible exceptions.

---

## UNIT IV – Viva Questions

**What is a byte stream?**
Used to handle binary data such as images and files. Example: `FileInputStream`.

**What is a character stream?**
Used to handle text data using Unicode. Example: `FileReader`.

**Difference between byte and character stream?**
Byte stream handles binary data, character stream handles text data.

**What is FileInputStream?**
Used to read data from file in byte form.

**What is FileOutputStream?**
Used to write data into a file.

**What is multithreading?**
Executing multiple threads simultaneously. It improves performance and efficiency.

**How to create a thread?**
By extending `Thread` class or implementing `Runnable` interface.

**What is run() method?**
Contains the code executed by thread.

**What is start() method?**
Starts execution of thread and calls `run()` method.

**What is sleep() method?**
Pauses thread execution for a specified time.

**What is join() method?**
Makes one thread wait until another thread finishes.

**What is an Applet?**
A Java program that runs inside a web browser. It is mainly used for GUI-based applications.

**What are applet life cycle methods?**
`init`, `start`, `paint`, `stop`, `destroy`. They control execution of applet.

---

## UNIT V – Viva Questions

**What is Swing?**
Swing is a Java framework used to create GUI applications. It provides rich set of components.

**What is JFrame?**
A top-level container used to create window applications.

**What is JButton?**
Used to create a clickable button.

**What is JLabel?**
Used to display text or images.

**What is JTextField?**
Used to accept input from user.

**What is Layout Manager?**
Controls arrangement of components in a container.

**What is FlowLayout?**
Arranges components from left to right.

**What is event handling?**
Handling user actions like button clicks or key press.

**What is ActionListener?**
Interface used to handle button click events.

**What is actionPerformed() method?**
Method that is executed when an event occurs.

**How to add components in JFrame?**
Using `add()` method.
*Example:*
```java
frame.add(button);
```
