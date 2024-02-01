package i1;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import e1.n;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8984a = 16777216;

    /* renamed from: b  reason: collision with root package name */
    public static final int f8985b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f8986c = new String[0];

    /* renamed from: d  reason: collision with root package name */
    public static final String f8987d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e  reason: collision with root package name */
    public static final String f8988e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: f  reason: collision with root package name */
    public static final String f8989f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* renamed from: g  reason: collision with root package name */
    public static final String f8990g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* renamed from: h  reason: collision with root package name */
    public static final String f8991h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    @g1

    /* renamed from: i  reason: collision with root package name */
    public static final int f8992i = 2048;
    @g1

    /* renamed from: j  reason: collision with root package name */
    public static final int f8993j = 1024;

    @t0(30)
    public static class a {
        public static CharSequence a(@m0 EditorInfo editorInfo, int i10) {
            return editorInfo.getInitialSelectedText(i10);
        }

        public static CharSequence b(@m0 EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextAfterCursor(i10, i11);
        }

        public static CharSequence c(@m0 EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextBeforeCursor(i10, i11);
        }

        public static void d(@m0 EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    @m0
    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f8986c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f8986c;
        }
        String[] stringArray = bundle.getStringArray(f8987d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f8988e);
        }
        return stringArray != null ? stringArray : f8986c;
    }

    @o0
    public static CharSequence b(@m0 EditorInfo editorInfo, int i10) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i10);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return null;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int i14 = bundle.getInt(f8990g);
        int i15 = editorInfo.extras.getInt(f8991h);
        int i16 = i11 - i13;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i15 - i14 != i16 || (charSequence = editorInfo.extras.getCharSequence(f8989f)) == null) {
            return null;
        }
        return (i10 & 1) != 0 ? charSequence.subSequence(i14, i15) : TextUtils.substring(charSequence, i14, i15);
    }

    @o0
    public static CharSequence c(@m0 EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f8989f)) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt(f8991h);
        int i13 = i11 & 1;
        int min = Math.min(i10, charSequence.length() - i12) + i12;
        return i13 != 0 ? charSequence.subSequence(i12, min) : TextUtils.substring(charSequence, i12, min);
    }

    @o0
    public static CharSequence d(@m0 EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f8989f)) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt(f8990g);
        int i13 = i11 & 1;
        int min = i12 - Math.min(i10, i12);
        return i13 != 0 ? charSequence.subSequence(min, i12) : TextUtils.substring(charSequence, min, i12);
    }

    public static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(f8987d);
        boolean containsKey2 = editorInfo.extras.containsKey(f8988e);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        return containsKey2 ? 2 : 0;
    }

    public static boolean f(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    public static boolean g(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    public static void h(@m0 EditorInfo editorInfo, @o0 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f8987d, strArr);
        editorInfo.extras.putStringArray(f8988e, strArr);
    }

    public static void i(@m0 EditorInfo editorInfo, @m0 CharSequence charSequence, int i10) {
        n.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            k(editorInfo, (CharSequence) null, 0, 0);
        } else if (g(editorInfo.inputType)) {
            k(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            k(editorInfo, charSequence, i13, i14);
        } else {
            l(editorInfo, charSequence, i13, i14);
        }
    }

    public static void j(@m0 EditorInfo editorInfo, @m0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    public static void k(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f8989f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f8990g, i10);
        editorInfo.extras.putInt(f8991h, i11);
    }

    public static void l(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (f(charSequence, i15, 0)) {
            i15++;
            min2--;
        }
        if (f(charSequence, (i11 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i13 != i12 ? TextUtils.concat(new CharSequence[]{charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i11, min + i11)}) : charSequence.subSequence(i15, min2 + i13 + min + i15);
        int i16 = min2 + 0;
        k(editorInfo, concat, i16, i13 + i16);
    }
}
