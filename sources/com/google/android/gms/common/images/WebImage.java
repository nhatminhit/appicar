package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import j8.o;
import j8.q;
import java.util.Locale;
import l8.b;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.a(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<WebImage> CREATOR = new i();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getUrl", id = 2)
    public final Uri P;
    @SafeParcelable.c(getter = "getWidth", id = 3)
    public final int Q;
    @SafeParcelable.c(getter = "getHeight", id = 4)
    public final int R;

    @SafeParcelable.b
    public WebImage(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) Uri uri, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) int i12) {
        this.O = i10;
        this.P = uri;
        this.Q = i11;
        this.R = i12;
    }

    public WebImage(@m0 Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(@m0 Uri uri, int i10, int i11) throws IllegalArgumentException {
        this(1, uri, i10, i11);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(@d.m0 org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0012 }
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0012 }
        L_0x0012:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }

    public int X0() {
        return this.R;
    }

    @m0
    public Uri Z0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return q.b(this.P, webImage.P) && this.Q == webImage.Q && this.R == webImage.R;
        }
    }

    public int f1() {
        return this.Q;
    }

    @a
    @m0
    public JSONObject g1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.f9782a, this.P.toString());
            jSONObject.put("width", this.Q);
            jSONObject.put("height", this.R);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int hashCode() {
        return q.c(this.P, Integer.valueOf(this.Q), Integer.valueOf(this.R));
    }

    @m0
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.Q), Integer.valueOf(this.R), this.P.toString()});
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, Z0(), i10, false);
        b.F(parcel, 3, f1());
        b.F(parcel, 4, X0());
        b.b(parcel, a10);
    }
}
