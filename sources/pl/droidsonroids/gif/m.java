package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import d.m0;
import d.o0;
import d.s0;
import d.u;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class m {

    public static class b extends m {

        /* renamed from: a  reason: collision with root package name */
        public final AssetFileDescriptor f22141a;

        public b(@m0 AssetFileDescriptor assetFileDescriptor) {
            super();
            this.f22141a = assetFileDescriptor;
        }

        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f22141a);
        }
    }

    public static final class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f22142a;

        /* renamed from: b  reason: collision with root package name */
        public final String f22143b;

        public c(@m0 AssetManager assetManager, @m0 String str) {
            super();
            this.f22142a = assetManager;
            this.f22143b = str;
        }

        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f22142a.openFd(this.f22143b));
        }
    }

    public static final class d extends m {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f22144a;

        public d(@m0 byte[] bArr) {
            super();
            this.f22144a = bArr;
        }

        public GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.f22144a);
        }
    }

    public static final class e extends m {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f22145a;

        public e(@m0 ByteBuffer byteBuffer) {
            super();
            this.f22145a = byteBuffer;
        }

        public GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.f22145a);
        }
    }

    public static final class f extends m {

        /* renamed from: a  reason: collision with root package name */
        public final FileDescriptor f22146a;

        public f(@m0 FileDescriptor fileDescriptor) {
            super();
            this.f22146a = fileDescriptor;
        }

        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f22146a);
        }
    }

    public static final class g extends m {

        /* renamed from: a  reason: collision with root package name */
        public final String f22147a;

        public g(@m0 File file) {
            super();
            this.f22147a = file.getPath();
        }

        public g(@m0 String str) {
            super();
            this.f22147a = str;
        }

        public GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.f22147a);
        }
    }

    public static final class h extends m {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f22148a;

        public h(@m0 InputStream inputStream) {
            super();
            this.f22148a = inputStream;
        }

        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f22148a);
        }
    }

    public static class i extends m {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f22149a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22150b;

        public i(@m0 Resources resources, @s0 @u int i10) {
            super();
            this.f22149a = resources;
            this.f22150b = i10;
        }

        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.f22149a.openRawResourceFd(this.f22150b));
        }
    }

    public static final class j extends m {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f22151a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f22152b;

        public j(@o0 ContentResolver contentResolver, @m0 Uri uri) {
            super();
            this.f22151a = contentResolver;
            this.f22152b = uri;
        }

        public GifInfoHandle c() throws IOException {
            return GifInfoHandle.y(this.f22151a, this.f22152b);
        }
    }

    public m() {
    }

    public final e a(e eVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10, i iVar) throws IOException {
        return new e(b(iVar), eVar, scheduledThreadPoolExecutor, z10);
    }

    public final GifInfoHandle b(@m0 i iVar) throws IOException {
        GifInfoHandle c10 = c();
        c10.K(iVar.f22131a, iVar.f22132b);
        return c10;
    }

    public abstract GifInfoHandle c() throws IOException;
}
