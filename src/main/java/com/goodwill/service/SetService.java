package com.goodwill.service;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;

import com.goodwill.domain.Set;

public interface SetService {
	List<Set> GetSetList(String study,String keyword,Integer limit,Integer offset);
	Integer CountSetList(String study,String keyword);
	List<T> GetChildrenList(Integer activeItem,String datasetID,String keyword,Integer limit,Integer offset);
	Integer CountChildrenList(Integer activeItem,String datasetID,String keyword);
}
