/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Aktivitas;
import java.io.*;
//import java.util.Arrays;
/**
 *
 * @author timot
 */
public class Konsultasi extends Aktivitas
{
    private String nama;
    private String tempat;

    public Konsultasi(String jadwal, int durasi, String status, String nama, String tempat)
    {
        super(jadwal, durasi, status);
        this.nama = nama;
        this.tempat = tempat;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public void MelakukanPenjadwalan()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String tanggal = br.readLine();
            int lama = br.read();
            setJadwal(tanggal);
            setDurasi(lama);
            System.out.printf("Jadwal konsultasi: %s, durasi: % d\n", getJadwal(), getDurasi());
        } 
        catch (IOException e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }

    public void MengaturTempat()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String lokasi = br.readLine();
            setTempat(lokasi);
            System.out.printf("Tempat konsultasi: %s\n", getTempat());
        } 
        catch (IOException e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }

    public void MenentukanTutor()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String tutor = br.readLine();
            setNama(tutor);
            System.out.printf("Tutor yang akan dijadwalkan: %s\n", getNama());
        } 
        catch (IOException e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }

    public void MenentukanTopik()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String topik = br.readLine();
            System.out.printf("membahas tentang : %s\n", topik);
        } 
        catch (IOException e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }
}