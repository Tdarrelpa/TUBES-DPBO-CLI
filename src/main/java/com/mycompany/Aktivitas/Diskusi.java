/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Aktivitas;
import com.mycompany.datadiri.UserPelajar;
import java.io.*;
//import java.util.Arrays;
/**
 *
 * @author timot
 */
public class Diskusi extends Aktivitas
{
    private String ruang;
    private int waktuDiskusi;

    public Diskusi(String jadwal, int durasi, String status, String ruang, int waktuDiskusi)
    {
        super(jadwal, durasi, status);
        this.ruang = ruang;
        this.waktuDiskusi = waktuDiskusi;
    }

    public void setRuang(String ruang) 
    {
        this.ruang = ruang;
    }

    public void setWaktuDiskusi(int waktuDiskusi) 
    {
        this.waktuDiskusi = waktuDiskusi;
    }

    public void MulaiDiskusi()
    {
            //JadwalPelajar.initializeSchedule();
            setAktivitas("Mulai");
            // Hanya dijalankan ketika aktivitas dimulai dan ada pelajarnya
            if(MulaiAktivitas() == true)
            {
                try 
                {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    setJadwal(br.readLine());
                    setRuang(br.readLine());
                    setWaktuDiskusi(br.read());
                    System.out.printf("Diskusi dilaksanakan tanggal %s, ruang %s, dan waktu %d jam\n", jadwal, ruang, waktuDiskusi);
                } 
                catch (IOException e) 
                {
                    //System.err.println(e.getCause());
                    System.err.println("Error terjadi: " + e.getMessage());
                }
            }
            else
            {
                System.out.println("Diskusi tidak dimulai");
            }
    }

    public void TutupDiskusi()
    {
            setAktivitas("Selesai");
            // Hanya dijalankan ketika aktivitas dimulai dan ada pelajarnya
            if(SelesaiAktivitas() == true)
            {
                try 
                {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    setJadwal(br.readLine());
                    setDurasi(br.read());
                    System.out.printf("Diskusi berakhir pada tanggal %s, di ruang %s, dan waktu %d jam, dengan durasi selama %d jam\n", jadwal, ruang, waktuDiskusi, durasi);
                } 
                catch (IOException e) 
                {
                    //System.err.println(e.getCause());
                    System.err.println("Error terjadi: " + e.getMessage());
                }
            }
            else
            {
                System.out.println("Diskusi belum selesai");
            }
    }

    public void MenjawabPertanyaan()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            UserPelajar up = new UserPelajar(br.readLine(), br.readLine(), br.readLine(), br.readLine(), br.read(), br.readLine(), br.readLine(), br.readLine());
            System.out.printf("Selama %d jam, %s bisa menjawab pertanyaan", waktuDiskusi, up.getNama());
        } 
        catch (IOException e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            //System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }
}