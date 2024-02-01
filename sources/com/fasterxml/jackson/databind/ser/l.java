package com.fasterxml.jackson.databind.ser;

import x5.m;

public abstract class l {
    @Deprecated
    public abstract c a(Object obj);

    public n b(Object obj, Object obj2) {
        c a10 = a(obj);
        if (a10 == null) {
            return null;
        }
        return m.j(a10);
    }
}
