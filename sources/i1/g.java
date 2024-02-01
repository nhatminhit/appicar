package i1;

import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import d.m0;
import d.o0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8994a = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8995b = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c  reason: collision with root package name */
    public static final String f8996c = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: d  reason: collision with root package name */
    public static final String f8997d = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e  reason: collision with root package name */
    public static final String f8998e = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: f  reason: collision with root package name */
    public static final String f8999f = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g  reason: collision with root package name */
    public static final String f9000g = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: h  reason: collision with root package name */
    public static final String f9001h = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i  reason: collision with root package name */
    public static final String f9002i = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: j  reason: collision with root package name */
    public static final String f9003j = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k  reason: collision with root package name */
    public static final String f9004k = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: l  reason: collision with root package name */
    public static final String f9005l = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m  reason: collision with root package name */
    public static final String f9006m = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: n  reason: collision with root package name */
    public static final String f9007n = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o  reason: collision with root package name */
    public static final int f9008o = 1;

    public class a extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f9009a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f9009a = cVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f9009a.a(h.g(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    public class b extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f9010a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f9010a = cVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (g.c(str, bundle, this.f9010a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(h hVar, int i10, Bundle bundle);
    }

    public static boolean a(@m0 InputConnection inputConnection, @m0 EditorInfo editorInfo, @m0 h hVar, int i10, @o0 Bundle bundle) {
        boolean z10;
        ClipDescription b10 = hVar.b();
        String[] a10 = e.a(editorInfo);
        int length = a10.length;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z10 = false;
                break;
            } else if (b10.hasMimeType(a10[i11])) {
                z10 = true;
                break;
            } else {
                i11++;
            }
        }
        if (!z10) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 25) {
            return inputConnection.commitContent((InputContentInfo) hVar.f(), i10, bundle);
        }
        int e10 = e.e(editorInfo);
        if (e10 == 2) {
            z11 = true;
        } else if (!(e10 == 3 || e10 == 4)) {
            return false;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(z11 ? f8997d : f8996c, hVar.a());
        bundle2.putParcelable(z11 ? f8999f : f8998e, hVar.b());
        bundle2.putParcelable(z11 ? f9001h : f9000g, hVar.c());
        bundle2.putInt(z11 ? f9005l : f9004k, i10);
        bundle2.putParcelable(z11 ? f9003j : f9002i, bundle);
        return inputConnection.performPrivateCommand(z11 ? f8995b : f8994a, bundle2);
    }

    @m0
    public static InputConnection b(@m0 InputConnection inputConnection, @m0 EditorInfo editorInfo, @m0 c cVar) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (cVar != null) {
            return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : e.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
        } else {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(@d.o0 java.lang.String r7, @d.m0 android.os.Bundle r8, @d.m0 i1.g.c r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = r0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            i1.h r8 = new i1.h     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.c(java.lang.String, android.os.Bundle, i1.g$c):boolean");
    }
}
