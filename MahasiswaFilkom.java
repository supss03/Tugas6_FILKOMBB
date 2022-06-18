package filkombb;

public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;
    private int totalMahasiswaFilkom;
    
    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
        totalMahasiswaFilkom = totalMahasiswaFilkom + 1;
    }
    
    
    public int getTotalMahasiswaFilkom() {
        return totalMahasiswaFilkom;
    }


    public void setTotalMahasiswaFilkom(int totalMahasiswaFilkom) {
        this.totalMahasiswaFilkom = totalMahasiswaFilkom;
    }


    public String getNIM() {
        return NIM;
    }
    
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public double getIPK() {
        return IPK;
    }
    
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public double getBeasiswa() {
        double beasiswa;
        if (getIPK() > 3.0 && getIPK() <= 3.5) {
            beasiswa = 50;
        }
        else if (getIPK() > 3.5 && getIPK() <= 4) {
            beasiswa = 75;
        } 
        else {
            beasiswa = 0;
        }
        return beasiswa;
    }

    public String getStatus() {
        String a = getNIM();
        String b = a.substring(0,  2);
        String angkatan;
        
        if (b.equalsIgnoreCase("18")) {
            angkatan = "2018";
        }
        else if (b.equalsIgnoreCase("19")) {
            angkatan = "2019";
        } 
        else if (b.equalsIgnoreCase("20")) {
            angkatan = "2020";
        }
        else if (b.equalsIgnoreCase("21")) {
            angkatan = "2021";
        }
        else {
            angkatan = "0000";
        }

        char indeks;
        indeks = a.charAt(6);
        String prodi;

        switch (indeks) {
            case '2':
                prodi = "Teknik Meniup Gelembung";
                break;
            case '3':
                prodi = "Teknik Berburu Ubur-Ubur";
                break;
            case '4':
                prodi = "Sistem Penghaburgeran";
                break;
            case '6':
                prodi = "Pendidikan Chum Bucket";
                break;
            case '7':
                prodi = "Teknologi Telepon Kerang";
                break;
            default:
                prodi = "tes";
                break;
        }

        return prodi + "," + angkatan;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("IPK\t\t:" + getIPK());
        System.out.println("NIM\t\t:" + getNIM());
        System.out.println("Status\t\t:" + getStatus());
        return "";
    }
}