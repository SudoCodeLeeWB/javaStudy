
import java.text.SimpleDateFormat;
import java.util.*;



public class CoreSystem {
    

    
    static Scanner scan = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat(" '  Date  ' yyyy-MM-dd  "); // reference : https://www.javatpoint.com/java-simpledateformat
    public  static Calendar calendar = Calendar.getInstance(); // reference : https://www.javatpoint.com/java-util-calendar
    

  //Used to check the input value. If the User wants to fix the input, then simply type 2 and enter the value again.
  //retuens the boolean , which is used to control the do while () loop.

  public static boolean correctCheck(){

    int answer = 0;
    boolean exitInner = false;
  
    do{
  
        System.out.println("If it is correct, Type 1 ");
        System.out.println("If it is  not correct, Type 2 ");
        answer = CoreSystem.scan.nextInt();
    
            
          if((answer != 1)&&(answer != 2)){
            System.out.println("Invalid answer , please type again.");
            exitInner = true;
        
          }
    }while(exitInner);
          

          if(answer == 1){

            exitInner = false;
            return false;                
          } else{ // case : answer == 2
            
            exitInner =false;
            return  true;
          }

  }


  //If the user types Y/N , It converts into yes / no
  // used for boolean value "finished"
  public static boolean boolCheck(){

    char answer ;
    boolean exitInner = false;
  
    do{
  
        System.out.println("Type  Y  for yes");
        System.out.println("Type  N  for no");
        CoreSystem.scan.nextLine();// null // reference : https://stackoverflow.com/questions/55549217/multiple-values-with-only-one-scanner-method
        answer = CoreSystem.scan.next().charAt(0);
    
            
          if((answer != 'Y')&&(answer != 'y')&&(answer != 'N')&&(answer != 'n')){
            System.out.println("Invalid answer , please type again.");
            exitInner = true;
        
          }else{
            exitInner = false;
          }

    }while(exitInner);

          
        switch(answer){

          case 'Y' , 'y':
            return true;
      
          case 'N' , 'n':
            return false;
  
        }

      // no need
     return true; 

  }







}
