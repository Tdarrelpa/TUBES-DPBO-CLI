/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regis.login;
//import java.util.Arrays;
/**
 *
 * @author Bintang
 */
public class Login extends User {
    // Constructor Login
    public Login(String username, String password) {
        super(username, password);
    }

    public boolean login(String username, String password) {
        boolean isValid = false;

        try {
            if (username.equals(getUsername()) && password.equals(getPassword())) {
                isValid = true;
                System.out.println("Login berhasil! Selamat datang, " + username);
            } else {
                throw new Exception("Username atau password salah.");
            }
        } catch (Exception e) 
        {
            //System.err.println(e.fillInStackTrace()); // Mencetak stack exception
            //System.err.println(Arrays.toString(e.getStackTrace())); // Mencetaknya sebagai string (dari array)
            System.err.println(e.getCause()); // Penyebab exception
            System.err.println("Error login" + e.getMessage()); // Pesan exception

        }

        return isValid;
    }
}