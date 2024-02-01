package com.google.android.gms.common.data;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import i8.m;
import java.util.HashMap;

public final class b extends DataHolder.a {
    public b(String[] strArr, String str) {
        super(strArr, (String) null, (m) null);
    }

    public final DataHolder.a c(ContentValues contentValues) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    public final DataHolder.a d(HashMap hashMap) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
}
