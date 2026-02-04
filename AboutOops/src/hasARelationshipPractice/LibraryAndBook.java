package hasARelationshipPractice;

public class LibraryAndBook {
	public static void main(String[] args) {
		Library library=new Library(121,"New Library");
		
		System.out.println(library.getLibraryId());
		System.out.println(library.getLibraryName());
		
		for(Book book:library.getBooks()) {
			System.out.println("Book ID = "+book.getBookId());
			System.out.println("Book title : "+book.getTitle());
			System.out.println("Book Author : "+book.getAuthor());
		}
		
	}
}
