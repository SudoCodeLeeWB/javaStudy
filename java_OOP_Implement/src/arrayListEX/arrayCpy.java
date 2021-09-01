package arrayListEX;

public class arrayCpy {

    public void exArCpy(){

        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

            bookArray1[0] = new Book("태백산맥 ", "조정래");
            bookArray1[1] = new Book("데미안 ", "헤르만 헤세");
            bookArray1[2] = new Book("태평천하 ", "채만식");
            
            System.arraycopy(bookArray1,0,bookArray2,0,3);
            
          

    }
    
}
