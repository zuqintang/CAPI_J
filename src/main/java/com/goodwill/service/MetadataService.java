package com.goodwill.service;

import java.util.List;
import java.util.Map;

import com.goodwill.domain.Element;
import com.goodwill.domain.Voption;

public interface MetadataService {
	List<Element> GetMetaList(Map<String, Object> param);

	Integer CountMetaList(Map<String, Object> param);	
	
	List<Voption> GetOptionList(Map<String, Object> param);

	Integer CountOptionList(Map<String, Object> param);
	
	Integer CountFieldcodesList(Map<String, Object> param);	
}
