package objWkTg;

public class userRideTrans {
    
    public static void main(String[] args) {

        transport Bus1 = new transport(101, 0 , 1000);
        Student lee = new Student("Lee",10000);


        Bus1.setPrice(lee.getDiscRate());

        lee.taketrans(Bus1, Bus1.getUPrice() );
        lee.showInfo();
        Bus1.showInfo();


    }


}
