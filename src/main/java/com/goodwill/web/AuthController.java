package com.goodwill.web;

import java.util.Map;
import javax.annotation.Resource;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goodwill.util.BaseController;
import com.goodwill.domain.User;
import com.goodwill.service.AuthService;

@Controller
@RequestMapping(value="/auth")
public class AuthController extends BaseController{
	@Resource
	private AuthService authService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject Login(@RequestBody Map<String,String> credentials) {
		Object execResult;
		try {
            User user = authService.Login(credentials);
            if (user == null ) {
            	response.setStatus(400);
                execResult = FromBoolean(false, "用户名或密码错误");
            } else {
                execResult = FromObject(user, 1, "0", "查询成功");
            }
        } catch (Exception e) {
        	response.setStatus(400);
            execResult = FromBoolean(false, e.getMessage());
        }
		return JSONObject.fromObject(execResult);
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject SignUp(@RequestBody Map<String,String> user) {
		Object execResult;
		try {
			User newUser = authService.SignUp(user);
			if (newUser == null ) {
				response.setStatus(400);
				execResult = FromBoolean(false, "用户名已存在");
			} else {
				execResult = FromObject(user, 1, "0", "注册成功");
			}
		} catch (Exception e) {
			response.setStatus(400);
			execResult = FromBoolean(false, e.getMessage());
		}
		return JSONObject.fromObject(execResult);
	}
}
