public class Main {
    // the main class

    //해야 할  일들
    //1. mainsystem 만들고 menuSystem,...OrderSystem 다 inherit 관계로 만들고, @Override 이용해서 Productsysyem.menu();이런식으로 만들기
    //(동일한 이름 써야 하므로 add/edit/delete 등 formal 한 이름 사용하기.)
    //2.main 함수의 비중이 너무 작으므로 시나리오 좀 더 작성하기
    //3.scan.nextint 예외처리 (int 가 아닌 값이 들어올경우) -- try/catch 이용해서 오류 해결해야 함. 
    //mainsystem의 구조 (superclass of all systems) : 추상 method 넣기, static Scanner scan = new Scanner(); 포함해야함. 


    public static void main(String arg[])  {

        //seenario 
        for(;;){
        MenuSystem.mainMenu();
        }
        
    }

}
