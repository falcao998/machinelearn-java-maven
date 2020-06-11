package br.com.sys.machinelearn;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendarLivros {

	public static void main(String args[]) throws TasteException, IOException{
		DataModel produtos = new Recomendador().getModeloLivros();
		Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);
		System.out.println("Usuário 1");
		List<RecommendedItem> recommendations = recommender.recommend(1, 4);
		for(RecommendedItem item : recommendations) {
			System.out.println("Usuário 1, esse item combina com você");
			System.out.println(item);
		}
	}
}
