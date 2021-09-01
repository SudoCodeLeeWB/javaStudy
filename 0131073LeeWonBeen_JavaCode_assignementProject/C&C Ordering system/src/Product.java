    public class Product {
    
    public static int genID =0;
    public int productID = 0;
    public String productName ="";
    public String productDetailsOwner ="";
    public String productDetailsUser ="";
    public int productQuantity =0;
    public String productType = "";
    public int productPrice =0;

        public int totalPrice =0;
   


    //get & set methods
    
    public String getProductName(){

        return productName;
    }

    public String getProductDetailsOwner(){

        return productDetailsOwner;
    }

    public String getProductDetailsUser(){

        return productDetailsUser;
    }

    public int getProductID(){

        return productID;
    }

    public int getProductQuantity(){

        return productQuantity;
    }

    public String getProductType(){

        return productType;
    }
    
    public int getProductPrice(){

        return productPrice;
    }

    public int getTotalPrice(){

        return totalPrice;
    }


        
        public void setProductName(String productName){
        
           this.productName = productName;
        }
       
       
        public void setProductDetailsOwner(String productDetailsOwner){
         
             this.productDetailsOwner = productDetailsOwner;
        }
       
           
        public void setProductDetailsUser(String productDetailsUser){
         
             this.productDetailsUser = productDetailsUser;
        }
               
        public void setProductID(int productID){
            
             this.productID = productID;
        }
       

       public void setProductQuantity(int productQuantity){

            this.productQuantity = productQuantity;
       }

       public void setProductType(String productType){

            this.productType = productType;
       }

       public void setproductPrice(int price){
           this.productPrice = price;

       }

       public void setTotalPrice(int price, int quantity){
        this.totalPrice = price * quantity;


       }
        


    // show details of the product. 
    public void showProductDetails(){

        //cli interface
        System.out.println("         "+getProductID()+ "         "+getProductType()+ "            " + getProductName() +"               "+ getProductDetailsOwner()+"               "+ getProductPrice() + "   ");
    }     


    // show details of the product - For Order
    public void showProductDetailsOrder(){

        //cli interface
        System.out.println("         "+getProductID()+ "         "+getProductType()+ "            " + getProductName() +"               "+ getProductDetailsOwner()+ "               "+ getProductDetailsUser() +"               "+ getProductQuantity() + "        " + getProductPrice() +"               "+ getTotalPrice() +"   ");
    }    


    public int generateID(){

        genID ++;
        return genID;
    }


// constructor used for OrderSystem.

public Product(){}



    public Product( int productID , String productName, String productDetailsOwner, String productDetailsUser, int productQuantity, String productType, int productPrice ){

        setProductID(productID);
        setProductType(productType);
        setProductName(productName);
        setProductDetailsOwner(productDetailsOwner);
        setProductDetailsUser(productDetailsUser);
        setProductQuantity(productQuantity);
        setproductPrice(productPrice);
        setTotalPrice(productQuantity ,productPrice );



    }


// constructor for ProductSystem.
    public Product(String productType ,String productName ,String productDetailsOwner, int price){
        
        setProductID(generateID());
        setProductType(productType);
        setProductName(productName);
        setProductDetailsOwner(productDetailsOwner);
        setProductDetailsUser(null);
        setProductQuantity(0);
        setproductPrice(price);
    }

     
//use deep copy to add Product inside the order - select using the product ID (from the productlist side).
 

}
  

