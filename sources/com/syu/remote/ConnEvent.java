package com.syu.remote;

public class ConnEvent {
    public boolean success;
    public String type;

    public ConnEvent(String str, boolean z10) {
        this.type = str;
        this.success = z10;
    }
}
