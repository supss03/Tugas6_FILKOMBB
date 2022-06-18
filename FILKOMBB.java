package filkombb;

import java.util.ArrayList;
import java.util.Scanner;

public class FILKOMBB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Manusia manusia1 = new Manusia("Aku", "3923842934", true, true);
        Manusia manusia2 = new Manusia("Arindra", "5896710284", false, true);
        Manusia manusia3 = new Manusia("Zidan", "7398561932", true, false);

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "6492874561", false, false, "205150601111018", 3.7);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Yusuf", "8673519825", true, true, "215150707111022", 3.9);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Alhafiz", "99817263581", true, false, "195150301111020", 3.2);

        Pekerja pekerja_1 = new Pekerja("Iqbal Biondy", "351717969", true, true, 7, 22, "18509284635");
        Pekerja pekerja_2 = new Pekerja("Nurcholis Mahendra", "9283761978", true, false, 4, 30, "3691092773");
        Pekerja pekerja_3 = new Pekerja("Dandy Ramadhany", "6372915467", false, true, 8 , 26, "5178293615");

        Manajer manajer_1 = new Manajer("Lyra Hertin", "351707384392", false, false, 9, 20, "204837283728", 1500);
        Manajer manajer_2 = new Manajer("Bimaveda Putra", "351707384397", true, true, 10, 23, "407837183728", 1300);
        Manajer manajer_3 = new Manajer("Ratu Khairunnisa", "351707384390", false, true, 6, 25, "609837983721", 2000);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();

        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);
        
        listMahasiswaFilkom.add(mhs1);
        listMahasiswaFilkom.add(mhs2);
        listMahasiswaFilkom.add(mhs3);

        listPekerja.add(pekerja_1);
        listPekerja.add(pekerja_2);
        listPekerja.add(pekerja_3);

        listManajer.add(manajer_1);
        listManajer.add(manajer_2);
        listManajer.add(manajer_3);

        System.out.println("A. Data Manusia\n");
        listManusia.toString();
        System.out.println("=================================================\n");
        System.out.println("B. Data Mahasiswa Filkom\n");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================\n");
        System.out.println("C. Data Pekerja\n");
        listPekerja.toString();
        System.out.println("=================================================\n");
        System.out.println("D. Data Manajer\n");
        listManajer.toString();
        System.out.println("=================================================");
    }
    
}