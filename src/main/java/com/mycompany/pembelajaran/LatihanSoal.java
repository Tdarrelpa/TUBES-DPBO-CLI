/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pembelajaran;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class LatihanSoal 
{
    private String kodeSoal;
    private String pertanyaan;
    private String pilihanJawaban;
    private String kunciJawaban;
    private int waktuPengerjaan;
    private int bobot;
    private int deadline;

    public String getKodeSoal() {
        return kodeSoal;
    }

    public void setKodeSoal(String kode) {
        this.kodeSoal = kode;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String soal) {
        this.pertanyaan = soal;
    }

    public String getPilihanJawaban() {
        return pilihanJawaban;
    }

    public void setPilihanJawaban(String pilihan) {
        this.pilihanJawaban = pilihan;
    }

    public String getKunciJawaban() {
        return kunciJawaban;
    }

    public void setKunciJawaban(String jawaban) {
        this.kunciJawaban = jawaban;
    }

    public int getWaktuPengerjaan() {
        return waktuPengerjaan;
    }

    public void setWaktuPengerjaan(int waktu) {
        this.waktuPengerjaan = waktu;
    }

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int nilai) {
        this.bobot = nilai;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int tenggat) {
        this.deadline = tenggat;
    }

    public void periksaJawaban(String jawaban) 
    {
        try
        {
            if (jawaban.equals(kunciJawaban)) 
            {
                System.out.println("Jawaban Benar!");
            } 
            else 
            {
                System.out.println("Jawaban Salah!");
            }
        } 
        catch (Exception e) 
        {
            System.err.println(e.fillInStackTrace());
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }
}
