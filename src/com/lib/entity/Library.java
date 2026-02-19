package com.lib.entity;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Member> members = new ArrayList<>();

    // Add member to library
    public void addMember(Member member) {
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }

    // Show members and their books
    public void showLibraryStatus() {
        for (Member m : members) {
            System.out.println("Member: " + m.getName());
            System.out.println("Borrowed books:");
            for (Book b : m.getBorrowedBooks()) {
                System.out.println("  - " + b.getName());
            }
        }
    }
}
