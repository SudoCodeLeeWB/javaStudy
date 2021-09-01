package arrayListEX;

public class ex2 {

    char[] alphabets =new char[26];
    char ch = 'A';

    
    public void example2(){

        for (int i =0; i < 26; i++ , ch++) {

            alphabets[i] = ch;
            System.out.println("alphabet : " + alphabets[i] + " aski : " + (int)alphabets[i] );

        }


    }

    
}
