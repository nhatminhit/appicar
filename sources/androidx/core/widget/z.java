package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import fh.h;
import kotlin.Metadata;
import we.l;
import we.r;
import xe.l0;
import xe.n0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\bø\u0001\u0000\u001av\u0010\u000f\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u0001H\bø\u0001\u0000\u001a7\u0010\u0012\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\bø\u0001\u0000\u001a\u0002\u0010\u0016\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0017"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lzd/v0;", "name", "text", "", "start", "count", "after", "Lzd/u2;", "action", "Landroid/text/TextWatcher;", "d", "before", "e", "Lkotlin/Function1;", "Landroid/text/Editable;", "c", "beforeTextChanged", "onTextChanged", "afterTextChanged", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class z {

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends n0 implements r<CharSequence, Integer, Integer, Integer, u2> {
        public static final a P = new a();

        public a() {
            super(4);
        }

        public /* bridge */ /* synthetic */ Object M(Object obj, Object obj2, Object obj3, Object obj4) {
            c((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return u2.f25116a;
        }

        public final void c(@h CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends n0 implements r<CharSequence, Integer, Integer, Integer, u2> {
        public static final b P = new b();

        public b() {
            super(4);
        }

        public /* bridge */ /* synthetic */ Object M(Object obj, Object obj2, Object obj3, Object obj4) {
            c((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return u2.f25116a;
        }

        public final void c(@h CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/text/Editable;", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends n0 implements l<Editable, u2> {
        public static final c P = new c();

        public c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Editable) obj);
            return u2.f25116a;
        }

        public final void c(@h Editable editable) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/z$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lzd/u2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements TextWatcher {
        public final /* synthetic */ l<Editable, u2> O;
        public final /* synthetic */ r<CharSequence, Integer, Integer, Integer, u2> P;
        public final /* synthetic */ r<CharSequence, Integer, Integer, Integer, u2> Q;

        public d(l<? super Editable, u2> lVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, u2> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, u2> rVar2) {
            this.O = lVar;
            this.P = rVar;
            this.Q = rVar2;
        }

        public void afterTextChanged(@h Editable editable) {
            this.O.A(editable);
        }

        public void beforeTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
            this.P.M(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        public void onTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
            this.Q.M(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/z$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lzd/u2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements TextWatcher {
        public final /* synthetic */ l O;

        public e(l lVar) {
            this.O = lVar;
        }

        public void afterTextChanged(@h Editable editable) {
            this.O.A(editable);
        }

        public void beforeTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/z$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lzd/u2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class f implements TextWatcher {
        public final /* synthetic */ r O;

        public f(r rVar) {
            this.O = rVar;
        }

        public void afterTextChanged(@h Editable editable) {
        }

        public void beforeTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
            this.O.M(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        public void onTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/z$d", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lzd/u2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class g implements TextWatcher {
        public final /* synthetic */ r O;

        public g(r rVar) {
            this.O = rVar;
        }

        public void afterTextChanged(@h Editable editable) {
        }

        public void beforeTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(@h CharSequence charSequence, int i10, int i11, int i12) {
            this.O.M(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @fh.g
    public static final TextWatcher a(@fh.g TextView textView, @fh.g r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, u2> rVar, @fh.g r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, u2> rVar2, @fh.g l<? super Editable, u2> lVar) {
        l0.p(textView, "<this>");
        l0.p(rVar, "beforeTextChanged");
        l0.p(rVar2, "onTextChanged");
        l0.p(lVar, "afterTextChanged");
        d dVar = new d(lVar, rVar, rVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, r rVar, r rVar2, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = a.P;
        }
        if ((i10 & 2) != 0) {
            rVar2 = b.P;
        }
        if ((i10 & 4) != 0) {
            lVar = c.P;
        }
        l0.p(textView, "<this>");
        l0.p(rVar, "beforeTextChanged");
        l0.p(rVar2, "onTextChanged");
        l0.p(lVar, "afterTextChanged");
        d dVar = new d(lVar, rVar, rVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @fh.g
    public static final TextWatcher c(@fh.g TextView textView, @fh.g l<? super Editable, u2> lVar) {
        l0.p(textView, "<this>");
        l0.p(lVar, "action");
        e eVar = new e(lVar);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @fh.g
    public static final TextWatcher d(@fh.g TextView textView, @fh.g r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, u2> rVar) {
        l0.p(textView, "<this>");
        l0.p(rVar, "action");
        f fVar = new f(rVar);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @fh.g
    public static final TextWatcher e(@fh.g TextView textView, @fh.g r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, u2> rVar) {
        l0.p(textView, "<this>");
        l0.p(rVar, "action");
        g gVar = new g(rVar);
        textView.addTextChangedListener(gVar);
        return gVar;
    }
}
