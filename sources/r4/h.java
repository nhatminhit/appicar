package r4;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import r4.k;

public class h<R> implements g<R> {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f12109a;

    /* renamed from: b  reason: collision with root package name */
    public f<R> f12110b;

    public static class a implements k.a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f12111a;

        public a(Animation animation) {
            this.f12111a = animation;
        }

        public Animation a(Context context) {
            return this.f12111a;
        }
    }

    public static class b implements k.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12112a;

        public b(int i10) {
            this.f12112a = i10;
        }

        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f12112a);
        }
    }

    public h(int i10) {
        this((k.a) new b(i10));
    }

    public h(Animation animation) {
        this((k.a) new a(animation));
    }

    public h(k.a aVar) {
        this.f12109a = aVar;
    }

    public f<R> a(v3.a aVar, boolean z10) {
        if (aVar == v3.a.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f12110b == null) {
            this.f12110b = new k(this.f12109a);
        }
        return this.f12110b;
    }
}
