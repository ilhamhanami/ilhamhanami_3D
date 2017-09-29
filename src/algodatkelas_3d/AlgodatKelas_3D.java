package algodatkelas_3d;

import java.util.Iterator;

public class AlgodatKelas_3D implements LinearList {

    protected Object[] element, element2;
    protected int size, capacity;
    int index;

//    public AlgodatKelas_3D( int initialCapacity){
//        if(initialCapacity < 1)
//            throw new IllegalArgumentException
//                    ("initialCapacity must be >=1");
//        element= new Object [initialCapacity];
//    }
    public AlgodatKelas_3D(int capacity) {
        this.capacity = capacity;
        element = new Object[capacity];

        index = 0;
    }

    public AlgodatKelas_3D() {
        this(10);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index =" + index + "size =" + size);
        }
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return element[index];
    }

    @Override
    public int indexOf(Object theElement) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(theElement)) {
                return i;
            }
        }
        //element tidak ditemukan
        return -1;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement = element[index];
        for (int i = index + 1; i < size; i++) {
            element[i - 1] = element[i];
        }
        element[--size] = null;
        return removedElement;
    }

    @Override
    public void add(int index, Object theElement) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("index ="+index+"size ="+ size);
        }
        if(size == element.length){
            AlgodatKelas_3D ada = new AlgodatKelas_3D(size);
        }
        if(element.length > size){
        for(int i = size - 1; i >= index; i--){
            element[i + 1] = element[i];
        }
        element[index] = theElement;
        size++;}
    }
    

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("[");
        for (int i = 0; i < size; i++) {
            if (element[i] == null) {
                s.append("null,");
            } else {
                s.append(element[i].toString() + ", ");
            }
        }

        if (size > 0) {
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        return new String(s);
    }

    public void increaseSize() {
        capacity++;
        Object[] newArray = new Object[capacity];
        System.arraycopy(element, 0, newArray, 0, element.length);
        element = newArray;
    }

    public void trimToSize() {
        if (size < capacity) {
            Object[] element2 = new Object[size];
            System.arraycopy(element, 0, element2, 0, size);
            element = element2;
            capacity = size;
        }
    }

    public Object setSize(int newSize) {
        if (size > newSize) {
            int index = size - newSize;
            Object removeElement = element[index];
            for (int j = 0; j < index; j++) {
                for (int i = index + 1; i < size; i++) {
                    element[i - 1] = element[i];
                }
                element[--size] = null;
            }
            return removeElement;
        } else {
            element2 = new Object[newSize];
            System.arraycopy(element, 0, element2, 0, size);
            element = element2;
        }
        return size;
    }
    
    @Override
    public void changeLength2D(int index,Object obj){
            if(size <= capacity){
                
            }
    }
}