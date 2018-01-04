package com.goodwill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import com.goodwill.domain.Set;


public interface SetDao {
	public abstract List<Set> GetSetList(@Param("study")String study,@Param("keyword")String keyword,@Param("limit")int limit,@Param("offset")int offset);
	public abstract Integer CountSetList(@Param("study")String study,@Param("keyword")String keyword);
	public abstract List<T> GetGroupListBySetID(@Param("datasetID")String datasetID,@Param("keyword")String keyword,@Param("limit")int limit,@Param("offset")int offset);
	public abstract Integer CountGroupListBySetID(@Param("datasetID")String datasetID,@Param("keyword")String keyword);
	Integer AddSet(Set set);
}
