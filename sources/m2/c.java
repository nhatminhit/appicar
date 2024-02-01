package m2;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import d.j0;
import d.m0;
import d.o0;
import e1.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f10325a;

    /* renamed from: b  reason: collision with root package name */
    public C0180c<D> f10326b;

    /* renamed from: c  reason: collision with root package name */
    public b<D> f10327c;

    /* renamed from: d  reason: collision with root package name */
    public Context f10328d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10329e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10330f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10331g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10332h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10333i = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            c.this.p();
        }
    }

    public interface b<D> {
        void a(@m0 c<D> cVar);
    }

    /* renamed from: m2.c$c  reason: collision with other inner class name */
    public interface C0180c<D> {
        void a(@m0 c<D> cVar, @o0 D d10);
    }

    public c(@m0 Context context) {
        this.f10328d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z10 = this.f10332h;
        this.f10332h = false;
        this.f10333i |= z10;
        return z10;
    }

    @j0
    public void B(@m0 C0180c<D> cVar) {
        C0180c<D> cVar2 = this.f10326b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar2 == cVar) {
            this.f10326b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @j0
    public void C(@m0 b<D> bVar) {
        b<D> bVar2 = this.f10327c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f10327c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @j0
    public void a() {
        this.f10330f = true;
        n();
    }

    @j0
    public boolean b() {
        return o();
    }

    public void c() {
        this.f10333i = false;
    }

    @m0
    public String d(@o0 D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        d.a(d10, sb2);
        sb2.append(p7.a.f11639j);
        return sb2.toString();
    }

    @j0
    public void e() {
        b<D> bVar = this.f10327c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @j0
    public void f(@o0 D d10) {
        C0180c<D> cVar = this.f10326b;
        if (cVar != null) {
            cVar.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f10325a);
        printWriter.print(" mListener=");
        printWriter.println(this.f10326b);
        if (this.f10329e || this.f10332h || this.f10333i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f10329e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f10332h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f10333i);
        }
        if (this.f10330f || this.f10331g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f10330f);
            printWriter.print(" mReset=");
            printWriter.println(this.f10331g);
        }
    }

    @j0
    public void h() {
        q();
    }

    @m0
    public Context i() {
        return this.f10328d;
    }

    public int j() {
        return this.f10325a;
    }

    public boolean k() {
        return this.f10330f;
    }

    public boolean l() {
        return this.f10331g;
    }

    public boolean m() {
        return this.f10329e;
    }

    @j0
    public void n() {
    }

    @j0
    public boolean o() {
        return false;
    }

    @j0
    public void p() {
        if (this.f10329e) {
            h();
        } else {
            this.f10332h = true;
        }
    }

    @j0
    public void q() {
    }

    @j0
    public void r() {
    }

    @j0
    public void s() {
    }

    @j0
    public void t() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        d.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f10325a);
        sb2.append(p7.a.f11639j);
        return sb2.toString();
    }

    @j0
    public void u(int i10, @m0 C0180c<D> cVar) {
        if (this.f10326b == null) {
            this.f10326b = cVar;
            this.f10325a = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @j0
    public void v(@m0 b<D> bVar) {
        if (this.f10327c == null) {
            this.f10327c = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @j0
    public void w() {
        r();
        this.f10331g = true;
        this.f10329e = false;
        this.f10330f = false;
        this.f10332h = false;
        this.f10333i = false;
    }

    public void x() {
        if (this.f10333i) {
            p();
        }
    }

    @j0
    public final void y() {
        this.f10329e = true;
        this.f10331g = false;
        this.f10330f = false;
        s();
    }

    @j0
    public void z() {
        this.f10329e = false;
        t();
    }
}
