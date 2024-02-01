package com.bumptech.glide.load;

import d.m0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import z3.b;

public interface ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4991a = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        public final boolean O;

        /* access modifiers changed from: public */
        ImageType(boolean z10) {
            this.O = z10;
        }

        public boolean hasAlpha() {
            return this.O;
        }
    }

    @m0
    ImageType a(@m0 ByteBuffer byteBuffer) throws IOException;

    @m0
    ImageType b(@m0 InputStream inputStream) throws IOException;

    int c(@m0 ByteBuffer byteBuffer, @m0 b bVar) throws IOException;

    int d(@m0 InputStream inputStream, @m0 b bVar) throws IOException;
}
