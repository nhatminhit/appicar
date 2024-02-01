package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import d.x0;
import k3.e;

@x0({x0.a.O})
public class IconCompatParcelizer {
    public static IconCompat read(e eVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2218a = eVar.M(iconCompat.f2218a, 1);
        iconCompat.f2220c = eVar.t(iconCompat.f2220c, 2);
        iconCompat.f2221d = eVar.W(iconCompat.f2221d, 3);
        iconCompat.f2222e = eVar.M(iconCompat.f2222e, 4);
        iconCompat.f2223f = eVar.M(iconCompat.f2223f, 5);
        iconCompat.f2224g = (ColorStateList) eVar.W(iconCompat.f2224g, 6);
        iconCompat.f2226i = eVar.d0(iconCompat.f2226i, 7);
        iconCompat.f2227j = eVar.d0(iconCompat.f2227j, 8);
        iconCompat.b();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, e eVar) {
        eVar.j0(true, true);
        iconCompat.c(eVar.i());
        int i10 = iconCompat.f2218a;
        if (-1 != i10) {
            eVar.M0(i10, 1);
        }
        byte[] bArr = iconCompat.f2220c;
        if (bArr != null) {
            eVar.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2221d;
        if (parcelable != null) {
            eVar.X0(parcelable, 3);
        }
        int i11 = iconCompat.f2222e;
        if (i11 != 0) {
            eVar.M0(i11, 4);
        }
        int i12 = iconCompat.f2223f;
        if (i12 != 0) {
            eVar.M0(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2224g;
        if (colorStateList != null) {
            eVar.X0(colorStateList, 6);
        }
        String str = iconCompat.f2226i;
        if (str != null) {
            eVar.f1(str, 7);
        }
        String str2 = iconCompat.f2227j;
        if (str2 != null) {
            eVar.f1(str2, 8);
        }
    }
}
