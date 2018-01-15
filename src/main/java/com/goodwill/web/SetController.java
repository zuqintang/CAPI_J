package com.goodwill.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import net.sf.json.JSONObject;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodwill.util.BaseController;
import com.goodwill.domain.Set;
import com.goodwill.service.SetService;


@Controller
@RequestMapping(value="/set")
public class SetController extends BaseController{
	@Resource
	private SetService setService;
	
	@RequestMapping(value = "/fetchSets", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject FetchSets(@RequestBody Map<String,Object> param) {
		Object execResult;
		try {
            List<Set> list = setService.GetSetList(param);
            if (list == null || list.size() == 0) {
                execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
            } else {
            	long total = setService.CountSetList(param);
            	long PageNum = (long)(Math.ceil((float)total/10));
                execResult = FromObject(list, PageNum, "0", "查询成功");
            }
        } catch (Exception e) {
            execResult = FromBoolean(false, e.getMessage());
        }
		return JSONObject.fromObject(execResult);
	}
	
	@RequestMapping(value = "/fetchSetChildren", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject FetchSetChildren(Integer activeItem,String datasetID,String keyword,int limit,int offset) {
		Object execResult;
		try {
			List<T> list = setService.GetChildrenList(activeItem,datasetID,keyword,limit,offset);
			if (list == null || list.size() == 0) {
				execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
			} else {
				long total = setService.CountChildrenList(activeItem,datasetID,keyword);
				long PageNum = (long)(Math.ceil((float)total/10));
				execResult = FromObject(list, PageNum, "0", "查询成功");
			}
		} catch (Exception e) {
			execResult = FromBoolean(false, e.getMessage());
		}
		return JSONObject.fromObject(execResult);
	}
	
	@RequestMapping(value = "/saveSet", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject SaveSet(Set set) {
		Object executeResult;
        int row = setService.AddSet(set);
        if (row > 0) {
            executeResult = FromObject(set, 1, "0", "添加成功");
        } else {
            executeResult = FromBoolean(false, "添加失败");
        }
        JSONObject jsonObject = JSONObject.fromObject(executeResult);
        return jsonObject;
	}
	
	@RequestMapping(value = "/fetchSet", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject FetchSet(Integer ID) {
		System.out.println(ID);
		Object execResult;
		try {
			List<Set> list = setService.GetSetInfo(ID);
			if (list == null || list.size() == 0) {
				execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
			} else {
				execResult = FromObject(list, 1, "0", "查询成功");
			}
		} catch (Exception e) {
			execResult = FromBoolean(false, e.getMessage());
		}
		return JSONObject.fromObject(execResult);
	}

}
