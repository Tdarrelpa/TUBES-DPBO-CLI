/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regis.login;
/**
 *
 * @author Bintang
 */
public class Registrasi extends User {
    private String email;

    // Constructor
    public Registrasi(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    // Getter untuk Email
    public String getEmail() {
        return email;
    }

    // Setter untuk Email
    public void setEmail(String email) {
        this.email = email;
    }

    // Metode registrasi
    public boolean register(String username, String password, String email) {
        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
            System.out.println("Error: Semua field harus diisi.");
            return false;
        }
        setUsername(username);
        setPassword(password);
        setEmail(email);
        System.out.println("Registrasi berhasil untuk username: " + username);
        return true;
    }
}