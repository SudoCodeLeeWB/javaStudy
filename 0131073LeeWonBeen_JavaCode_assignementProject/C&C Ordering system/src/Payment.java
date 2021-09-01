public class Payment {
    
//check payment
public boolean payCheck;
public String paymentMethod;


public String getPaymentMethod(){
    return paymentMethod;
}

public boolean getPayCheck(){

    return payCheck;
}


    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void setPayCheck(boolean payCheck){
        this.payCheck = payCheck;
    }



        public void changePaymentMethod(){

            boolean exit = false;
        
           do{
           System.out.println("Type Payment method");
           CoreSystem.scan.nextLine();// null
           setPaymentMethod(CoreSystem.scan.nextLine());
           System.out.println("The payment Mehtod is :" + getPaymentMethod());

              exit = CoreSystem.correctCheck();
           }while(exit);
       

           
        }


        public void changePaymentState(){

            boolean exit = false;
        
           do{
           System.out.println("Paid already? ");
           setPayCheck( CoreSystem.boolCheck());
        
           System.out.println("paid already? :" + getPayCheck());
    
              exit = CoreSystem.correctCheck();
        
           }while(exit);
       
        }

        
        public void showPaymentDetails(){


            System.out.println( "Payment method is :    "+ getPaymentMethod());
            System.out.println(" Payment finsihed? :    "+ getPayCheck());


        }



        public void changePaymentDetails(){
            
            changePaymentState();
            changePaymentMethod();
        }



            //constructor 

            public Payment(){}

            public Payment(boolean execute){

                if (execute = true)
                changePaymentDetails();
        
            }




}
