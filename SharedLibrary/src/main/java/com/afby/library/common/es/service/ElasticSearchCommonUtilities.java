package com.afby.library.common.es.service;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.metrics.max.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.afby.library.common.constants.LibraryConstants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class ElasticSearchCommonUtilities {

	@Autowired
	private Client client;
	
	protected SearchRequestBuilder getSearchRequestForIndex(){
		return client.prepareSearch(LibraryConstants.INDEX_NAME);
	}
	
	public SearchRequestBuilder getSearchRequestForType(String type){
		return getSearchRequestForIndex().setTypes(type);
	}
	
	public Double generateID(String type){
		
		SearchResponse sr=getSearchRequestForType(type).setQuery(QueryBuilders.matchAllQuery())
									 .addAggregation(AggregationBuilders.max(LibraryConstants.TYPE_IDS).field(LibraryConstants.TYPE_IDS))
									 .execute().actionGet();
		
		Max valueMax=(Max)sr.getAggregations().asList().get(0);
		Double maxValue=Double.isInfinite(valueMax.getValue())?LibraryConstants.STARTING_ID:valueMax.getValue();
		
		return Double.sum(maxValue, LibraryConstants.INCREMENT_ID_BY);
	}
}
