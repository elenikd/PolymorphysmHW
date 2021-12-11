package myfile.schoolAbstract;
                               // Abstract keyword in Java |Abstract class and Methods in Java
abstract class Person {
    String name;
    int age;

    void setData(String name, int age) {    // setData assigned values to our variables
        this.name = name;
        this.age = age;
    }

    abstract void display();
}

    class Student extends Person {
     int rollNumber = 520;

        @Override
        void display() {    // void <---method
            System.out.println("Student name :" + name);
            System.out.println("Age : " + age);
            System.out.println("Roll number : " + rollNumber);
        }
    }
    class Teacher extends Person {
    int salary = 5000;
    @Override
    void display(){
        System.out.println("Teacher name :" + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
    }

    //Driver Class
    class School{
        public static void main(String[] args) {
            // create Object of student and Teacher
           Student studentObject = new Student();
           Teacher teacherObject = new Teacher();
           studentObject.setData("John", 5);
           studentObject.display();

           // 1)  We cannot create an object of an abstract class
            // 2) And subclasses of an abstract class must override the unimplemented abstract methods

            /*



                 Abstract keyword can be used with Class and methods.
                 Abstract methods had no body
                 We can not create an Object of abstract class

              abstract class Person {
              public abstract void sameMethods();<-----NO BODY
            }
              public static void main(String[] args){
                 Person object = new Person();   // we are calling method without body
                 object.sameMethods
              }
The setData() method of
Java DatagramPacket class sets the data buffer, length and offset for this packet.

              What is SetData?
SetData(String, Object) Stores the specified data in this data object, along with one or more
specified data formats. The data format is specified by a string. SetData(Type, Object)
Stores the specified data in this data object, along with one or more specified data formats.



             */



        }

    }


