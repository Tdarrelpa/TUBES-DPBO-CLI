/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datadiri;
import java.io.*;
import java.util.*;
import java.time.*;
import com.mycompany.pembelajaran.*;
/**
 *
 * @author hp
 */
public class UserTutor extends Datadiri
{
    private String tempatBekerja;
    private String pengalaman;
    private String kemampuan;
    private List<String> schedule;

    public UserTutor(String nama, String dataLahir, String alamat, String golonganDarah, String jenisKelamin, int umur, String tempatBekerja, String pengalaman, String kemampuan) {
        super(nama, dataLahir, alamat, golonganDarah, jenisKelamin, umur);
        this.tempatBekerja = tempatBekerja;
        this.pengalaman = pengalaman;
        this.kemampuan = kemampuan;
        this.schedule = new ArrayList<>();
    }

    public void setTempatBekerja(String tempatBekerja) {
        this.tempatBekerja = tempatBekerja;
    }

    public void setPengalaman(String pengalaman) {
        this.pengalaman = pengalaman;
    }

    public void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }
    
    public void menerimaPesanan(String pesan) 
    { 
        // Logic to receive order 
        System.out.println("Order received: " + pesan);
        melakukanPenjadwalan();
    } 
    
    public void menolakPesanan(String pesan) 
    { 
        // Logic to reject order 
        System.out.println("Order rejected: " + pesan); 
    }
    
    public void melakukanPenjadwalan() 
    { 
        // Logic to schedule 
        System.out.println("Scheduling..."); 
        if (schedule.isEmpty()) 
        { 
            try 
            { 
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
                System.out.print("Enter subject for the appointment: "); 
                String subject = reader.readLine(); 
                schedule.add(subject); 
                System.out.println("Appointment scheduled with subject: " + subject); 
            } 
            catch (IOException e) 
            { 
                System.err.println(e.getCause());
                System.err.println("An error occurred while reading input: " + e.getMessage());
            } 
        } 
        else 
        { 
            System.out.println("Schedule is not empty. Cannot make an appointment."); 
        }
    } 
    public void menjalankanTutoring() 
    { 
        // Logic to start tutoring 
        System.out.println("Tutoring started...");
        try 
        { 
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter duration of the tutoring session in minutes: "); 
            int durationMinutes = Integer.parseInt(reader.readLine()); 
            LocalTime startTime = LocalTime.now(); 
            LocalTime endTime = startTime.plusMinutes(durationMinutes); 
        System.out.println("Tutoring session started at " + formatTime(startTime) + " and will end at " + formatTime(endTime)); 
            while(LocalTime.now().isBefore(endTime)) 
            { 
                // Simulate tutoring session 
                Thread.sleep(Duration.ofMinutes(durationMinutes)); 
            }
            // Sleep for 1 second to simulate time passing 
                System.out.println("Tutoring session ended at " + formatTime(LocalTime.now())); 
        }
        catch (IOException | InterruptedException e) 
        { 
            System.out.println("An error occurred: " + e.getMessage()); 
        }
    } 
    public void membuatLatihanSoal() 
    {   
        try 
        {
            // Logic to create exercises 
            System.out.println("Creating exercises...");
            LatihanSoal ls = new LatihanSoal();
            ls.setBobot(70);
            ls.setKodeSoal("CCK131");
            ls.setKunciJawaban("Awam");
            ls.setDeadline(20);
            System.out.println("Latihan soal sudah dibuat!");
        } 
        catch (Exception e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
    }

    public void menilaiLatihanSoal() 
    {   
        try 
        {
            // Logic to evaluate exercises 
            System.out.println("Evaluating exercises...");
            LatihanSoal ls = new LatihanSoal();
            System.out.printf("%s, %s, %s, %s, %d, %d, %d\n", ls.getKodeSoal(), ls.getPertanyaan(), ls.getPilihanJawaban(), ls.getKunciJawaban(), ls.getWaktuPengerjaan(), ls.getBobot(), ls.getDeadline());
            ls.periksaJawaban("Abah");
            System.out.println("Jawaban sudah diperiksa!");
        } 
        catch (Exception e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
        
    } 
    public void menguploadMateri() 
    { 
        try 
        {
            // Logic to upload material
            System.out.println("Uploading material...");
            Materi m = new Materi();
            m.setJudulMateri("Elektromagnetik");
            m.setIsiMateri("Apa itu elektromagnetik? Elektromagnetik adalah....");
            m.setSumberReferensi("https://www.listrik.co.id");
            System.out.println("Material uploaded!");
        } 
        catch (Exception e) 
        {
            //System.err.println(e.fillInStackTrace());
            //System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
    }
    
    
    @Override
    public void mengisiBioData(String nama, String dataLahir, String alamat, String golonganDarah, String jenisKelamin, int umur, String tempatBekerja, String pengalaman, String kemampuan) 
    { 
        try 
        {
           setNama(nama);
           setDataLahir(dataLahir);
           setAlamat(alamat);
           setGolonganDarah(golonganDarah);
           setJenisKelamin(jenisKelamin);
           setUmur(umur);
           setTempatBekerja(tempatBekerja);
           setPengalaman(pengalaman);
           setKemampuan(kemampuan);
        } 
        catch (Exception e) 
        {
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }
        System.out.println("BioData Filled");
    }
    
    //Method tambahan supaya kodenya bekerja secara real-time (Mencegah pembacaan waktu secara milidetik, karena menciptakan loop tak hingga)
    private String formatTime(LocalTime time) 
    {
        return String.format("%02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
    }
}