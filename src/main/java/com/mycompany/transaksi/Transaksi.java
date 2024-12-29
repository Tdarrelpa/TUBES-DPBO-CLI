/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transaksi;

/**
 *
 * @author Nadya
 */
public class Transaksi {
    protected int uang;
    protected String status;

    public Transaksi(int uang, String status) {
        this.uang = uang;
        this.status = status;
    }

    public boolean prosesTransaksi() {
        try
        {
            return "sukses".equalsIgnoreCase(status);
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public String lihatStatus() {
        try
        {
            return status;
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
    }
}