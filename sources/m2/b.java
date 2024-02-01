package m2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import d.m0;
import d.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import m2.c;
import x0.q;

public class b extends a<Cursor> {

    /* renamed from: r  reason: collision with root package name */
    public final c<Cursor>.a f10317r = new c.a();

    /* renamed from: s  reason: collision with root package name */
    public Uri f10318s;

    /* renamed from: t  reason: collision with root package name */
    public String[] f10319t;

    /* renamed from: u  reason: collision with root package name */
    public String f10320u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f10321v;

    /* renamed from: w  reason: collision with root package name */
    public String f10322w;

    /* renamed from: x  reason: collision with root package name */
    public Cursor f10323x;

    /* renamed from: y  reason: collision with root package name */
    public x0.c f10324y;

    public b(@m0 Context context) {
        super(context);
    }

    public b(@m0 Context context, @m0 Uri uri, @o0 String[] strArr, @o0 String str, @o0 String[] strArr2, @o0 String str2) {
        super(context);
        this.f10318s = uri;
        this.f10319t = strArr;
        this.f10320u = str;
        this.f10321v = strArr2;
        this.f10322w = str2;
    }

    public void D() {
        super.D();
        synchronized (this) {
            x0.c cVar = this.f10324y;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* renamed from: N */
    public void f(Cursor cursor) {
        if (!l()) {
            Cursor cursor2 = this.f10323x;
            this.f10323x = cursor;
            if (m()) {
                super.f(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @o0
    public String[] O() {
        return this.f10319t;
    }

    @o0
    public String P() {
        return this.f10320u;
    }

    @o0
    public String[] Q() {
        return this.f10321v;
    }

    @o0
    public String R() {
        return this.f10322w;
    }

    @m0
    public Uri S() {
        return this.f10318s;
    }

    /* renamed from: T */
    public Cursor I() {
        Cursor a10;
        synchronized (this) {
            if (!H()) {
                this.f10324y = new x0.c();
            } else {
                throw new q();
            }
        }
        try {
            a10 = i0.b.a(i().getContentResolver(), this.f10318s, this.f10319t, this.f10320u, this.f10321v, this.f10322w, this.f10324y);
            if (a10 != null) {
                a10.getCount();
                a10.registerContentObserver(this.f10317r);
            }
            synchronized (this) {
                this.f10324y = null;
            }
            return a10;
        } catch (RuntimeException e10) {
            a10.close();
            throw e10;
        } catch (Throwable th2) {
            synchronized (this) {
                this.f10324y = null;
                throw th2;
            }
        }
    }

    /* renamed from: U */
    public void J(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void V(@o0 String[] strArr) {
        this.f10319t = strArr;
    }

    public void W(@o0 String str) {
        this.f10320u = str;
    }

    public void X(@o0 String[] strArr) {
        this.f10321v = strArr;
    }

    public void Y(@o0 String str) {
        this.f10322w = str;
    }

    public void Z(@m0 Uri uri) {
        this.f10318s = uri;
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f10318s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f10319t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f10320u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f10321v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f10322w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f10323x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f10332h);
    }

    public void r() {
        super.r();
        t();
        Cursor cursor = this.f10323x;
        if (cursor != null && !cursor.isClosed()) {
            this.f10323x.close();
        }
        this.f10323x = null;
    }

    public void s() {
        Cursor cursor = this.f10323x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f10323x == null) {
            h();
        }
    }

    public void t() {
        b();
    }
}
