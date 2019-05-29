package day49_inheritance_02;

public class BarensAndNoble {
	
	public static void main(String[] args) {
		Ebook ebook=new Ebook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEbook(10);
		
		
		
		
		AudioBook aBook =new AudioBook();
		aBook.setTitle("OCA Prepration");
		
		
		PaperBack pb =new PaperBack();
		pb.setAuthor("Malcolm Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		
		
		System.out.println(pb.toString());
	}

}
