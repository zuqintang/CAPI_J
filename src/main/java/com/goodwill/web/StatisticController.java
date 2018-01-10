package com.goodwill.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodwill.domain.Set;
import com.goodwill.service.SetService;
import com.goodwill.service.StatisticService;
import com.goodwill.util.BaseController;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/statistic")
public class StatisticController extends BaseController {
	@Resource
	private StatisticService statisticService;
	
	@RequestMapping(value = "/sumdatafimaly", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject search()
	{
		Object execResult;
		try {
            Map DataFimaly = statisticService.SumDataFimaly();
            if (DataFimaly == null) {
                execResult = FromObject(DataFimaly, 1, "1", "数据获取失败");
            } else {
                execResult = FromObject(DataFimaly, 1, "0", "查询成功");
            }
        } catch (Exception e) {
            execResult = FromBoolean(false, e.getMessage());
        }
		return JSONObject.fromObject(execResult);
	}
}
