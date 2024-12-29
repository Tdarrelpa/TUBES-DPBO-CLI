/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transaksi;

/**
 *
 * @author Nadya
 */
public class Pembayaran extends Transaksi{
    private String pembayar;
    private String penerima;
    private String buktiBayar;

    public Pembayaran(int uang, String status, String pembayar, String penerima, String buktiBayar) {
        super(uang, status);
        this.pembayar = pembayar;
        this.penerima = penerima;
        this.buktiBayar = buktiBayar;
    }

    public void memesanDosen() {
        System.out.println("Tutor berhasil dipesan.");
    }

    public void melakukanPembayaran() {
        try 
        {
            System.out.println("Pembayaran sedang diproses...");
            System.out.println("Pembayaran dilakukan oleh " + pembayar);
            pembayaranDiterima();
        } 
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
    }

    public void pembayaranDiterima() {
        try
        {
        this.status = "sukses";
        System.out.println("Pembayaran diterima oleh " + penerima);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    public void mendapatBuktiBayar() {
        System.out.println("Bukti pembayaran: " + buktiBayar);
    }

    public void pembayaranDitolak() {
        try 
        {
            this.status = "gagal";
            System.out.println("Pembayaran ditolak.");
        } 
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
    }
}