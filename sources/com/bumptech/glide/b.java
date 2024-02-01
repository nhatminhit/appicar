package com.bumptech.glide;

import a4.j;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import c4.d;
import com.bumptech.glide.load.ImageHeaderParser;
import d.g1;
import d.m0;
import d.o0;
import d.z;
import d4.a;
import d4.b;
import d4.c;
import d4.d;
import d4.e;
import d4.f;
import d4.k;
import d4.s;
import d4.u;
import d4.v;
import d4.w;
import d4.x;
import e4.b;
import e4.c;
import e4.d;
import e4.e;
import e4.f;
import e4.i;
import g4.a0;
import g4.c0;
import g4.f0;
import g4.h0;
import g4.k0;
import g4.o;
import g4.q;
import g4.t;
import g4.y;
import h4.a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m4.d;
import m4.l;
import p4.g;
import p4.h;
import q4.p;
import w3.k;
import w3.m;
import y3.k;
import z3.e;

public class b implements ComponentCallbacks2 {

    /* renamed from: a0  reason: collision with root package name */
    public static final String f4922a0 = "image_manager_disk_cache";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f4923b0 = "Glide";

    /* renamed from: c0  reason: collision with root package name */
    public static volatile b f4924c0;

    /* renamed from: d0  reason: collision with root package name */
    public static volatile boolean f4925d0;
    public final k O;
    public final e P;
    public final j Q;
    public final d R;
    public final j S;
    public final z3.b T;
    public final l U;
    public final d V;
    public final List<l> W = new ArrayList();
    public final a X;
    public f Y = f.NORMAL;
    @o0
    @z("this")
    public c4.b Z;

    public interface a {
        @m0
        h build();
    }

    public b(@m0 Context context, @m0 k kVar, @m0 j jVar, @m0 e eVar, @m0 z3.b bVar, @m0 l lVar, @m0 d dVar, int i10, @m0 a aVar, @m0 Map<Class<?>, m<?, ?>> map, @m0 List<g<Object>> list, boolean z10, boolean z11) {
        v3.k kVar2;
        v3.k kVar3;
        Context context2 = context;
        e eVar2 = eVar;
        z3.b bVar2 = bVar;
        Class<u3.a> cls = u3.a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.O = kVar;
        this.P = eVar2;
        this.T = bVar2;
        this.Q = jVar;
        this.U = lVar;
        this.V = dVar;
        this.X = aVar;
        Resources resources = context.getResources();
        j jVar2 = new j();
        this.S = jVar2;
        jVar2.t(new o());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            jVar2.t(new t());
        }
        List<ImageHeaderParser> g10 = jVar2.g();
        k4.a aVar2 = new k4.a(context2, g10, eVar2, bVar2);
        v3.k<ParcelFileDescriptor, Bitmap> h10 = k0.h(eVar);
        q qVar = new q(jVar2.g(), resources.getDisplayMetrics(), eVar2, bVar2);
        if (!z11 || i11 < 28) {
            kVar2 = new g4.j(qVar);
            kVar3 = new f0(qVar, bVar2);
        } else {
            kVar3 = new y();
            kVar2 = new g4.k();
        }
        Class<byte[]> cls5 = cls4;
        i4.e eVar3 = new i4.e(context2);
        int i12 = i11;
        s.c cVar = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        Class<String> cls6 = cls2;
        s.b bVar3 = new s.b(resources);
        s.d dVar3 = dVar2;
        s.a aVar3 = new s.a(resources);
        g4.e eVar4 = new g4.e(bVar2);
        Class<Integer> cls7 = cls3;
        l4.a aVar4 = new l4.a();
        l4.d dVar4 = new l4.d();
        ContentResolver contentResolver = context.getContentResolver();
        s.b bVar4 = bVar3;
        s.c cVar2 = cVar;
        i4.e eVar5 = eVar3;
        jVar2.c(ByteBuffer.class, new c()).c(InputStream.class, new d4.t(bVar2)).e(j.f4970l, ByteBuffer.class, Bitmap.class, kVar2).e(j.f4970l, InputStream.class, Bitmap.class, kVar3);
        if (m.c()) {
            jVar2.e(j.f4970l, ParcelFileDescriptor.class, Bitmap.class, new a0(qVar));
        }
        i4.e eVar6 = eVar5;
        jVar2.e(j.f4970l, ParcelFileDescriptor.class, Bitmap.class, h10).e(j.f4970l, AssetFileDescriptor.class, Bitmap.class, k0.c(eVar)).a(Bitmap.class, Bitmap.class, v.a.c()).e(j.f4970l, Bitmap.class, Bitmap.class, new h0()).d(Bitmap.class, eVar4).e(j.f4971m, ByteBuffer.class, BitmapDrawable.class, new g4.a(resources, kVar2)).e(j.f4971m, InputStream.class, BitmapDrawable.class, new g4.a(resources, kVar3)).e(j.f4971m, ParcelFileDescriptor.class, BitmapDrawable.class, new g4.a(resources, h10)).d(BitmapDrawable.class, new g4.b(eVar2, eVar4)).e(j.f4969k, InputStream.class, k4.c.class, new k4.j(g10, aVar2, bVar2)).e(j.f4969k, ByteBuffer.class, k4.c.class, aVar2).d(k4.c.class, new k4.d()).a(cls, cls, v.a.c()).e(j.f4970l, cls, Bitmap.class, new k4.h(eVar2)).b(Uri.class, Drawable.class, eVar6).b(Uri.class, Bitmap.class, new c0(eVar6, eVar2)).x(new a.C0145a()).a(File.class, ByteBuffer.class, new d.b()).a(File.class, InputStream.class, new f.e()).b(File.class, File.class, new j4.a()).a(File.class, ParcelFileDescriptor.class, new f.b()).a(File.class, File.class, v.a.c()).x(new k.a(bVar2));
        if (m.c()) {
            jVar2.x(new m.a());
        }
        Class cls8 = Integer.TYPE;
        s.c cVar3 = cVar2;
        s.b bVar5 = bVar4;
        Class<Integer> cls9 = cls7;
        s.d dVar5 = dVar3;
        s.a aVar5 = aVar3;
        Class<String> cls10 = cls6;
        Context context3 = context;
        jVar2.a(cls8, InputStream.class, cVar3).a(cls8, ParcelFileDescriptor.class, bVar5).a(cls9, InputStream.class, cVar3).a(cls9, ParcelFileDescriptor.class, bVar5).a(cls9, Uri.class, dVar5).a(cls8, AssetFileDescriptor.class, aVar5).a(cls9, AssetFileDescriptor.class, aVar5).a(cls8, Uri.class, dVar5).a(cls10, InputStream.class, new e.c()).a(Uri.class, InputStream.class, new e.c()).a(cls10, InputStream.class, new u.c()).a(cls10, ParcelFileDescriptor.class, new u.b()).a(cls10, AssetFileDescriptor.class, new u.a()).a(Uri.class, InputStream.class, new c.a()).a(Uri.class, InputStream.class, new a.c(context.getAssets())).a(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).a(Uri.class, InputStream.class, new d.a(context3)).a(Uri.class, InputStream.class, new e.a(context3));
        if (i12 >= 29) {
            jVar2.a(Uri.class, InputStream.class, new f.c(context3));
            jVar2.a(Uri.class, ParcelFileDescriptor.class, new f.b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls11 = cls5;
        l4.a aVar6 = aVar4;
        l4.d dVar6 = dVar4;
        jVar2.a(Uri.class, InputStream.class, new w.d(contentResolver2)).a(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver2)).a(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver2)).a(Uri.class, InputStream.class, new x.a()).a(URL.class, InputStream.class, new i.a()).a(Uri.class, File.class, new k.a(context3)).a(d4.g.class, InputStream.class, new b.a()).a(cls11, ByteBuffer.class, new b.a()).a(cls11, InputStream.class, new b.d()).a(Uri.class, Uri.class, v.a.c()).a(Drawable.class, Drawable.class, v.a.c()).b(Drawable.class, Drawable.class, new i4.f()).u(Bitmap.class, BitmapDrawable.class, new l4.b(resources)).u(Bitmap.class, cls11, aVar6).u(Drawable.class, cls11, new l4.c(eVar2, aVar6, dVar6)).u(k4.c.class, cls11, dVar6);
        v3.k<ByteBuffer, Bitmap> d10 = k0.d(eVar);
        jVar2.b(ByteBuffer.class, Bitmap.class, d10);
        jVar2.b(ByteBuffer.class, BitmapDrawable.class, new g4.a(resources, d10));
        this.R = new d(context, bVar, jVar2, new q4.k(), aVar, map, list, kVar, z10, i10);
    }

    @m0
    public static l B(@m0 Activity activity) {
        return o(activity).i(activity);
    }

    @Deprecated
    @m0
    public static l C(@m0 Fragment fragment) {
        return o(fragment.getActivity()).j(fragment);
    }

    @m0
    public static l D(@m0 Context context) {
        return o(context).k(context);
    }

    @m0
    public static l E(@m0 View view) {
        return o(view.getContext()).l(view);
    }

    @m0
    public static l F(@m0 androidx.fragment.app.Fragment fragment) {
        return o(fragment.getContext()).m(fragment);
    }

    @m0
    public static l G(@m0 FragmentActivity fragmentActivity) {
        return o(fragmentActivity).n(fragmentActivity);
    }

    @z("Glide.class")
    public static void a(@m0 Context context, @o0 GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f4925d0) {
            f4925d0 = true;
            r(context, generatedAppGlideModule);
            f4925d0 = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @m0
    public static b d(@m0 Context context) {
        if (f4924c0 == null) {
            GeneratedAppGlideModule e10 = e(context.getApplicationContext());
            synchronized (b.class) {
                if (f4924c0 == null) {
                    a(context, e10);
                }
            }
        }
        return f4924c0;
    }

    @o0
    public static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            y(e10);
        }
        return null;
    }

    @o0
    public static File k(@m0 Context context) {
        return l(context, "image_manager_disk_cache");
    }

    @o0
    public static File l(@m0 Context context, @m0 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        Log.isLoggable("Glide", 6);
        return null;
    }

    @m0
    public static l o(@o0 Context context) {
        t4.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).n();
    }

    @g1
    public static void p(@m0 Context context, @m0 c cVar) {
        GeneratedAppGlideModule e10 = e(context);
        synchronized (b.class) {
            if (f4924c0 != null) {
                x();
            }
            s(context, cVar, e10);
        }
    }

    @g1
    @Deprecated
    public static synchronized void q(b bVar) {
        synchronized (b.class) {
            if (f4924c0 != null) {
                x();
            }
            f4924c0 = bVar;
        }
    }

    @z("Glide.class")
    public static void r(@m0 Context context, @o0 GeneratedAppGlideModule generatedAppGlideModule) {
        s(context, new c(), generatedAppGlideModule);
    }

    @z("Glide.class")
    public static void s(@m0 Context context, @m0 c cVar, @o0 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<n4.c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new n4.e(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d10 = generatedAppGlideModule.d();
            Iterator<n4.c> it = emptyList.iterator();
            while (it.hasNext()) {
                n4.c next = it.next();
                if (d10.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("AppGlideModule excludes manifest GlideModule: ");
                        sb2.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (n4.c cVar2 : emptyList) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Discovered GlideModule from manifest: ");
                sb3.append(cVar2.getClass());
            }
        }
        cVar.t(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        for (n4.c a10 : emptyList) {
            a10.a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, cVar);
        }
        b b10 = cVar.b(applicationContext);
        for (n4.c next2 : emptyList) {
            try {
                next2.b(applicationContext, b10, b10.S);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e10);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, b10, b10.S);
        }
        applicationContext.registerComponentCallbacks(b10);
        f4924c0 = b10;
    }

    @g1
    public static synchronized void x() {
        synchronized (b.class) {
            if (f4924c0 != null) {
                f4924c0.i().getApplicationContext().unregisterComponentCallbacks(f4924c0);
                f4924c0.O.m();
            }
            f4924c0 = null;
        }
    }

    public static void y(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public void A(l lVar) {
        synchronized (this.W) {
            if (this.W.contains(lVar)) {
                this.W.remove(lVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void b() {
        t4.m.a();
        this.O.e();
    }

    public void c() {
        t4.m.b();
        this.Q.b();
        this.P.b();
        this.T.b();
    }

    @m0
    public z3.b f() {
        return this.T;
    }

    @m0
    public z3.e g() {
        return this.P;
    }

    public m4.d h() {
        return this.V;
    }

    @m0
    public Context i() {
        return this.R.getBaseContext();
    }

    @m0
    public d j() {
        return this.R;
    }

    @m0
    public j m() {
        return this.S;
    }

    @m0
    public l n() {
        return this.U;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        c();
    }

    public void onTrimMemory(int i10) {
        z(i10);
    }

    public synchronized void t(@m0 d.a... aVarArr) {
        if (this.Z == null) {
            this.Z = new c4.b(this.Q, this.P, (v3.b) this.X.build().R().c(q.f7992g));
        }
        this.Z.c(aVarArr);
    }

    public void u(l lVar) {
        synchronized (this.W) {
            if (!this.W.contains(lVar)) {
                this.W.add(lVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public boolean v(@m0 p<?> pVar) {
        synchronized (this.W) {
            for (l b02 : this.W) {
                if (b02.b0(pVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @m0
    public f w(@m0 f fVar) {
        t4.m.b();
        this.Q.c(fVar.a());
        this.P.c(fVar.a());
        f fVar2 = this.Y;
        this.Y = fVar;
        return fVar2;
    }

    public void z(int i10) {
        t4.m.b();
        for (l onTrimMemory : this.W) {
            onTrimMemory.onTrimMemory(i10);
        }
        this.Q.a(i10);
        this.P.a(i10);
        this.T.a(i10);
    }
}
