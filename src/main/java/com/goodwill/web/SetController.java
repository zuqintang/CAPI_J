package com.goodwill.web;

import java.util.List;
import javax.annotation.Resource;
import net.sf.json.JSONObject;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodwill.util.BaseController;
import com.goodwill.domain.Set;
import com.goodwill.service.SetService;


@Controller
@RequestMapping(value="/Dataset")
public class SetController extends BaseController{
	@Resource
	private SetService setService;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject search(String standard,String study,String keyword,int limit,int offset) {
		Object execResult;
		try {
            List<Set> list = setService.GetSetList(standard,study,keyword,limit,offset);
            if (list == null || list.size() == 0) {
                execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
            } else {
            	long total = setService.CountSetList(standard,study,keyword);
            	long PageNum = (long)(Math.ceil((float)total/10));
                execResult = FromObject(list, PageNum, "0", "查询成功");
            }
        } catch (Exception e) {
            execResult = FromBoolean(false, e.getMessage());
        }
		return JSONObject.fromObject(execResult);
	}
	
	@RequestMapping(value = "/searchSetChildren", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject searchSetChildren(Integer activeItem,String datasetID,String keyword,int limit,int offset) {
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
	
	@RequestMapping(value = "/addSet", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject addSet(Set set) {
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
	
	@RequestMapping(value = "/searchSetInfo", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject searchSetInfo(Integer ID) {
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
