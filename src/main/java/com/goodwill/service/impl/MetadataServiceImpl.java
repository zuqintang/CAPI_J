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
import com.goodwill.service.MetadataService;
import com.goodwill.service.SetService;

@Service
public class MetadataServiceImpl implements MetadataService{

	
	@Autowired
	private MetaDataDao metaDataDao;

	public List<Set> GetMetaList(Map<String,Object> param) {
		return metaDataDao.GetMetaList(param);
	}


	public Integer CountMetaList(Map<String,Object> param) {
		return metaDataDao.CountMetaList(param);
	}
	
//	public List<T> GetChildrenList(Integer activeItem,String datasetID,String keyword,Integer limit,Integer offset) {
//		if(activeItem == 1) 
//		{
//			return setDao.GetGroupListBySetID(datasetID, keyword, limit, offset);
//		}else if(activeItem == 2)
//		{
//			return metaDataDao.GetElementListBySetID(datasetID,keyword, limit, offset);
//		}else 
//		{
//			return null;
//		}
//	}
//	
//	
//	public Integer CountChildrenList(Integer activeItem,String datasetID,String keyword) {
//		if(activeItem == 1) {
//			return setDao.CountGroupListBySetID(datasetID, keyword);			
//		}else if(activeItem == 2) {
//			return metaDataDao.CountElementListBySetID(datasetID,keyword);
//		}else
//		{
//			return null;			
//		}
//	}
//
//
//	@Transactional
//	public Integer AddSet(Set set) {
//	        return setDao.AddSet(set);
//	    }
//
//
//	@Override
//	public List<Set> GetSetInfo(Integer ID) {
//		return setDao.GetSetInfo(ID);
//	}
//	
}
