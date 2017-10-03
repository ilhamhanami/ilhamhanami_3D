package algodatkelas_3d;

import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {
        AlgodatKelas_3D x = new AlgodatKelas_3D();
        x.add(0, new Integer(4));
        x.add(0, new Integer(3));
        x.add(0, new Integer(2));
        x.add(0, new Integer(1));
        x.add(0, new Integer(0));
        
        Object[]a=new Object[15];

        System.out.println("banyak index/data = " + x.size);
        System.out.println("banyaknya kapasitas =" + x.capacity);

        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
        System.out.println("panjang array : " + x.size());
        System.out.println("sebelum di trim : " + x.capacity);
        x.trimToSize();
        System.out.println("setelah di trim : " + x.capacity);
        x.setSize(8);
        System.out.println("ukuran elemen de set menjadi: " + x.element2.length);
        x.remove(1);
        System.out.println("Tampilan setelah indek 1 dihapus :");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);

        }
        System.out.println("panjang array sebelum di trim :" + x.capacity);
        System.out.println("panjang array setelah di trim :" + x.size);
        System.out.println("panjang kapasitas array : " + x.element.length);

        x.add(3, "a");
        x.add(4, 7);
        x.add(5,6);
        System.out.println(x.size);
        System.out.println("isi stlh d tambah 3 array baru : "+ x.toString());
        System.out.println("jumlah array sebelum dipotong :" + x.element.length);
        x.trimToSize();
        x.setSize(7);
        System.out.println("jumlah array setelah dipotong :" + x.element.length);
        x.setSize(6);
        System.out.println("isi array setelah di setsize"+x.toString());
        System.out.println("remove range");
        x.removeRange(1, 2);
        System.out.println("panjang array :"+x.element.length);
        System.out.println("array setelah remove ="+x.toString());
        
        System.out.println();
        System.out.println("panjang array= "+x.size);
        System.out.println("panjang element= "+x.element.length);
        System.out.println("data dipanggil melalui X ="+x.toString());
        System.out.println("data dipanggil melalu Y="+x.clone(a));
        
        System.out.println("");
        x.clear();
        System.out.println("array setelah di clear= "+x.toString());
    }
}
