package com.example.steamprototype.entity;

import android.app.GameManager;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private List<Game> library;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.library = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Game> getLibrary() {
        return library;
    }

    public String getLibString() {
        StringBuilder lib = new StringBuilder();
        for (Game game : library) {
            lib.append(game.getGameID()).append(",");
        }
        return lib.toString();
    }

    public void setLibrary(List<Game> library) {
        this.library = library;
    }
}
