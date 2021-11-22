public class Student {

    /*Create a Class Student that will have 3 subclasses as
     * SyntaxStudent, CollegeStudent, SchoolStudent.
     * override some of the methods in child classes
     * Define some methods specific to child classes
     * Write example of achieving run time polymorphism
     *
     */

    void practice() {
        System.out.println(" Being a student is a great way to develop your knowledge. ");
        System.out.println();
    }
    void study() {
        System.out.print(" Education is our passport to the future, ");
    }

    void learning() {
        System.out.println(" Learning how to code in Java world ");
    }
}
     class SyntaxStudent extends Student {
         @Override
         void learning() {
             System.out.println(" Syntax Student gets skills and uderstanding of how codding is run. ");
         }

         @Override
         void study() {
             System.out.println(" Our teacher is very sarcastic in Syntax Class, so student woun't be asleep. ");
         }
     }
    class CollegeStudent  extends Student  {
        @Override
         void practice () {
            System.out.println(" Student practice daily how to code and learning diffrent topics on coding world. ");
    }
}
    class SchoolStudent extends Student {
         @Override
          void study(){
        System.out.println(" Students Background Knowledge ");
    }
}
























