package cn.wanli.common.utils;

import java.time.format.DateTimeFormatter;

/**
 * 日期相关工具类
 *
 * @author wanli
 */
public final class DateUtils {
    private DateUtils() {
        throw new AssertionError("工具类不能初始化");
    }

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

}
