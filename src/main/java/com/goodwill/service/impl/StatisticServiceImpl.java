package com.goodwill.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodwill.dao.MetaDataDao;
import com.goodwill.dao.SetDao;
import com.goodwill.service.StatisticService;

@Service
public class StatisticServiceImpl implements StatisticService{

	@Autowired
	private SetDao setDao;
	
	@Autowired
	private MetaDataDao metaDataDao;

	public Map SumDataFimaly() {
		Map dataFimaly = new HashMap();
		List<Map> setStd =setDao.SumSetByStandards(0);
		List<Map> setStu =setDao.SumSetByStatus(0);
		List<Map> groupStd = setDao.SumSetByStandards(1);
		List<Map> groupStu = setDao.SumSetByStatus(1);
		List<Map> metaStd = metaDataDao.SumMetaDataByStandards();
		List<Map> metaStu = metaDataDao.SumMetaDataByStatus();
		dataFimaly.put("setStd", setStd);
		dataFimaly.put("setStu", setStu);
		dataFimaly.put("groupStd", groupStd);
		dataFimaly.put("groupStu", groupStu);
		dataFimaly.put("metaStd", metaStd);
		dataFimaly.put("metaStu", metaStu);
		return dataFimaly;
	}

}
