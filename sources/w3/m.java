package w3;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import d.m0;
import d.t0;
import java.io.IOException;
import w3.e;

public final class m implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final b f14611a;

    @t0(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @m0
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @m0
        /* renamed from: c */
        public e<ParcelFileDescriptor> b(@m0 ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    @t0(21)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ParcelFileDescriptor f14612a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f14612a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor a() throws IOException {
            try {
                Os.lseek(this.f14612a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f14612a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    @t0(21)
    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14611a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return true;
    }

    public void b() {
    }

    @t0(21)
    @m0
    /* renamed from: d */
    public ParcelFileDescriptor a() throws IOException {
        return this.f14611a.a();
    }
}
