package constructorEx;

// test main class//
public class PersonTest {


    public static void main(String[]args){


        //call default constructor
        Person PersonKang = new Person();
            System.out.println(PersonKang.name);


        // call constructor : public Person(String name) + constructor Overload
        Person PersonLee = new Person("LeeWonBeen");

            // manual value setting < possible because it is public >
            PersonLee.height = 180;

            System.out.println(PersonLee.height);
            System.out.println(PersonLee.name);






        
    }
    
}
