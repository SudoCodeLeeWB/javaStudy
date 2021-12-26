public class Customer {
    
    private int customerID;
    private String customerName;
    protected String customerGrade;
    public int bounsPoints;
    public double bonusRatio;
    public double discountRatio;

    //constructor
    //basic information of customer -> apply to all customers.
    public Customer(){

        customerGrade = "Silver";
        bonusRatio = 0.01;
        discountRatio = 0;
        getCustomerName();
        
    }

    //used inside of the calcPrice , automatically adds the point while the price calcualtion is executed.
    private int earnPoint(double price){

        double bonusPoint  = 0;
        
        bonusPoint = price * bonusRatio;
        return bonusPoint;

    }


    // called during the calculation process.
    public double calcPrice(double originalPrice){

        double price = 0; 
        
        //get point if the user buys the product.
        bonusPoint = earnPoint(originalPrice);
        price = originalPrice * ( 1 - discountRatio);
        return price;

    }


    // get , set methods.
    public String getCustomerName(){

        return customerName;

    }
    
    public void setCustomerName(String customerName){

        this.customerName = customerName;

    }

    // The info only can viewed by the showCustomerInfo
    private String getCustomerGrade(){

        return customerGrade;

    }


    public String showCustomerInfo(){

        return  getCustomerName() + " 님의 등급은 " + getCustomerGrade() +" 입니다 " + bonusPoint +"   "+ bonusRatio + "   " + discountRatio + "   " + customerID ; 

    }


    public void setCustomerID(int customerID){

        this.customerID = customerID;

    }





}
