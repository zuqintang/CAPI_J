package com.goodwill.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import com.goodwill.domain.Set;


public interface SetDao {
	public abstract List<Set> GetSetList(Map<String,Object> param);
	public abstract Integer CountSetList(Map<String,Object> param);
	public abstract List<T> GetGroupListBySetID(@Param("datasetID")String datasetID,@Param("keyword")String keyword,@Param("limit")int limit,@Param("offset")int offset);
	public abstract Integer CountGroupListBySetID(@Param("datasetID")String datasetID,@Param("keyword")String keyword);
	public abstract Integer AddSet(Set set);
	public abstract List<Set> GetSetInfo(Integer ID);
	public abstract List<Map> SumSetByStandards(Integer DATA_SET_TYPE);
	public abstract List<Map> SumSetByStatus(Integer DATA_SET_TYPE);
}
