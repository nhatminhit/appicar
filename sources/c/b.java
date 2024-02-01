package c;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import c.a;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class b {

    @TargetApi(19)
    public static class a extends a<String, Uri> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String str) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", str);
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Uri> b(@m0 Context context, @m0 String str) {
            return null;
        }

        @o0
        /* renamed from: f */
        public final Uri c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    /* renamed from: c.b$b  reason: collision with other inner class name */
    public static class C0071b extends a<String, Uri> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Uri> b(@m0 Context context, @m0 String str) {
            return null;
        }

        @o0
        /* renamed from: f */
        public final Uri c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    @TargetApi(18)
    public static class c extends a<String, List<Uri>> {
        @m0
        public static List<Uri> e(@m0 Intent intent) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (intent.getData() != null) {
                linkedHashSet.add(intent.getData());
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return Collections.emptyList();
            }
            if (clipData != null) {
                for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
                    Uri uri = clipData.getItemAt(i10).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }

        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }

        @o0
        /* renamed from: f */
        public final a.C0070a<List<Uri>> b(@m0 Context context, @m0 String str) {
            return null;
        }

        @m0
        /* renamed from: g */
        public final List<Uri> c(int i10, @o0 Intent intent) {
            return (intent == null || i10 != -1) ? Collections.emptyList() : e(intent);
        }
    }

    @TargetApi(19)
    public static class d extends a<String[], Uri> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Uri> b(@m0 Context context, @m0 String[] strArr) {
            return null;
        }

        @o0
        /* renamed from: f */
        public final Uri c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    @TargetApi(21)
    public static class e extends a<Uri, Uri> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @o0 Uri uri) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Uri> b(@m0 Context context, @o0 Uri uri) {
            return null;
        }

        @o0
        /* renamed from: f */
        public final Uri c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    @TargetApi(19)
    public static class f extends a<String[], List<Uri>> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<List<Uri>> b(@m0 Context context, @m0 String[] strArr) {
            return null;
        }

        @m0
        /* renamed from: f */
        public final List<Uri> c(int i10, @o0 Intent intent) {
            return (i10 != -1 || intent == null) ? Collections.emptyList() : c.e(intent);
        }
    }

    public static final class g extends a<Void, Uri> {
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @o0 Void voidR) {
            return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }

        @o0
        /* renamed from: e */
        public Uri c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return intent.getData();
        }
    }

    public static final class h extends a<String[], Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final String f4760a = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* renamed from: b  reason: collision with root package name */
        public static final String f4761b = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* renamed from: c  reason: collision with root package name */
        public static final String f4762c = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        @m0
        public static Intent e(@m0 String[] strArr) {
            return new Intent(f4760a).putExtra(f4761b, strArr);
        }

        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String[] strArr) {
            return e(strArr);
        }

        @o0
        /* renamed from: f */
        public a.C0070a<Map<String, Boolean>> b(@m0 Context context, @o0 String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return new a.C0070a<>(Collections.emptyMap());
            }
            androidx.collection.a aVar = new androidx.collection.a();
            boolean z10 = true;
            for (String str : strArr) {
                boolean z11 = i0.d.a(context, str) == 0;
                aVar.put(str, Boolean.valueOf(z11));
                if (!z11) {
                    z10 = false;
                }
            }
            if (z10) {
                return new a.C0070a<>(aVar);
            }
            return null;
        }

        @m0
        /* renamed from: g */
        public Map<String, Boolean> c(int i10, @o0 Intent intent) {
            if (i10 != -1) {
                return Collections.emptyMap();
            }
            if (intent == null) {
                return Collections.emptyMap();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f4761b);
            int[] intArrayExtra = intent.getIntArrayExtra(f4762c);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i11 = 0; i11 < length; i11++) {
                hashMap.put(stringArrayExtra[i11], Boolean.valueOf(intArrayExtra[i11] == 0));
            }
            return hashMap;
        }
    }

    public static final class i extends a<String, Boolean> {
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 String str) {
            return h.e(new String[]{str});
        }

        @o0
        /* renamed from: e */
        public a.C0070a<Boolean> b(@m0 Context context, @o0 String str) {
            if (str == null) {
                return new a.C0070a<>(Boolean.FALSE);
            }
            if (i0.d.a(context, str) == 0) {
                return new a.C0070a<>(Boolean.TRUE);
            }
            return null;
        }

        @m0
        /* renamed from: f */
        public Boolean c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(h.f4762c);
            if (intArrayExtra == null || intArrayExtra.length == 0) {
                return Boolean.FALSE;
            }
            boolean z10 = false;
            if (intArrayExtra[0] == 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class j extends a<Intent, ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public static final String f4763a = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 Intent intent) {
            return intent;
        }

        @m0
        /* renamed from: e */
        public ActivityResult c(int i10, @o0 Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static final class k extends a<IntentSenderRequest, ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public static final String f4764a = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* renamed from: b  reason: collision with root package name */
        public static final String f4765b = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* renamed from: c  reason: collision with root package name */
        public static final String f4766c = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 IntentSenderRequest intentSenderRequest) {
            return new Intent(f4764a).putExtra(f4765b, intentSenderRequest);
        }

        @m0
        /* renamed from: e */
        public ActivityResult c(int i10, @o0 Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static class l extends a<Uri, Boolean> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 Uri uri) {
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Boolean> b(@m0 Context context, @m0 Uri uri) {
            return null;
        }

        @m0
        /* renamed from: f */
        public final Boolean c(int i10, @o0 Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    public static class m extends a<Void, Bitmap> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @o0 Void voidR) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Bitmap> b(@m0 Context context, @o0 Void voidR) {
            return null;
        }

        @o0
        /* renamed from: f */
        public final Bitmap c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }
    }

    public static class n extends a<Uri, Bitmap> {
        @d.i
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, @m0 Uri uri) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
        }

        @o0
        /* renamed from: e */
        public final a.C0070a<Bitmap> b(@m0 Context context, @m0 Uri uri) {
            return null;
        }

        @o0
        /* renamed from: f */
        public final Bitmap c(int i10, @o0 Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            return (Bitmap) intent.getParcelableExtra("data");
        }
    }
}
