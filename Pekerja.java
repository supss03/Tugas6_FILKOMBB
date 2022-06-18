package filkombb;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    private int totalPekerja;
    
    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
        totalPekerja = totalPekerja + 1;
    }

    public int getTotalPekerja() {
        return totalPekerja;
    }

    public void setTotalPekerja(int totalPekerja) {
        this.totalPekerja = totalPekerja;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }    
    
    public String getStatus() {
        String a = getNIP();
        
        char digit_1 = a.charAt(0);
        
        String kantorCabang;
        switch (digit_1) {
            case '1':
                kantorCabang = "Mondstadt";
                break;
            case '2':
                kantorCabang = "Liyue";
                break;
            case '3':
                kantorCabang = "Inazuma";
                break;
            case '4':
                kantorCabang = "Sumeru";
                break;
            case '5':
                kantorCabang = "Fontaine";
                break;
            case '6':
                kantorCabang = "Natlan";
                break;
            case '7':
                kantorCabang = "Snezhnaya";
                break;
            default:
                kantorCabang = " ";
                break;
        }
        
        char digit_3 = a.charAt(2);
        char noCabang = digit_3;
        
        char digit_7 = a.charAt(6);
        
        String departemen;
        switch (digit_7) {
            case '1':
                departemen = "Pemasaran";
                break;
            case '2':
                departemen = "Humas";
                break;
            case '3':
                departemen = "Riset";
                break;
            case '4':
                departemen = "Teknologi";
                break;
            case '5':
                departemen = "Personalia";
                break;
            case '6':
                departemen = "Akademik";
                break;
            case '7':
                departemen = "Administrasi";
                break;
            case '8':
                departemen = "Operasional";
                break;
            case '9':
                departemen = "Pembangunan";
                break;
            default:
                departemen = " ";
                break;
        }
        
        return departemen + "," + kantorCabang + " " + "cabang ke-" + noCabang;
        
    }
    public double hitungGajiNormal() {
        double gajiNormal;
        return gajiNormal = getHariKerja() * getJamKerja() * 15;
    }

    public double hitungBonus() {
        double bonus;
        double hariLibur = 0;
        
        for (int i = 1; i <= getHariKerja(); i++) {
            if (i % 7 == 0){
                hariLibur = hariLibur + 2;
            }    
        }

        double bonusLembur = (getHariKerja() - hariLibur) * (getJamKerja() - 7) * 7;
        double bonusLibur = hariLibur * getJamKerja() * 20;
        return bonus = bonusLembur + bonusLibur;
    }
    
    @Override
    public double getPendapatan(){
        return super.getPendapatan() + hitungGajiNormal() + hitungBonus();
    }

    @Override
    public String toString(){
        super.toString();
        System.out.println("Bonus\t\t:" + hitungBonus() + "$");
        System.out.println("Gaji\t\t:" + hitungGajiNormal() + "$");
        System.out.println("Status\t\t:" + getStatus());
        return " ";
    }
}