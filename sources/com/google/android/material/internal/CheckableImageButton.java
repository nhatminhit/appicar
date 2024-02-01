package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import d.m0;
import d.x0;
import f.a;
import f1.w1;
import g1.z;

@x0({x0.a.LIBRARY_GROUP})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] T = {16842912};
    public boolean Q;
    public boolean R;
    public boolean S;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean Q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @m0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @m0
            /* renamed from: b */
            public SavedState createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @m0
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@m0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(@m0 Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.Q = z10;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q ? 1 : 0);
        }
    }

    public class a extends f1.a {
        public a() {
        }

        public void f(View view, @m0 AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.S0(CheckableImageButton.this.a());
            zVar.T0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.R = true;
        this.S = true;
        w1.z1(this, new a());
    }

    public boolean a() {
        return this.R;
    }

    public boolean b() {
        return this.S;
    }

    public boolean isChecked() {
        return this.Q;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.Q) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = T;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.Q);
    }

    @m0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Q = this.Q;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.R && this.Q != z10) {
            this.Q = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.S = z10;
    }

    public void setPressed(boolean z10) {
        if (this.S) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.Q);
    }
}
