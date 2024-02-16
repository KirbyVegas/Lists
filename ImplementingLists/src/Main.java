public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("How to read ", "Mike ", 10);
        Book book2 = new Book("How to write ", "John ", 25);
        String aword = "random string to test";
        int y = 10;

//        AList a = new AList();
//        a.listAdd(book1);
//        a.listAdd(aword);
//        a.listAdd(book2);
//        a.listAdd(book1);
//        a.listAdd(aword);
//        a.listAdd(y);
//        a.listRemove(4);
//        String result = a.theString();
//        System.out.println(result);


        //test for SLList
        SLList s = new SLList();
        s.listAdd(book1);
        s.listAdd(book2);
        s.listAdd(book2);
        s.listAdd(y);
        //works for
        s.listRemove(1);
        String result2 = s.toString();
        System.out.println(result2);

        //test for DLList
        DLList d = new DLList();
        d.listAdd(book1);
        d.listAdd(aword);
        d.listAdd(book2);
        d.listAdd(y);
        d.listRemove(0);
        String result3 = d.toString();
        System.out.println(result3);



    }


}
