public class ProductSystem {
    
public static int  productNumberForProd =0;   // control the ProductArray
public static Product[] ProductArray = new Product[100];

    
   //add new Product

   public static void addProduct(){
    
    String productType = getProductType();
    String productName  = getProductName();
    String productDetailsOwner = getProductDetailsOwner();
    int price = getProductPrice();
    
       ProductArray[productNumberForProd] = new Product(productType ,productName, productDetailsOwner , price);
      
       System.out.println("New Product Generated!");
       productNumberForProd ++;
       showProductList();
}


//Edit Product

public static void editProduct(){

    int answer;
    System.out.println("Edit Product");
    showProductList();
    if(productNumberForProd != 0){
    System.out.println("Type the product ID you want to edit.");
    answer = CoreSystem.scan.nextInt(); 
    if(( answer-1 <= productNumberForProd)&&(answer-1 >= 0)){

    String productType = getProductType();
    String productName  = getProductName();
    String productDetailsOwner = getProductDetailsOwner();
    int price = getProductPrice();

    ProductArray[answer-1] = new Product(productType ,productName, productDetailsOwner , price);
    System.out.println("Product Info changed!");
    showProductList();

    }else{
        System.out.println("invalid Product Id , please type again");
        System.out.println("Going back to main menu...");

    }
    }

}
// productarray[i] , i = pID -1  PID = answer

//delete Product
public static void deleteProduct(){

    int answer;
    System.out.println("Delete Product");
    showProductList();
    if(productNumberForProd != 0){
    System.out.println("Type the product ID you want to delete.");
    answer = CoreSystem.scan.nextInt(); 
    if(( answer-1 <= productNumberForProd)&&(answer-1 >= 0)){


            for(int i = answer-1; i < productNumberForProd-1 ; i++ ){
            
                ProductArray[i] = ProductArray[i+1];
                ProductArray[i].setProductID(i+1);
                
            }

    System.out.println("Product Info changed!");

    productNumberForProd --;
    Product.genID --;
    showProductList();

    }else{
        System.out.println("invalid Product Id , please type again");
        System.out.println("Going back to main menu...");

    }
    }

}


public static void showProductList(){

    if (productNumberForProd ==0){
        System.out.println("There is no product. Please add the product");
    }else{

            System.out.println("    Product ID   " + "   Product Type     " +"     Product Name     " + "      Product Explain " + "    Price    " );
            System.out.println(" --------------------------------------------------------------------------------------------------------------------------------");
                for(int i =0; i < productNumberForProd ;  i++ ){
                
                    ProductArray[i].showProductDetails();
                }
    }


}

//for Product inside the Order.
public static void showProductListOrder(Order order){
 
    if (order.productNumber ==0){
        System.out.println(" \nThere is no product. Please add the product\n");
    }else{

            System.out.println("    Product ID  " + "  Product Type  " + "  Product Name  " + "   Product Explain "  +  " User preference " + " Quantity " + "   Price   " + "   total price   ");
            System.out.println(" ------------------------------------------------------------------------------------------------------------------------------------------------");
                for(int i =0; i < order.productNumber;  i++ ){
                
                order.product[i].showProductDetailsOrder();
                }

    }


}



        public static String getProductType(){
        
        String productType ="";

        boolean exit = false;
        
                    int typeAnswer =0;
        
                    
                    System.out.println("Adding Product");
                    
                    do{
                    System.out.println("Choose Product Type :");
                    System.out.println("1 . Cookie jar");
                    System.out.println("2 . Cake ");
                    System.out.println("3 . Others ");
                    
                    typeAnswer = CoreSystem.scan.nextInt(); 
                    
                    switch(typeAnswer){
                    
                        case 1:
                         System.out.println("The product type is : Cookie jar ");
                            productType = "Cookie Jar";
                        break;
                    
                        case 2:
                        System.out.println("The product type is : Cake ");
                             productType = "Cake";
                       break;
                    
                       case 3:
                       System.out.println("The product type is : Others ");
                             productType = "Others";
                       break;
                    }
                
                    exit = CoreSystem.correctCheck();
                
                    }while(exit);

                    return productType;
                

    }
        
    public static String getProductName(){
        String productName ="";
        boolean exit = false;
        do{
                    
            System.out.println("Type Product Name");
            CoreSystem.scan.nextLine(); //-- fake one
            productName = CoreSystem.scan.nextLine();
            System.out.println("The Product name is :" + productName);

            exit = CoreSystem.correctCheck();
        
        }while(exit);

        return productName;
    }


    public static String getProductDetailsOwner(){

        String productDetailsOwner = "";
        boolean exit = false;
        do{

            System.out.println("Type Product Introduction");
            CoreSystem.scan.nextLine(); //-- fake one
            productDetailsOwner = CoreSystem.scan.nextLine();
            System.out.println("The Product Detail is :" + productDetailsOwner);
            exit = CoreSystem.correctCheck();
        
        
        }while(exit);

        return productDetailsOwner;

    }

    public static int getProductPrice(){
        int productPrice;
        boolean exit = false;
        do{
                    
            System.out.println("Type Product Price");
            productPrice = CoreSystem.scan.nextInt(); // **
            System.out.println("The Product price is :" + productPrice);

            exit = CoreSystem.correctCheck();
        
        }while(exit);

        return productPrice;
    }


// *****

    public static int getTotalProductPrice(Order order){

        int total=0;
        int value=0; 

   

        for(int i =0; i < order.productNumber;  i++ ){
               
            value = order.product[i].getTotalPrice();

            total = total +  value;
            }

        return total;

    }


}