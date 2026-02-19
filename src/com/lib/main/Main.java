package com.lib.main;

import com.lib.entity.Book;
import com.lib.entity.Library;
import com.lib.entity.Member;

public class Main {

	public static void main(String[] args) {
		
		Library lib=new Library();
		Member m1=new Member(1,"Rahul");
		lib.addMember(m1);
		
		Book b1=new Book(1,"Clean Code","MV",true);
		m1.borrowBook(b1);
		lib.showLibraryStatus();
	}

}
