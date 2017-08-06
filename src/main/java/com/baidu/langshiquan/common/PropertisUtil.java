package com.baidu.langshiquan.common;

import org.springframework.util.PropertyPlaceholderHelper;
import org.springframework.util.SystemPropertyUtils;

import java.util.Properties;

/**
 * Created by Administrator on 2017/8/4.
 */
public class PropertisUtil {
    private static Properties props = null;
    private static PropertyPlaceholderHelper helper =
            new PropertyPlaceholderHelper(SystemPropertyUtils.PLACEHOLDER_PREFIX,
                    SystemPropertyUtils.PLACEHOLDER_SUFFIX, SystemPropertyUtils.VALUE_SEPARATOR, false);


    public static String getProperty(String key) {
        return helper.replacePlaceholders(props.getProperty(key), props);
    }
}
