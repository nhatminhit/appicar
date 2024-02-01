package com.bumptech.glide;

public enum f {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    public final float O;

    /* access modifiers changed from: public */
    f(float f10) {
        this.O = f10;
    }

    public float a() {
        return this.O;
    }
}
