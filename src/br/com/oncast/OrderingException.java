package br.com.oncast;

/**
 * Exception retornada caso n�o haja um arquivo de configura��o e as configura��es estejam setadas como null.
 * @author C�ssio
 *
 */
public class OrderingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderingException(String message){
		super(message);
	}

}
