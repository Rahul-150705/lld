package com.lib.entity;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Librarian>librarian=new ArrayList<>();
    // Add member to library
    public void addMember(Librarian librarian) {
        librarian.add(librarian);
    }

    public List<Librarian> getLibrarian() {
        return librarian;
    }

    // Show members and their books
}
