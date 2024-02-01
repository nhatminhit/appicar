package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import b6.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import i8.l;
import j8.s;
import j8.w;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import l8.b;

@a
@SafeParcelable.a(creator = "BitmapTeleporterCreator")
@w
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @a
    @m0
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new l();
    @SafeParcelable.h(id = 1)
    public final int O;
    @o0
    @SafeParcelable.c(id = 2)
    public ParcelFileDescriptor P;
    @SafeParcelable.c(id = 3)
    public final int Q;
    @o0
    public Bitmap R;
    public boolean S;
    public File T;

    @SafeParcelable.b
    public BitmapTeleporter(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.e(id = 3) int i11) {
        this.O = i10;
        this.P = parcelFileDescriptor;
        this.Q = i11;
        this.R = null;
        this.S = false;
    }

    @a
    public BitmapTeleporter(@m0 Bitmap bitmap) {
        this.O = 1;
        this.P = null;
        this.Q = 0;
        this.R = bitmap;
        this.S = true;
    }

    public static final void f1(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @a
    @o0
    public Bitmap X0() {
        if (!this.S) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) s.l(this.P)));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                f1(dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.R = createBitmap;
                this.S = true;
            } catch (IOException e10) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e10);
            } catch (Throwable th2) {
                f1(dataInputStream);
                throw th2;
            }
        }
        return this.R;
    }

    @a
    public void Z0(@m0 File file) {
        if (file != null) {
            this.T = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    @a
    public void a() {
        if (!this.S) {
            try {
                ((ParcelFileDescriptor) s.l(this.P)).close();
            } catch (IOException unused) {
            }
        }
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        if (this.P == null) {
            Bitmap bitmap = (Bitmap) s.l(this.R);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.T;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.P = ParcelFileDescriptor.open(createTempFile, c.A);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                            f1(dataOutputStream);
                        } catch (IOException e10) {
                            throw new IllegalStateException("Could not write into unlinked file", e10);
                        } catch (Throwable th2) {
                            f1(dataOutputStream);
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e11) {
                    throw new IllegalStateException("Could not create temporary file", e11);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.S(parcel, 2, this.P, i10 | 1, false);
        b.F(parcel, 3, this.Q);
        b.b(parcel, a10);
        this.P = null;
    }
}
