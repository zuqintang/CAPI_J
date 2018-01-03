package com.goodwill.util;

import java.util.regex.Pattern;

/**
 * 正则校验工具（解决导入数据正则校验问题）
 */
public class RegexValidUtil {
    /**
     * 验证邮箱（与前台正则格式保持一致）
     *
     * @param email 邮箱账号
     * @return
     */
    public static boolean checkEmail(String email) {
        boolean flag = false;
        try {
            flag = Pattern.compile("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$").matcher(email).matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 验证手机号码
     *
     * @param phone 手机号
     * @return
     */
    public static boolean checkPhone(String phone) {
        boolean flag = false;
        try {
            flag = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$").matcher(phone).matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public static boolean checkNotNull(String str) {
        boolean flag = false;
        if (str != "" && str != null) {
            flag = true;
        }
        return flag;
    }
}
