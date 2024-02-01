package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import d.e0;
import d.o0;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import nh.a;
import pl.droidsonroids.gif.g;
import pl.droidsonroids.gif.m;

public abstract class g<T extends g<T>> {

    /* renamed from: a  reason: collision with root package name */
    public m f22114a;

    /* renamed from: b  reason: collision with root package name */
    public e f22115b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledThreadPoolExecutor f22116c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22117d = true;

    /* renamed from: e  reason: collision with root package name */
    public final i f22118e = new i();

    public e a() throws IOException {
        m mVar = this.f22114a;
        if (mVar != null) {
            return mVar.a(this.f22115b, this.f22116c, this.f22117d, this.f22118e);
        }
        throw new NullPointerException("Source is not set");
    }

    public T b(ContentResolver contentResolver, Uri uri) {
        this.f22114a = new m.j(contentResolver, uri);
        return t();
    }

    public T c(AssetFileDescriptor assetFileDescriptor) {
        this.f22114a = new m.b(assetFileDescriptor);
        return t();
    }

    public T d(AssetManager assetManager, String str) {
        this.f22114a = new m.c(assetManager, str);
        return t();
    }

    public T e(Resources resources, int i10) {
        this.f22114a = new m.i(resources, i10);
        return t();
    }

    public T f(File file) {
        this.f22114a = new m.g(file);
        return t();
    }

    public T g(FileDescriptor fileDescriptor) {
        this.f22114a = new m.f(fileDescriptor);
        return t();
    }

    public T h(InputStream inputStream) {
        this.f22114a = new m.h(inputStream);
        return t();
    }

    public T i(String str) {
        this.f22114a = new m.g(str);
        return t();
    }

    public T j(ByteBuffer byteBuffer) {
        this.f22114a = new m.e(byteBuffer);
        return t();
    }

    public T k(byte[] bArr) {
        this.f22114a = new m.d(bArr);
        return t();
    }

    public ScheduledThreadPoolExecutor l() {
        return this.f22116c;
    }

    public m m() {
        return this.f22114a;
    }

    public e n() {
        return this.f22115b;
    }

    public i o() {
        return this.f22118e;
    }

    public boolean p() {
        return this.f22117d;
    }

    @a
    public T q(@o0 i iVar) {
        this.f22118e.b(iVar);
        return t();
    }

    public T r(boolean z10) {
        this.f22117d = z10;
        return t();
    }

    public T s(@e0(from = 1, to = 65535) int i10) {
        this.f22118e.d(i10);
        return t();
    }

    public abstract T t();

    public T u(boolean z10) {
        return r(z10);
    }

    public T v(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f22116c = scheduledThreadPoolExecutor;
        return t();
    }

    public T w(int i10) {
        this.f22116c = new ScheduledThreadPoolExecutor(i10);
        return t();
    }

    public T x(e eVar) {
        this.f22115b = eVar;
        return t();
    }
}
