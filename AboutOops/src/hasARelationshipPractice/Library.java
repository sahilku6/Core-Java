package hasARelationshipPractice;

public class Library {
	private int libraryId;
	private String libraryName;
	
	public Library() {
		
	}

	public Library(int libraryId,String libraryName) {
		this.libraryId=libraryId;
		this.libraryName=libraryName;
	}
	
	public int getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	

	Book[] books= {new Book(1,"English","Kushwaha"),
			new Book(2,"Hindi","Kumar"),
			new Book(3,"Sanskrit","Mehta"),
			new Book(4,"Math","Komal"),
			new Book(5,"Science","Kaur")
		};

	public Book[] getBooks() {
		return books;
	}
	
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
}
