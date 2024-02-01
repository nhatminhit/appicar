package g0;

import android.animation.Animator;
import d.t0;
import kotlin.Metadata;
import xe.l0;
import xe.n0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\r\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a5\u0010\u000e\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001a¤\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u001aZ\u0010\u0016\u001a\u00020\f*\u00020\u00002#\b\u0006\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0017"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lzd/v0;", "name", "animator", "Lzd/u2;", "action", "Landroid/animation/Animator$AnimatorListener;", "f", "j", "e", "h", "Landroid/animation/Animator$AnimatorPauseListener;", "i", "g", "onEnd", "onStart", "onCancel", "onRepeat", "a", "onResume", "onPause", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class a {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: g0.a$a  reason: collision with other inner class name */
    public static final class C0131a extends n0 implements we.l<Animator, u2> {
        public static final C0131a P = new C0131a();

        public C0131a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Animator) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Animator animator) {
            l0.p(animator, "it");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends n0 implements we.l<Animator, u2> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Animator) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Animator animator) {
            l0.p(animator, "it");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends n0 implements we.l<Animator, u2> {
        public static final c P = new c();

        public c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Animator) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Animator animator) {
            l0.p(animator, "it");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends n0 implements we.l<Animator, u2> {
        public static final d P = new d();

        public d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Animator) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Animator animator) {
            l0.p(animator, "it");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"g0/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l<Animator, u2> f7512a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ we.l<Animator, u2> f7513b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ we.l<Animator, u2> f7514c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ we.l<Animator, u2> f7515d;

        public e(we.l<? super Animator, u2> lVar, we.l<? super Animator, u2> lVar2, we.l<? super Animator, u2> lVar3, we.l<? super Animator, u2> lVar4) {
            this.f7512a = lVar;
            this.f7513b = lVar2;
            this.f7514c = lVar3;
            this.f7515d = lVar4;
        }

        public void onAnimationCancel(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7514c.A(animator);
        }

        public void onAnimationEnd(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7513b.A(animator);
        }

        public void onAnimationRepeat(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7512a.A(animator);
        }

        public void onAnimationStart(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7515d.A(animator);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends n0 implements we.l<Animator, u2> {
        public static final f P = new f();

        public f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Animator) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Animator animator) {
            l0.p(animator, "it");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends n0 implements we.l<Animator, u2> {
        public static final g P = new g();

        public g() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Animator) obj);
            return u2.f25116a;
        }

        public final void c(@fh.g Animator animator) {
            l0.p(animator, "it");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"g0/a$h", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class h implements Animator.AnimatorPauseListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l<Animator, u2> f7516a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ we.l<Animator, u2> f7517b;

        public h(we.l<? super Animator, u2> lVar, we.l<? super Animator, u2> lVar2) {
            this.f7516a = lVar;
            this.f7517b = lVar2;
        }

        public void onAnimationPause(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7516a.A(animator);
        }

        public void onAnimationResume(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7517b.A(animator);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"g0/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class i implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l f7518a;

        public i(we.l lVar) {
            this.f7518a = lVar;
        }

        public void onAnimationCancel(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7518a.A(animator);
        }

        public void onAnimationEnd(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationRepeat(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationStart(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"g0/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l f7519a;

        public j(we.l lVar) {
            this.f7519a = lVar;
        }

        public void onAnimationCancel(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationEnd(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7519a.A(animator);
        }

        public void onAnimationRepeat(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationStart(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"g0/a$h", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class k implements Animator.AnimatorPauseListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l f7520a;

        public k(we.l lVar) {
            this.f7520a = lVar;
        }

        public void onAnimationPause(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7520a.A(animator);
        }

        public void onAnimationResume(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"g0/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l f7521a;

        public l(we.l lVar) {
            this.f7521a = lVar;
        }

        public void onAnimationCancel(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationEnd(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationRepeat(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7521a.A(animator);
        }

        public void onAnimationStart(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"g0/a$h", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class m implements Animator.AnimatorPauseListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l f7522a;

        public m(we.l lVar) {
            this.f7522a = lVar;
        }

        public void onAnimationPause(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationResume(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7522a.A(animator);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"g0/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lzd/u2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class n implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ we.l f7523a;

        public n(we.l lVar) {
            this.f7523a = lVar;
        }

        public void onAnimationCancel(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationEnd(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationRepeat(@fh.g Animator animator) {
            l0.p(animator, "animator");
        }

        public void onAnimationStart(@fh.g Animator animator) {
            l0.p(animator, "animator");
            this.f7523a.A(animator);
        }
    }

    @fh.g
    public static final Animator.AnimatorListener a(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar, @fh.g we.l<? super Animator, u2> lVar2, @fh.g we.l<? super Animator, u2> lVar3, @fh.g we.l<? super Animator, u2> lVar4) {
        l0.p(animator, "<this>");
        l0.p(lVar, "onEnd");
        l0.p(lVar2, "onStart");
        l0.p(lVar3, "onCancel");
        l0.p(lVar4, "onRepeat");
        e eVar = new e(lVar4, lVar, lVar3, lVar2);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, we.l lVar, we.l lVar2, we.l lVar3, we.l lVar4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C0131a.P;
        }
        if ((i10 & 2) != 0) {
            lVar2 = b.P;
        }
        if ((i10 & 4) != 0) {
            lVar3 = c.P;
        }
        if ((i10 & 8) != 0) {
            lVar4 = d.P;
        }
        l0.p(animator, "<this>");
        l0.p(lVar, "onEnd");
        l0.p(lVar2, "onStart");
        l0.p(lVar3, "onCancel");
        l0.p(lVar4, "onRepeat");
        e eVar = new e(lVar4, lVar, lVar3, lVar2);
        animator.addListener(eVar);
        return eVar;
    }

    @t0(19)
    @fh.g
    public static final Animator.AnimatorPauseListener c(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar, @fh.g we.l<? super Animator, u2> lVar2) {
        l0.p(animator, "<this>");
        l0.p(lVar, "onResume");
        l0.p(lVar2, "onPause");
        h hVar = new h(lVar2, lVar);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, we.l lVar, we.l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = f.P;
        }
        if ((i10 & 2) != 0) {
            lVar2 = g.P;
        }
        l0.p(animator, "<this>");
        l0.p(lVar, "onResume");
        l0.p(lVar2, "onPause");
        h hVar = new h(lVar2, lVar);
        animator.addPauseListener(hVar);
        return hVar;
    }

    @fh.g
    public static final Animator.AnimatorListener e(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, "action");
        i iVar = new i(lVar);
        animator.addListener(iVar);
        return iVar;
    }

    @fh.g
    public static final Animator.AnimatorListener f(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, "action");
        j jVar = new j(lVar);
        animator.addListener(jVar);
        return jVar;
    }

    @t0(19)
    @fh.g
    public static final Animator.AnimatorPauseListener g(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, "action");
        k kVar = new k(lVar);
        animator.addPauseListener(kVar);
        return kVar;
    }

    @fh.g
    public static final Animator.AnimatorListener h(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, "action");
        l lVar2 = new l(lVar);
        animator.addListener(lVar2);
        return lVar2;
    }

    @t0(19)
    @fh.g
    public static final Animator.AnimatorPauseListener i(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, "action");
        m mVar = new m(lVar);
        animator.addPauseListener(mVar);
        return mVar;
    }

    @fh.g
    public static final Animator.AnimatorListener j(@fh.g Animator animator, @fh.g we.l<? super Animator, u2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, "action");
        n nVar = new n(lVar);
        animator.addListener(nVar);
        return nVar;
    }
}
