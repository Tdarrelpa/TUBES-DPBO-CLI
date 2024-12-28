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
public class Datadiri 
{
    private String nama;
    private String dataLahir;
    private int alamat;
    private String golonganDarah;
    private String jenisKelamin;
    private int umur;

    public Datadiri(String nama, String dataLahir, int alamat, String golonganDarah, String jenisKelamin, int umur) {
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

    public int getAlamat() {
        return alamat;
    }

    public void setAlamat(int alamat) {
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
    
    public void mengisiBioData() 
    { 
        try 
        {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           nama = br.readLine();
           setNama(nama);
           dataLahir = br.readLine();
           setDataLahir(dataLahir);
           alamat = br.read();
           setAlamat(alamat);
           golonganDarah = br.readLine();
           setGolonganDarah(golonganDarah);
           jenisKelamin = br.readLine();
           setJenisKelamin(jenisKelamin);
           umur = br.read();
           setUmur(umur);
        } 
        catch (IOException e) 
        {
            System.err.println(e.fillInStackTrace());
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
        System.out.println("Biodata filled");
    }
}

