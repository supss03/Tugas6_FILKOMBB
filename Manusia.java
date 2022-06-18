package filkombb;

public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    private int totalManusia;
    
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        totalManusia = totalManusia + 1;
    }


    public int getTotalManusia() {
        return totalManusia;
    }


    public void setTotalManusia(int totalManusia) {
        this.totalManusia = totalManusia;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNIK() {
        return NIK;
    }


    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin(){
        return jenisKelamin;
    }

    public String getJenisKelamin() {
        String jk;
        if (this.jenisKelamin == true) {
            jk = "Laki-laki";
        }
        else {
            jk = "Perempuan";
        }
        return jk;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }


    public boolean isMenikah() {
        return menikah;
    }


    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan() {
        double tunjangan;
        if (isMenikah() == true ) {
            if (isJenisKelamin() == true) {
                tunjangan = 25;
            }
            else {
                tunjangan = 20;
            }
        }
        else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan(){
        return getTunjangan();
    }
    

    @Override
    public String toString(){
        System.out.println("=================================================");
        System.out.println("NAMA\t\t:" + getNama());
        System.out.println("NIK\t\t:" + getNIK());
        System.out.println("Jenis Kelamin\t:" + getJenisKelamin());
        System.out.println("Pendapatan\t:" + getPendapatan() + "$");
        return " ";
    }
}