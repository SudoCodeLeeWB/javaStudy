package objWkTg;

public class Student {
 
    
 public int grade;
 public int money;
 public String studentName;
 private double discRate = 0.5;


    public Student (String studentName , int money) {

        this.studentName = studentName;
        this.money = money;

    }


        public void taketrans(transport tr , double price){

            tr.takeMoney();
            this.money -= price;

        }



        public void showInfo(){

            System.out.println(studentName + " 님의 남은 돈은 : " + money +"입니다.");

        }


        public void setDiscRate(double discRate) {
            this.discRate = discRate;
        }



        public double getDiscRate() {
            return discRate;
        }



}
