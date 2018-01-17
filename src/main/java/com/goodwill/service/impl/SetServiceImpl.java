package com.goodwill.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goodwill.dao.MetaDataDao;
import com.goodwill.dao.SetDao;
import com.goodwill.domain.Set;
import com.goodwill.service.SetService;

@Service
public class SetServiceImpl implements SetService{

	@Autowired
	private SetDao setDao;
	
	@Autowired
	private MetaDataDao metaDataDao;

	public List<Set> GetSetList(Map<String,Object> param) {
		return setDao.GetSetList(param);
	}


	public Integer CountSetList(Map<String,Object> param) {
		return setDao.CountSetList(param);
	}
	
	public List<T> GetChildrenList(Map<String,Object> param) {
		if(param.get("activeItem").equals(1)) 
		{
			return setDao.GetGroupListBySetID(param);
		}else if(param.get("activeItem").equals(2))
		{
			return metaDataDao.GetElementListBySetID(param);
		}else 
		{
			return null;
		}
	}
	
	
	public Integer CountChildrenList(Map<String,Object> param) {
		if(param.get("activeItem").equals(1)) 
		{
			return setDao.CountGroupListBySetID(param);			
		}else if(param.get("activeItem").equals(2)){
			return metaDataDao.CountElementListBySetID(param);
		}else
		{
			return null;			
		}
	}


	@Transactional
	public Integer AddSet(Set set) {
	        return setDao.AddSet(set);
	    }


	@Override
	public List<Set> GetSetInfo(Integer ID) {
		return setDao.GetSetInfo(ID);
	}
	
}
