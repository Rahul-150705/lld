package com.lib.main;

import com.lib.entity.Book;
import com.lib.entity.Librarian;
import com.lib.entity.Library;
import com.lib.entity.Member;

public class Main {

	public static void main(String[] args) {
		
		Library lib=new Library();
		Librarian ln=new Librarian(1,"VC");
		Member m1=new Member(1,"Rahul");
		lib.addMember(ln);
		ln.addMember(m1);
		
		Book b1=new Book(1,"Code","Push",true);
		Book b2=new Book(2,"Git","Ci/Cd",true);
		m1.borrowBook(b2);
		m1.borrowBook(b1);
		ln.showLibraryStatus();
		
		
//		lib.addMember(m1);
//		
//		Book b1=new Book(1,"Clean Code","MV",true);
//		m1.borrowBook(b1);
//		lib.showLibraryStatus();
	}

}
