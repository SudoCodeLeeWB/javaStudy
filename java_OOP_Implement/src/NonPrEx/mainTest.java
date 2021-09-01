package NonPrEx;

public class mainTest {
    
    public static void main(String[] args){

        Student lee = new Student(0131073 , "LeeWonBeen");
        System.out.println(lee);
        
        lee.setKorScore("KGrammer", 100);
        lee.setMatScore("math1", 98);

        lee.showSystemInfo();

    }


}
