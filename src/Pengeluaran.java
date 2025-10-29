/**
 * Kelas Pengeluaran menyimpan rincian berbagai jenis pengeluaran.
 *
 * <p>Refactoring yang digunakan:
 * <ul>
 *   <li><b>Encapsulate Field</b> - penggunaan getter untuk menghitung total pengeluaran.</li>
 *   <li><b>Move Method</b> - logika penampilan rincian dipindahkan ke kelas ini.</li>
 * </ul>
 * </p>
 *
 * @author Dodo
 * @version 1.0
 */
// Class untuk menyimpan data pengeluaran
class Pengeluaran {
    private double makan;
    private double transport;
    private double main;
    private double skincare;

    /**
     * Konstruktor untuk membuat objek Pengeluaran.
     *
     * @param makan biaya makan
     * @param transport biaya transportasi
     * @param main biaya hiburan
     * @param skincare biaya perawatan diri
     */
    public Pengeluaran(double makan, double transport, double main, double skincare) {
        this.makan = makan;
        this.transport = transport;
        this.main = main;
        this.skincare = skincare;
    }

    /**
     * Menghitung total seluruh pengeluaran.
     *
     * @return total pengeluaran
     */
    // Getter total pengeluaran (Encapsulate Field)
    public double getTotalPengeluaran() {
        return makan + transport + main + skincare;
    }

    /**
     * Menampilkan rincian setiap jenis pengeluaran ke layar.
     */
    // Menampilkan rincian pengeluaran (Move Method)
    public void tampilkanRincian() {
        System.out.println("Pengeluaran Makan: " + makan);
        System.out.println("Pengeluaran Transport: " + transport);
        System.out.println("Pengeluaran Main: " + main);
        System.out.println("Pengeluaran Skincare: " + skincare);
        System.out.println("Total Pengeluaran: " + getTotalPengeluaran());
    }
}