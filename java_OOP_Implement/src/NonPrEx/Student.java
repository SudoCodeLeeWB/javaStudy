package NonPrEx;

public class Student {
    
    public int studentID;
    public String stuName;

    public Subject korea;
    public Subject math;


    
        //constructor
        public Student(int studentID, String stuName){
         
            this.studentID = studentID;
            this.stuName = stuName;

            // initialized refernce data type
            korea = new Subject();
            math = new Subject();

        }

        
        // regardless of user input. 
        // sets the score
       //if the data accessor is public -  (subject)

        /*

        public void setKorScore(String subjectName, int score){
            
            korea.subjectName = subjectName;
            korea.score = score;
            
        }


        public void setMatScore(String subjectName, int score){
            
            math.subjectName = subjectName;
            math.score = score;
            
        }



        //prints the total info
        public void showSystemInfo(){

            int average = (math.score + korea.score) /2 ;

            System.out.println("Average is :" +  average);

            // if the class subject's variable SubjN and score is public 
            System.out.println(korea.subjectName);
            System.out.println(korea.score);
            
            System.out.println(math.subjectName);
            System.out.println(math.score);



            // if the class subject's variable SubjN and score is private



        }
        */


        //  id the data accessor is private


        public void setKorScore(String subjectName, int score){
            
            korea.setSubName(subjectName); 
            korea.setSubScore(score);
            
        }


        public void setMatScore(String subjectName, int score){
            
            math.setSubName(subjectName);
            math.setSubScore(score);
            
        }



        //prints the total info
        public void showSystemInfo(){

            int average = ( math.getSubScore() + korea.getSubScore() ) /2 ;

            System.out.println("Average is :" +  average);

            // if the class subject's variable SubjN and score is public 
            System.out.println(korea.getSubName());
            System.out.println(korea.getSubScore());
            
            System.out.println(math.getSubName());
            System.out.println(math.getSubScore());



            // if the class subject's variable SubjN and score is private



        }






}
