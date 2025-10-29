
# 💰 Program Laporan Keuangan dan Pengeluaran Bulanan

Program ini merupakan aplikasi **Java sederhana** untuk menampilkan **laporan keuangan pribadi** berdasarkan pemasukan dan pengeluaran.  
Dilengkapi dengan dokumentasi **JavaDoc** dan penerapan beberapa konsep **Refactoring** agar kode lebih rapi dan mudah dipahami.

---

## 📘 Deskripsi Program

Program ini terdiri dari empat kelas utama:

1. **Main.java**  
   → Menjalankan program utama dengan membuat objek `Pengeluaran` dan `Keuangan`, lalu menampilkan laporan keuangan.

2. **Keuangan.java**  
   → Menyimpan data nama, pemasukan, dan objek `Pengeluaran`.  
   Berfungsi untuk menghitung sisa uang dan menampilkan laporan keuangan.

3. **Pengeluaran.java**  
   → Menyimpan rincian pengeluaran (makan, transport, hiburan, skincare) serta menghitung total pengeluaran.

4. **PengeluaranBulanan.java**  
   → Versi sederhana tanpa OOP untuk menampilkan rincian pengeluaran dan menghitung sisa uang.

---

## ⚙️ Fitur Program

- Menghitung total pengeluaran berdasarkan beberapa kategori.
- Menampilkan laporan keuangan dengan nama, rincian pengeluaran, total pengeluaran, dan sisa uang.
- Menerapkan prinsip **Refactoring**:
    - **Extract Method** → memisahkan logika perhitungan ke metode `hitungSisaUang()`.
    - **Rename Method** → penamaan metode menjadi lebih jelas seperti `tampilkanLaporan()`.
    - **Encapsulate Field** → penggunaan getter untuk menghitung total pengeluaran.
    - **Move Method** → memindahkan logika tampilan pengeluaran ke kelas `Pengeluaran`.

---



