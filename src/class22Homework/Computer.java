package class22Homework;

public class Computer {

    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
     * Define common behavior within and some fields in parent class
     * and override some of the methods in child classes
     * Define some methods specific to child classes
     * Create objects of child classes and store them into array.
     * Loop through each object and execute available methods.
     *
     */

    String name;
    String storage;
    String memory;
  Computer(String name, String memory,String storage){
      this.name=name;
      this.memory=memory;
      this.storage=storage;

  }

    void operatingSystem(){
        System.out.println(name + " " +memory+ " "+ storage +"All the computer have to have software that will run the computer");
    }
    void sound() {
        System.out.println(name + " " +memory+ " "+ storage +"Most the computer have build in speakers that gives sound");
    }
    void memory() {
        System.out.println(name + " " +memory+ " "+ storage + "Memory plays a importand role in computer as it stores information ");
    }
}

class Apple extends Computer {
    Apple(String name, String memory,String storage) {
        super(name, memory,storage);
    }

    @Override
    void memory() {
        System.out.println( name + " " +memory+ " "+ storage +"Without a momory the computer will not work proporly or will not work at all ");
    }
    @Override
    void sound() {
        System.out.println(name + " " + memory + " " + storage + "The speakers produce sounds that comes from a coputer ");
    }
        void programs() {
            System.out.println(name + " " +memory+ " "+ storage + "Their is two types of software programs one is system software and another is application software.");
        }
}
        class Lenovo extends Computer {
            Lenovo(String name, String memory, String storage) {
                super(name, memory, storage);
            }

                void programs () {
                    System.out.println(name + " " + memory + " " + storage + "Programming software is for computer programmers and developer who are writing code...");
                }
            }
        class HP extends Computer {
            HP(String name, String memory, String storage) {
                super(name, memory, storage);
            }

        void memory() {
            System.out.println( name + " " + memory + " " + storage +  "Users can store their information as a storage on a flash drive");
        }
    }
    class Dell extends Computer {
        Dell(String name, String memory, String storage) {
            super(name, memory, storage);

    }
    void operatingSystem(){
        System.out.println("Its computers memory and processes.");

    }

}





