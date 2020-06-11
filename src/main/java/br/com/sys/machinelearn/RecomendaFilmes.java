package br.com.sys.machinelearn;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaFilmes {

	public static void main(String args[]) throws IOException, TasteException{
		DataModel filmes = new Recomendador().getModeloFilmes();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(filmes);
		List<RecommendedItem> recommenderList = recommender.recommend(4, 3);
		for(RecommendedItem recommenderItem : recommenderList) {
			System.out.println("Você pode gostar desse filme =D");
			System.out.println(recommenderItem);
		}
	}
}
