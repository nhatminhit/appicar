package i0;

import android.annotation.SuppressLint;
import android.content.Intent;
import d.m0;

public final class l {
    @SuppressLint({"ActionValue"})

    /* renamed from: a  reason: collision with root package name */
    public static final String f8972a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8973b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c  reason: collision with root package name */
    public static final String f8974c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})

    /* renamed from: d  reason: collision with root package name */
    public static final String f8975d = "android.intent.extra.TIME";

    /* renamed from: e  reason: collision with root package name */
    public static final String f8976e = "android.intent.category.LEANBACK_LAUNCHER";

    @m0
    public static Intent a(@m0 String str, @m0 String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
