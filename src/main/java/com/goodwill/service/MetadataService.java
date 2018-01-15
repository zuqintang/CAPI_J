package com.goodwill.service;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.goodwill.domain.Set;

public interface MetadataService {
	List<Set> GetMetaList(Map<String,Object> param);
	
	Integer CountMetaList(Map<String,Object> param);
	
//	List<T> GetChildrenList(Integer activeItem,String datasetID,String keyword,Integer limit,Integer offset);
//	
//	Integer CountChildrenList(Integer activeItem,String datasetID,String keyword);
//	
//	Integer AddSet(Set set);
//	
//	List<Set> GetSetInfo(Integer ID);
}
