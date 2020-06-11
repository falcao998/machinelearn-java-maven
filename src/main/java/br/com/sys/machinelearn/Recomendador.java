package br.com.sys.machinelearn;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class Recomendador {

	public DataModel getModeloLivros() throws IOException {
		return getModelo("livros.csv");
	}
	
	public DataModel getModeloFilmes() throws IOException {
		return getModelo("filmes.csv");
	}
	
	public DataModel getModelo(String path) throws IOException {
		File file = new File("src/main/resources/" + path);
		return new FileDataModel(file);
	}
}
