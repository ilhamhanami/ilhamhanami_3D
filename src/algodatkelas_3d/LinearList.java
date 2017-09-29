package algodatkelas_3d;

public interface LinearList {
    public boolean isEmpty();
    public Object get(int index);
    public int indexOf(Object element);
    public Object remove(int index);
    public void add(int index,Object obj);
    public String toString();
    public void changeLength2D(int index,Object obj);
    
    
}