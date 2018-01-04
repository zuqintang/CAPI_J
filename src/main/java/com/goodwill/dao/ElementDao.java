package com.goodwill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;


public interface ElementDao {
	public abstract List<T> GetElementListBySetID(@Param("datasetID")String datasetID,@Param("keyword")String keyword,@Param("limit")int limit,@Param("offset")int offset);
	public abstract Integer CountElementListBySetID(@Param("datasetID")String datasetID,@Param("keyword")String keyword);
}
