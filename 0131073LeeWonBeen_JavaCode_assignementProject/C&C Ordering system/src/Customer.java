public class Customer {

    //part of the Order class, Declared when Order is init.
    //use constructor to initialize 

    public String customerName;
    public String customerPhoneNum;


    //get/set methods - for capsulation.

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName){

        this.customerName = customerName;
    }
 
    public String getCustomerPhoneNum(){

        return customerPhoneNum;

    }

    public void setCustomerPhoneNum(String customerPhoneNum){

        this.customerPhoneNum = customerPhoneNum;
    }




// Used in constructor, changing the customer information.
 public void changeCustomer(){

     boolean exit = false;

    do{
    System.out.println("Type Customer's name");
    CoreSystem.scan.nextLine(); //null 
    setCustomerName( CoreSystem.scan.nextLine());
    System.out.println("Type Customer's Phone Number");
    setCustomerPhoneNum( CoreSystem.scan.nextLine());
    
    System.out.println("The name is :" + getCustomerName());
    System.out.println("The Phone number is :" + getCustomerPhoneNum());
    
       exit = CoreSystem.correctCheck();

    }while(exit);

 }


 //show Information - used in the Order / showDetails.
 public void showCustomerDetails(){

    System.out.println(" Customer name :        "+ getCustomerName());
    System.out.println(" Customer Phone number: "+ getCustomerPhoneNum());
    

 }


        // constructor - used in the order class.

        public Customer(){}


        public Customer(boolean execute ){
            if(execute = true)
            changeCustomer();

        
        }


      
}

