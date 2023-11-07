package com.mycompany.myapp.utils;

import org.apache.commons.lang3.StringUtils;

public class DataUtil {

    public static String makeLikeQuery(String s) {
        if (StringUtils.isEmpty(s)) return null;
        s = s.trim().toLowerCase();
        return "%" + s + "%";
    }
}
