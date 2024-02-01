package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadRequest;
import d.o0;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import w7.b;
import w7.q0;

@Deprecated
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final int f5212b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final b f5213a;

    public a(File file) {
        this.f5213a = new b(file);
    }

    public static String c(Uri uri, @o0 String str) {
        return str != null ? str : uri.toString();
    }

    public static DownloadRequest e(DataInputStream dataInputStream) throws IOException {
        byte[] bArr;
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        int readInt2 = dataInputStream.readInt();
        String str = null;
        if (readInt2 != 0) {
            byte[] bArr2 = new byte[readInt2];
            dataInputStream.readFully(bArr2);
            bArr = bArr2;
        } else {
            bArr = null;
        }
        boolean z10 = true;
        boolean z11 = readInt == 0 && DownloadRequest.U.equals(readUTF);
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            int readInt3 = dataInputStream.readInt();
            for (int i10 = 0; i10 < readInt3; i10++) {
                arrayList.add(f(readUTF, readInt, dataInputStream));
            }
        }
        if (readInt >= 2 || (!DownloadRequest.V.equals(readUTF) && !DownloadRequest.W.equals(readUTF) && !DownloadRequest.X.equals(readUTF))) {
            z10 = false;
        }
        if (!z10 && dataInputStream.readBoolean()) {
            str = dataInputStream.readUTF();
        }
        String c10 = readInt < 3 ? c(parse, str) : dataInputStream.readUTF();
        if (!readBoolean) {
            return new DownloadRequest(c10, readUTF, parse, arrayList, str, bArr);
        }
        throw new DownloadRequest.b();
    }

    public static StreamKey f(String str, int i10, DataInputStream dataInputStream) throws IOException {
        return new StreamKey(((DownloadRequest.W.equals(str) || DownloadRequest.X.equals(str)) && i10 == 0) ? 0 : dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt());
    }

    public void a() {
        this.f5213a.a();
    }

    public boolean b() {
        return this.f5213a.c();
    }

    public DownloadRequest[] d() throws IOException {
        if (!b()) {
            return new DownloadRequest[0];
        }
        InputStream inputStream = null;
        try {
            inputStream = this.f5213a.d();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int readInt = dataInputStream.readInt();
            if (readInt <= 0) {
                int readInt2 = dataInputStream.readInt();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < readInt2; i10++) {
                    try {
                        arrayList.add(e(dataInputStream));
                    } catch (DownloadRequest.b unused) {
                    }
                }
                return (DownloadRequest[]) arrayList.toArray(new DownloadRequest[0]);
            }
            throw new IOException("Unsupported action file version: " + readInt);
        } finally {
            q0.q(inputStream);
        }
    }
}
