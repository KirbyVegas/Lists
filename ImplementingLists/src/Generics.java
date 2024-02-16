//public class Generics {
//
//
//    public class DLList <T> {
//
//        public DLList(){
//        //constructor
//        }
//
//        public void listAdd(T x) {
//
//        }
//
//        public void listRemove(int pos) {
//
//        }
//
//        public String toString(){
//
//        }
//
//
//        public class SLList <T> {
//
//            public SLList(){
//                //constructor
//            }
//
//            public void listAdd(T x) {
//
//            }
//
//            public void listRemove(int pos) {
//
//            }
//
//            public String toString(){
//
//            }
//
//
//            public class AList <T> {
//
//                public T[] array;
//                public int size;
//                public int maxSize;
//
//                public AList(){
//                    maxSize = 1;
//                    size = 0;
//                    array = new T[maxSize];
//                }
//
//                public void listAdd(T x) {
//                    if(size < maxSize) {
//                        array[size] = p;
//                        size++;
//                    }
//                    if(size == maxSize) {
//                        //if array is maxed out, create a new temporary array
//                        Book[] newArray = new Book[maxSize*2];
//                        maxSize = maxSize*2;
//
//                        //for each book in array, put it into the newarray
//                        for(int i = 0; i< array.length; i++) {
//                            newArray[i] = array[i];
//                        }
//                        newArray[array.length] = p;
//                        array = newArray;
//                    }
//
//                }
//
//                public void listRemove(int pos) {
//
//                }
//
//                public String toString(){
//
//                }
//
//
//
//    }
//
//
//
//}
