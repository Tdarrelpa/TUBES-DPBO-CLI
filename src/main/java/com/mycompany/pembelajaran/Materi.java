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
public class Materi {
    private String judulMateri;
    private String isiMateri;
    private String sumberReferensi;

    public String getJudulMateri() {
        return judulMateri;
    }

    public void setJudulMateri(String judul) {
        this.judulMateri = judul;
    }

    public String getIsiMateri() {
        return isiMateri;
    }

    public void setIsiMateri(String isi) {
        this.isiMateri = isi;
    }

    public String getSumberReferensi() {
        return sumberReferensi;
    }

    public void setSumberReferensi(String sumber) {
        this.sumberReferensi = sumber;
    }

    public void tampilkanMateri() 
    {
        try 
        {
            System.out.println("Judul Materi: " + judulMateri);
            System.out.println("Isi Materi: " + isiMateri);
            System.out.println("Sumber Referensi: " + sumberReferensi);
        } 
        catch (Exception e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            //System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }
}