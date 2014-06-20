package br.com.oncast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**Essa classe trás os métodos de gerenciamento de configuração.
 * 
 * @author Cássio
 *
 */

public class ConfigManager {
	
	private File configfile;
	
	public ConfigManager(){
		super();
		this.configfile = new File("config.cfg");
	}
	
	/**
	 * Método responsável por carregar configurações do arquivo config.cfg
	 * @return Objeto com as configurações obtidas no arquivo config.cfg. Caso ocorra problemas com o carregamento do arquivo, retorna o objeto como null;
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public Config carregarConfig() throws FileNotFoundException, IOException{
		Config config = new Config();
		if(configfile.exists()){
			Properties properties = new Properties();
			properties.load(new FileInputStream(configfile));
			if(properties.getProperty("author").equals("true")){
				config.setAuthor(true);
			}else{
				config.setAuthor(false);
			}
			if(properties.getProperty("title").equals("true")){
				config.setTitle(true);
			}else{
				config.setTitle(false);
			}
			if(properties.getProperty("edition").equals("true")){
				config.setEdition(true);
			}else{
				config.setEdition(false);
			}
			if(properties.getProperty("authorType").equals("ascendente")){
				config.setAuthorType("ascendente");
			}else if(properties.getProperty("authorType").equals("descendente")){
				config.setAuthorType("descendente");
			}
			if(properties.getProperty("titleType").equals("ascendente")){
				config.setTitleType("ascendente");
			}else if(properties.getProperty("titleType").equals("descendente")){
				config.setTitleType("descendente");
			}if(properties.getProperty("editionType").equals("ascendente")){
				config.setEditionType("ascendente");
			}else if(properties.getProperty("editionType").equals("descendente")){
				config.setEditionType("descendente");
			}
			return config;
		}else{
			config = null;
			return config;
		}
		
	}
	
}
