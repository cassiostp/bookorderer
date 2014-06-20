package br.com.oncast;

/**
 * Classe responsável por armazenar os valores de configuração dentro do programa.
 * @author Cássio
 *
 */
public class Config {
	
	private boolean author;
	private boolean edition;
	private boolean title;
	
	private String authorType;
	private String editionType;
	private String titleType;
	
	/**
	 * @return the author
	 */
	public boolean isAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(boolean author) {
		this.author = author;
	}
	/**
	 * @return the edition
	 */
	public boolean isEdition() {
		return edition;
	}
	/**
	 * @param edition the edition to set
	 */
	public void setEdition(boolean edition) {
		this.edition = edition;
	}
	/**
	 * @return the title
	 */
	public boolean isTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(boolean title) {
		this.title = title;
	}
	/**
	 * @return the authorType
	 */
	public String getAuthorType() {
		return authorType;
	}
	/**
	 * @param authorType the authorType to set
	 */
	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}
	/**
	 * @return the editionType
	 */
	public String getEditionType() {
		return editionType;
	}
	/**
	 * @param editionType the editionType to set
	 */
	public void setEditionType(String editionType) {
		this.editionType = editionType;
	}
	/**
	 * @return the titleType
	 */
	public String getTitleType() {
		return titleType;
	}
	/**
	 * @param titleType the titleType to set
	 */
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	
	
}
