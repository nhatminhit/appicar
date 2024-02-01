package com.syu.remote;

public class Message {
    public int code;
    public float[] flts;
    public int[] ints;
    public int module;
    public String[] strs;

    public Message(int i10, int i11, int[] iArr, float[] fArr, String[] strArr) {
        this.module = i10;
        this.code = i11;
        this.ints = iArr;
        this.flts = fArr;
        this.strs = strArr;
    }
}
