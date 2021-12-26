public class VIPCustomer extends Customer {

    private int agentID;
    
    //constructor
    public VIPCustomer() {

        customerGrade = "VIP";
        bonusRatio = 0.02;
        discountRatio = 0.5;
        agentID = 0;

    }

    public int getAgentId(){

        return agentID;

    }

}
