package h7;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import w7.q0;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int f8870g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f8871h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f8872i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f8873j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int f8874k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final int f8875l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final a f8876m = new a(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f8877a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8878b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8879c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8880d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8881e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f8882f;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: h7.a$a  reason: collision with other inner class name */
    public @interface C0146a {
    }

    public a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f8877a = i10;
        this.f8878b = i11;
        this.f8879c = i12;
        this.f8880d = i13;
        this.f8881e = i14;
        this.f8882f = typeface;
    }

    @TargetApi(19)
    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return q0.f14786a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @TargetApi(19)
    public static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    public static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f8876m.f8877a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f8876m.f8878b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f8876m.f8879c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f8876m.f8880d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f8876m.f8881e, captionStyle.getTypeface());
    }
}
