package r;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.f1;
import d.h0;
import d.m0;
import d.o0;
import e1.m;
import java.util.concurrent.ArrayBlockingQueue;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12044e = "AsyncLayoutInflater";

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f12045a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f12046b;

    /* renamed from: c  reason: collision with root package name */
    public d f12047c;

    /* renamed from: d  reason: collision with root package name */
    public Handler.Callback f12048d = new C0205a();

    /* renamed from: r.a$a  reason: collision with other inner class name */
    public class C0205a implements Handler.Callback {
        public C0205a() {
        }

        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f12053d == null) {
                cVar.f12053d = a.this.f12045a.inflate(cVar.f12052c, cVar.f12051b, false);
            }
            cVar.f12054e.a(cVar.f12053d, cVar.f12052c, cVar.f12051b);
            a.this.f12047c.d(cVar);
            return true;
        }
    }

    public static class b extends LayoutInflater {

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f12049a = {"android.widget.", "android.webkit.", "android.app."};

        public b(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = f12049a;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                try {
                    View createView = createView(str, strArr[i10], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i10++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public a f12050a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f12051b;

        /* renamed from: c  reason: collision with root package name */
        public int f12052c;

        /* renamed from: d  reason: collision with root package name */
        public View f12053d;

        /* renamed from: e  reason: collision with root package name */
        public e f12054e;
    }

    public static class d extends Thread {
        public static final d Q;
        public ArrayBlockingQueue<c> O = new ArrayBlockingQueue<>(10);
        public m.c<c> P = new m.c<>(10);

        static {
            d dVar = new d();
            Q = dVar;
            dVar.start();
        }

        public static d b() {
            return Q;
        }

        public void a(c cVar) {
            try {
                this.O.put(cVar);
            } catch (InterruptedException e10) {
                throw new RuntimeException("Failed to enqueue async inflate request", e10);
            }
        }

        public c c() {
            c b10 = this.P.b();
            return b10 == null ? new c() : b10;
        }

        public void d(c cVar) {
            cVar.f12054e = null;
            cVar.f12050a = null;
            cVar.f12051b = null;
            cVar.f12052c = 0;
            cVar.f12053d = null;
            this.P.a(cVar);
        }

        public void e() {
            try {
                c take = this.O.take();
                try {
                    take.f12053d = take.f12050a.f12045a.inflate(take.f12052c, take.f12051b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.f12050a.f12046b, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        public void run() {
            while (true) {
                e();
            }
        }
    }

    public interface e {
        void a(@m0 View view, @h0 int i10, @o0 ViewGroup viewGroup);
    }

    public a(@m0 Context context) {
        this.f12045a = new b(context);
        this.f12046b = new Handler(this.f12048d);
        this.f12047c = d.b();
    }

    @f1
    public void a(@h0 int i10, @o0 ViewGroup viewGroup, @m0 e eVar) {
        if (eVar != null) {
            c c10 = this.f12047c.c();
            c10.f12050a = this;
            c10.f12052c = i10;
            c10.f12051b = viewGroup;
            c10.f12054e = eVar;
            this.f12047c.a(c10);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
