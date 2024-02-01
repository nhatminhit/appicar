package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.b;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import r2.c;
import r2.l;
import r2.m;

@t0(19)
@x0({x0.a.O})
public class a {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f3043a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3044b;
    @m0

    /* renamed from: c  reason: collision with root package name */
    public final b.d f3045c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f3046d;
    @m0

    /* renamed from: e  reason: collision with root package name */
    public final File f3047e;
    @m0

    /* renamed from: f  reason: collision with root package name */
    public final String f3048f;
    @m0

    /* renamed from: g  reason: collision with root package name */
    public final String f3049g;
    @m0

    /* renamed from: h  reason: collision with root package name */
    public final String f3050h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3051i = false;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public r2.b[] f3052j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public byte[] f3053k;

    @x0({x0.a.O})
    public a(@m0 AssetManager assetManager, @m0 Executor executor, @m0 b.d dVar, @m0 String str, @m0 String str2, @m0 String str3, @m0 File file) {
        this.f3043a = assetManager;
        this.f3044b = executor;
        this.f3045c = dVar;
        this.f3048f = str;
        this.f3049g = str2;
        this.f3050h = str3;
        this.f3047e = file;
        this.f3046d = c();
    }

    @o0
    public static byte[] c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return m.f12088e;
            case 26:
                return m.f12087d;
            case 27:
                return m.f12086c;
            case 28:
            case 29:
            case 30:
                return m.f12085b;
            case 31:
            case 32:
            case 33:
                return m.f12084a;
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i10, Object obj) {
        this.f3045c.b(i10, obj);
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        if (!(i10 == 24 || i10 == 25)) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final void b() {
        if (!this.f3051i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @x0({x0.a.O})
    public boolean d() {
        int i10;
        Integer num;
        if (this.f3046d == null) {
            i10 = 3;
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        } else if (!this.f3047e.canWrite()) {
            i10 = 4;
            num = null;
        } else {
            this.f3051i = true;
            return true;
        }
        h(i10, num);
        return false;
    }

    @x0({x0.a.O})
    @m0
    public a f() {
        FileInputStream createInputStream;
        FileInputStream createInputStream2;
        b();
        if (this.f3046d == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.f3043a.openFd(this.f3049g);
            try {
                createInputStream2 = openFd.createInputStream();
                this.f3052j = l.w(createInputStream2, l.o(createInputStream2, l.f12082f), this.f3048f);
                if (createInputStream2 != null) {
                    createInputStream2.close();
                }
                openFd.close();
                r2.b[] bVarArr = this.f3052j;
                if (bVarArr != null && g()) {
                    try {
                        AssetFileDescriptor openFd2 = this.f3043a.openFd(this.f3050h);
                        try {
                            createInputStream = openFd2.createInputStream();
                            this.f3052j = l.q(createInputStream, l.o(createInputStream, l.f12083g), this.f3046d, bVarArr);
                            if (createInputStream != null) {
                                createInputStream.close();
                            }
                            openFd2.close();
                            return this;
                        } catch (Throwable th2) {
                            if (openFd2 != null) {
                                openFd2.close();
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException e10) {
                        this.f3045c.b(9, e10);
                    } catch (IOException e11) {
                        this.f3045c.b(7, e11);
                    } catch (IllegalStateException e12) {
                        this.f3052j = null;
                        this.f3045c.b(8, e12);
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                return this;
            } catch (Throwable th4) {
                if (openFd != null) {
                    openFd.close();
                }
                throw th4;
            }
        } catch (FileNotFoundException e13) {
            this.f3045c.b(6, e13);
        } catch (IOException e14) {
            this.f3045c.b(7, e14);
        } catch (IllegalStateException e15) {
            this.f3045c.b(8, e15);
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
        throw th;
        throw th;
    }

    public final void h(int i10, @o0 Object obj) {
        this.f3044b.execute(new r2.a(this, i10, obj));
    }

    @x0({x0.a.O})
    @m0
    public a i() {
        int i10;
        b.d dVar;
        ByteArrayOutputStream byteArrayOutputStream;
        r2.b[] bVarArr = this.f3052j;
        byte[] bArr = this.f3046d;
        if (!(bVarArr == null || bArr == null)) {
            b();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                l.E(byteArrayOutputStream, bArr);
                if (!l.B(byteArrayOutputStream, bArr, bVarArr)) {
                    this.f3045c.b(5, (Object) null);
                    this.f3052j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f3053k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f3052j = null;
            } catch (IOException e10) {
                e = e10;
                dVar = this.f3045c;
                i10 = 7;
            } catch (IllegalStateException e11) {
                e = e11;
                dVar = this.f3045c;
                i10 = 8;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return this;
        dVar.b(i10, e);
        this.f3052j = null;
        return this;
        throw th;
    }

    @x0({x0.a.O})
    public boolean j() {
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f3053k;
        if (bArr == null) {
            return false;
        }
        b();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.f3047e);
                c.l(byteArrayInputStream, fileOutputStream);
                h(1, (Object) null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f3053k = null;
                this.f3052j = null;
                return true;
            } catch (Throwable th2) {
                byteArrayInputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            h(6, e10);
            this.f3053k = null;
            this.f3052j = null;
            return false;
        } catch (IOException e11) {
            try {
                h(7, e11);
                this.f3053k = null;
                this.f3052j = null;
                return false;
            } catch (Throwable th3) {
                this.f3053k = null;
                this.f3052j = null;
                throw th3;
            }
        } catch (Throwable th4) {
            th2.addSuppressed(th4);
        }
        throw th;
    }
}
