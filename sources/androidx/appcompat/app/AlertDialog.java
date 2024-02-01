package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import d.a1;
import d.b1;
import d.e;
import d.f;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;

public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public static final int R = 0;
    public static final int S = 1;
    public final AlertController Q;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.f f718a;

        /* renamed from: b  reason: collision with root package name */
        public final int f719b;

        public a(@m0 Context context) {
            this(context, AlertDialog.h(context, 0));
        }

        public a(@m0 Context context, @b1 int i10) {
            this.f718a = new AlertController.f(new ContextThemeWrapper(context, AlertDialog.h(context, i10)));
            this.f719b = i10;
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.f718a.f710u = onKeyListener;
            return this;
        }

        public a B(@a1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f698i = fVar.f690a.getText(i10);
            this.f718a.f700k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f698i = charSequence;
            fVar.f700k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.f718a.f699j = drawable;
            return this;
        }

        @x0({x0.a.Q})
        public a E(boolean z10) {
            this.f718a.Q = z10;
            return this;
        }

        public a F(@e int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f711v = fVar.f690a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f718a;
            fVar2.f713x = onClickListener;
            fVar2.I = i11;
            fVar2.H = true;
            return this;
        }

        public a G(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.K = cursor;
            fVar.f713x = onClickListener;
            fVar.I = i10;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f712w = listAdapter;
            fVar.f713x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f711v = charSequenceArr;
            fVar.f713x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a J(@a1 int i10) {
            AlertController.f fVar = this.f718a;
            fVar.f695f = fVar.f690a.getText(i10);
            return this;
        }

        public a K(@o0 CharSequence charSequence) {
            this.f718a.f695f = charSequence;
            return this;
        }

        public a L(int i10) {
            AlertController.f fVar = this.f718a;
            fVar.f715z = null;
            fVar.f714y = i10;
            fVar.E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.f718a;
            fVar.f715z = view;
            fVar.f714y = 0;
            fVar.E = false;
            return this;
        }

        @x0({x0.a.Q})
        @Deprecated
        public a N(View view, int i10, int i11, int i12, int i13) {
            AlertController.f fVar = this.f718a;
            fVar.f715z = view;
            fVar.f714y = 0;
            fVar.E = true;
            fVar.A = i10;
            fVar.B = i11;
            fVar.C = i12;
            fVar.D = i13;
            return this;
        }

        public AlertDialog O() {
            AlertDialog a10 = a();
            a10.show();
            return a10;
        }

        @m0
        public AlertDialog a() {
            AlertDialog alertDialog = new AlertDialog(this.f718a.f690a, this.f719b);
            this.f718a.a(alertDialog.Q);
            alertDialog.setCancelable(this.f718a.f707r);
            if (this.f718a.f707r) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f718a.f708s);
            alertDialog.setOnDismissListener(this.f718a.f709t);
            DialogInterface.OnKeyListener onKeyListener = this.f718a.f710u;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @m0
        public Context b() {
            return this.f718a.f690a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f712w = listAdapter;
            fVar.f713x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f718a.f707r = z10;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f718a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f713x = onClickListener;
            return this;
        }

        public a f(@o0 View view) {
            this.f718a.f696g = view;
            return this;
        }

        public a g(@u int i10) {
            this.f718a.f692c = i10;
            return this;
        }

        public a h(@o0 Drawable drawable) {
            this.f718a.f693d = drawable;
            return this;
        }

        public a i(@f int i10) {
            TypedValue typedValue = new TypedValue();
            this.f718a.f690a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f718a.f692c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z10) {
            this.f718a.N = z10;
            return this;
        }

        public a k(@e int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f711v = fVar.f690a.getResources().getTextArray(i10);
            this.f718a.f713x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f711v = charSequenceArr;
            fVar.f713x = onClickListener;
            return this;
        }

        public a m(@a1 int i10) {
            AlertController.f fVar = this.f718a;
            fVar.f697h = fVar.f690a.getText(i10);
            return this;
        }

        public a n(@o0 CharSequence charSequence) {
            this.f718a.f697h = charSequence;
            return this;
        }

        public a o(@e int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f711v = fVar.f690a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f718a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f711v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a r(@a1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f701l = fVar.f690a.getText(i10);
            this.f718a.f703n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f701l = charSequence;
            fVar.f703n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.f718a.f702m = drawable;
            return this;
        }

        public a u(@a1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f704o = fVar.f690a.getText(i10);
            this.f718a.f706q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f718a;
            fVar.f704o = charSequence;
            fVar.f706q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.f718a.f705p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.f718a.f708s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.f718a.f709t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f718a.O = onItemSelectedListener;
            return this;
        }
    }

    public AlertDialog(@m0 Context context) {
        this(context, 0);
    }

    public AlertDialog(@m0 Context context, @b1 int i10) {
        super(context, h(context, i10));
        this.Q = new AlertController(getContext(), this, getWindow());
    }

    public AlertDialog(@m0 Context context, boolean z10, @o0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    public static int h(@m0 Context context, @b1 int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int i10) {
        return this.Q.c(i10);
    }

    public ListView g() {
        return this.Q.e();
    }

    public void i(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.Q.l(i10, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    public void k(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.Q.l(i10, charSequence, onClickListener, (Message) null, drawable);
    }

    public void l(int i10, CharSequence charSequence, Message message) {
        this.Q.l(i10, charSequence, (DialogInterface.OnClickListener) null, message, (Drawable) null);
    }

    @x0({x0.a.Q})
    public void m(int i10) {
        this.Q.m(i10);
    }

    public void n(View view) {
        this.Q.n(view);
    }

    public void o(int i10) {
        this.Q.o(i10);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Q.f();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.Q.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.Q.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void p(Drawable drawable) {
        this.Q.p(drawable);
    }

    public void q(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.Q.o(typedValue.resourceId);
    }

    public void r(CharSequence charSequence) {
        this.Q.q(charSequence);
    }

    public void s(View view) {
        this.Q.u(view);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.Q.s(charSequence);
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.Q.v(view, i10, i11, i12, i13);
    }
}
