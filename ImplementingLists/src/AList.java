public class AList<T> {

    public static Object[] array;
    public static int size;
    public static int maxSize;

    public AList() {
        maxSize = 1;
        array = new Object[maxSize];
    }

    public void listAdd(T p) {
        if(array.length == maxSize) {
            resize(maxSize*2);
            maxSize=maxSize*2;
            array[size] = p;
            size++;
        }
        else {
            array[size] = p;
            size++;
        }
    }
    //seperate method to resize the array when it gets full
    //to simplify the listadd method
    public void resize(int newAllocationSize) {
        Object[] newArray = new Object[newAllocationSize];
        for(int i = 0; i < maxSize; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public static void listRemove(int pos) {
        if (pos > size) {
            System.out.println("Tried to remove at an invalid position");
        }
        else if (pos == size) {
            size--;
        }
        else if (pos < size - 1) {
            for (int i = pos; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            size--;
        }
    }

    public String theString() {
        //should return a string containing all elements in the AList
        if(array.length == 0) {
            return " ";
        }
        String result = " ";
        for(int i = 0; i < array.length; i++) {
            result = result + "\n" + array[i].toString();
        }
        return result;
    }

}
