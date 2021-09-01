package arrayListEX;

public class ex1 {

    int[] num = new int [5];
    int size =0;


    public void example1(){

    // .length attribute indicates the lengthe of an array. 
    for ( int i = 0 ; i< num.length-2 ; i ++ ){

        num[i] = i*10;
        size ++;

    }
    

    for ( int i = 0 ; i< size ; i ++ ){

        System.out.println(num[i]);

    }

    }

    //  automatically inicilated as 0 if value not entered. 

    //  printing only available array elements. 

}
