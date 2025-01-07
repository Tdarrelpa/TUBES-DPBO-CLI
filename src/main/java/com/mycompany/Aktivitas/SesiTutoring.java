/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Aktivitas;
import java.io.*;
/**
 *
 * @author timot
 */
public class SesiTutoring extends Aktivitas
{
    private String IDMurid;
    private String IDTutor;
    private String tugas;
    private String namaCourse;
    private String catatanPembelajaran;

    public SesiTutoring(String jadwal, int durasi, String status, String IDMurid, String IDTutor, String tugas, String namaCourse, 
    String catatanPembelajaran) 
    {
        super(jadwal, durasi, status);
        this.IDMurid = IDMurid;
        this.IDTutor = IDTutor;
        this.tugas = tugas;
        this.namaCourse = namaCourse;
        this.catatanPembelajaran = catatanPembelajaran;
    }

    public String getIDMurid() 
    {
        return IDMurid;
    }

    public void setIDMurid(String IDMurid) 
    {
        this.IDMurid = IDMurid;
    }

    public String getIDTutor() 
    {
        return IDTutor;
    }

    public void setIDTutor(String IDTutor) 
    {
        this.IDTutor = IDTutor;
    }

    public String getTugas() 
    {
        return tugas;
    }

    public void setTugas(String tugas) 
    {
        this.tugas = tugas;
    }

    public String getNamaCourse() 
    {
        return namaCourse;
    }

    public void setNamaCourse(String namaCourse) 
    {
        this.namaCourse = namaCourse;
    }

    public String getCatatanPembelajaran() 
    {
        return catatanPembelajaran;
    }

    public void setCatatanPembelajaran(String catatanPembelajaran) 
    {
        this.catatanPembelajaran = catatanPembelajaran;
    }
    
    public void postTugas()
    {
        try
        {
            System.out.printf("Post Tugas: %s\n", getTugas());
            System.out.println("Tugas telah diposting");
        } 
        catch (Exception e) 
        {
            //System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
    }

    public void postCatatanPembelajaran()
    {
        try 
        {
            System.out.printf("Post Catatan Pembelajaran: %s\n", getCatatanPembelajaran());
            System.out.println("Catatan telah dipost");
        } 
        catch (Exception e) 
        {
            //System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
    }

    public void selesaikanTugas()
    {
        try
        {
            System.out.printf("Menyelesaikan tugas: %s\n", getTugas());
            System.out.println("Tugas telah diselesaikan");
        } 
        catch (Exception e) 
        {
            //System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
    }

    public void tambahCatatanPembelajaran()
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            setCatatanPembelajaran(br.readLine());
            System.out.printf("Tambah Catatan Pembelajaran: %s\n", getCatatanPembelajaran());
            System.out.println("Catatan telah ditambah");
        } 
        catch (IOException e) 
        {
            //System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
    }
}