/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regis.login;

/**
 *
 * @author Bintang
 */
public class User {
    private static int nextId = 1; // Static counter untuk ID otomatis
    private String id;
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.id = "USR" + nextId++; // ID otomatis, dimulai dari USR1, USR2, ...
        this.username = username;
        this.password = password;
    }

    // Getter untuk ID
    public String getId() {
        return id;
    }

    // Getter untuk Username
    public String getUsername() {
        return username;
    }

    // Setter untuk Username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter untuk Password
    public String getPassword() {
        return password;
    }

    // Setter untuk Password
    public void setPassword(String password) {
        this.password = password;
    }
}