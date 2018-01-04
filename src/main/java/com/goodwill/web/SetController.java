package com.goodwill.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodwill.dao.SetDao;
import com.goodwill.util.BaseController;

import com.goodwill.domain.Set;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/Dataset")
public class SetController extends BaseController{
	@Resource
	private SetDao setDao;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject search(String study,String keyword,int limit,int offset) {
		Object execResult;
		try {
            List<Set> list = setDao.GetSetList(study,keyword,limit,offset);
            if (list == null || list.size() == 0) {
                execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
            } else {
            	long total = setDao.CountSetList(study,keyword);
            	long PageNum = (long)(Math.ceil((float)total/10));
                execResult = FromObject(list, PageNum, "0", "查询成功");
            }
        } catch (Exception e) {
            execResult = FromBoolean(false, e.getMessage());
        }
		return JSONObject.fromObject(execResult);
	}
}
