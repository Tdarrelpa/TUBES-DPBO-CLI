/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pembelajaran;
//import java.util.Arrays;
/**
 *
 * @author User
 */
public class Pembelajaran {
    private String kodeMataPelajaran;
    private String namaMataPelajaran;
    private String jenjangPendidikan;

    public String getKodeMataPelajaran() {
        return kodeMataPelajaran;
    }

    public void setKodeMataPelajaran(String kode) {
        this.kodeMataPelajaran = kode;
    }

    public String getNamaMataPelajaran() {
        return namaMataPelajaran;
    }

    public void setNamaMataPelajaran(String nama) {
        this.namaMataPelajaran = nama;
    }

    public String getJenjangPendidikan() {
        return jenjangPendidikan;
    }

    public void setJenjangPendidikan(String pendidikan) {
        this.jenjangPendidikan = pendidikan;
    }

    public void tampilkanInfo() 
    {
        try 
        {
            System.out.println("Kode Mata Pelajaran: " + kodeMataPelajaran);
            System.out.println("Nama Mata Pelajaran: " + namaMataPelajaran);
            System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        } 
        catch (Exception e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println("Error terjadi: " + e.getMessage());
        }
    }
}