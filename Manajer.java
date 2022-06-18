package filkombb;

public class Manajer extends Pekerja {
    private int lamaKerja;
    private int totalManager;

    public Manajer(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP, int lamaKerja) {
        super(nama, NIK, jenisKelamin, menikah, jamKerja, hariKerja, NIP);
        this.setLamaKerja(lamaKerja);
        totalManager = totalManager + 1;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double hitungBonus() {
        return super.hitungBonus() + (0.3 * super.hitungBonus());
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + 15;
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Lama Kerja\t:" + getLamaKerja() + " hari");
        return " ";
    }

    public int getTotalManager() {
        return totalManager;
    }

    public void setTotalManager(int totalManager) {
        this.totalManager = totalManager;
    }
}