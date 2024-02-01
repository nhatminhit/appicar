package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import com.google.android.material.badge.a;
import com.google.android.material.internal.ParcelableSparseArray;
import d.m0;
import d.o0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public class BottomNavigationPresenter implements j {
    public e O;
    public BottomNavigationMenuView P;
    public boolean Q = false;
    public int R;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int O;
        @o0
        public ParcelableSparseArray P;

        public static class a implements Parcelable.Creator<SavedState> {
            @m0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @m0
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(@m0 Parcel parcel) {
            this.O = parcel.readInt();
            this.P = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            parcel.writeParcelable(this.P, 0);
        }
    }

    public void a(BottomNavigationMenuView bottomNavigationMenuView) {
        this.P = bottomNavigationMenuView;
    }

    public void b(e eVar, boolean z10) {
    }

    public void c(int i10) {
        this.R = i10;
    }

    public void d(boolean z10) {
        if (!this.Q) {
            if (z10) {
                this.P.c();
            } else {
                this.P.p();
            }
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f(e eVar, h hVar) {
        return false;
    }

    public boolean g(e eVar, h hVar) {
        return false;
    }

    public int getId() {
        return this.R;
    }

    public void h(j.a aVar) {
    }

    public void i(Context context, e eVar) {
        this.O = eVar;
        this.P.e(eVar);
    }

    public void j(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.P.o(savedState.O);
            this.P.setBadgeDrawables(a.e(this.P.getContext(), savedState.P));
        }
    }

    public void k(boolean z10) {
        this.Q = z10;
    }

    public boolean l(m mVar) {
        return false;
    }

    public k m(ViewGroup viewGroup) {
        return this.P;
    }

    @m0
    public Parcelable n() {
        SavedState savedState = new SavedState();
        savedState.O = this.P.getSelectedItemId();
        savedState.P = a.f(this.P.getBadgeDrawables());
        return savedState;
    }
}
