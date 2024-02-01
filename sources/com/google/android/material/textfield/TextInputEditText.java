package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.e;
import com.google.android.material.internal.n;
import d.m0;
import d.o0;
import i9.a;

public class TextInputEditText extends AppCompatEditText {
    public final Rect S;
    public boolean T;

    public TextInputEditText(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public TextInputEditText(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.editTextStyle);
    }

    public TextInputEditText(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(ca.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.S = new Rect();
        TypedArray j10 = n.j(context, attributeSet, a.o.TextInputEditText, i10, a.n.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(j10.getBoolean(a.o.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        j10.recycle();
    }

    @o0
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @o0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @m0
    public final String b(@m0 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z10 = !TextUtils.isEmpty(text);
        boolean z11 = !TextUtils.isEmpty(hint);
        setLabelFor(a.h.textinput_helper_text);
        String str = "";
        String charSequence = z11 ? hint.toString() : str;
        if (!z10) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public boolean c() {
        return this.T;
    }

    public void getFocusedRect(@o0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.T && rect != null) {
            textInputLayout.getFocusedRect(this.S);
            rect.bottom = this.S.bottom;
        }
    }

    public boolean getGlobalVisibleRect(@o0 Rect rect, @o0 Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.T || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.S, point);
            rect.bottom = this.S.bottom;
        }
        return globalVisibleRect;
    }

    @o0
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.Z()) ? super.getHint() : textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.Z() && super.getHint() == null && e.c()) {
            setHint("");
        }
    }

    @o0
    public InputConnection onCreateInputConnection(@m0 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public boolean requestRectangleOnScreen(@o0 Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.T) {
            this.S.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(a.f.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.S, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.T = z10;
    }
}
