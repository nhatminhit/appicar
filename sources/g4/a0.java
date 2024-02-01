package g4;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import d.m0;
import d.o0;
import d.t0;
import java.io.IOException;
import v3.i;
import v3.k;
import y3.v;

@t0(21)
public final class a0 implements k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final q f7901a;

    public a0(q qVar) {
        this.f7901a = qVar;
    }

    @o0
    /* renamed from: c */
    public v<Bitmap> a(@m0 ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, @m0 i iVar) throws IOException {
        return this.f7901a.d(parcelFileDescriptor, i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(@m0 ParcelFileDescriptor parcelFileDescriptor, @m0 i iVar) {
        return this.f7901a.o(parcelFileDescriptor);
    }
}
