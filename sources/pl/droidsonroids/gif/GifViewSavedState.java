package pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import d.m0;

class GifViewSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<GifViewSavedState> CREATOR = new a();
    public final long[][] O;

    public class a implements Parcelable.Creator<GifViewSavedState> {
        /* renamed from: a */
        public GifViewSavedState createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel, (a) null);
        }

        /* renamed from: b */
        public GifViewSavedState[] newArray(int i10) {
            return new GifViewSavedState[i10];
        }
    }

    public GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.O = new long[parcel.readInt()][];
        int i10 = 0;
        while (true) {
            long[][] jArr = this.O;
            if (i10 < jArr.length) {
                jArr[i10] = parcel.createLongArray();
                i10++;
            } else {
                return;
            }
        }
    }

    public /* synthetic */ GifViewSavedState(Parcel parcel, a aVar) {
        this(parcel);
    }

    public GifViewSavedState(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        long[][] jArr2 = new long[1][];
        this.O = jArr2;
        jArr2[0] = jArr;
    }

    public GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.O = new long[drawableArr.length][];
        for (int i10 = 0; i10 < drawableArr.length; i10++) {
            e eVar = drawableArr[i10];
            if (eVar instanceof e) {
                this.O[i10] = eVar.U.o();
            } else {
                this.O[i10] = null;
            }
        }
    }

    public void a(Drawable drawable, int i10) {
        long[] jArr = this.O[i10];
        if (jArr != null && (drawable instanceof e)) {
            e eVar = (e) drawable;
            eVar.L((long) eVar.U.E(jArr, eVar.T));
        }
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.O.length);
        for (long[] writeLongArray : this.O) {
            parcel.writeLongArray(writeLongArray);
        }
    }
}
