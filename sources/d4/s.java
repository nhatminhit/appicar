package d4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d.m0;
import d.o0;
import d4.n;
import java.io.InputStream;
import v3.i;

public class s<Data> implements n<Integer, Data> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6070c = "ResourceLoader";

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f6071a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f6072b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f6073a;

        public a(Resources resources) {
            this.f6073a = resources;
        }

        public n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f6073a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public void b() {
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f6074a;

        public b(Resources resources) {
            this.f6074a = resources;
        }

        @m0
        public n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f6074a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }

        public void b() {
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f6075a;

        public c(Resources resources) {
            this.f6075a = resources;
        }

        @m0
        public n<Integer, InputStream> a(r rVar) {
            return new s(this.f6075a, rVar.d(Uri.class, InputStream.class));
        }

        public void b() {
        }
    }

    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f6076a;

        public d(Resources resources) {
            this.f6076a = resources;
        }

        @m0
        public n<Integer, Uri> a(r rVar) {
            return new s(this.f6076a, v.c());
        }

        public void b() {
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f6072b = resources;
        this.f6071a = nVar;
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 Integer num, int i10, int i11, @m0 i iVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f6071a.b(d10, i10, i11, iVar);
    }

    @o0
    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f6072b.getResourcePackageName(num.intValue()) + '/' + this.f6072b.getResourceTypeName(num.intValue()) + '/' + this.f6072b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable(f6070c, 5)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Received invalid resource id: ");
            sb2.append(num);
            return null;
        }
    }

    /* renamed from: e */
    public boolean a(@m0 Integer num) {
        return true;
    }
}
