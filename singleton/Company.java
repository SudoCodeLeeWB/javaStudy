// this is a example of a "static"


public class Company{


    // make the "one and only" static class for Company.
    private static Company instance =  new Company();


    //make a public method so that the Private static instance can be used ( accessed ) from the outer class.
    public static Company getInstance(){

        if (instance == null ){
        
            instance  = new Company();
        }

    //TODO
    // 이해가 안되는 부분 : class 호출시에 static instance 인 Company 의 instance는 이미 생성되는것 아닌가?
    // 그렇다면 instance == null 일 수 있나?
    //--> "선언 부분"에 대한 공부가 필요해 보인다. 

        //the method returns the instance. 
        return instance;
    
    }

    //external class can not make a instance of a Company.
    //private constructor for company.
    private Company(){}

}