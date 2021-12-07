package class22Homework;

public class ComputerTester {
    public static void main(String[] args) {
        Computer computer1 = Computer("Apple");
        Computer[] computer = {new Apple("MacBook"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")};

        for (Computer comp2 : computer) {
            comp2.name();
            comp2.memory();
            comp2.storage();

             if (comp2 instanceof Dell){
                 (Dell)comp2.operatingSystem();
             }
        }


    }


}
