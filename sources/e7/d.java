package e7;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import e7.g;
import j6.i;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o6.f;
import o6.l;
import r6.b;
import r6.e;
import r6.g0;
import r6.h;
import r6.j;
import w7.j0;
import w7.s;

public final class d implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final String f6876d = ".aac";

    /* renamed from: e  reason: collision with root package name */
    public static final String f6877e = ".ac3";

    /* renamed from: f  reason: collision with root package name */
    public static final String f6878f = ".ec3";

    /* renamed from: g  reason: collision with root package name */
    public static final String f6879g = ".ac4";

    /* renamed from: h  reason: collision with root package name */
    public static final String f6880h = ".mp3";

    /* renamed from: i  reason: collision with root package name */
    public static final String f6881i = ".mp4";

    /* renamed from: j  reason: collision with root package name */
    public static final String f6882j = ".m4";

    /* renamed from: k  reason: collision with root package name */
    public static final String f6883k = ".mp4";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6884l = ".cmf";

    /* renamed from: m  reason: collision with root package name */
    public static final String f6885m = ".vtt";

    /* renamed from: n  reason: collision with root package name */
    public static final String f6886n = ".webvtt";

    /* renamed from: b  reason: collision with root package name */
    public final int f6887b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6888c;

    public d() {
        this(0, true);
    }

    public d(int i10, boolean z10) {
        this.f6887b = i10;
        this.f6888c = z10;
    }

    public static g.a b(i iVar) {
        return new g.a(iVar, (iVar instanceof h) || (iVar instanceof b) || (iVar instanceof e) || (iVar instanceof n6.e), g(iVar));
    }

    public static g.a c(i iVar, Format format, j0 j0Var) {
        i eVar;
        if (iVar instanceof s) {
            eVar = new s(format.f5082o0, j0Var);
        } else if (iVar instanceof h) {
            eVar = new h();
        } else if (iVar instanceof b) {
            eVar = new b();
        } else if (iVar instanceof e) {
            eVar = new e();
        } else if (!(iVar instanceof n6.e)) {
            return null;
        } else {
            eVar = new n6.e();
        }
        return b(eVar);
    }

    public static f e(j0 j0Var, DrmInitData drmInitData, @o0 List<Format> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new f(0, j0Var, (l) null, drmInitData, list);
    }

    public static g0 f(int i10, boolean z10, Format format, List<Format> list, j0 j0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 |= 32;
        } else {
            list = z10 ? Collections.singletonList(Format.z((String) null, s.f14800a0, 0, (String) null)) : Collections.emptyList();
        }
        String str = format.T;
        if (!TextUtils.isEmpty(str)) {
            if (!s.f14836u.equals(s.a(str))) {
                i11 |= 2;
            }
            if (!s.f14813h.equals(s.j(str))) {
                i11 |= 4;
            }
        }
        return new g0(2, j0Var, new j(i11, list));
    }

    public static boolean g(i iVar) {
        return (iVar instanceof g0) || (iVar instanceof f);
    }

    /* JADX INFO: finally extract failed */
    public static boolean h(i iVar, j6.j jVar) throws InterruptedException, IOException {
        try {
            boolean c10 = iVar.c(jVar);
            jVar.h();
            return c10;
        } catch (EOFException unused) {
            jVar.h();
            return false;
        } catch (Throwable th2) {
            jVar.h();
            throw th2;
        }
    }

    public g.a a(i iVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, j0 j0Var, Map<String, List<String>> map, j6.j jVar) throws InterruptedException, IOException {
        if (iVar != null) {
            if (g(iVar)) {
                return b(iVar);
            }
            if (c(iVar, format, j0Var) == null) {
                throw new IllegalArgumentException("Unexpected previousExtractor type: " + iVar.getClass().getSimpleName());
            }
        }
        i d10 = d(uri, format, list, drmInitData, j0Var);
        jVar.h();
        if (h(d10, jVar)) {
            return b(d10);
        }
        if (!(d10 instanceof s)) {
            s sVar = new s(format.f5082o0, j0Var);
            if (h(sVar, jVar)) {
                return b(sVar);
            }
        }
        if (!(d10 instanceof h)) {
            h hVar = new h();
            if (h(hVar, jVar)) {
                return b(hVar);
            }
        }
        if (!(d10 instanceof b)) {
            b bVar = new b();
            if (h(bVar, jVar)) {
                return b(bVar);
            }
        }
        if (!(d10 instanceof e)) {
            e eVar = new e();
            if (h(eVar, jVar)) {
                return b(eVar);
            }
        }
        if (!(d10 instanceof n6.e)) {
            n6.e eVar2 = new n6.e(0, 0);
            if (h(eVar2, jVar)) {
                return b(eVar2);
            }
        }
        if (!(d10 instanceof f)) {
            f e10 = e(j0Var, drmInitData, list);
            if (h(e10, jVar)) {
                return b(e10);
            }
        }
        if (!(d10 instanceof g0)) {
            g0 f10 = f(this.f6887b, this.f6888c, format, list, j0Var);
            if (h(f10, jVar)) {
                return b(f10);
            }
        }
        return b(d10);
    }

    public final i d(Uri uri, Format format, List<Format> list, DrmInitData drmInitData, j0 j0Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return (s.S.equals(format.W) || lastPathSegment.endsWith(f6886n) || lastPathSegment.endsWith(f6885m)) ? new s(format.f5082o0, j0Var) : lastPathSegment.endsWith(f6876d) ? new h() : (lastPathSegment.endsWith(f6877e) || lastPathSegment.endsWith(f6878f)) ? new b() : lastPathSegment.endsWith(f6879g) ? new e() : lastPathSegment.endsWith(f6880h) ? new n6.e(0, 0) : (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(f6882j, lastPathSegment.length() + -4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + -5) || lastPathSegment.startsWith(f6884l, lastPathSegment.length() + -5)) ? e(j0Var, drmInitData, list) : f(this.f6887b, this.f6888c, format, list, j0Var);
    }
}
