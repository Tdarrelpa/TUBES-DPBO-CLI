/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transaksi;
//import java.util.Arrays;
/**
 *
 * @author Nadya
 */
public class Refund extends Transaksi{
    private String surat;
    private String murid;

    public Refund(int uang, String status, String surat, String murid) {
        super(uang, status);
        this.surat = surat;
        this.murid = murid;
    }

    public void membuatSuratPengajuanRefund() {
        try 
        {
            System.out.println("Surat pengajuan refund dibuat oleh: " + murid);
            System.out.println("Isi surat: " + surat);
        } 
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
    }

    public void dapatUangKembali() 
    {
        try 
        {
            if (prosesTransaksi() == true) 
            {
                System.out.println(lihatStatus());
                System.out.println("Uang sejumlah " + uang + " telah dikembalikan kepada " + murid);
            } 
            else 
            {
                System.out.println("Proses refund gagal.");
            }
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