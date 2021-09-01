package objWkTg;

public class transport {
    
    int money;
    int Tnumber;
    private double OriginalPrice;
    private double UserPrice;


        public void takeMoney(){

         this.money += UserPrice;
        
        }


        public transport(int Tnumber, int money , int price){   

        this.Tnumber = Tnumber;
        this.money = money;
        this.OriginalPrice = price;

        }

            public double getUPrice() {
                return UserPrice;
            }

            public double getOPrice() {
                return OriginalPrice;
            }



            public void setPrice( double discRate ){

                this.UserPrice = OriginalPrice * (1- discRate);

            }


            
            public void showInfo(){

              System.out.println(Tnumber + " 님의 남은 돈은 : " + money +"입니다.");
              System.out.println(OriginalPrice + " 기본 가격 " + UserPrice + "사용자 가격");

           }



}
