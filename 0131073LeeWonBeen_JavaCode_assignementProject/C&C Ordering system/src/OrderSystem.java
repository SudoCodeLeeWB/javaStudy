import java.util.Calendar;
import java.util.Date;

public class OrderSystem {
    


//an array to save the Order list

// instance arrays for the Order
// int - used when allocate the OrderId to the Order.
public static int stOrderId =0; // static Order Id , for Controling the OrderArray. ( can differenciate the Array which is null or has a instance.)
public static Order[] OrderArray = new Order[100]; // initilize the Order , The 100 Order instance can be stored (from 0 to 99). Can not use sql to store and put data, therefore required. 



//declare it as a static, 
//add new Order
    public static void addOrder(){

        int number = stOrderId ;
        // int ID =stOrderId ;
        
        int orderID  =makeOrderID();
        String OrderDate  = makeOrderDate(); 
        System.out.println(makeOrderDate());
        Date deliveryDate = makeDeliveryDate(); 
         boolean finished = makeFinished();
         String deliveryAddress = makeDeliveryAddress();
        OrderArray[number] = new Order( orderID , OrderDate , deliveryDate ,finished ,new Customer(true) , new Payment(true) , deliveryAddress) ;
        OrderArray[number].addProductInOrder();
        
        System.out.println("New Order Generated!");
        OrderArray[number].showOrderInformation();

    }


//Edit Order{
    public static void editOrder(){

        boolean exitInner = false;
        int menus = 0;
        int answer;

        System.out.println("Edit Order");

        do{
            listOrder();
            System.out.println("Choose the Order you want to edit.");
            answer = CoreSystem.scan.nextInt();
            // why two times?

                // filtering the Order
            if(( answer > stOrderId )||( answer < 0 )){
                System.out.println("Invalid answer , Please Type again.");
                exitInner = true;
            }else{
                exitInner = false;
            }
        }while(exitInner);

        // menu - navigate
        menus = askProductInOrder();


        if(menus ==1){

                // add Product In order
                OrderArray[answer].addProductInOrder();


        }else if(menus == 4){
            //edit the whole Order 

        
        listOrder();
        
        int orderID  = answer;
        String OrderDate  = makeOrderDate(); 
        System.out.println(makeOrderDate());
        Date deliveryDate = makeDeliveryDate(); 
        boolean finished = makeFinished();
        String deliveryAddress = makeDeliveryAddress();


        OrderArray[answer] = new Order( orderID , OrderDate , deliveryDate ,finished ,new Customer(true) , new Payment(true) , deliveryAddress) ;


        System.out.println("\nOrder edited!\n");
        System.out.println("Edited Order :");

        OrderArray[answer].showOrderInformation();

        }else if(menus == 2){

            OrderArray[answer].deleteProductInOrder();


        }else{
            // menus == 3 case
            System.out.println("Is the order Finished?");
            boolean a = CoreSystem.boolCheck();

            OrderArray[answer].setFinsihed(a);


        }

    }


//delete Order
    public static void deleteOrder(){
        int answer;
        boolean exitInner = false;
        
        System.out.println("Delete Order");


        if(stOrderId != 0){
        listOrder();
    

                do{
                    System.out.println("Choose the Order you want to delete.");
                    answer = CoreSystem.scan.nextInt();
                    if(( answer-1 > stOrderId )||( answer < 0 )){
                        System.out.println("Invalid answer , Please Type again.");
                        exitInner = true;
                    }
                }while(exitInner);

        //Order delete
                         for(int i = answer-1; i < stOrderId-2 ; i++ ){
                             
                             OrderArray[i] = OrderArray[i+1];
                             OrderArray[i].setOrderId(i);
                             
                         }


        System.out.println("Order Info changed!");

        stOrderId--; // deleted one Order , 
        listOrder();
        }else{
            System.out.println(" There are no Orders. Please enter a Order " );
        }

    }


    public static int askProductInOrder(){
        boolean exit  = true;
        int answer;

            do{
            System.out.println("what do you want to do?");
            System.out.println("1. add product in Order");
            System.out.println("2. delete product in Order");
            System.out.println("3. change the state of the Order");
            System.out.println("4. change the entire  Order ");

            answer = CoreSystem.scan.nextInt(); 
   
                if((answer == 1)||(answer == 2)||(answer == 3)){
                    exit = false;
                }
                else{
                        System.out.println("Invalid answer ! plese type again.");
                        exit = true;
                }

        }while(exit);

        return answer;
        

    }





//listDown Order system using the for loop
public static void listOrder(){

        for (int i =0; i <= stOrderId-1 ; i++){
              
            OrderArray[i].showOrderInformation();
        
        }
}

// setting the Order values here.


//OrderID setting
public static int makeOrderID(){

    stOrderId += 1;
    return stOrderId;

}


// add reference for here
public static String  makeOrderDate(){

String formattedTime = CoreSystem.sdf.format(CoreSystem.calendar.getTime());

int colon = formattedTime.length()-2;
formattedTime = formattedTime.substring(0,colon) + ":"
    + formattedTime.substring(colon);

return formattedTime;
}


public static Date makeDeliveryDate(){

    int afterdays;
    boolean exit = false;
    String formattedTime;
    Date date ;

    do{
    System.out.println("when do you want to receive?");
    System.out.println("Today : " + makeOrderDate());
    System.out.println("After ---- Days : ");
    afterdays = CoreSystem.scan.nextInt();
    CoreSystem.calendar.add(Calendar.DATE , afterdays);
    formattedTime = CoreSystem.sdf.format(CoreSystem.calendar.getTime());
    System.out.println("selected date is : " + formattedTime);
    //initialize the getTime
    date = CoreSystem.calendar.getTime();
    exit = CoreSystem.correctCheck();
    CoreSystem.calendar.add(Calendar.DATE , -afterdays);
    
    }while(exit);

    return date;

}


public static boolean makeFinished(){

    return false;
}



public static String makeDeliveryAddress(){

    System.out.println("Type the delivery address");
    CoreSystem.scan.nextLine(); //null
    String address = CoreSystem.scan.nextLine();
    return address;
}




}
