package n1;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DialerKeyListener;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TextKeyListener;
import android.widget.TextView;
import androidx.databinding.g;
import androidx.databinding.h;
import androidx.databinding.n;
import androidx.databinding.o;
import d.x0;
import p1.c;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:autoLink", method = "setAutoLinkMask", type = TextView.class), @g(attribute = "android:drawablePadding", method = "setCompoundDrawablePadding", type = TextView.class), @g(attribute = "android:editorExtras", method = "setInputExtras", type = TextView.class), @g(attribute = "android:inputType", method = "setRawInputType", type = TextView.class), @g(attribute = "android:scrollHorizontally", method = "setHorizontallyScrolling", type = TextView.class), @g(attribute = "android:textAllCaps", method = "setAllCaps", type = TextView.class), @g(attribute = "android:textColorHighlight", method = "setHighlightColor", type = TextView.class), @g(attribute = "android:textColorHint", method = "setHintTextColor", type = TextView.class), @g(attribute = "android:textColorLink", method = "setLinkTextColor", type = TextView.class), @g(attribute = "android:onEditorAction", method = "setOnEditorActionListener", type = TextView.class)})
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10764a = "TextViewBindingAdapters";

    /* renamed from: b  reason: collision with root package name */
    public static final int f10765b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10766c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10767d = 5;

    public class a implements TextWatcher {
        public final /* synthetic */ c O;
        public final /* synthetic */ d P;
        public final /* synthetic */ o Q;
        public final /* synthetic */ b R;

        public a(c cVar, d dVar, o oVar, b bVar) {
            this.O = cVar;
            this.P = dVar;
            this.Q = oVar;
            this.R = bVar;
        }

        public void afterTextChanged(Editable editable) {
            b bVar = this.R;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = this.O;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i10, i11, i12);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            d dVar = this.P;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i10, i11, i12);
            }
            o oVar = this.Q;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    public interface b {
        void afterTextChanged(Editable editable);
    }

    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    public interface d {
        void onTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    @androidx.databinding.d({"android:text"})
    public static void A(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    @androidx.databinding.d({"android:textSize"})
    public static void B(TextView textView, float f10) {
        textView.setTextSize(0, f10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:beforeTextChanged", "android:onTextChanged", "android:afterTextChanged", "android:textAttrChanged"})
    public static void C(TextView textView, c cVar, d dVar, b bVar, o oVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && oVar == null) ? null : new a(cVar, dVar, oVar, bVar);
        TextWatcher textWatcher = (TextWatcher) r.b(textView, aVar, c.g.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }

    @n(attribute = "android:text", event = "android:textAttrChanged")
    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    @androidx.databinding.d({"android:autoText"})
    public static void c(TextView textView, boolean z10) {
        KeyListener keyListener = textView.getKeyListener();
        TextKeyListener.Capitalize capitalize = TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(TextKeyListener.getInstance(z10, capitalize));
    }

    @androidx.databinding.d({"android:bufferType"})
    public static void d(TextView textView, TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    @androidx.databinding.d({"android:capitalize"})
    public static void e(TextView textView, TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    @androidx.databinding.d({"android:digits"})
    public static void f(TextView textView, CharSequence charSequence) {
        DigitsKeyListener digitsKeyListener;
        if (charSequence != null) {
            digitsKeyListener = DigitsKeyListener.getInstance(charSequence.toString());
        } else if (textView.getKeyListener() instanceof DigitsKeyListener) {
            digitsKeyListener = null;
        } else {
            return;
        }
        textView.setKeyListener(digitsKeyListener);
    }

    @androidx.databinding.d({"android:drawableBottom"})
    public static void g(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    @androidx.databinding.d({"android:drawableEnd"})
    public static void h(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    @androidx.databinding.d({"android:drawableLeft"})
    public static void i(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    @androidx.databinding.d({"android:drawableRight"})
    public static void j(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    @androidx.databinding.d({"android:drawableStart"})
    public static void k(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @androidx.databinding.d({"android:drawableTop"})
    public static void l(TextView textView, Drawable drawable) {
        p(drawable);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    @androidx.databinding.d({"android:imeActionId"})
    public static void m(TextView textView, int i10) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i10);
    }

    @androidx.databinding.d({"android:imeActionLabel"})
    public static void n(TextView textView, CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    @androidx.databinding.d({"android:inputMethod"})
    public static void o(TextView textView, CharSequence charSequence) {
        StringBuilder sb2;
        try {
            textView.setKeyListener((KeyListener) Class.forName(charSequence.toString()).newInstance());
            return;
        } catch (ClassNotFoundException unused) {
            sb2 = new StringBuilder();
        } catch (InstantiationException unused2) {
            sb2 = new StringBuilder();
        } catch (IllegalAccessException unused3) {
            sb2 = new StringBuilder();
        }
        sb2.append("Could not create input method: ");
        sb2.append(charSequence);
    }

    public static void p(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @androidx.databinding.d({"android:lineSpacingExtra"})
    public static void q(TextView textView, float f10) {
        textView.setLineSpacing(f10, textView.getLineSpacingMultiplier());
    }

    @androidx.databinding.d({"android:lineSpacingMultiplier"})
    public static void r(TextView textView, float f10) {
        textView.setLineSpacing(textView.getLineSpacingExtra(), f10);
    }

    @androidx.databinding.d({"android:maxLength"})
    public static void s(TextView textView, int i10) {
        boolean z10;
        InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new InputFilter[]{new InputFilter.LengthFilter(i10)};
        } else {
            int i11 = 0;
            while (true) {
                if (i11 >= filters.length) {
                    z10 = false;
                    break;
                }
                InputFilter inputFilter = filters[i11];
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    if (((InputFilter.LengthFilter) inputFilter).getMax() != i10) {
                        filters[i11] = new InputFilter.LengthFilter(i10);
                    }
                    z10 = true;
                } else {
                    i11++;
                }
            }
            if (!z10) {
                int length = filters.length + 1;
                InputFilter[] inputFilterArr = new InputFilter[length];
                System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[length - 1] = new InputFilter.LengthFilter(i10);
                filters = inputFilterArr;
            }
        }
        textView.setFilters(filters);
    }

    @androidx.databinding.d({"android:numeric"})
    public static void t(TextView textView, int i10) {
        boolean z10 = true;
        boolean z11 = (i10 & 3) != 0;
        if ((i10 & 5) == 0) {
            z10 = false;
        }
        textView.setKeyListener(DigitsKeyListener.getInstance(z11, z10));
    }

    @androidx.databinding.d({"android:password"})
    public static void u(TextView textView, boolean z10) {
        PasswordTransformationMethod passwordTransformationMethod;
        if (z10) {
            passwordTransformationMethod = PasswordTransformationMethod.getInstance();
        } else if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            passwordTransformationMethod = null;
        } else {
            return;
        }
        textView.setTransformationMethod(passwordTransformationMethod);
    }

    @androidx.databinding.d({"android:phoneNumber"})
    public static void v(TextView textView, boolean z10) {
        DialerKeyListener dialerKeyListener;
        if (z10) {
            dialerKeyListener = DialerKeyListener.getInstance();
        } else if (textView.getKeyListener() instanceof DialerKeyListener) {
            dialerKeyListener = null;
        } else {
            return;
        }
        textView.setKeyListener(dialerKeyListener);
    }

    @androidx.databinding.d({"android:shadowColor"})
    public static void w(TextView textView, int i10) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i10);
    }

    @androidx.databinding.d({"android:shadowDx"})
    public static void x(TextView textView, float f10) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), f10, textView.getShadowDy(), shadowColor);
    }

    @androidx.databinding.d({"android:shadowDy"})
    public static void y(TextView textView, float f10) {
        int shadowColor = textView.getShadowColor();
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f10, shadowColor);
    }

    @androidx.databinding.d({"android:shadowRadius"})
    public static void z(TextView textView, float f10) {
        textView.setShadowLayer(f10, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
    }
}
