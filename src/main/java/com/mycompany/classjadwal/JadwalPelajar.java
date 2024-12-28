/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classjadwal;
import com.mycompany.datadiri.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Akfarizi
 */

public class JadwalPelajar extends Jadwal {
    private int idPelajar;
    private String namaPelajar;
    private List<String> schedule;

    public JadwalPelajar(int tanggal, String bulan, int tahun, String hari, String kelas, String mataPelajaran, int idPelajar, String namaPelajar) {
        super(tanggal, bulan, tahun, hari, kelas, mataPelajaran);
        this.idPelajar = idPelajar;
        this.namaPelajar = namaPelajar;
        this.schedule = new ArrayList<>();
    }
    
    public void initializeSchedule()
    {
        // Sementara, agak bingung buat yang ini
        schedule.add(4, "Senin");
        schedule.add(0, "Selasa");
        schedule.add(3, "Rabu");
        schedule.add(5, "Kamis");
        schedule.add(2, "Jumat");
        schedule.add(1, "Sabtu");
    }

    public String getPelajarInfo() {
        return "ID Pelajar: " + idPelajar + ", Nama: " + namaPelajar;
    }
    
    public void cekKetersediaan() {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // Format: nama, lahir, alamat, golongan darah, jenis kelamin, umur, sekolah, course, tutor
            UserPelajar up = new UserPelajar(br.readLine(), br.readLine(), br.read(), br.readLine(), br.readLine(), br.read(), br.readLine(), br.readLine(), br.readLine());
            System.out.println("Memeriksa ketersediaan pelajar...");
            up.memilihTutor(br.readLine());
            if(schedule.isEmpty())
            {
                up.menghubungiViaChat();
                up.melakukanPembayaran(20000, "Student name","Tutor name");
                konfirmasiPesanan();
            }
            else
            {
                System.out.println("Tutor tidak tersedia");
            }
        } 
        catch (IOException e) 
        {
            System.err.println(e.fillInStackTrace());
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
        finally
        {
            konfirmasiPesanan();
        }
    }

    public void konfirmasiPesanan() 
    {
        try 
        {
            System.out.println("Pesanan pelajar dikonfirmasi.");
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

