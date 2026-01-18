package Practice.Capgemenai;

public class TransientTest {

	public static void main(String[] args) throws Exception {
		 Book book = new Book();
	        book.setBookName("Java Reference");
	        book.setDescription("will not be saved");
	        book.setCopies(25);
	        
	        BookSerTest.serialize(book);
	        Book book2 = BookSerTest.deserialize();
	        System.out.println(book2.getDescription());
	        System.out.println(book2.getBookCategory());
	}
}
