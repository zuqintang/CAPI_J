package com.goodwill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goodwill.domain.Set;

public interface SetDao {
	public abstract List<Set> GetSetList(@Param("study")String study,@Param("keyword")String keyword,@Param("limit")int limit,@Param("offset")int offset);
	public abstract Integer CountSetList(@Param("study")String study,@Param("keyword")String keyword);
}
