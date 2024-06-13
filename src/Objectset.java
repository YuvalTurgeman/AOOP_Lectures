public class Objectset {
    //fields
    private Object[] elements;
    private int size;

    //ctors
    public Objectset(int capacity){
        elements = new Object[capacity];
        size = 0;
    }

    //getters+setters
    public int getSize(){return size;}

    //methods
    public boolean add(Object o){
        if(!contains(o) && size<elements.length){
            elements[size] = 0;//meanwhile we copy the reference, lecturer said it will change in the future.
            size++;
            return true;
        }
        return false;
    }

    public boolean remove(Object o){
        int index = indexOf(o);
        if(index != -1){
            elements[index] = elements[size-1];
            elements[size-1] = null;
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(Object o){
        return indexOf(o) != -1;
    }

    //helper methods
    private int indexOf(Object o){
        if(o != null)//not sure if this is the best way to do this
            for(int i=0;i<size;i++)
                if(elements[i].equals(o))//lecturer said that this line will be changed in the future.
                    return i;
        return -1;
    }

}
