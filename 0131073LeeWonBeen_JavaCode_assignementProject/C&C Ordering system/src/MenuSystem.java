

public class MenuSystem {

            // Methods for navigation

            public static void mainMenu(){
                

                int menu ;
                boolean exit =true;

                do {
                System.out.println("Main menu : what do you want to do?");
                System.out.println("1.  Orders.");
                System.out.println("2.  View unfinished Orders.");
                System.out.println("3.  View incomes & Order history.");
                System.out.println("4.  Products.");
                System.out.println("Please Type the number\n");
                
                    menu= CoreSystem.scan.nextInt();
                
                    //filtering the input values
                if(( menu  != 1 )&&(menu != 2 )&&(menu != 3 )&&(menu != 4 )) {
                
                    System.out.println(" Invalid Number! please type again.\n");
                    
                
                }else{
                        exit = false;
                       
                        
                }

                }while(exit);
                                
                          switch (menu) {
                              case 1:
                                   MenuSystem.orderMenu();
                              break;
                        
                              case 2:
                                   MenuSystem.DisplayOrders(); 
                              break;
                        
                              case 3:
                                  MenuSystem.DisplayMenu();
                              break;
                        
                              case 4 :
                                   MenuSystem.ProductMenu();
                              break ;
                        
                          }
            }



            public static void orderMenu(){

                boolean exit =true;
                int menu ;
                
                do {
                
                System.out.println("Order menu : what do you want to do?");
                System.out.println("1.  Add new Order.");
                System.out.println("2.  Edit Order.");
                System.out.println("3.  Delete Order.");
                System.out.println("Please Type the number");
                     
                menu= CoreSystem.scan.nextInt();
           
                    // filtering the input value
                if(( menu  != 1 )&&(menu != 2 )&&(menu != 3 )) {
                
                    System.out.println(" Invalid Number! please type again.");
                   
                
                }else{
                        exit = false;
                      
                }
                

                }while(exit);

                if(ProductSystem.productNumberForProd == 0){
                    System.out.println("You can not Add/Delete/Edit Order without Product.");
                    System.out.println("Please enter the Product in the product menu and do it again.\n");

                }else{

                   switch (menu) {
                       case 1:
                            OrderSystem.addOrder();
                       break;
                   
                       case 2:
                            OrderSystem.editOrder(); // 상속으로 넘기기/
                       break;
                   
                       case 3:
                           OrderSystem.deleteOrder();
                       break;
                   
                   }

                }
                
                    
            
                
            }

            public static void ProductMenu(){

                boolean exit =true;
                int menu ;
            
                do {
                
                System.out.println("Product menu : what do you want to do?");
                System.out.println("1.  Add new Product.");
                System.out.println("2.  Edit Product.");
                System.out.println("3.  Delete Product.");
                System.out.println("4.  View all Products.");
                System.out.println("Please Type the number");
                
                menu  =  CoreSystem.scan.nextInt();
            
                    //filtering the input
                if(( menu  != 1 )&&(menu != 2 )&&(menu != 3 )&&(menu != 4 )) {
                
                    System.out.println(" Invalid Number! please type again.");
                   
                }else{
                        exit = false;
                       
                }

                }while(exit);
            
      
                    switch (menu) {
                    
                        case 1:
                             ProductSystem.addProduct();
                        break;
                    
                        case 2:
                             ProductSystem.editProduct(); // 상속으로 넘기기/
                        break;
                    
                        case 3:
                            ProductSystem.deleteProduct();
                        break;

                        case 4:
                        ProductSystem.showProductList();
                        break;
                    
                    }
            }

        


            // mehtod for main menu 3 , showing the whole list of order / total income.
            public static void DisplayMenu(){

                if(OrderSystem.stOrderId !=0){

                int totalIncome = 0;
                OrderSystem.listOrder();

                for (int i =0; i <= OrderSystem.stOrderId-1 ; i++){
              
                    totalIncome +=  ProductSystem.getTotalProductPrice(OrderSystem.OrderArray[i]);
                
                }
                System.out.println("Total income is : " + totalIncome );
                }else{
                System.out.println(" There are no Orders. Please enter a Order " );
                }

            }



            // method for Viewing  unfinished Orders.
            public static void DisplayOrders(){

                if(OrderSystem.stOrderId !=0){

                    System.out.println(" Loading unfinished Orders...Please wait.");

                    for(int i=0; i <= OrderSystem.stOrderId-1 ; i++){
                        System.out.println("loop enter");
                        DisplaySystem.showUnFinished(OrderSystem.OrderArray[i] );
                    }
                    

                }else{
                System.out.println(" There are no Orders. Please enter a Order " );
                }

            }
            
           
}

    




