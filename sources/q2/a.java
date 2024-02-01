package q2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import d.m0;
import d.o0;
import d.t0;
import java.io.FileNotFoundException;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f11761g = "PrintHelper";

    /* renamed from: h  reason: collision with root package name */
    public static final int f11762h = 3500;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f11763i;

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f11764j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f11765k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f11766l = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: m  reason: collision with root package name */
    public static final int f11767m = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: n  reason: collision with root package name */
    public static final int f11768n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f11769o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f11770p = 2;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11771a;

    /* renamed from: b  reason: collision with root package name */
    public BitmapFactory.Options f11772b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11773c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f11774d = 2;

    /* renamed from: e  reason: collision with root package name */
    public int f11775e = 2;

    /* renamed from: f  reason: collision with root package name */
    public int f11776f = 1;

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    public class C0200a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f11777a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f11778b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Bitmap f11779c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f11780d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f11781e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f11782f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f11783g;

        public C0200a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i10, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f11777a = cancellationSignal;
            this.f11778b = printAttributes;
            this.f11779c = bitmap;
            this.f11780d = printAttributes2;
            this.f11781e = i10;
            this.f11782f = parcelFileDescriptor;
            this.f11783g = writeResultCallback;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d2 */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[Catch:{ all -> 0x00c7, all -> 0x00da }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Throwable doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                android.os.CancellationSignal r9 = r8.f11777a     // Catch:{ all -> 0x00da }
                boolean r9 = r9.isCanceled()     // Catch:{ all -> 0x00da }
                r0 = 0
                if (r9 == 0) goto L_0x000a
                return r0
            L_0x000a:
                android.print.pdf.PrintedPdfDocument r9 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00da }
                q2.a r1 = q2.a.this     // Catch:{ all -> 0x00da }
                android.content.Context r1 = r1.f11771a     // Catch:{ all -> 0x00da }
                android.print.PrintAttributes r2 = r8.f11778b     // Catch:{ all -> 0x00da }
                r9.<init>(r1, r2)     // Catch:{ all -> 0x00da }
                android.graphics.Bitmap r1 = r8.f11779c     // Catch:{ all -> 0x00da }
                android.print.PrintAttributes r2 = r8.f11778b     // Catch:{ all -> 0x00da }
                int r2 = r2.getColorMode()     // Catch:{ all -> 0x00da }
                android.graphics.Bitmap r1 = q2.a.a(r1, r2)     // Catch:{ all -> 0x00da }
                android.os.CancellationSignal r2 = r8.f11777a     // Catch:{ all -> 0x00da }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00da }
                if (r2 == 0) goto L_0x002a
                return r0
            L_0x002a:
                r2 = 1
                android.graphics.pdf.PdfDocument$Page r3 = r9.startPage(r2)     // Catch:{ all -> 0x00c7 }
                boolean r4 = q2.a.f11764j     // Catch:{ all -> 0x00c7 }
                if (r4 == 0) goto L_0x0041
                android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$PageInfo r5 = r3.getInfo()     // Catch:{ all -> 0x00c7 }
                android.graphics.Rect r5 = r5.getContentRect()     // Catch:{ all -> 0x00c7 }
                r2.<init>(r5)     // Catch:{ all -> 0x00c7 }
                goto L_0x0064
            L_0x0041:
                android.print.pdf.PrintedPdfDocument r5 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00c7 }
                q2.a r6 = q2.a.this     // Catch:{ all -> 0x00c7 }
                android.content.Context r6 = r6.f11771a     // Catch:{ all -> 0x00c7 }
                android.print.PrintAttributes r7 = r8.f11780d     // Catch:{ all -> 0x00c7 }
                r5.<init>(r6, r7)     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$Page r2 = r5.startPage(r2)     // Catch:{ all -> 0x00c7 }
                android.graphics.RectF r6 = new android.graphics.RectF     // Catch:{ all -> 0x00c7 }
                android.graphics.pdf.PdfDocument$PageInfo r7 = r2.getInfo()     // Catch:{ all -> 0x00c7 }
                android.graphics.Rect r7 = r7.getContentRect()     // Catch:{ all -> 0x00c7 }
                r6.<init>(r7)     // Catch:{ all -> 0x00c7 }
                r5.finishPage(r2)     // Catch:{ all -> 0x00c7 }
                r5.close()     // Catch:{ all -> 0x00c7 }
                r2 = r6
            L_0x0064:
                int r5 = r1.getWidth()     // Catch:{ all -> 0x00c7 }
                int r6 = r1.getHeight()     // Catch:{ all -> 0x00c7 }
                int r7 = r8.f11781e     // Catch:{ all -> 0x00c7 }
                android.graphics.Matrix r5 = q2.a.d(r5, r6, r2, r7)     // Catch:{ all -> 0x00c7 }
                if (r4 == 0) goto L_0x0075
                goto L_0x0083
            L_0x0075:
                float r4 = r2.left     // Catch:{ all -> 0x00c7 }
                float r6 = r2.top     // Catch:{ all -> 0x00c7 }
                r5.postTranslate(r4, r6)     // Catch:{ all -> 0x00c7 }
                android.graphics.Canvas r4 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                r4.clipRect(r2)     // Catch:{ all -> 0x00c7 }
            L_0x0083:
                android.graphics.Canvas r2 = r3.getCanvas()     // Catch:{ all -> 0x00c7 }
                r2.drawBitmap(r1, r5, r0)     // Catch:{ all -> 0x00c7 }
                r9.finishPage(r3)     // Catch:{ all -> 0x00c7 }
                android.os.CancellationSignal r2 = r8.f11777a     // Catch:{ all -> 0x00c7 }
                boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00c7 }
                if (r2 == 0) goto L_0x00a7
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f11782f     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x009f
                r9.close()     // Catch:{ IOException -> 0x009f }
            L_0x009f:
                android.graphics.Bitmap r9 = r8.f11779c     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00a6
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00a6:
                return r0
            L_0x00a7:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c7 }
                android.os.ParcelFileDescriptor r3 = r8.f11782f     // Catch:{ all -> 0x00c7 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x00c7 }
                r2.<init>(r3)     // Catch:{ all -> 0x00c7 }
                r9.writeTo(r2)     // Catch:{ all -> 0x00c7 }
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f11782f     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x00bf
                r9.close()     // Catch:{ IOException -> 0x00bf }
            L_0x00bf:
                android.graphics.Bitmap r9 = r8.f11779c     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00c6
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00c6:
                return r0
            L_0x00c7:
                r0 = move-exception
                r9.close()     // Catch:{ all -> 0x00da }
                android.os.ParcelFileDescriptor r9 = r8.f11782f     // Catch:{ all -> 0x00da }
                if (r9 == 0) goto L_0x00d2
                r9.close()     // Catch:{ IOException -> 0x00d2 }
            L_0x00d2:
                android.graphics.Bitmap r9 = r8.f11779c     // Catch:{ all -> 0x00da }
                if (r1 == r9) goto L_0x00d9
                r1.recycle()     // Catch:{ all -> 0x00da }
            L_0x00d9:
                throw r0     // Catch:{ all -> 0x00da }
            L_0x00da:
                r9 = move-exception
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.a.C0200a.doInBackground(java.lang.Void[]):java.lang.Throwable");
        }

        /* renamed from: b */
        public void onPostExecute(Throwable th2) {
            if (this.f11777a.isCanceled()) {
                this.f11783g.onWriteCancelled();
            } else if (th2 == null) {
                this.f11783g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.f11783g.onWriteFailed((CharSequence) null);
            }
        }
    }

    public interface b {
        void a();
    }

    @t0(19)
    public class c extends PrintDocumentAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final String f11785a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11786b;

        /* renamed from: c  reason: collision with root package name */
        public final Bitmap f11787c;

        /* renamed from: d  reason: collision with root package name */
        public final b f11788d;

        /* renamed from: e  reason: collision with root package name */
        public PrintAttributes f11789e;

        public c(String str, int i10, Bitmap bitmap, b bVar) {
            this.f11785a = str;
            this.f11786b = i10;
            this.f11787c = bitmap;
            this.f11788d = bVar;
        }

        public void onFinish() {
            b bVar = this.f11788d;
            if (bVar != null) {
                bVar.a();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f11789e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f11785a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f11789e, this.f11786b, this.f11787c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @t0(19)
    public class d extends PrintDocumentAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final String f11791a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f11792b;

        /* renamed from: c  reason: collision with root package name */
        public final b f11793c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11794d;

        /* renamed from: e  reason: collision with root package name */
        public PrintAttributes f11795e;

        /* renamed from: f  reason: collision with root package name */
        public AsyncTask<Uri, Boolean, Bitmap> f11796f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f11797g = null;

        /* renamed from: q2.a$d$a  reason: collision with other inner class name */
        public class C0201a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f11799a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f11800b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f11801c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f11802d;

            /* renamed from: q2.a$d$a$a  reason: collision with other inner class name */
            public class C0202a implements CancellationSignal.OnCancelListener {
                public C0202a() {
                }

                public void onCancel() {
                    d.this.a();
                    C0201a.this.cancel(false);
                }
            }

            public C0201a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f11799a = cancellationSignal;
                this.f11800b = printAttributes;
                this.f11801c = printAttributes2;
                this.f11802d = layoutResultCallback;
            }

            /* renamed from: a */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f11792b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            /* renamed from: b */
            public void onCancelled(Bitmap bitmap) {
                this.f11802d.onLayoutCancelled();
                d.this.f11796f = null;
            }

            /* renamed from: c */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.f11763i || a.this.f11776f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.f11795e.getMediaSize();
                    }
                    if (!(mediaSize == null || mediaSize.isPortrait() == a.g(bitmap))) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f11797g = bitmap;
                if (bitmap != null) {
                    this.f11802d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f11791a).setContentType(1).setPageCount(1).build(), true ^ this.f11800b.equals(this.f11801c));
                } else {
                    this.f11802d.onLayoutFailed((CharSequence) null);
                }
                d.this.f11796f = null;
            }

            public void onPreExecute() {
                this.f11799a.setOnCancelListener(new C0202a());
            }
        }

        public d(String str, Uri uri, b bVar, int i10) {
            this.f11791a = str;
            this.f11792b = uri;
            this.f11793c = bVar;
            this.f11794d = i10;
        }

        public void a() {
            synchronized (a.this.f11773c) {
                BitmapFactory.Options options = a.this.f11772b;
                if (options != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        options.requestCancelDecode();
                    }
                    a.this.f11772b = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f11796f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f11793c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.f11797g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f11797g = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f11795e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f11797g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f11791a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f11796f = new C0201a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f11795e, this.f11794d, this.f11797g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        f11763i = i10 > 23;
        if (i10 != 23) {
            z10 = true;
        }
        f11764j = z10;
    }

    public a(@m0 Context context) {
        this.f11771a = context;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    @t0(19)
    public static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static Matrix d(int i10, int i11, RectF rectF, int i12) {
        Matrix matrix = new Matrix();
        float f10 = (float) i10;
        float width = rectF.width() / f10;
        float max = i12 == 2 ? Math.max(width, rectF.height() / ((float) i11)) : Math.min(width, rectF.height() / ((float) i11));
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (f10 * max)) / 2.0f, (rectF.height() - (((float) i11) * max)) / 2.0f);
        return matrix;
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f11775e;
    }

    public int e() {
        int i10 = this.f11776f;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int f() {
        return this.f11774d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC, Splitter:B:17:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap h(android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0023
            android.content.Context r0 = r2.f11771a
            if (r0 == 0) goto L_0x0023
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x001c }
            java.io.InputStream r3 = r0.openInputStream(r3)     // Catch:{ all -> 0x001c }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0018
            r3.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r4
        L_0x0019:
            r4 = move-exception
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r4 = move-exception
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            throw r4
        L_0x0023:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bad argument to loadBitmap"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.a.h(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public Bitmap i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f11771a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i10 = options2.outWidth;
        int i11 = options2.outHeight;
        if (i10 > 0 && i11 > 0) {
            int max = Math.max(i10, i11);
            int i12 = 1;
            while (max > 3500) {
                max >>>= 1;
                i12 <<= 1;
            }
            if (i12 > 0 && Math.min(i10, i11) / i12 > 0) {
                synchronized (this.f11773c) {
                    options = new BitmapFactory.Options();
                    this.f11772b = options;
                    options.inMutable = true;
                    options.inSampleSize = i12;
                }
                try {
                    Bitmap h10 = h(uri, options);
                    synchronized (this.f11773c) {
                        this.f11772b = null;
                    }
                    return h10;
                } catch (Throwable th2) {
                    synchronized (this.f11773c) {
                        this.f11772b = null;
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    public void j(@m0 String str, @m0 Bitmap bitmap) {
        k(str, bitmap, (b) null);
    }

    public void k(@m0 String str, @m0 Bitmap bitmap, @o0 b bVar) {
        if (bitmap != null) {
            ((PrintManager) this.f11771a.getSystemService("print")).print(str, new c(str, this.f11774d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f11775e).build());
        }
    }

    public void l(@m0 String str, @m0 Uri uri) throws FileNotFoundException {
        m(str, uri, (b) null);
    }

    public void m(@m0 String str, @m0 Uri uri, @o0 b bVar) throws FileNotFoundException {
        PrintAttributes.MediaSize mediaSize;
        d dVar = new d(str, uri, bVar, this.f11774d);
        PrintManager printManager = (PrintManager) this.f11771a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f11775e);
        int i10 = this.f11776f;
        if (i10 == 1 || i10 == 0) {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        } else {
            if (i10 == 2) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
            }
            printManager.print(str, dVar, builder.build());
        }
        builder.setMediaSize(mediaSize);
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i10) {
        this.f11775e = i10;
    }

    public void o(int i10) {
        this.f11776f = i10;
    }

    public void p(int i10) {
        this.f11774d = i10;
    }

    @t0(19)
    public void r(PrintAttributes printAttributes, int i10, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new C0200a(cancellationSignal, f11764j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i10, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
