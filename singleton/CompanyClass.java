public class CompanyClass {

 //   public static void main(String[] args){


        Company MyCompany1 = Company.getInstance();
        Company MyCompany2 = Company.getInstance();

        System.out.println(MyCompany1 == MyCompany2);
      


    }
}
