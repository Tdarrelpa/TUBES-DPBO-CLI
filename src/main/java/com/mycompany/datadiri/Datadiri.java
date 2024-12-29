/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datadiri;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author hp
 */
public abstract class Datadiri 
{
    private String nama;
    private String dataLahir;
    private String alamat;
    private String golonganDarah;
    private String jenisKelamin;
    private int umur;

    public Datadiri(String nama, String dataLahir, String alamat, String golonganDarah, String jenisKelamin, int umur) {
        this.nama = nama;
        this.dataLahir = dataLahir;
        this.alamat = alamat;
        this.golonganDarah = golonganDarah;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDataLahir() {
        return dataLahir;
    }

    public void setDataLahir(String dataLahir) {
        this.dataLahir = dataLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public abstract void mengisiBioData(String nama, String dataLahir, String alamat, String golonganDarah, String jenisKelamin, int umur, String sekolah, String course, String tutor);
}