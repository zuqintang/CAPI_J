package com.goodwill.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import com.goodwill.domain.Element;
import com.goodwill.domain.Field_Code;
import com.goodwill.domain.Voption;

public interface MetaDataDao {
	public abstract List<T> GetElementListBySetID(Map<String,Object> param);

	public abstract Integer CountElementListBySetID(Map<String,Object> param);

	public abstract List<Map> SumMetaDataByStandards();

	public abstract List<Map> SumMetaDataByStatus();

	public abstract List<Element> GetMetaList(Map<String, Object> param);

	public abstract Integer CountMetaList(Map<String, Object> param);

	public abstract List<Field_Code> GetFieldcodeList(Map<String, Object> param);
	
	public abstract List<Voption> GetOptionList(Map<String, Object> param);
	
	public abstract Integer CountOptionList(Map<String,Object> param);
	public abstract Integer CountFieldcodesList(Map<String,Object> param);
}
