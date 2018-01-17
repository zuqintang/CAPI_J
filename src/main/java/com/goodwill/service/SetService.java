package com.goodwill.service;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;

import com.goodwill.domain.Set;

public interface SetService {
	List<Set> GetSetList(Map<String,Object> param);
	
	Integer CountSetList(Map<String,Object> param);
	
	List<T> GetChildrenList(Map<String,Object> param);
	
	Integer CountChildrenList(Map<String,Object> param);
	
	Integer AddSet(Set set);
	
	List<Set> GetSetInfo(Integer ID);
}
