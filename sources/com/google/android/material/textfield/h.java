package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import d.m0;
import i9.a;

public class h extends e {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f17624d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final TextInputLayout.h f17625e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.i f17626f = new c();

    public class a extends m {
        public a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            h hVar = h.this;
            hVar.f17592c.setChecked(!hVar.g());
        }
    }

    public class b implements TextInputLayout.h {
        public b() {
        }

        public void a(@m0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            h hVar = h.this;
            hVar.f17592c.setChecked(!hVar.g());
            editText.removeTextChangedListener(h.this.f17624d);
            editText.addTextChangedListener(h.this.f17624d);
        }
    }

    public class c implements TextInputLayout.i {

        public class a implements Runnable {
            public final /* synthetic */ EditText O;

            public a(EditText editText) {
                this.O = editText;
            }

            public void run() {
                this.O.removeTextChangedListener(h.this.f17624d);
            }
        }

        public c() {
        }

        public void a(@m0 TextInputLayout textInputLayout, int i10) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i10 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            EditText editText = h.this.f17590a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(h.this.g() ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                h.this.f17590a.i0();
            }
        }
    }

    public h(@m0 TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    public void a() {
        this.f17590a.setEndIconDrawable(g.a.d(this.f17591b, a.g.design_password_eye));
        TextInputLayout textInputLayout = this.f17590a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.password_toggle_content_description));
        this.f17590a.setEndIconOnClickListener(new d());
        this.f17590a.e(this.f17625e);
        this.f17590a.f(this.f17626f);
        EditText editText = this.f17590a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f17590a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
