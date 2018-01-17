package com.goodwill.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goodwill.dao.MetaDataDao;
import com.goodwill.dao.SetDao;
import com.goodwill.domain.Element;
import com.goodwill.domain.Field_Code;
import com.goodwill.domain.Set;
import com.goodwill.domain.Voption;
import com.goodwill.service.MetadataService;
import com.goodwill.service.SetService;

@Service
public class MetadataServiceImpl implements MetadataService {

	@Autowired
	private MetaDataDao metaDataDao;

	public List<Element> GetMetaList(Map<String, Object> param) {
		return metaDataDao.GetMetaList(param);
	}

	public Integer CountMetaList(Map<String, Object> param) {
		return metaDataDao.CountMetaList(param);
	}

	public List<Field_Code> GetFieldcodeList(Map<String, Object> param) {
		return metaDataDao.GetFieldcodeList(param);
	}

	public List<Voption> GetOptionList(Map<String, Object> param) {
		return metaDataDao.GetOptionList(param);
	}

	public Integer CountOptionList(Map<String, Object> param) {
		return metaDataDao.CountOptionList(param);
	}
	
	public List<Field_Code> GetFieldcodesList(Map<String, Object> param) {
		return metaDataDao.GetFieldcodeList(param);
	}

	public Integer CountFieldcodesList(Map<String, Object> param) {
		return metaDataDao.CountFieldcodesList(param);
	}
}
