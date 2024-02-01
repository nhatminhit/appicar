package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import d.m0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2295a = "PopupWindowCompatApi21";

    /* renamed from: b  reason: collision with root package name */
    public static Method f2296b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2297c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f2298d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f2299e;

    /* renamed from: f  reason: collision with root package name */
    public static Field f2300f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f2301g;

    public static boolean a(@m0 PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(@m0 PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(@m0 PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void d(@m0 PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }

    public static void e(@m0 PopupWindow popupWindow, @m0 View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
