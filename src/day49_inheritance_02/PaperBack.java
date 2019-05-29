package day49_inheritance_02;

public class PaperBack extends Book {
	private int pages;
	
	
	public String toString () {
		String result="";
		
		result=getTitle()+"|"+getAuthor()+"|"+getPrice()+"|"+getType()+"|"+pages;
		return result;
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
