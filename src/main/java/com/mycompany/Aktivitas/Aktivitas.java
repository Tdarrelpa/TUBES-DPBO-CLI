/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Aktivitas;

/**
 *
 * @author timot
 */
public class Aktivitas 
{
    protected String jadwal;
    protected int durasi;
    protected String status;

    public Aktivitas(String jadwal, int durasi, String status) 
    {
        this.jadwal = jadwal;
        this.durasi = durasi;
        this.status = status;
    }

    public void setJadwal(String jadwal) 
    {
        this.jadwal = jadwal;
    }

    public void setDurasi(int durasi) 
    {
        this.durasi = durasi;
    }

    public String getJadwal() {
        return jadwal;
    }

    public int getDurasi() {
        return durasi;
    }

    public boolean MulaiAktivitas()
    {
        return status.equals("Mulai");
    }

    public boolean SelesaiAktivitas()
    {
        return status.equals("Selesai");
    }

    public String cekStatus()
    {
        return status;
    }
}
