public class test {
    
    public static void main(Sting[] args){

        //normal customer check
        Customer  customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoints = 1000;
        System.out.println(customerLee.showCustomerInfo());

        //vip customer check 
        VIPCustomer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerID(10020);
        vipCustomer.setCustomerName("김유신");
        vipCustomer.bounsPoints = 100000;
        System.out.println(vipCustomer.showCustomerInfo());

    }


}
