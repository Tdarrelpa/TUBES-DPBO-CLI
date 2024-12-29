/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classjadwal;
import com.mycompany.datadiri.*;
import java.util.*;
/**
 *
 * @author Akfarizi
 */

 public class JadwalTutor extends Jadwal implements IfaceJadwal {
    private int idTutor;
    private String namaTutor;
    private float rating;
    private List<String> schedule;

    public JadwalTutor(int tanggal, String bulan, int tahun, String hari, String kelas, String mataPelajaran, int idTutor, String namaTutor, float rating) {
        super(tanggal, bulan, tahun, hari, kelas, mataPelajaran);
        this.idTutor = idTutor;
        this.namaTutor = namaTutor;
        this.rating = rating;
        this.schedule = new ArrayList<>();
    }

    public int getIdTutor() 
    {
        return idTutor;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getTutorInfo() {
        return "ID Tutor: " + idTutor + ", Nama: " + namaTutor + ", Rating: " + rating;
    }
    
    public void initializeSchedule()
    {
        // Sementara, agak bingung yang ini
        schedule.add(4, "Senin");
        schedule.add(3, "Rabu");
        schedule.add(5, "Kamis");
        schedule.add(1, "Sabtu");
    }
    
    @Override
    public void cekKetersediaan() {
        try 
        {
            Scanner scan = new Scanner(System.in);
            // Format: nama, lahir, alamat, golongan darah, jenis kelamin, umur, tempat kerja, pengalaman, kemampuan
            System.out.print("Masukan nama: ");
            String NamaTutor = scan.nextLine();
            System.out.print("Masukan tanggal lahir spasi dengan (-): ");
            String dataLahirTutor = scan.nextLine();
            System.out.print("Tempat tinggal: ");
            String alamatTutor = scan.nextLine();
            System.out.print("Golongan darah: ");
            String golonganDarahTutor = scan.nextLine();
            System.out.print("Umur: ");
            int umurTutor = scan.nextInt();
            System.out.print("Tempat berkerja saat ini: ");
            String tempatBekerja = scan.nextLine(); 
            System.out.print("Pengalaman: ");
            String pengalaman = scan.nextLine();
            System.out.print("Kemampuan: ");
            String kemampuan = scan.nextLine();
            UserTutor ut = new UserTutor(NamaTutor, dataLahirTutor, alamatTutor, golonganDarahTutor, scan.nextLine(), umurTutor, tempatBekerja, pengalaman, kemampuan);
            System.out.println("Memeriksa ketersediaan tutor...");
            if(schedule.isEmpty())
            {
                ut.menerimaPesanan(NamaTutor);
                konfirmasiPesanan();
                ut.melakukanPenjadwalan();
                ut.menjalankanTutoring();
            }
            else
            {
                ut.menolakPesanan(NamaTutor);
            }
        } 
        catch (InputMismatchException e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            //System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
        finally
        {
            konfirmasiPesanan();
        }
    }

    @Override
    public void konfirmasiPesanan() {
        try 
        {
            System.out.println("Pesanan diterima.");
        } 
        catch (Exception e) 
        {
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
        finally
        {
            System.out.println("Proses selesai!");
        }
    }
}