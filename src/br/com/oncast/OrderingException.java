package br.com.oncast;

/**
 * Exception retornada caso não haja um arquivo de configuração e as configurações estejam setadas como null.
 * @author Cássio
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
