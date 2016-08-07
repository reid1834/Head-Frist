package com.reid.decorator;

/**
 * Created by Reid on 2016/8/7 0007.
 */
public abstract class Coffee {
    public static final int CUP_LARGE = 0;
    public static final int CUP_MIDDLE = 1;
    public static final int CUP_SMALL = 2;

    private int cupType = CUP_MIDDLE;

    public Coffee() {
    }

    public Coffee(int cupType) {
        this.cupType = cupType;
    }

    public int getCupSize() {
        return cupType;
    }

    public String getCupType() {
        String type = null;
        if (cupType == CUP_LARGE) {
            type = "大杯";
        } else if (cupType == CUP_MIDDLE) {
            type = "中杯";
        } else if (cupType == CUP_SMALL) {
            type = "小杯";
        }

        return type;
    }

    public abstract String getDescription();
    public abstract float cost();
}
