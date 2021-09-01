
package arrayListEX;

public class arrayinPrint {

    public static void main(String[] args){

        
        ex1 a = new ex1();
        ex2 b = new ex2();

        a.example1();
        b.example2();
        

        
        //example3 - book class & array.
        Book [] library = new Book[5];
        //this sentence points the address of a space to store the information of new instances. & initialized as null.


        library[0] = new Book( "가" , "나" );
        library[1] = new Book( "다" , "라" );
        library[2] = new Book( "마" , "바" );
        library[3] = new Book( "사" , "아" );
        library[4] = new Book( "자" , "차" );


        
        for (int i = 0; i < library.length; i++) {

            
            System.out.println(library[i]);
            library[i].showBookDetails();
            

        }

        
    }
    
}
