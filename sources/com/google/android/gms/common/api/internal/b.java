package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d.g1;
import d.m0;
import d.o0;
import f8.a;
import f8.k;
import f8.u;
import j8.s;

@e8.a
public class b {

    @e8.a
    public static abstract class a<R extends u, A extends a.b> extends BasePendingResult<R> implements C0094b<R> {
        @e8.a

        /* renamed from: r  reason: collision with root package name */
        public final a.c<A> f5648r;
        @e8.a
        @o0

        /* renamed from: s  reason: collision with root package name */
        public final f8.a<?> f5649s;

        @e8.a
        @g1
        public a(@m0 BasePendingResult.a<R> aVar) {
            super(aVar);
            this.f5648r = new a.c<>();
            this.f5649s = null;
        }

        @e8.a
        @Deprecated
        public a(@m0 a.c<A> cVar, @m0 k kVar) {
            super((k) s.m(kVar, "GoogleApiClient must not be null"));
            this.f5648r = (a.c) s.l(cVar);
            this.f5649s = null;
        }

        @e8.a
        public a(@m0 f8.a<?> aVar, @m0 k kVar) {
            super((k) s.m(kVar, "GoogleApiClient must not be null"));
            s.m(aVar, "Api must not be null");
            this.f5648r = aVar.b();
            this.f5649s = aVar;
        }

        @e8.a
        public final void A(@m0 A a10) throws DeadObjectException {
            try {
                w(a10);
            } catch (DeadObjectException e10) {
                B(e10);
                throw e10;
            } catch (RemoteException e11) {
                B(e11);
            }
        }

        @e8.a
        public final void B(@m0 RemoteException remoteException) {
            a(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @e8.a
        public final void a(@m0 Status status) {
            s.b(!status.r1(), "Failed result must not be success");
            u k10 = k(status);
            o(k10);
            z(k10);
        }

        @e8.a
        public /* bridge */ /* synthetic */ void b(@m0 Object obj) {
            super.o((u) obj);
        }

        @e8.a
        public abstract void w(@m0 A a10) throws RemoteException;

        @e8.a
        @o0
        public final f8.a<?> x() {
            return this.f5649s;
        }

        @e8.a
        @m0
        public final a.c<A> y() {
            return this.f5648r;
        }

        @e8.a
        public void z(@m0 R r10) {
        }
    }

    @e8.a
    /* renamed from: com.google.android.gms.common.api.internal.b$b  reason: collision with other inner class name */
    public interface C0094b<R> {
        @e8.a
        void a(@m0 Status status);

        @e8.a
        void b(@m0 R r10);
    }
}
