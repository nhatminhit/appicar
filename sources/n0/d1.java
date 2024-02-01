package n0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import d.m0;
import d.o0;
import d.x0;
import g4.w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import k0.d;
import y0.f;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class d1 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f10685b = "TypefaceCompatBaseImpl";

    /* renamed from: c  reason: collision with root package name */
    public static final int f10686c = 0;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, d.c> f10687a = new ConcurrentHashMap<>();

    public class a implements c<f.c> {
        public a() {
        }

        /* renamed from: c */
        public int a(f.c cVar) {
            return cVar.e();
        }

        /* renamed from: d */
        public boolean b(f.c cVar) {
            return cVar.f();
        }
    }

    public class b implements c<d.C0165d> {
        public b() {
        }

        /* renamed from: c */
        public int a(d.C0165d dVar) {
            return dVar.e();
        }

        /* renamed from: d */
        public boolean b(d.C0165d dVar) {
            return dVar.f();
        }
    }

    public interface c<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public static <T> T g(T[] tArr, int i10, c<T> cVar) {
        int i11 = (i10 & 1) == 0 ? 400 : w.f8024j;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(cVar.a(t11) - i11) * 2) + (cVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    public static long j(@o0 Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0;
        }
    }

    public final void a(Typeface typeface, d.c cVar) {
        long j10 = j(typeface);
        if (j10 != 0) {
            this.f10687a.put(Long.valueOf(j10), cVar);
        }
    }

    @o0
    public Typeface b(Context context, d.c cVar, Resources resources, int i10) {
        d.C0165d f10 = f(cVar, i10);
        if (f10 == null) {
            return null;
        }
        Typeface e10 = x0.e(context, resources, f10.b(), f10.a(), i10);
        a(e10, cVar);
        return e10;
    }

    @o0
    public Typeface c(Context context, @o0 CancellationSignal cancellationSignal, @m0 f.c[] cVarArr, int i10) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(cVarArr, i10).d());
            try {
                Typeface d10 = d(context, inputStream);
                e1.a(inputStream);
                return d10;
            } catch (IOException unused) {
                e1.a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                e1.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            e1.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            e1.a(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e10 = e1.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!e1.d(e10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    @o0
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = e1.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!e1.c(e10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e10.getPath());
            e10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public final d.C0165d f(d.c cVar, int i10) {
        return (d.C0165d) g(cVar.a(), i10, new b());
    }

    public f.c h(f.c[] cVarArr, int i10) {
        return (f.c) g(cVarArr, i10, new a());
    }

    @o0
    public d.c i(Typeface typeface) {
        long j10 = j(typeface);
        if (j10 == 0) {
            return null;
        }
        return this.f10687a.get(Long.valueOf(j10));
    }
}
