package cn.wanli.common.enums;

/**
 * 性别枚举
 *
 * @author wanli
 */
public enum Gender {
    /**
     * 性别
     */
    MALE("男"), FEMALE("女"), UNKNOWN("未知");
    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
