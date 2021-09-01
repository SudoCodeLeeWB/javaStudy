package StaticEx;

public class student {
    private static int serialNum =1000;
    public int  studentID;
    public String stuName;



    public  student (String name){
        serialNum++;
        this.stuName = name;
        
    }

    public void studentINFO(){
        
        System.out.println( stuName );
        

    }


    //  class method -  the method for the static variable.
    
    public static int getSerialNum(){

        return serialNum;

    }

    public static void setSerialNum(int serialNum){

        student.serialNum = serialNum;
        // static method can not use instance variable.


    }


}
