package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d.j;
import d.m0;
import d.o0;
import d.s0;
import d.u;
import java.io.File;
import java.net.URL;

public interface g<T> {
    @j
    @Deprecated
    T d(@o0 URL url);

    @j
    @m0
    T g(@o0 Uri uri);

    @j
    @m0
    T i(@o0 byte[] bArr);

    @j
    @m0
    T j(@o0 File file);

    @j
    @m0
    T k(@o0 Drawable drawable);

    @j
    @m0
    T m(@o0 Bitmap bitmap);

    @j
    @m0
    T n(@o0 Object obj);

    @j
    @m0
    T p(@o0 @s0 @u Integer num);

    @j
    @m0
    T t(@o0 String str);
}
