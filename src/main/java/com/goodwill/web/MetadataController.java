package com.goodwill.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodwill.util.BaseController;
import com.goodwill.domain.Element;
import com.goodwill.domain.Field_Code;
import com.goodwill.domain.Voption;
import com.goodwill.service.MetadataService;

@Controller
@RequestMapping(value = "/metadata")
public class MetadataController extends BaseController {
	@Resource
	private MetadataService metadataService;

	@RequestMapping(value = "/fetchMetas", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject FetchMetas(@RequestBody Map<String, Object> param) {
		Object execResult;
		System.out.println(param);
		try {
			List<Element> list = metadataService.GetMetaList(param);
			if (list == null || list.size() == 0) {
				execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
			} else {
				long total = metadataService.CountMetaList(param);
				long PageNum = (long) (Math.ceil((float) total / 10));
				execResult = FromObject(list, PageNum, "0", "查询成功");
			}
		} catch (Exception e) {
			execResult = FromBoolean(false, e.getMessage());
		}
		return JSONObject.fromObject(execResult);
	}

	@RequestMapping(value = "/fetchField", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject FetchFieldcode(@RequestBody Map<String, Object> param) {
		Object execResult;
		try {
			List<Field_Code> list = metadataService.GetFieldcodeList(param);
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
	
	@RequestMapping(value = "/fetchOption", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject FetchOption(@RequestBody Map<String, Object> param) {
		Object execResult;
		try {
			List<Voption> list = metadataService.GetOptionList(param);
			if (list == null || list.size() == 0) {
				execResult = FromObject(list, list.size(), "1", "没有找到匹配的记录");
			} else {
				long total = metadataService.CountOptionList(param);
				System.out.println(total);
				long PageNum = (long) (Math.ceil((float) total / 10));
				execResult = FromObject(list, PageNum, "0", "查询成功");
			}
		} catch (Exception e) {
			execResult = FromBoolean(false, e.getMessage());
		}
		return JSONObject.fromObject(execResult);
	}
}
