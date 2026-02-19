package com.lib.entity;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
	private int id;
	private String name;
	private List<Member> members = new ArrayList<>();
	public Librarian(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void addMember(Member member) {
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Librarian librarian) {
		// TODO Auto-generated method stub
		
	}
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
