package com.example.online.enums;

public enum ShopStateEnum {
    OFFLINE(-1, "非法商品"), DOWN(0, "已下架"), SUCCESS(1, "操作成功"), INNER_ERROR(-1001, "添加商品失败"), EMPTY(-1002, "商品不存在"),ERROR(-1003,"操作失败");

    private int state;

    private String stateInfo;

    private ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static ShopStateEnum stateOf(int index) {
        for (ShopStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
