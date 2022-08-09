class Assignment3{

public static void main(String []args){
int i, j, row = 4;       
  
for (i=0; i<row; i++)   
{      
for (j=2*(row-i); j>=0; j--)         
{    
System.out.print(" ");   
}   
for (j=0; j<=i; j++ )   
{      
System.out.print("1 ");   
}  
System.out.println();   
}    

}

}
//Question no.1
/* Enapsulation: Encapsulation is the method in which we don't give the actual 
direct access to the data members of the main class that is in use.
Encapsulation in Java is a process of wrapping code and data together into a single unit.
//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  
 
public class Student{  
//private data member  
private String name;  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name  
}  
}
 
class Test{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName());  
}  
}    

//Question no.2
 Polymorphism :Polymorphism means "many forms", and it occurs when we have many classes 
 that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
 Polymorphism uses those methods to perform different tasks.
 This allows us to perform a single action in different ways.
 class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The cat  says: meow meow");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bauu bauu");
  }
}




//Question no.3
/* 1. Access specifiers: The access specifirs in Java specifies the accessibility or scope of a field,
 method, constructor, or class. We can change the access level of fields, constructors, methods, and
 class by applying the access specifiers on it.
 
 There are four types of Java access specifiers:

Private: The access level of a private specifiers is only within the class. It cannot be accessed from outside the class.
Default: The access level of a default specifiers is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
Protected: The access level of a protected specifiers is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
Public: The access level of a public specifiers is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

2. Packages: A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form, built-in package and user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

3.Final keyboard: The final keyword in java is used to restrict the user.
 The java final keyword can be used in many context.
 Final can be:

1. variable
2. method
3. class
The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable
 or uninitialized final variable.
 It can be initialized in the constructor only.
 The blank final variable can be static also which will be initialized in the static block only.
 */

