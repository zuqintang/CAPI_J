package com.goodwill.service.impl;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goodwill.dao.ElementDao;
import com.goodwill.dao.SetDao;
import com.goodwill.domain.Set;
import com.goodwill.service.SetService;

@Service
public class SetServiceImpl implements SetService{

	@Autowired
	private SetDao setDao;
	
	@Autowired
	private ElementDao elementDao;

	public List<Set> GetSetList(String study, String keyword, Integer limit, Integer offset) {
		return setDao.GetSetList(study, keyword, limit, offset);
	}


	public Integer CountSetList(String study, String keyword) {
		return setDao.CountSetList(study, keyword);
	}
	
	public List<T> GetChildrenList(Integer activeItem,String datasetID,String keyword,Integer limit,Integer offset) {
		if(activeItem == 1) 
		{
			return setDao.GetGroupListBySetID(datasetID, keyword, limit, offset);
		}else if(activeItem == 2)
		{
			return elementDao.GetElementListBySetID(datasetID,keyword, limit, offset);
		}else 
		{
			return null;
		}
	}
	
	
	public Integer CountChildrenList(Integer activeItem,String datasetID,String keyword) {
		if(activeItem == 1) {
			return setDao.CountGroupListBySetID(datasetID, keyword);			
		}else if(activeItem == 2) {
			return elementDao.CountElementListBySetID(datasetID,keyword);
		}else
		{
			return null;			
		}
	}


	@Transactional
	public Integer AddSet(Set set) {
	        return setDao.AddSet(set);
	    }
	
}