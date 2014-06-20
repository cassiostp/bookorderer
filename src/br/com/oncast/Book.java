package br.com.oncast;

/**
 * Classe que armazena os dados do livro cadastrado.
 * @author Cássio
 *
 */
public class Book {
	
	private String title;
	private String authorName;
	private int editionYear;


	/**
	 * 
	 */
	public Book() {
		super();
	}
	
	/**
	 * @param title
	 * @param authorName
	 * @param editionYear
	 */
	public Book(String title, String authorName, int editionYear) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.editionYear = editionYear;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * @return the editionYear
	 */
	public int getEditionYear() {
		return editionYear;
	}

	/**
	 * @param editionYear the editionYear to set
	 */
	public void setEditionYear(int editionYear) {
		this.editionYear = editionYear;
	}
	
	
}
