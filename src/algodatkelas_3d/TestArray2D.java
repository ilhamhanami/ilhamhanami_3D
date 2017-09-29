package algodatkelas_3d;

public class TestArray2D {
    public static Object[] ChangeLength(Object [] a,int n,int m,int newLength, int newLengthbaru){
        if(n > newLength){
            throw new IllegalArgumentException("length is too small");
        }
        if(m > newLengthbaru){
            throw new IllegalArgumentException("length is too small");
        }
        if(a != null){
            Object[][]copy=new Object[newLength][newLengthbaru];
            for(int i=0;i<a.length;i++){
                final Object[]row= (Object[]) a[i];
                copy[i]=new Object[newLengthbaru];
                System.arraycopy(row, 0, copy[i], 0, row.length);
            }
            return copy;
        }
        
        return null;
    }
    public static Object [][] changeLength(Object[][] a,int newLength,int newLengthbaru){
        return (Object[][]) ChangeLength(a,a.length,a[0].length, newLength,newLengthbaru);
    }
}