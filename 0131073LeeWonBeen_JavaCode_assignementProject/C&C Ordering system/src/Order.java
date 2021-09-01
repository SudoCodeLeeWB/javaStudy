import java.util.*;

public class Order {
    

//Order variables
public int orderID;
public String orderDate;
public Date deliveryDate ;
public String deliveryAddress;
public boolean finished;

public String days3Before;
public String days2Before;
public String days1Before;



// elements of a Order class - includes

public  int productNumber =0;
public  Product [] product = new Product[100];

public Customer customer =new Customer();
public Payment payment = new Payment();
//static goes to 



// use the constructor to make make the Product in Order & productNumber
// add new products inside the Order 
public void addProductInOrder(){
    boolean exit = true;
    boolean exit2 =  true;

    do{
    exit2 =  true;
    int pNum =0;
    pNum = productNumber;
    int answer;
    System.out.println("The Product List");
    ProductSystem.showProductList(); // shows all products inside the Product Array
    
    System.out.println("\n\nCurrent Product in the List");
    ProductSystem.showProductListOrder(this);//shows this Order's Product array
    CoreSystem.scan.nextLine(); // null
    answer = CoreSystem.scan.nextInt();

        do{
            
            System.out.println("Type the Id or the Product List you want to add.");
            answer = CoreSystem.scan.nextInt();

        if(answer > ProductSystem.productNumberForProd){
            System.out.println("invalid Id, please type again.");
            exit2 =true;
        }else{
            exit2 =false;
        }
        }while(exit2);

    //두번 나오는 현상 테스트 , Order Date 와 Delivery date 해결해야함.
    System.out.println(ProductSystem.ProductArray[answer-1]);

    String productName = ProductSystem.ProductArray[answer-1].getProductName();
    String productDetailsOwner = ProductSystem.ProductArray[answer-1].getProductDetailsOwner();
    String productType = ProductSystem.ProductArray[answer-1].getProductType();
    int productPrice = ProductSystem.ProductArray[answer-1].getProductPrice();


    System.out.println("Type the quantity");
    int productQuantity =  CoreSystem.scan.nextInt();

    System.out.println("Type the user preference");
    CoreSystem.scan.nextLine();      // null
    String productDetailsUser = CoreSystem.scan.nextLine();  


    product[pNum] = new Product(pNum  ,productName , productDetailsOwner , productDetailsUser ,productQuantity , productType , productPrice ); // change
    product[pNum].setProductID(pNum);

    productNumber++;


        System.out.println("Do you want to add more product? Type Y for yes, type N for no.");
        exit = CoreSystem.boolCheck();

        if(exit = false){break;}

    }while(exit);

    

}

//delete products inside the Order
public void deleteProductInOrder(){

    int answer;
    boolean exitInner = false;

    System.out.println("The Product List");
    ProductSystem.showProductList(); // shows all products inside the Product Array
    
    System.out.println("\n\nCurrent Product in the List");
    ProductSystem.showProductListOrder(this);//shows this Order's Product array

///

    do{
        System.out.println("Choose the Product in the list you want to delete.");
        answer = CoreSystem.scan.nextInt();
        if(( answer > productNumber )||( answer < 0 )){
            System.out.println("Invalid answer , Please Type again.");
            exitInner = true;
        }
    }while(exitInner);

    //Order delete(덮어쓰기)
    for(int i = answer-1 ; i < productNumber-1 ; i++ ){

        product[i] = product[i+1];
        product[i].setProductID(i);
        
        
    }

    System.out.println("Order Info changed!");
    ProductSystem.showProductListOrder(this);
    productNumber--; // 하나 제거했음으로
}




//get/set methods **


    //set mehtods

    public void setOrderId(int sTOrderID){

        this.orderID = sTOrderID;
    }

    public void setFinsihed(boolean finished){

        this.finished = finished;
    }

    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(Date deliveryDate){
        this.deliveryDate = deliveryDate;
    }
    

    // for editing the customer/payment
    public void setCustomer(){
        customer  = new Customer();
    }

    public void setPayment(){

        payment = new Payment();
    }



    public void setDays3Before(){
    
        DisplaySystem.calendar2.setTime(deliveryDate);
        DisplaySystem.calendar2.add(Calendar.DATE ,  -1);
        this.days3Before = CoreSystem.sdf.format(DisplaySystem.calendar2.getTime());
    }

    public void setDays2Before(){
        
        DisplaySystem.calendar2.setTime(deliveryDate);
         DisplaySystem.calendar2.add(Calendar.DATE ,  -2);
        this.days2Before = CoreSystem.sdf.format(DisplaySystem.calendar2.getTime());
    }
    
    public void setDays1Before(){
        DisplaySystem.calendar2.setTime(deliveryDate);
        DisplaySystem.calendar2.add(Calendar.DATE ,  -3);
        this.days1Before = CoreSystem.sdf.format(DisplaySystem.calendar2.getTime());

    }
    



//get methods

public int getOrderID(){
    return orderID;
}

public String getOrderDate(){

    return orderDate;
}

public Date getDeliveryDate(){
    return deliveryDate;
}

public boolean getFinished(){
    return finished;
}

public String getDeliveryAddress(){
    return deliveryAddress;
}

public String getDays3Before(){
    
    return days3Before;
}
public String getDays2Before(){

    return days2Before;
}

public String getDays1Before(){

    return days1Before;
}


//part of the showOrder information

public void showOrderVariableDetails(){

    System.out.println(" Order ID :     " + getOrderID() );
    System.out.println(" Order Date :   " + getOrderDate() );
    System.out.println(" Delivery Date :" + getDeliveryDate() );
    System.out.println(" Delivery Address :" + getDeliveryAddress() );
    System.out.println(" Order Finished? :" + getFinished() );

}


//change product information


        // show Order information (display for one instance.)
        public void showOrderInformation(){
        
            //Informations needs to be seen
            //0.    Order info
            //1.    Customer info
            //2.    Payment info
            //3.    Products included in the Order.

            System.out.println("\n\n ================ORDER============== \n\n");
            showOrderVariableDetails();
            customer.showCustomerDetails();
            payment.showPaymentDetails();
            
            //shows this Order's Product array 
            ProductSystem.showProductListOrder(this);

            //shows total price
            System.out.println("Total price is : " + ProductSystem.getTotalProductPrice(this));

            System.out.println("\n\n ==============ORDER END============ \n\n");

        
        }


            public Order(){}


                // Order Constructor
                public Order( int orderID , String OrderDate , Date deliveryDate , boolean finished ,Customer customer ,Payment payment , String deliveryAddress  ){

                    this.orderID = orderID;
                    this.orderDate = OrderDate;
                    this.deliveryDate = deliveryDate;
                    this.finished = finished;
                    this.customer = customer;
                    this.payment = payment;
                    this.deliveryAddress = deliveryAddress;
                    addProductInOrder();

                    //days for DisplaySystem.
                    setDays1Before();
                    setDays2Before();
                    setDays3Before();
                    
                }





}
