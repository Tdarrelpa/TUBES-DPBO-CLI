/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Aktivitas;
import regis.login.*;
import com.mycompany.classjadwal.*;
import com.mycompany.datadiri.*;
import com.mycompany.pembelajaran.*;
import com.mycompany.transaksi.*;
import java.util.*;
/**
 *
 * @author timot
 */
public class ProjectMain {

    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        
        int input = -1;
        
        System.out.println("===== Registrasi =====");
        System.out.print("Masukkan Username: ");
        String username = scan.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scan.nextLine();
        System.out.print("Masukkan Email: ");
        String email = scan.nextLine();

        // Registrasi dengan ID otomatis
        Registrasi regUser = new Registrasi(username, password, email);
        regUser.register(username, password, email);
        
        do
        {   
            printHeader();
            input = scan.nextInt();
            switch(input)
            {
                case 1:{
                    Scanner s = new Scanner(System.in);    
                    System.out.println("\n===== Login =====");
                        Login loginUser = new Login(regUser.getUsername(), regUser.getPassword());
                        int attempts = 3; // Batas percobaan login

                        while (attempts > 0) {
                        System.out.print("Masukkan Username: ");
                        String inputUsername = s.nextLine();
                        System.out.print("Masukkan Password: ");
                        String inputPassword = s.nextLine();

                        try 
                        {
                            if (loginUser.login(inputUsername, inputPassword)) {
                                break; // Berhenti jika login berhasil
                            } else {
                                attempts--;
                                if (attempts > 0) {
                                    System.out.println("Sisa percobaan: " + attempts);
                                } else {
                                    throw new Exception("Anda telah melebihi batas percobaan login.");
                                }
                            }
                        } 
                        catch (Exception e) 
                        {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                }
                case 2:
                    try
                    {
                        UserPelajar userPelajar = new UserPelajar("Guest", "xx-xxxx", 00, "NULL", "L/P", 0, "Sekolah", "Course", "tutor");
                        String namaPelajar = scan.nextLine();
                        String dataLahirPelajar = scan.nextLine();
                        int alamatPelajar = scan.nextInt();
                        String golonganDarahPelajar = scan.nextLine(); 
                        int umurPelajar = scan.nextInt(); 
                        String sekolah = scan.nextLine();
                        String course = scan.nextLine();
                        String Tutor = scan.nextLine();
                    
                        userPelajar.mengisiBioData(namaPelajar, dataLahirPelajar, alamatPelajar, golonganDarahPelajar, scan.nextLine(), umurPelajar, sekolah, course, Tutor);
                        userPelajar.memilihTutor(scan.nextLine());
                        userPelajar.menghubungiViaChat();
                        userPelajar.melakukanPembayaran(1000, namaPelajar, Tutor);
                    }
                    catch(InputMismatchException e)
                    {
                        System.err.println(e.fillInStackTrace());
                        System.err.println(Arrays.toString(e.getStackTrace()));
                        System.err.println(e.getCause());
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    try
                    {
                        UserTutor userTutor = new UserTutor("Guest", "xx-xxxx", 00, "NULL", "L/P", 0, "TempatKerja", "Pengalaman", "kemampuan");

                        // Untuk menginput biodata yang ada
                        String namaTutor = scan.nextLine();
                        String dataLahirTutor = scan.nextLine();
                        int alamatTutor = scan.nextInt();
                        String golonganDarahTutor = scan.nextLine();
                        int umurTutor = scan.nextInt();
                        String tempatBekerja = scan.nextLine(); 
                        String pengalaman = scan.nextLine();
                        String kemampuan = scan.nextLine();
                        userTutor.mengisiBioData(namaTutor, dataLahirTutor, alamatTutor, golonganDarahTutor, scan.nextLine(), umurTutor, tempatBekerja, pengalaman, kemampuan);

                        System.out.print("Apakah menerima pesanan? (ya/Tidak): ");
                        String approval = scan.nextLine();
                        if ("ya".equalsIgnoreCase(approval)) {
                            userTutor.menerimaPesanan("Pesan");
                        } else {
                            userTutor.menolakPesanan("Pesan");
                        }
                        userTutor.melakukanPenjadwalan();
                    }
                    catch(InputMismatchException e)
                    {
                        System.err.println(e.fillInStackTrace());
                        System.err.println(Arrays.toString(e.getStackTrace()));
                        System.err.println(e.getCause());
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    JadwalPelajar pelajar = new JadwalPelajar(5, "Desember", 2024, "Kamis", "12A", "Matematika", 201, "Andi");
                    System.out.println(pelajar.getPelajarInfo());
                    pelajar.cekKetersediaan();
                    break;

                case 5:
                    JadwalTutor tutor = new JadwalTutor(5, "Desember", 2024, "Kamis", "12A", "Matematika", 101, "Budi", 4.5f);
                    System.out.println(tutor.getTutorInfo());
                    tutor.cekKetersediaan();
                    break;
                case 6:
                    try
                    {
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Masukkan Jenjang Pendidikan (SD/SMP/SMA/SMK/Kuliah): ");
                        String jenjang = scanner.nextLine().toUpperCase();
            
                        Pembelajaran pembelajaran = new Pembelajaran();
                        pembelajaran.setJenjangPendidikan(jenjang);
            
                        LatihanSoal latihanSoal = new LatihanSoal();
                        Materi materi = new Materi();
            
            
                        if(jenjang.equals("SD"))
                        {
                            pembelajaran.setNamaMataPelajaran("Matematika Dasar");
                            pembelajaran.setKodeMataPelajaran("MATH-SD");
                            materi.setJudulMateri("Penjumlahan dan Pengurangan");
                            materi.setIsiMateri("Dasar penjumlahan dan pengurangan untuk kelas SD.");
                            materi.setSumberReferensi("Buku SD Matematika Dasar");
                    
                            latihanSoal.setKodeSoal("SOAL-SD-01");
                            latihanSoal.setPertanyaan("Berapakah 2 + 2?");
                            latihanSoal.setPilihanJawaban("A. 3\nB. 4\nC. 5");
                            latihanSoal.setKunciJawaban("B");
                        }  
                        else if(jenjang.equals("SMP"))
                        {
                            pembelajaran.setNamaMataPelajaran("Fisika Dasar");
                            pembelajaran.setKodeMataPelajaran("PHYS-SMP");
                            materi.setJudulMateri("Hukum Newton");
                            materi.setIsiMateri("Penjelasan dasar tentang hukum Newton 1, 2, dan 3.");
                            materi.setSumberReferensi("Buku SMP Fisika Dasar");
                    
                            latihanSoal.setKodeSoal("SOAL-SMP-01");
                            latihanSoal.setPertanyaan("Apa hukum Newton 1?");
                            latihanSoal.setPilihanJawaban("A. Gaya = Massa x Percepatan\nB. Benda diam akan tetap diam\nC. Setiap aksi ada reaksi");
                            latihanSoal.setKunciJawaban("B");
                        }    
                        else if(jenjang.equals("SMA"))
                        {
                            pembelajaran.setNamaMataPelajaran("Kimia");
                            pembelajaran.setKodeMataPelajaran("CHEM-SMA");
                            materi.setJudulMateri("Ikatan Kimia");
                            materi.setIsiMateri("Penjelasan tentang ikatan ionik dan kovalen.");
                            materi.setSumberReferensi("Buku SMA Kimia");
                    
                            latihanSoal.setKodeSoal("SOAL-SMA-01");
                            latihanSoal.setPertanyaan("Ikatan ionik terjadi karena?");
                            latihanSoal.setPilihanJawaban("A. Transfer elektron\nB. Berbagi elektron\nC. Tidak ada elektron");
                            latihanSoal.setKunciJawaban("A");
                        } 
                        else if(jenjang.equals("SMK"))
                        {
                            pembelajaran.setNamaMataPelajaran("Pemrograman Dasar");
                            pembelajaran.setKodeMataPelajaran("CS-SMK");
                            materi.setJudulMateri("Algoritma dan Flowchart");
                            materi.setIsiMateri("Penjelasan tentang cara membuat algoritma dan flowchart.");
                            materi.setSumberReferensi("Buku SMK Pemrograman Dasar");
                    
                            latihanSoal.setKodeSoal("SOAL-SMK-01");
                            latihanSoal.setPertanyaan("Apa simbol untuk proses dalam flowchart?");
                            latihanSoal.setPilihanJawaban("A. Persegi Panjang\nB. Lingkaran\nC. Belah Ketupat");
                            latihanSoal.setKunciJawaban("A");
                        }
                        else if(jenjang.equals("KULIAH"))
                        {
                            pembelajaran.setNamaMataPelajaran("Pemrograman Berorientasi Objek");
                            pembelajaran.setKodeMataPelajaran("CS-UNI");
                            materi.setJudulMateri("Konsep Dasar OOP");
                            materi.setIsiMateri("Penjelasan tentang class, object, inheritance, dan polymorphism.");
                            materi.setSumberReferensi("Buku Java Programming");
                    
                            latihanSoal.setKodeSoal("SOAL-UNI-01");
                            latihanSoal.setPertanyaan("Apa itu Polymorphism?");
                            latihanSoal.setPilihanJawaban("A. Kemampuan objek berubah bentuk\nB. Pewarisan sifat\nC. Pengkapsulan data");
                            latihanSoal.setKunciJawaban("A");
                        }
                        else
                        {
                            System.out.println("Jenjang pendidikan tidak dikenali.");
                        }
                        System.out.println("\n--- Informasi Pembelajaran ---");
                        pembelajaran.tampilkanInfo();
            
                        System.out.println("\n--- Materi ---");
                        materi.tampilkanMateri();
            
                        System.out.println("\n--- Latihan Soal ---");
                        System.out.println("Pertanyaan: " + latihanSoal.getPertanyaan());
                        System.out.println("Pilihan Jawaban:\n" + latihanSoal.getPilihanJawaban());
                        System.out.print("Masukkan Jawaban Anda: ");
                        String jawabanUser = scanner.nextLine();
                        latihanSoal.periksaJawaban(jawabanUser);
                        //Dengan atau tanpa scanner.close(), udah error disini
                    }
                    catch(Exception e)
                    {
                        System.err.println(e.fillInStackTrace());
                        System.err.println(Arrays.toString(e.getStackTrace()));
                        System.err.println("Penyebab error: " + e.getMessage());
                        System.err.println("Terjadi error:" + e.getMessage());
                    }
                    break;
                case 7:
                    Pembayaran pembayaran = new Pembayaran(500000, "pending", "Nadya", "Tutor A", "bukti123.png");
                    pembayaran.memesanDosen();
                    pembayaran.melakukanPembayaran();
                    pembayaran.mendapatBuktiBayar();
                    System.out.println("Status Pembayaran: " + pembayaran.lihatStatus());
                    break;
                case 8:
                    // Contoh transaksi refund
                    Refund refund = new Refund(500000, "sukses", "Pengajuan refund karena kelas batal.", "Nadya");
                    refund.membuatSuratPengajuanRefund();
                    refund.dapatUangKembali();
                    break;
                case 0:
                    System.out.println("Terimakasih telah menggunakan aplikasi ini!");
                    break;
                default:
                    System.out.println("[Error] Salah memasukkan ");
                    break;
            }
        } while(input != 0);
        scan.close();
    }
    
    public static void printHeader()
    {
        System.out.println("1. Register dan Login");
        System.out.println("2. Identitas pelajar");
        System.out.println("3. Identitas tutor");
        System.out.println("4. Jadwal pelajar");
        System.out.println("5. Jadwal tutor");
        System.out.println("6. materi");
        System.out.println("7. Transaksi");
        System.out.println("8. Refund");
        System.out.println("0. Keluar");
        System.out.print("Masukkan input >>");
    }
    
    public static void Materi() 
    {
        try(Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Masukkan Jenjang Pendidikan (SD/SMP/SMA/SMK/Kuliah): ");
            String jenjang = scanner.nextLine().toUpperCase();
            
            Pembelajaran pembelajaran = new Pembelajaran();
            pembelajaran.setJenjangPendidikan(jenjang);
            
            LatihanSoal latihanSoal = new LatihanSoal();
            Materi materi = new Materi();
            
            
            if(jenjang.equals("SD"))
            {
                pembelajaran.setNamaMataPelajaran("Matematika Dasar");
                pembelajaran.setKodeMataPelajaran("MATH-SD");
                materi.setJudulMateri("Penjumlahan dan Pengurangan");
                materi.setIsiMateri("Dasar penjumlahan dan pengurangan untuk kelas SD.");
                materi.setSumberReferensi("Buku SD Matematika Dasar");

                latihanSoal.setKodeSoal("SOAL-SD-01");
                latihanSoal.setPertanyaan("Berapakah 2 + 2?");
                latihanSoal.setPilihanJawaban("A. 3\nB. 4\nC. 5");
                latihanSoal.setKunciJawaban("B");
            }  
            else if(jenjang.equals("SMP"))
            {
                pembelajaran.setNamaMataPelajaran("Fisika Dasar");
                pembelajaran.setKodeMataPelajaran("PHYS-SMP");
                materi.setJudulMateri("Hukum Newton");
                materi.setIsiMateri("Penjelasan dasar tentang hukum Newton 1, 2, dan 3.");
                materi.setSumberReferensi("Buku SMP Fisika Dasar");

                latihanSoal.setKodeSoal("SOAL-SMP-01");
                latihanSoal.setPertanyaan("Apa hukum Newton 1?");
                latihanSoal.setPilihanJawaban("A. Gaya = Massa x Percepatan\nB. Benda diam akan tetap diam\nC. Setiap aksi ada reaksi");
                latihanSoal.setKunciJawaban("B");
            }    
            else if(jenjang.equals("SMA"))
            {
                pembelajaran.setNamaMataPelajaran("Kimia");
                pembelajaran.setKodeMataPelajaran("CHEM-SMA");
                materi.setJudulMateri("Ikatan Kimia");
                materi.setIsiMateri("Penjelasan tentang ikatan ionik dan kovalen.");
                materi.setSumberReferensi("Buku SMA Kimia");

                latihanSoal.setKodeSoal("SOAL-SMA-01");
                latihanSoal.setPertanyaan("Ikatan ionik terjadi karena?");
                latihanSoal.setPilihanJawaban("A. Transfer elektron\nB. Berbagi elektron\nC. Tidak ada elektron");
                latihanSoal.setKunciJawaban("A");
            } 
            else if(jenjang.equals("SMK"))
            {
                pembelajaran.setNamaMataPelajaran("Pemrograman Dasar");
                pembelajaran.setKodeMataPelajaran("CS-SMK");
                materi.setJudulMateri("Algoritma dan Flowchart");
                materi.setIsiMateri("Penjelasan tentang cara membuat algoritma dan flowchart.");
                materi.setSumberReferensi("Buku SMK Pemrograman Dasar");

                latihanSoal.setKodeSoal("SOAL-SMK-01");
                latihanSoal.setPertanyaan("Apa simbol untuk proses dalam flowchart?");
                latihanSoal.setPilihanJawaban("A. Persegi Panjang\nB. Lingkaran\nC. Belah Ketupat");
                latihanSoal.setKunciJawaban("A");
            }
            else if(jenjang.equals("KULIAH"))
            {
                pembelajaran.setNamaMataPelajaran("Pemrograman Berorientasi Objek");
                pembelajaran.setKodeMataPelajaran("CS-UNI");
                materi.setJudulMateri("Konsep Dasar OOP");
                materi.setIsiMateri("Penjelasan tentang class, object, inheritance, dan polymorphism.");
                materi.setSumberReferensi("Buku Java Programming");

                latihanSoal.setKodeSoal("SOAL-UNI-01");
                latihanSoal.setPertanyaan("Apa itu Polymorphism?");
                latihanSoal.setPilihanJawaban("A. Kemampuan objek berubah bentuk\nB. Pewarisan sifat\nC. Pengkapsulan data");
                latihanSoal.setKunciJawaban("A");
            }
            else
            {
                System.out.println("Jenjang pendidikan tidak dikenali.");
            }
            System.out.println("\n--- Informasi Pembelajaran ---");
            pembelajaran.tampilkanInfo();

            System.out.println("\n--- Materi ---");
            materi.tampilkanMateri();

            System.out.println("\n--- Latihan Soal ---");
            System.out.println("Pertanyaan: " + latihanSoal.getPertanyaan());
            System.out.println("Pilihan Jawaban:\n" + latihanSoal.getPilihanJawaban());
            System.out.print("Masukkan Jawaban Anda: ");
            String jawabanUser = scanner.nextLine();
            latihanSoal.periksaJawaban(jawabanUser);
            scanner.close();
        }
        catch(InputMismatchException e)
        {
            System.err.println(e.fillInStackTrace());
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println("Penyebab error: " + e.getMessage());
            System.err.println("Terjadi error:" + e.getMessage());
        }
    }
}