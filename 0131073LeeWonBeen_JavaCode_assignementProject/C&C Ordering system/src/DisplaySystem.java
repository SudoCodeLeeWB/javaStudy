import java.util.*;



public class DisplaySystem {
    //date,calender for comparing the date and show the order before 3 days - Delivery date.
    //calender used to get currnet date.
    static Date date = new Date();
    static Calendar calendar2 = Calendar.getInstance();


    // method for showing the unfinished & delivery D-date 3 under Orders.
    
    public static void showUnFinished( Order order ){
        
        boolean finsihed  = order.getFinished();
        String days3Before = order.getDays3Before();
        String days2Before = order.getDays2Before();
        String days1Before = order.getDays1Before();

        String Today = CoreSystem.sdf.format(CoreSystem.calendar.getTime());

        System.out.println("Display Unfinsihed Orders, which is 3 days before the Delivery date.");

        // 3 days before  & not finsihed check
        
        if( (Today.equals(days3Before) ) || (Today.equals(days2Before)) ||  (Today.equals(days1Before) ) ){ // reference : https://www.geeksforgeeks.org/difference-equals-method-java/
            
            if(finsihed == false){
            order.showOrderInformation();
            }

        }

    }

}
