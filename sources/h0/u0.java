package h0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.app.Notification$DecoratedCustomViewStyle;
import android.app.Notification$MessagingStyle;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import e0.a;
import h0.l2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import y3.q;

public class u0 {
    @SuppressLint({"ActionValue"})
    public static final String A = "android.title";
    public static final String A0 = "reminder";
    @SuppressLint({"ActionValue"})
    public static final String B = "android.title.big";
    public static final String B0 = "recommendation";
    @SuppressLint({"ActionValue"})
    public static final String C = "android.text";
    public static final String C0 = "status";
    @SuppressLint({"ActionValue"})
    public static final String D = "android.subText";
    public static final String D0 = "workout";
    @SuppressLint({"ActionValue"})
    public static final String E = "android.remoteInputHistory";
    public static final String E0 = "location_sharing";
    @SuppressLint({"ActionValue"})
    public static final String F = "android.infoText";
    public static final String F0 = "stopwatch";
    @SuppressLint({"ActionValue"})
    public static final String G = "android.summaryText";
    public static final String G0 = "missed_call";
    @SuppressLint({"ActionValue"})
    public static final String H = "android.bigText";
    public static final int H0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String I = "android.icon";
    public static final int I0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String J = "android.largeIcon";
    public static final int J0 = 2;
    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon.big";
    public static final int K0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String L = "android.progress";
    public static final int L0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String M = "android.progressMax";
    public static final int M0 = 2;
    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressIndeterminate";
    public static final String N0 = "silent";
    @SuppressLint({"ActionValue"})
    public static final String O = "android.showChronometer";
    @SuppressLint({"ActionValue"})
    public static final String P = "android.chronometerCountDown";
    @SuppressLint({"ActionValue"})
    public static final String Q = "android.colorized";
    @SuppressLint({"ActionValue"})
    public static final String R = "android.showWhen";
    @SuppressLint({"ActionValue"})
    public static final String S = "android.picture";
    @SuppressLint({"ActionValue"})
    public static final String T = "android.textLines";
    @SuppressLint({"ActionValue"})
    public static final String U = "android.template";
    public static final String V = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String W = "android.people";
    @SuppressLint({"ActionValue"})
    public static final String X = "android.people.list";
    @SuppressLint({"ActionValue"})
    public static final String Y = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})
    public static final String Z = "android.mediaSession";
    @SuppressLint({"ActionValue"})

    /* renamed from: a  reason: collision with root package name */
    public static final String f8497a = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({"ActionValue"})

    /* renamed from: a0  reason: collision with root package name */
    public static final String f8498a0 = "android.compactActions";
    @SuppressLint({"ActionValue"})

    /* renamed from: b  reason: collision with root package name */
    public static final String f8499b = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: b0  reason: collision with root package name */
    public static final String f8500b0 = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})

    /* renamed from: c  reason: collision with root package name */
    public static final String f8501c = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: c0  reason: collision with root package name */
    public static final String f8502c0 = "android.messagingStyleUser";
    @SuppressLint({"ActionValue"})

    /* renamed from: d  reason: collision with root package name */
    public static final String f8503d = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})

    /* renamed from: d0  reason: collision with root package name */
    public static final String f8504d0 = "android.conversationTitle";
    @SuppressLint({"ActionValue"})

    /* renamed from: e  reason: collision with root package name */
    public static final String f8505e = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: e0  reason: collision with root package name */
    public static final String f8506e0 = "android.messages";

    /* renamed from: f  reason: collision with root package name */
    public static final int f8507f = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: f0  reason: collision with root package name */
    public static final String f8508f0 = "android.messages.historic";

    /* renamed from: g  reason: collision with root package name */
    public static final int f8509g = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: g0  reason: collision with root package name */
    public static final String f8510g0 = "android.isGroupConversation";

    /* renamed from: h  reason: collision with root package name */
    public static final int f8511h = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: h0  reason: collision with root package name */
    public static final String f8512h0 = "android.hiddenConversationTitle";

    /* renamed from: i  reason: collision with root package name */
    public static final int f8513i = 4;
    @SuppressLint({"ActionValue"})

    /* renamed from: i0  reason: collision with root package name */
    public static final String f8514i0 = "android.audioContents";

    /* renamed from: j  reason: collision with root package name */
    public static final int f8515j = -1;
    @d.l

    /* renamed from: j0  reason: collision with root package name */
    public static final int f8516j0 = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f8517k = 1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f8518k0 = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f8519l = 2;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f8520l0 = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f8521m = 4;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f8522m0 = -1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f8523n = 8;

    /* renamed from: n0  reason: collision with root package name */
    public static final String f8524n0 = "call";

    /* renamed from: o  reason: collision with root package name */
    public static final int f8525o = 16;

    /* renamed from: o0  reason: collision with root package name */
    public static final String f8526o0 = "navigation";

    /* renamed from: p  reason: collision with root package name */
    public static final int f8527p = 32;

    /* renamed from: p0  reason: collision with root package name */
    public static final String f8528p0 = "msg";

    /* renamed from: q  reason: collision with root package name */
    public static final int f8529q = 64;

    /* renamed from: q0  reason: collision with root package name */
    public static final String f8530q0 = "email";
    @Deprecated

    /* renamed from: r  reason: collision with root package name */
    public static final int f8531r = 128;

    /* renamed from: r0  reason: collision with root package name */
    public static final String f8532r0 = "event";

    /* renamed from: s  reason: collision with root package name */
    public static final int f8533s = 256;

    /* renamed from: s0  reason: collision with root package name */
    public static final String f8534s0 = "promo";

    /* renamed from: t  reason: collision with root package name */
    public static final int f8535t = 512;

    /* renamed from: t0  reason: collision with root package name */
    public static final String f8536t0 = "alarm";

    /* renamed from: u  reason: collision with root package name */
    public static final int f8537u = 4096;

    /* renamed from: u0  reason: collision with root package name */
    public static final String f8538u0 = "progress";

    /* renamed from: v  reason: collision with root package name */
    public static final int f8539v = 0;

    /* renamed from: v0  reason: collision with root package name */
    public static final String f8540v0 = "social";

    /* renamed from: w  reason: collision with root package name */
    public static final int f8541w = -1;

    /* renamed from: w0  reason: collision with root package name */
    public static final String f8542w0 = "err";

    /* renamed from: x  reason: collision with root package name */
    public static final int f8543x = -2;

    /* renamed from: x0  reason: collision with root package name */
    public static final String f8544x0 = "transport";

    /* renamed from: y  reason: collision with root package name */
    public static final int f8545y = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final String f8546y0 = "sys";

    /* renamed from: z  reason: collision with root package name */
    public static final int f8547z = 2;

    /* renamed from: z0  reason: collision with root package name */
    public static final String f8548z0 = "service";

    public static class b {

        /* renamed from: l  reason: collision with root package name */
        public static final int f8549l = 0;

        /* renamed from: m  reason: collision with root package name */
        public static final int f8550m = 1;

        /* renamed from: n  reason: collision with root package name */
        public static final int f8551n = 2;

        /* renamed from: o  reason: collision with root package name */
        public static final int f8552o = 3;

        /* renamed from: p  reason: collision with root package name */
        public static final int f8553p = 4;

        /* renamed from: q  reason: collision with root package name */
        public static final int f8554q = 5;

        /* renamed from: r  reason: collision with root package name */
        public static final int f8555r = 6;

        /* renamed from: s  reason: collision with root package name */
        public static final int f8556s = 7;

        /* renamed from: t  reason: collision with root package name */
        public static final int f8557t = 8;

        /* renamed from: u  reason: collision with root package name */
        public static final int f8558u = 9;

        /* renamed from: v  reason: collision with root package name */
        public static final int f8559v = 10;

        /* renamed from: w  reason: collision with root package name */
        public static final String f8560w = "android.support.action.showsUserInterface";

        /* renamed from: x  reason: collision with root package name */
        public static final String f8561x = "android.support.action.semanticAction";

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f8562a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f8563b;

        /* renamed from: c  reason: collision with root package name */
        public final v2[] f8564c;

        /* renamed from: d  reason: collision with root package name */
        public final v2[] f8565d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8566e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8567f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8568g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8569h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f8570i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f8571j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f8572k;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final IconCompat f8573a;

            /* renamed from: b  reason: collision with root package name */
            public final CharSequence f8574b;

            /* renamed from: c  reason: collision with root package name */
            public final PendingIntent f8575c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f8576d;

            /* renamed from: e  reason: collision with root package name */
            public final Bundle f8577e;

            /* renamed from: f  reason: collision with root package name */
            public ArrayList<v2> f8578f;

            /* renamed from: g  reason: collision with root package name */
            public int f8579g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f8580h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f8581i;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public a(int i10, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.z((Resources) null, "", i10) : null, charSequence, pendingIntent, new Bundle(), (v2[]) null, true, 0, true, false);
            }

            public a(@o0 IconCompat iconCompat, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (v2[]) null, true, 0, true, false);
            }

            public a(@o0 IconCompat iconCompat, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent, @m0 Bundle bundle, @o0 v2[] v2VarArr, boolean z10, int i10, boolean z11, boolean z12) {
                this.f8576d = true;
                this.f8580h = true;
                this.f8573a = iconCompat;
                this.f8574b = g.z(charSequence);
                this.f8575c = pendingIntent;
                this.f8577e = bundle;
                this.f8578f = v2VarArr == null ? null : new ArrayList<>(Arrays.asList(v2VarArr));
                this.f8576d = z10;
                this.f8579g = i10;
                this.f8580h = z11;
                this.f8581i = z12;
            }

            public a(@m0 b bVar) {
                this(bVar.f(), bVar.f8571j, bVar.f8572k, new Bundle(bVar.f8562a), bVar.g(), bVar.b(), bVar.h(), bVar.f8567f, bVar.k());
            }

            @t0(19)
            @x0({x0.a.LIBRARY_GROUP_PREFIX})
            @m0
            public static a f(@m0 Notification.Action action) {
                a aVar = action.getIcon() != null ? new a(IconCompat.o(action.getIcon()), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput e10 : remoteInputs) {
                        aVar.b(v2.e(e10));
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    aVar.f8576d = action.getAllowGeneratedReplies();
                }
                if (i10 >= 28) {
                    aVar.j(action.getSemanticAction());
                }
                if (i10 >= 29) {
                    aVar.i(action.isContextual());
                }
                return aVar;
            }

            @m0
            public a a(@o0 Bundle bundle) {
                if (bundle != null) {
                    this.f8577e.putAll(bundle);
                }
                return this;
            }

            @m0
            public a b(@o0 v2 v2Var) {
                if (this.f8578f == null) {
                    this.f8578f = new ArrayList<>();
                }
                if (v2Var != null) {
                    this.f8578f.add(v2Var);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            @d.m0
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public h0.u0.b c() {
                /*
                    r15 = this;
                    r15.d()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList<h0.v2> r2 = r15.f8578f
                    if (r2 == 0) goto L_0x002f
                    java.util.Iterator r2 = r2.iterator()
                L_0x0015:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x002f
                    java.lang.Object r3 = r2.next()
                    h0.v2 r3 = (h0.v2) r3
                    boolean r4 = r3.r()
                    if (r4 == 0) goto L_0x002b
                    r0.add(r3)
                    goto L_0x0015
                L_0x002b:
                    r1.add(r3)
                    goto L_0x0015
                L_0x002f:
                    boolean r2 = r0.isEmpty()
                    r3 = 0
                    if (r2 == 0) goto L_0x0038
                    r10 = r3
                    goto L_0x0045
                L_0x0038:
                    int r2 = r0.size()
                    h0.v2[] r2 = new h0.v2[r2]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    h0.v2[] r0 = (h0.v2[]) r0
                    r10 = r0
                L_0x0045:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto L_0x004c
                    goto L_0x0059
                L_0x004c:
                    int r0 = r1.size()
                    h0.v2[] r0 = new h0.v2[r0]
                    java.lang.Object[] r0 = r1.toArray(r0)
                    r3 = r0
                    h0.v2[] r3 = (h0.v2[]) r3
                L_0x0059:
                    r9 = r3
                    h0.u0$b r0 = new h0.u0$b
                    androidx.core.graphics.drawable.IconCompat r5 = r15.f8573a
                    java.lang.CharSequence r6 = r15.f8574b
                    android.app.PendingIntent r7 = r15.f8575c
                    android.os.Bundle r8 = r15.f8577e
                    boolean r11 = r15.f8576d
                    int r12 = r15.f8579g
                    boolean r13 = r15.f8580h
                    boolean r14 = r15.f8581i
                    r4 = r0
                    r4.<init>((androidx.core.graphics.drawable.IconCompat) r5, (java.lang.CharSequence) r6, (android.app.PendingIntent) r7, (android.os.Bundle) r8, (h0.v2[]) r9, (h0.v2[]) r10, (boolean) r11, (int) r12, (boolean) r13, (boolean) r14)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: h0.u0.b.a.c():h0.u0$b");
            }

            public final void d() {
                if (this.f8581i && this.f8575c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @m0
            public a e(@m0 C0141b bVar) {
                bVar.a(this);
                return this;
            }

            @m0
            public Bundle g() {
                return this.f8577e;
            }

            @m0
            public a h(boolean z10) {
                this.f8576d = z10;
                return this;
            }

            @m0
            public a i(boolean z10) {
                this.f8581i = z10;
                return this;
            }

            @m0
            public a j(int i10) {
                this.f8579g = i10;
                return this;
            }

            @m0
            public a k(boolean z10) {
                this.f8580h = z10;
                return this;
            }
        }

        /* renamed from: h0.u0$b$b  reason: collision with other inner class name */
        public interface C0141b {
            @m0
            a a(@m0 a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        public static final class d implements C0141b {

            /* renamed from: e  reason: collision with root package name */
            public static final String f8582e = "android.wearable.EXTENSIONS";

            /* renamed from: f  reason: collision with root package name */
            public static final String f8583f = "flags";

            /* renamed from: g  reason: collision with root package name */
            public static final String f8584g = "inProgressLabel";

            /* renamed from: h  reason: collision with root package name */
            public static final String f8585h = "confirmLabel";

            /* renamed from: i  reason: collision with root package name */
            public static final String f8586i = "cancelLabel";

            /* renamed from: j  reason: collision with root package name */
            public static final int f8587j = 1;

            /* renamed from: k  reason: collision with root package name */
            public static final int f8588k = 2;

            /* renamed from: l  reason: collision with root package name */
            public static final int f8589l = 4;

            /* renamed from: m  reason: collision with root package name */
            public static final int f8590m = 1;

            /* renamed from: a  reason: collision with root package name */
            public int f8591a = 1;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f8592b;

            /* renamed from: c  reason: collision with root package name */
            public CharSequence f8593c;

            /* renamed from: d  reason: collision with root package name */
            public CharSequence f8594d;

            public d() {
            }

            public d(@m0 b bVar) {
                Bundle bundle = bVar.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f8591a = bundle.getInt("flags", 1);
                    this.f8592b = bundle.getCharSequence(f8584g);
                    this.f8593c = bundle.getCharSequence(f8585h);
                    this.f8594d = bundle.getCharSequence(f8586i);
                }
            }

            @m0
            public a a(@m0 a aVar) {
                Bundle bundle = new Bundle();
                int i10 = this.f8591a;
                if (i10 != 1) {
                    bundle.putInt("flags", i10);
                }
                CharSequence charSequence = this.f8592b;
                if (charSequence != null) {
                    bundle.putCharSequence(f8584g, charSequence);
                }
                CharSequence charSequence2 = this.f8593c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f8585h, charSequence2);
                }
                CharSequence charSequence3 = this.f8594d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f8586i, charSequence3);
                }
                aVar.g().putBundle("android.wearable.EXTENSIONS", bundle);
                return aVar;
            }

            @m0
            /* renamed from: b */
            public d clone() {
                d dVar = new d();
                dVar.f8591a = this.f8591a;
                dVar.f8592b = this.f8592b;
                dVar.f8593c = this.f8593c;
                dVar.f8594d = this.f8594d;
                return dVar;
            }

            @o0
            @Deprecated
            public CharSequence c() {
                return this.f8594d;
            }

            @o0
            @Deprecated
            public CharSequence d() {
                return this.f8593c;
            }

            public boolean e() {
                return (this.f8591a & 4) != 0;
            }

            public boolean f() {
                return (this.f8591a & 2) != 0;
            }

            @o0
            @Deprecated
            public CharSequence g() {
                return this.f8592b;
            }

            public boolean h() {
                return (this.f8591a & 1) != 0;
            }

            @m0
            public d i(boolean z10) {
                l(1, z10);
                return this;
            }

            @Deprecated
            @m0
            public d j(@o0 CharSequence charSequence) {
                this.f8594d = charSequence;
                return this;
            }

            @Deprecated
            @m0
            public d k(@o0 CharSequence charSequence) {
                this.f8593c = charSequence;
                return this;
            }

            public final void l(int i10, boolean z10) {
                int i11;
                if (z10) {
                    i11 = i10 | this.f8591a;
                } else {
                    i11 = (~i10) & this.f8591a;
                }
                this.f8591a = i11;
            }

            @m0
            public d m(boolean z10) {
                l(4, z10);
                return this;
            }

            @m0
            public d n(boolean z10) {
                l(2, z10);
                return this;
            }

            @Deprecated
            @m0
            public d o(@o0 CharSequence charSequence) {
                this.f8592b = charSequence;
                return this;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(int i10, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.z((Resources) null, "", i10) : null, charSequence, pendingIntent);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(int i10, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent, @o0 Bundle bundle, @o0 v2[] v2VarArr, @o0 v2[] v2VarArr2, boolean z10, int i11, boolean z11, boolean z12) {
            this(i10 != 0 ? IconCompat.z((Resources) null, "", i10) : null, charSequence, pendingIntent, bundle, v2VarArr, v2VarArr2, z10, i11, z11, z12);
        }

        public b(@o0 IconCompat iconCompat, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (v2[]) null, (v2[]) null, true, 0, true, false);
        }

        public b(@o0 IconCompat iconCompat, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent, @o0 Bundle bundle, @o0 v2[] v2VarArr, @o0 v2[] v2VarArr2, boolean z10, int i10, boolean z11, boolean z12) {
            this.f8567f = true;
            this.f8563b = iconCompat;
            if (iconCompat != null && iconCompat.G() == 2) {
                this.f8570i = iconCompat.B();
            }
            this.f8571j = g.z(charSequence);
            this.f8572k = pendingIntent;
            this.f8562a = bundle == null ? new Bundle() : bundle;
            this.f8564c = v2VarArr;
            this.f8565d = v2VarArr2;
            this.f8566e = z10;
            this.f8568g = i10;
            this.f8567f = z11;
            this.f8569h = z12;
        }

        @o0
        public PendingIntent a() {
            return this.f8572k;
        }

        public boolean b() {
            return this.f8566e;
        }

        @o0
        public v2[] c() {
            return this.f8565d;
        }

        @m0
        public Bundle d() {
            return this.f8562a;
        }

        @Deprecated
        public int e() {
            return this.f8570i;
        }

        @o0
        public IconCompat f() {
            int i10;
            if (this.f8563b == null && (i10 = this.f8570i) != 0) {
                this.f8563b = IconCompat.z((Resources) null, "", i10);
            }
            return this.f8563b;
        }

        @o0
        public v2[] g() {
            return this.f8564c;
        }

        public int h() {
            return this.f8568g;
        }

        public boolean i() {
            return this.f8567f;
        }

        @o0
        public CharSequence j() {
            return this.f8571j;
        }

        public boolean k() {
            return this.f8569h;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static class d extends p {

        /* renamed from: h  reason: collision with root package name */
        public static final String f8595h = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f8596e;

        /* renamed from: f  reason: collision with root package name */
        public IconCompat f8597f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8598g;

        @t0(16)
        public static class a {
            private a() {
            }

            @t0(16)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @t0(16)
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @t0(23)
        public static class b {
            private b() {
            }

            @t0(23)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public d() {
        }

        public d(@o0 g gVar) {
            z(gVar);
        }

        @o0
        public static IconCompat A(@o0 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.o((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.u((Bitmap) parcelable);
            }
            return null;
        }

        @m0
        public d B(@o0 Bitmap bitmap) {
            this.f8597f = bitmap == null ? null : IconCompat.u(bitmap);
            this.f8598g = true;
            return this;
        }

        @m0
        public d C(@o0 Bitmap bitmap) {
            this.f8596e = bitmap;
            return this;
        }

        @m0
        public d D(@o0 CharSequence charSequence) {
            this.f8697b = g.z(charSequence);
            return this;
        }

        @m0
        public d E(@o0 CharSequence charSequence) {
            this.f8698c = g.z(charSequence);
            this.f8699d = true;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void b(w wVar) {
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(wVar.a()).setBigContentTitle(this.f8697b).bigPicture(this.f8596e);
            if (this.f8598g) {
                Context context = null;
                if (this.f8597f == null) {
                    a.a(bigPicture, (Bitmap) null);
                } else {
                    if (wVar instanceof u1) {
                        context = ((u1) wVar).f();
                    }
                    b.a(bigPicture, this.f8597f.R(context));
                }
            }
            if (this.f8699d) {
                a.b(bigPicture, this.f8698c);
            }
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void g(@m0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(u0.K);
            bundle.remove(u0.S);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @m0
        public String t() {
            return f8595h;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void y(@m0 Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(u0.K)) {
                this.f8597f = A(bundle.getParcelable(u0.K));
                this.f8598g = true;
            }
            this.f8596e = (Bitmap) bundle.getParcelable(u0.S);
        }
    }

    public static class e extends p {

        /* renamed from: f  reason: collision with root package name */
        public static final String f8599f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f8600e;

        public e() {
        }

        public e(@o0 g gVar) {
            z(gVar);
        }

        @m0
        public e A(@o0 CharSequence charSequence) {
            this.f8600e = g.z(charSequence);
            return this;
        }

        @m0
        public e B(@o0 CharSequence charSequence) {
            this.f8697b = g.z(charSequence);
            return this;
        }

        @m0
        public e C(@o0 CharSequence charSequence) {
            this.f8698c = g.z(charSequence);
            this.f8699d = true;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void a(@m0 Bundle bundle) {
            super.a(bundle);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void b(w wVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(wVar.a()).setBigContentTitle(this.f8697b).bigText(this.f8600e);
            if (this.f8699d) {
                bigText.setSummaryText(this.f8698c);
            }
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void g(@m0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(u0.H);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @m0
        public String t() {
            return f8599f;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void y(@m0 Bundle bundle) {
            super.y(bundle);
            this.f8600e = bundle.getCharSequence(u0.H);
        }
    }

    public static final class f {

        /* renamed from: h  reason: collision with root package name */
        public static final int f8601h = 1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f8602i = 2;

        /* renamed from: a  reason: collision with root package name */
        public PendingIntent f8603a;

        /* renamed from: b  reason: collision with root package name */
        public PendingIntent f8604b;

        /* renamed from: c  reason: collision with root package name */
        public IconCompat f8605c;

        /* renamed from: d  reason: collision with root package name */
        public int f8606d;
        @d.p

        /* renamed from: e  reason: collision with root package name */
        public int f8607e;

        /* renamed from: f  reason: collision with root package name */
        public int f8608f;

        /* renamed from: g  reason: collision with root package name */
        public String f8609g;

        @t0(29)
        public static class a {
            private a() {
            }

            @t0(29)
            @o0
            public static f a(@o0 Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null || notification$BubbleMetadata.getIntent() == null) {
                    return null;
                }
                c i10 = new c(notification$BubbleMetadata.getIntent(), IconCompat.o(notification$BubbleMetadata.getIcon())).b(notification$BubbleMetadata.getAutoExpandBubble()).c(notification$BubbleMetadata.getDeleteIntent()).i(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    i10.d(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    i10.e(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return i10.a();
            }

            @t0(29)
            @o0
            public static Notification$BubbleMetadata b(@o0 f fVar) {
                if (fVar == null || fVar.g() == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder suppressNotification = new Notification$BubbleMetadata.Builder().setIcon(fVar.f().Q()).setIntent(fVar.g()).setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    suppressNotification.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(fVar.e());
                }
                return suppressNotification.build();
            }
        }

        @t0(30)
        public static class b {
            private b() {
            }

            @t0(30)
            @o0
            public static f a(@o0 Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null) {
                    return null;
                }
                c cVar = notification$BubbleMetadata.getShortcutId() != null ? new c(notification$BubbleMetadata.getShortcutId()) : new c(notification$BubbleMetadata.getIntent(), IconCompat.o(notification$BubbleMetadata.getIcon()));
                cVar.b(notification$BubbleMetadata.getAutoExpandBubble()).c(notification$BubbleMetadata.getDeleteIntent()).i(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @t0(30)
            @o0
            public static Notification$BubbleMetadata b(@o0 f fVar) {
                if (fVar == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder builder = fVar.h() != null ? new Notification$BubbleMetadata.Builder(fVar.h()) : new Notification$BubbleMetadata.Builder(fVar.g(), fVar.f().Q());
                builder.setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    builder.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    builder.setDesiredHeightResId(fVar.e());
                }
                return builder.build();
            }
        }

        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            public PendingIntent f8610a;

            /* renamed from: b  reason: collision with root package name */
            public IconCompat f8611b;

            /* renamed from: c  reason: collision with root package name */
            public int f8612c;
            @d.p

            /* renamed from: d  reason: collision with root package name */
            public int f8613d;

            /* renamed from: e  reason: collision with root package name */
            public int f8614e;

            /* renamed from: f  reason: collision with root package name */
            public PendingIntent f8615f;

            /* renamed from: g  reason: collision with root package name */
            public String f8616g;

            @Deprecated
            public c() {
            }

            public c(@m0 PendingIntent pendingIntent, @m0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (iconCompat != null) {
                    this.f8610a = pendingIntent;
                    this.f8611b = iconCompat;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            @t0(30)
            public c(@m0 String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f8616g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            @SuppressLint({"SyntheticAccessor"})
            @m0
            public f a() {
                String str = this.f8616g;
                if (str == null && this.f8610a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (str == null && this.f8611b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    f fVar = new f(this.f8610a, this.f8615f, this.f8611b, this.f8612c, this.f8613d, this.f8614e, str);
                    fVar.j(this.f8614e);
                    return fVar;
                }
            }

            @m0
            public c b(boolean z10) {
                f(1, z10);
                return this;
            }

            @m0
            public c c(@o0 PendingIntent pendingIntent) {
                this.f8615f = pendingIntent;
                return this;
            }

            @m0
            public c d(@d.q(unit = 0) int i10) {
                this.f8612c = Math.max(i10, 0);
                this.f8613d = 0;
                return this;
            }

            @m0
            public c e(@d.p int i10) {
                this.f8613d = i10;
                this.f8612c = 0;
                return this;
            }

            @m0
            public final c f(int i10, boolean z10) {
                int i11;
                if (z10) {
                    i11 = i10 | this.f8614e;
                } else {
                    i11 = (~i10) & this.f8614e;
                }
                this.f8614e = i11;
                return this;
            }

            @m0
            public c g(@m0 IconCompat iconCompat) {
                if (this.f8616g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (iconCompat != null) {
                    this.f8611b = iconCompat;
                    return this;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            @m0
            public c h(@m0 PendingIntent pendingIntent) {
                if (this.f8616g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (pendingIntent != null) {
                    this.f8610a = pendingIntent;
                    return this;
                } else {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
            }

            @m0
            public c i(boolean z10) {
                f(2, z10);
                return this;
            }
        }

        public f(@o0 PendingIntent pendingIntent, @o0 PendingIntent pendingIntent2, @o0 IconCompat iconCompat, int i10, @d.p int i11, int i12, @o0 String str) {
            this.f8603a = pendingIntent;
            this.f8605c = iconCompat;
            this.f8606d = i10;
            this.f8607e = i11;
            this.f8604b = pendingIntent2;
            this.f8608f = i12;
            this.f8609g = str;
        }

        @o0
        public static f a(@o0 Notification$BubbleMetadata notification$BubbleMetadata) {
            if (notification$BubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(notification$BubbleMetadata);
            }
            if (i10 == 29) {
                return a.a(notification$BubbleMetadata);
            }
            return null;
        }

        @o0
        public static Notification$BubbleMetadata k(@o0 f fVar) {
            if (fVar == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.b(fVar);
            }
            if (i10 == 29) {
                return a.b(fVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f8608f & 1) != 0;
        }

        @o0
        public PendingIntent c() {
            return this.f8604b;
        }

        @d.q(unit = 0)
        public int d() {
            return this.f8606d;
        }

        @d.p
        public int e() {
            return this.f8607e;
        }

        @o0
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f8605c;
        }

        @o0
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f8603a;
        }

        @o0
        public String h() {
            return this.f8609g;
        }

        public boolean i() {
            return (this.f8608f & 2) != 0;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void j(int i10) {
            this.f8608f = i10;
        }
    }

    public static class g {
        public static final int X = 5120;
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public i0.m O;
        public long P;
        public int Q;
        public boolean R;
        public f S;
        public Notification T;
        public boolean U;
        public Icon V;
        @Deprecated
        public ArrayList<String> W;
        @x0({x0.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a  reason: collision with root package name */
        public Context f8617a;
        @x0({x0.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f8618b;
        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @m0

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<l2> f8619c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f8620d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f8621e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f8622f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f8623g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f8624h;

        /* renamed from: i  reason: collision with root package name */
        public RemoteViews f8625i;

        /* renamed from: j  reason: collision with root package name */
        public Bitmap f8626j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f8627k;

        /* renamed from: l  reason: collision with root package name */
        public int f8628l;

        /* renamed from: m  reason: collision with root package name */
        public int f8629m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f8630n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f8631o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f8632p;

        /* renamed from: q  reason: collision with root package name */
        public p f8633q;

        /* renamed from: r  reason: collision with root package name */
        public CharSequence f8634r;

        /* renamed from: s  reason: collision with root package name */
        public CharSequence f8635s;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence[] f8636t;

        /* renamed from: u  reason: collision with root package name */
        public int f8637u;

        /* renamed from: v  reason: collision with root package name */
        public int f8638v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f8639w;

        /* renamed from: x  reason: collision with root package name */
        public String f8640x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f8641y;

        /* renamed from: z  reason: collision with root package name */
        public String f8642z;

        @Deprecated
        public g(@m0 Context context) {
            this(context, (String) null);
        }

        @t0(19)
        public g(@m0 Context context, @m0 Notification notification) {
            this(context, u0.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            p s10 = p.s(notification);
            O(u0.m(notification)).N(u0.l(notification)).L(u0.k(notification)).y0(u0.D(notification)).m0(u0.z(notification)).x0(s10).M(notification.contentIntent).X(u0.o(notification)).Z(u0.H(notification)).d0(u0.t(notification)).F0(notification.when).p0(u0.B(notification)).C0(u0.F(notification)).C(u0.e(notification)).h0(u0.w(notification)).g0(u0.v(notification)).c0(u0.s(notification)).a0(notification.largeIcon).D(u0.f(notification)).F(u0.h(notification)).E(u0.g(notification)).f0(notification.number).z0(notification.tickerText).M(notification.contentIntent).T(notification.deleteIntent).W(notification.fullScreenIntent, u0.q(notification)).w0(notification.sound, notification.audioStreamType).D0(notification.vibrate).b0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).S(notification.defaults).i0(notification.priority).I(u0.j(notification)).E0(u0.G(notification)).k0(u0.y(notification)).u0(u0.C(notification)).B0(u0.E(notification)).n0(u0.A(notification)).j0(bundle.getInt(u0.M), bundle.getInt(u0.L), bundle.getBoolean(u0.N)).B(u0.d(notification)).s0(notification.icon, notification.iconLevel).c(u(notification, s10));
            this.V = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action f10 : actionArr) {
                    b(b.a.f(f10).c());
                }
            }
            List<b> r10 = u0.r(notification);
            if (!r10.isEmpty()) {
                for (b e10 : r10) {
                    e(e10);
                }
            }
            String[] stringArray = notification.extras.getStringArray(u0.W);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String g10 : stringArray) {
                    g(g10);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(u0.X)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    f(l2.a((Person) it.next()));
                }
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24 && bundle.containsKey(u0.P)) {
                H(bundle.getBoolean(u0.P));
            }
            if (i10 >= 26 && bundle.containsKey(u0.Q)) {
                J(bundle.getBoolean(u0.Q));
            }
        }

        public g(@m0 Context context, @m0 String str) {
            this.f8618b = new ArrayList<>();
            this.f8619c = new ArrayList<>();
            this.f8620d = new ArrayList<>();
            this.f8630n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f8617a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f8629m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        @t0(19)
        @o0
        public static Bundle u(@m0 Notification notification, @o0 p pVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(u0.A);
            bundle.remove(u0.C);
            bundle.remove(u0.F);
            bundle.remove(u0.D);
            bundle.remove(u0.f8499b);
            bundle.remove(u0.f8501c);
            bundle.remove(u0.R);
            bundle.remove(u0.L);
            bundle.remove(u0.M);
            bundle.remove(u0.N);
            bundle.remove(u0.P);
            bundle.remove(u0.Q);
            bundle.remove(u0.X);
            bundle.remove(u0.W);
            bundle.remove(v1.f8740d);
            bundle.remove(v1.f8738b);
            bundle.remove(v1.f8739c);
            bundle.remove(v1.f8737a);
            bundle.remove(v1.f8741e);
            Bundle bundle2 = bundle.getBundle(h.f8643d);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(h.f8647h);
                bundle.putBundle(h.f8643d, bundle3);
            }
            if (pVar != null) {
                pVar.g(bundle);
            }
            return bundle;
        }

        @o0
        public static CharSequence z(@o0 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        @o0
        public final Bitmap A(@o0 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f8617a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        @Deprecated
        @m0
        public g A0(@o0 CharSequence charSequence, @o0 RemoteViews remoteViews) {
            this.T.tickerText = z(charSequence);
            this.f8625i = remoteViews;
            return this;
        }

        @m0
        public g B(boolean z10) {
            this.R = z10;
            return this;
        }

        @m0
        public g B0(long j10) {
            this.P = j10;
            return this;
        }

        @m0
        public g C(boolean z10) {
            V(16, z10);
            return this;
        }

        @m0
        public g C0(boolean z10) {
            this.f8631o = z10;
            return this;
        }

        @m0
        public g D(int i10) {
            this.M = i10;
            return this;
        }

        @m0
        public g D0(@o0 long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        @m0
        public g E(@o0 f fVar) {
            this.S = fVar;
            return this;
        }

        @m0
        public g E0(int i10) {
            this.G = i10;
            return this;
        }

        @m0
        public g F(@o0 String str) {
            this.D = str;
            return this;
        }

        @m0
        public g F0(long j10) {
            this.T.when = j10;
            return this;
        }

        @m0
        public g G(@m0 String str) {
            this.L = str;
            return this;
        }

        public final boolean G0() {
            p pVar = this.f8633q;
            return pVar == null || !pVar.r();
        }

        @t0(24)
        @m0
        public g H(boolean z10) {
            this.f8632p = z10;
            t().putBoolean(u0.P, z10);
            return this;
        }

        @m0
        public g I(@d.l int i10) {
            this.F = i10;
            return this;
        }

        @m0
        public g J(boolean z10) {
            this.B = z10;
            this.C = true;
            return this;
        }

        @m0
        public g K(@o0 RemoteViews remoteViews) {
            this.T.contentView = remoteViews;
            return this;
        }

        @m0
        public g L(@o0 CharSequence charSequence) {
            this.f8627k = z(charSequence);
            return this;
        }

        @m0
        public g M(@o0 PendingIntent pendingIntent) {
            this.f8623g = pendingIntent;
            return this;
        }

        @m0
        public g N(@o0 CharSequence charSequence) {
            this.f8622f = z(charSequence);
            return this;
        }

        @m0
        public g O(@o0 CharSequence charSequence) {
            this.f8621e = z(charSequence);
            return this;
        }

        @m0
        public g P(@o0 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @m0
        public g Q(@o0 RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @m0
        public g R(@o0 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @m0
        public g S(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @m0
        public g T(@o0 PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        @m0
        public g U(@o0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public final void V(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.T;
                i11 = i10 | notification.flags;
            } else {
                notification = this.T;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        @m0
        public g W(@o0 PendingIntent pendingIntent, boolean z10) {
            this.f8624h = pendingIntent;
            V(128, z10);
            return this;
        }

        @m0
        public g X(@o0 String str) {
            this.f8640x = str;
            return this;
        }

        @m0
        public g Y(int i10) {
            this.Q = i10;
            return this;
        }

        @m0
        public g Z(boolean z10) {
            this.f8641y = z10;
            return this;
        }

        @m0
        public g a(int i10, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent) {
            this.f8618b.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        @m0
        public g a0(@o0 Bitmap bitmap) {
            this.f8626j = A(bitmap);
            return this;
        }

        @m0
        public g b(@o0 b bVar) {
            if (bVar != null) {
                this.f8618b.add(bVar);
            }
            return this;
        }

        @m0
        public g b0(@d.l int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        @m0
        public g c(@o0 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @m0
        public g c0(boolean z10) {
            this.A = z10;
            return this;
        }

        @t0(21)
        @m0
        public g d(int i10, @o0 CharSequence charSequence, @o0 PendingIntent pendingIntent) {
            this.f8620d.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        @m0
        public g d0(@o0 i0.m mVar) {
            this.O = mVar;
            return this;
        }

        @t0(21)
        @m0
        public g e(@o0 b bVar) {
            if (bVar != null) {
                this.f8620d.add(bVar);
            }
            return this;
        }

        @Deprecated
        @m0
        public g e0() {
            this.U = true;
            return this;
        }

        @m0
        public g f(@o0 l2 l2Var) {
            if (l2Var != null) {
                this.f8619c.add(l2Var);
            }
            return this;
        }

        @m0
        public g f0(int i10) {
            this.f8628l = i10;
            return this;
        }

        @Deprecated
        @m0
        public g g(@o0 String str) {
            if (str != null && !str.isEmpty()) {
                this.W.add(str);
            }
            return this;
        }

        @m0
        public g g0(boolean z10) {
            V(2, z10);
            return this;
        }

        @m0
        public Notification h() {
            return new u1(this).c();
        }

        @m0
        public g h0(boolean z10) {
            V(8, z10);
            return this;
        }

        @m0
        public g i() {
            this.f8618b.clear();
            return this;
        }

        @m0
        public g i0(int i10) {
            this.f8629m = i10;
            return this;
        }

        @m0
        public g j() {
            this.f8620d.clear();
            Bundle bundle = this.E.getBundle(h.f8643d);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(h.f8647h);
                this.E.putBundle(h.f8643d, bundle2);
            }
            return this;
        }

        @m0
        public g j0(int i10, int i11, boolean z10) {
            this.f8637u = i10;
            this.f8638v = i11;
            this.f8639w = z10;
            return this;
        }

        @m0
        public g k() {
            this.f8619c.clear();
            this.W.clear();
            return this;
        }

        @m0
        public g k0(@o0 Notification notification) {
            this.H = notification;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            RemoteViews v10;
            int i10 = Build.VERSION.SDK_INT;
            if (this.J != null && G0()) {
                return this.J;
            }
            u1 u1Var = new u1(this);
            p pVar = this.f8633q;
            if (pVar != null && (v10 = pVar.v(u1Var)) != null) {
                return v10;
            }
            Notification c10 = u1Var.c();
            return i10 >= 24 ? Notification.Builder.recoverBuilder(this.f8617a, c10).createBigContentView() : c10.bigContentView;
        }

        @m0
        public g l0(@o0 CharSequence[] charSequenceArr) {
            this.f8636t = charSequenceArr;
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            RemoteViews w10;
            if (this.I != null && G0()) {
                return this.I;
            }
            u1 u1Var = new u1(this);
            p pVar = this.f8633q;
            if (pVar != null && (w10 = pVar.w(u1Var)) != null) {
                return w10;
            }
            Notification c10 = u1Var.c();
            return Build.VERSION.SDK_INT >= 24 ? Notification.Builder.recoverBuilder(this.f8617a, c10).createContentView() : c10.contentView;
        }

        @m0
        public g m0(@o0 CharSequence charSequence) {
            this.f8635s = z(charSequence);
            return this;
        }

        @o0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            RemoteViews x10;
            int i10 = Build.VERSION.SDK_INT;
            if (this.K != null && G0()) {
                return this.K;
            }
            u1 u1Var = new u1(this);
            p pVar = this.f8633q;
            if (pVar != null && (x10 = pVar.x(u1Var)) != null) {
                return x10;
            }
            Notification c10 = u1Var.c();
            return i10 >= 24 ? Notification.Builder.recoverBuilder(this.f8617a, c10).createHeadsUpContentView() : c10.headsUpContentView;
        }

        @m0
        public g n0(@o0 String str) {
            this.N = str;
            return this;
        }

        @m0
        public g o(@m0 j jVar) {
            jVar.a(this);
            return this;
        }

        @m0
        public g o0(@o0 j0.o oVar) {
            i0.m mVar;
            if (oVar == null) {
                return this;
            }
            this.N = oVar.j();
            if (this.O == null) {
                if (oVar.n() != null) {
                    mVar = oVar.n();
                } else if (oVar.j() != null) {
                    mVar = new i0.m(oVar.j());
                }
                this.O = mVar;
            }
            if (this.f8621e == null) {
                O(oVar.v());
            }
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.J;
        }

        @m0
        public g p0(boolean z10) {
            this.f8630n = z10;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @o0
        public f q() {
            return this.S;
        }

        @m0
        public g q0(boolean z10) {
            this.U = z10;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @d.l
        public int r() {
            return this.F;
        }

        @m0
        public g r0(int i10) {
            this.T.icon = i10;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.I;
        }

        @m0
        public g s0(int i10, int i11) {
            Notification notification = this.T;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        @m0
        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        @t0(23)
        @m0
        public g t0(@m0 IconCompat iconCompat) {
            this.V = iconCompat.R(this.f8617a);
            return this;
        }

        @m0
        public g u0(@o0 String str) {
            this.f8642z = str;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v() {
            return this.K;
        }

        @m0
        public g v0(@o0 Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @Deprecated
        @m0
        public Notification w() {
            return h();
        }

        @m0
        public g w0(@o0 Uri uri, int i10) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = i10;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i10).build();
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public int x() {
            return this.f8629m;
        }

        @m0
        public g x0(@o0 p pVar) {
            if (this.f8633q != pVar) {
                this.f8633q = pVar;
                if (pVar != null) {
                    pVar.z(this);
                }
            }
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public long y() {
            if (this.f8630n) {
                return this.T.when;
            }
            return 0;
        }

        @m0
        public g y0(@o0 CharSequence charSequence) {
            this.f8634r = z(charSequence);
            return this;
        }

        @m0
        public g z0(@o0 CharSequence charSequence) {
            this.T.tickerText = z(charSequence);
            return this;
        }
    }

    public static final class h implements j {
        @x0({x0.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: d  reason: collision with root package name */
        public static final String f8643d = "android.car.EXTENSIONS";

        /* renamed from: e  reason: collision with root package name */
        public static final String f8644e = "large_icon";

        /* renamed from: f  reason: collision with root package name */
        public static final String f8645f = "car_conversation";

        /* renamed from: g  reason: collision with root package name */
        public static final String f8646g = "app_color";
        @x0({x0.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: h  reason: collision with root package name */
        public static final String f8647h = "invisible_actions";

        /* renamed from: i  reason: collision with root package name */
        public static final String f8648i = "author";

        /* renamed from: j  reason: collision with root package name */
        public static final String f8649j = "text";

        /* renamed from: k  reason: collision with root package name */
        public static final String f8650k = "messages";

        /* renamed from: l  reason: collision with root package name */
        public static final String f8651l = "remote_input";

        /* renamed from: m  reason: collision with root package name */
        public static final String f8652m = "on_reply";

        /* renamed from: n  reason: collision with root package name */
        public static final String f8653n = "on_read";

        /* renamed from: o  reason: collision with root package name */
        public static final String f8654o = "participants";

        /* renamed from: p  reason: collision with root package name */
        public static final String f8655p = "timestamp";

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f8656a;

        /* renamed from: b  reason: collision with root package name */
        public a f8657b;

        /* renamed from: c  reason: collision with root package name */
        public int f8658c = 0;

        @Deprecated
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final String[] f8659a;

            /* renamed from: b  reason: collision with root package name */
            public final v2 f8660b;

            /* renamed from: c  reason: collision with root package name */
            public final PendingIntent f8661c;

            /* renamed from: d  reason: collision with root package name */
            public final PendingIntent f8662d;

            /* renamed from: e  reason: collision with root package name */
            public final String[] f8663e;

            /* renamed from: f  reason: collision with root package name */
            public final long f8664f;

            /* renamed from: h0.u0$h$a$a  reason: collision with other inner class name */
            public static class C0142a {

                /* renamed from: a  reason: collision with root package name */
                public final List<String> f8665a = new ArrayList();

                /* renamed from: b  reason: collision with root package name */
                public final String f8666b;

                /* renamed from: c  reason: collision with root package name */
                public v2 f8667c;

                /* renamed from: d  reason: collision with root package name */
                public PendingIntent f8668d;

                /* renamed from: e  reason: collision with root package name */
                public PendingIntent f8669e;

                /* renamed from: f  reason: collision with root package name */
                public long f8670f;

                public C0142a(@m0 String str) {
                    this.f8666b = str;
                }

                @m0
                public C0142a a(@o0 String str) {
                    if (str != null) {
                        this.f8665a.add(str);
                    }
                    return this;
                }

                @m0
                public a b() {
                    List<String> list = this.f8665a;
                    return new a((String[]) list.toArray(new String[list.size()]), this.f8667c, this.f8669e, this.f8668d, new String[]{this.f8666b}, this.f8670f);
                }

                @m0
                public C0142a c(long j10) {
                    this.f8670f = j10;
                    return this;
                }

                @m0
                public C0142a d(@o0 PendingIntent pendingIntent) {
                    this.f8668d = pendingIntent;
                    return this;
                }

                @m0
                public C0142a e(@o0 PendingIntent pendingIntent, @o0 v2 v2Var) {
                    this.f8667c = v2Var;
                    this.f8669e = pendingIntent;
                    return this;
                }
            }

            public a(@o0 String[] strArr, @o0 v2 v2Var, @o0 PendingIntent pendingIntent, @o0 PendingIntent pendingIntent2, @o0 String[] strArr2, long j10) {
                this.f8659a = strArr;
                this.f8660b = v2Var;
                this.f8662d = pendingIntent2;
                this.f8661c = pendingIntent;
                this.f8663e = strArr2;
                this.f8664f = j10;
            }

            public long a() {
                return this.f8664f;
            }

            @o0
            public String[] b() {
                return this.f8659a;
            }

            @o0
            public String c() {
                String[] strArr = this.f8663e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @o0
            public String[] d() {
                return this.f8663e;
            }

            @o0
            public PendingIntent e() {
                return this.f8662d;
            }

            @o0
            public v2 f() {
                return this.f8660b;
            }

            @o0
            public PendingIntent g() {
                return this.f8661c;
            }
        }

        public h() {
        }

        public h(@m0 Notification notification) {
            Bundle bundle = u0.n(notification) == null ? null : u0.n(notification).getBundle(f8643d);
            if (bundle != null) {
                this.f8656a = (Bitmap) bundle.getParcelable(f8644e);
                this.f8658c = bundle.getInt(f8646g, 0);
                this.f8657b = f(bundle.getBundle(f8645f));
            }
        }

        @t0(21)
        public static Bundle b(@m0 a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.d() == null || aVar.d().length <= 1) ? null : aVar.d()[0];
            int length = aVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i10 = 0; i10 < length; i10++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.b()[i10]);
                bundle2.putString(f8648i, str);
                parcelableArr[i10] = bundle2;
            }
            bundle.putParcelableArray(f8650k, parcelableArr);
            v2 f10 = aVar.f();
            if (f10 != null) {
                bundle.putParcelable(f8651l, new RemoteInput.Builder(f10.o()).setLabel(f10.n()).setChoices(f10.h()).setAllowFreeFormInput(f10.f()).addExtras(f10.m()).build());
            }
            bundle.putParcelable(f8652m, aVar.g());
            bundle.putParcelable(f8653n, aVar.e());
            bundle.putStringArray(f8654o, aVar.d());
            bundle.putLong(f8655p, aVar.a());
            return bundle;
        }

        @t0(21)
        public static a f(@o0 Bundle bundle) {
            String[] strArr;
            boolean z10;
            Bundle bundle2 = bundle;
            v2 v2Var = null;
            if (bundle2 == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle2.getParcelableArray(f8650k);
            int i10 = 0;
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = true;
                        break;
                    }
                    Parcelable parcelable = parcelableArray[i11];
                    if (!(parcelable instanceof Bundle)) {
                        break;
                    }
                    String string = ((Bundle) parcelable).getString("text");
                    strArr2[i11] = string;
                    if (string == null) {
                        break;
                    }
                    i11++;
                }
                z10 = false;
                if (!z10) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle2.getParcelable(f8653n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle2.getParcelable(f8652m);
            RemoteInput remoteInput = (RemoteInput) bundle2.getParcelable(f8651l);
            String[] stringArray = bundle2.getStringArray(f8654o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = remoteInput.getEditChoicesBeforeSending();
                }
                v2Var = new v2(resultKey, label, choices, allowFreeFormInput, i10, remoteInput.getExtras(), (Set<String>) null);
            }
            return new a(strArr, v2Var, pendingIntent2, pendingIntent, stringArray, bundle2.getLong(f8655p));
        }

        @m0
        public g a(@m0 g gVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f8656a;
            if (bitmap != null) {
                bundle.putParcelable(f8644e, bitmap);
            }
            int i10 = this.f8658c;
            if (i10 != 0) {
                bundle.putInt(f8646g, i10);
            }
            a aVar = this.f8657b;
            if (aVar != null) {
                bundle.putBundle(f8645f, b(aVar));
            }
            gVar.t().putBundle(f8643d, bundle);
            return gVar;
        }

        @d.l
        public int c() {
            return this.f8658c;
        }

        @o0
        public Bitmap d() {
            return this.f8656a;
        }

        @o0
        @Deprecated
        public a e() {
            return this.f8657b;
        }

        @m0
        public h g(@d.l int i10) {
            this.f8658c = i10;
            return this;
        }

        @m0
        public h h(@o0 Bitmap bitmap) {
            this.f8656a = bitmap;
            return this;
        }

        @Deprecated
        @m0
        public h i(@o0 a aVar) {
            this.f8657b = aVar;
            return this;
        }
    }

    public static class i extends p {

        /* renamed from: e  reason: collision with root package name */
        public static final String f8671e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: f  reason: collision with root package name */
        public static final int f8672f = 3;

        public static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b next : list) {
                if (!next.k()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final RemoteViews A(RemoteViews remoteViews, boolean z10) {
            int min;
            boolean z11 = true;
            int i10 = 0;
            RemoteViews c10 = c(true, a.g.notification_template_custom_big, false);
            c10.removeAllViews(a.e.actions);
            List<b> C = C(this.f8696a.f8618b);
            if (!z10 || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                z11 = false;
            } else {
                for (int i11 = 0; i11 < min; i11++) {
                    c10.addView(a.e.actions, B(C.get(i11)));
                }
            }
            if (!z11) {
                i10 = 8;
            }
            c10.setViewVisibility(a.e.actions, i10);
            c10.setViewVisibility(a.e.action_divider, i10);
            e(c10, remoteViews);
            return c10;
        }

        public final RemoteViews B(b bVar) {
            boolean z10 = bVar.f8572k == null;
            RemoteViews remoteViews = new RemoteViews(this.f8696a.f8617a.getPackageName(), z10 ? a.g.notification_action_tombstone : a.g.notification_action);
            IconCompat f10 = bVar.f();
            if (f10 != null) {
                remoteViews.setImageViewBitmap(a.e.action_image, o(f10, this.f8696a.f8617a.getResources().getColor(a.b.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(a.e.action_text, bVar.f8571j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(a.e.action_container, bVar.f8572k);
            }
            remoteViews.setContentDescription(a.e.action_container, bVar.f8571j);
            return remoteViews;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void b(w wVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                wVar.a().setStyle(new Notification$DecoratedCustomViewStyle());
            }
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @m0
        public String t() {
            return f8671e;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(w wVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews p10 = this.f8696a.p();
            if (p10 == null) {
                p10 = this.f8696a.s();
            }
            if (p10 == null) {
                return null;
            }
            return A(p10, true);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(w wVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f8696a.s() != null) {
                return A(this.f8696a.s(), false);
            }
            return null;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(w wVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews v10 = this.f8696a.v();
            RemoteViews s10 = v10 != null ? v10 : this.f8696a.s();
            if (v10 == null) {
                return null;
            }
            return A(s10, true);
        }
    }

    public interface j {
        @m0
        g a(@m0 g gVar);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public static class l extends p {

        /* renamed from: f  reason: collision with root package name */
        public static final String f8673f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<CharSequence> f8674e = new ArrayList<>();

        public l() {
        }

        public l(@o0 g gVar) {
            z(gVar);
        }

        @m0
        public l A(@o0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f8674e.add(g.z(charSequence));
            }
            return this;
        }

        @m0
        public l B(@o0 CharSequence charSequence) {
            this.f8697b = g.z(charSequence);
            return this;
        }

        @m0
        public l C(@o0 CharSequence charSequence) {
            this.f8698c = g.z(charSequence);
            this.f8699d = true;
            return this;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void b(w wVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(wVar.a()).setBigContentTitle(this.f8697b);
            if (this.f8699d) {
                bigContentTitle.setSummaryText(this.f8698c);
            }
            Iterator<CharSequence> it = this.f8674e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void g(@m0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(u0.T);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @m0
        public String t() {
            return f8673f;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void y(@m0 Bundle bundle) {
            super.y(bundle);
            this.f8674e.clear();
            if (bundle.containsKey(u0.T)) {
                Collections.addAll(this.f8674e, bundle.getCharSequenceArray(u0.T));
            }
        }
    }

    public static class m extends p {

        /* renamed from: j  reason: collision with root package name */
        public static final String f8675j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: k  reason: collision with root package name */
        public static final int f8676k = 25;

        /* renamed from: e  reason: collision with root package name */
        public final List<a> f8677e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final List<a> f8678f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public l2 f8679g;
        @o0

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f8680h;
        @o0

        /* renamed from: i  reason: collision with root package name */
        public Boolean f8681i;

        public static final class a {

            /* renamed from: g  reason: collision with root package name */
            public static final String f8682g = "text";

            /* renamed from: h  reason: collision with root package name */
            public static final String f8683h = "time";

            /* renamed from: i  reason: collision with root package name */
            public static final String f8684i = "sender";

            /* renamed from: j  reason: collision with root package name */
            public static final String f8685j = "type";

            /* renamed from: k  reason: collision with root package name */
            public static final String f8686k = "uri";

            /* renamed from: l  reason: collision with root package name */
            public static final String f8687l = "extras";

            /* renamed from: m  reason: collision with root package name */
            public static final String f8688m = "person";

            /* renamed from: n  reason: collision with root package name */
            public static final String f8689n = "sender_person";

            /* renamed from: a  reason: collision with root package name */
            public final CharSequence f8690a;

            /* renamed from: b  reason: collision with root package name */
            public final long f8691b;
            @o0

            /* renamed from: c  reason: collision with root package name */
            public final l2 f8692c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f8693d;
            @o0

            /* renamed from: e  reason: collision with root package name */
            public String f8694e;
            @o0

            /* renamed from: f  reason: collision with root package name */
            public Uri f8695f;

            public a(@o0 CharSequence charSequence, long j10, @o0 l2 l2Var) {
                this.f8693d = new Bundle();
                this.f8690a = charSequence;
                this.f8691b = j10;
                this.f8692c = l2Var;
            }

            @Deprecated
            public a(@o0 CharSequence charSequence, long j10, @o0 CharSequence charSequence2) {
                this(charSequence, j10, new l2.a().f(charSequence2).a());
            }

            @m0
            public static Bundle[] a(@m0 List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).m();
                }
                return bundleArr;
            }

            @o0
            public static a e(@m0 Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            a aVar = new a(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(f8688m) ? l2.b(bundle.getBundle(f8688m)) : (!bundle.containsKey(f8689n) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey(f8684i) ? new l2.a().f(bundle.getCharSequence(f8684i)).a() : null : l2.a((Person) bundle.getParcelable(f8689n)));
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                aVar.k(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                aVar.d().putAll(bundle.getBundle("extras"));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @m0
            public static List<a> f(@m0 Parcelable[] parcelableArr) {
                a e10;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Bundle bundle : parcelableArr) {
                    if ((bundle instanceof Bundle) && (e10 = e(bundle)) != null) {
                        arrayList.add(e10);
                    }
                }
                return arrayList;
            }

            @o0
            public String b() {
                return this.f8694e;
            }

            @o0
            public Uri c() {
                return this.f8695f;
            }

            @m0
            public Bundle d() {
                return this.f8693d;
            }

            @o0
            public l2 g() {
                return this.f8692c;
            }

            @o0
            @Deprecated
            public CharSequence h() {
                l2 l2Var = this.f8692c;
                if (l2Var == null) {
                    return null;
                }
                return l2Var.f();
            }

            @o0
            public CharSequence i() {
                return this.f8690a;
            }

            public long j() {
                return this.f8691b;
            }

            @m0
            public a k(@o0 String str, @o0 Uri uri) {
                this.f8694e = str;
                this.f8695f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            @d.t0(24)
            @d.x0({d.x0.a.LIBRARY_GROUP_PREFIX})
            @d.m0
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification$MessagingStyle.Message l() {
                /*
                    r6 = this;
                    h0.l2 r0 = r6.g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 0
                    r3 = 28
                    if (r1 < r3) goto L_0x0020
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.i()
                    long r4 = r6.j()
                    if (r0 != 0) goto L_0x0018
                    goto L_0x001c
                L_0x0018:
                    android.app.Person r2 = r0.k()
                L_0x001c:
                    r1.<init>((java.lang.CharSequence) r3, (long) r4, (android.app.Person) r2)
                    goto L_0x0034
                L_0x0020:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.i()
                    long r4 = r6.j()
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    java.lang.CharSequence r2 = r0.f()
                L_0x0031:
                    r1.<init>((java.lang.CharSequence) r3, (long) r4, (java.lang.CharSequence) r2)
                L_0x0034:
                    java.lang.String r0 = r6.b()
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r6.b()
                    android.net.Uri r2 = r6.c()
                    r1.setData(r0, r2)
                L_0x0045:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: h0.u0.m.a.l():android.app.Notification$MessagingStyle$Message");
            }

            @m0
            public final Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f8690a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f8691b);
                l2 l2Var = this.f8692c;
                if (l2Var != null) {
                    bundle.putCharSequence(f8684i, l2Var.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f8689n, this.f8692c.k());
                    } else {
                        bundle.putBundle(f8688m, this.f8692c.m());
                    }
                }
                String str = this.f8694e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f8695f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f8693d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public m() {
        }

        public m(@m0 l2 l2Var) {
            if (!TextUtils.isEmpty(l2Var.f())) {
                this.f8679g = l2Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        @Deprecated
        public m(@m0 CharSequence charSequence) {
            this.f8679g = new l2.a().f(charSequence).a();
        }

        @o0
        public static m E(@m0 Notification notification) {
            p s10 = p.s(notification);
            if (s10 instanceof m) {
                return (m) s10;
            }
            return null;
        }

        @m0
        public m A(@o0 a aVar) {
            if (aVar != null) {
                this.f8678f.add(aVar);
                if (this.f8678f.size() > 25) {
                    this.f8678f.remove(0);
                }
            }
            return this;
        }

        @m0
        public m B(@o0 a aVar) {
            if (aVar != null) {
                this.f8677e.add(aVar);
                if (this.f8677e.size() > 25) {
                    this.f8677e.remove(0);
                }
            }
            return this;
        }

        @m0
        public m C(@o0 CharSequence charSequence, long j10, @o0 l2 l2Var) {
            B(new a(charSequence, j10, l2Var));
            return this;
        }

        @Deprecated
        @m0
        public m D(@o0 CharSequence charSequence, long j10, @o0 CharSequence charSequence2) {
            this.f8677e.add(new a(charSequence, j10, new l2.a().f(charSequence2).a()));
            if (this.f8677e.size() > 25) {
                this.f8677e.remove(0);
            }
            return this;
        }

        @o0
        public final a F() {
            for (int size = this.f8677e.size() - 1; size >= 0; size--) {
                a aVar = this.f8677e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().f())) {
                    return aVar;
                }
            }
            if (this.f8677e.isEmpty()) {
                return null;
            }
            List<a> list = this.f8677e;
            return list.get(list.size() - 1);
        }

        @o0
        public CharSequence G() {
            return this.f8680h;
        }

        @m0
        public List<a> H() {
            return this.f8678f;
        }

        @m0
        public List<a> I() {
            return this.f8677e;
        }

        @m0
        public l2 J() {
            return this.f8679g;
        }

        @o0
        @Deprecated
        public CharSequence K() {
            return this.f8679g.f();
        }

        public final boolean L() {
            for (int size = this.f8677e.size() - 1; size >= 0; size--) {
                a aVar = this.f8677e.get(size);
                if (aVar.g() != null && aVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean M() {
            g gVar = this.f8696a;
            if (gVar != null && gVar.f8617a.getApplicationInfo().targetSdkVersion < 28 && this.f8681i == null) {
                return this.f8680h != null;
            }
            Boolean bool = this.f8681i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @m0
        public final TextAppearanceSpan N(int i10) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i10), (ColorStateList) null);
        }

        public final CharSequence O(@m0 a aVar) {
            b1.a c10 = b1.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i10 = -16777216;
            CharSequence charSequence = "";
            CharSequence f10 = aVar.g() == null ? charSequence : aVar.g().f();
            if (TextUtils.isEmpty(f10)) {
                f10 = this.f8679g.f();
                if (this.f8696a.r() != 0) {
                    i10 = this.f8696a.r();
                }
            }
            CharSequence m10 = c10.m(f10);
            spannableStringBuilder.append(m10);
            spannableStringBuilder.setSpan(N(i10), spannableStringBuilder.length() - m10.length(), spannableStringBuilder.length(), 33);
            if (aVar.i() != null) {
                charSequence = aVar.i();
            }
            spannableStringBuilder.append(q.a.R).append(c10.m(charSequence));
            return spannableStringBuilder;
        }

        @m0
        public m P(@o0 CharSequence charSequence) {
            this.f8680h = charSequence;
            return this;
        }

        @m0
        public m Q(boolean z10) {
            this.f8681i = Boolean.valueOf(z10);
            return this;
        }

        public void a(@m0 Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(u0.f8500b0, this.f8679g.f());
            bundle.putBundle(u0.f8502c0, this.f8679g.m());
            bundle.putCharSequence(u0.f8512h0, this.f8680h);
            if (this.f8680h != null && this.f8681i.booleanValue()) {
                bundle.putCharSequence(u0.f8504d0, this.f8680h);
            }
            if (!this.f8677e.isEmpty()) {
                bundle.putParcelableArray(u0.f8506e0, a.a(this.f8677e));
            }
            if (!this.f8678f.isEmpty()) {
                bundle.putParcelableArray(u0.f8508f0, a.a(this.f8678f));
            }
            Boolean bool = this.f8681i;
            if (bool != null) {
                bundle.putBoolean(u0.f8510g0, bool.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
        @d.x0({d.x0.a.LIBRARY_GROUP_PREFIX})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(h0.w r8) {
            /*
                r7 = this;
                boolean r0 = r7.M()
                r7.Q(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L_0x0089
                r1 = 28
                if (r0 < r1) goto L_0x001d
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                h0.l2 r2 = r7.f8679g
                android.app.Person r2 = r2.k()
                r0.<init>((android.app.Person) r2)
                goto L_0x0028
            L_0x001d:
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                h0.l2 r2 = r7.f8679g
                java.lang.CharSequence r2 = r2.f()
                r0.<init>((java.lang.CharSequence) r2)
            L_0x0028:
                java.util.List<h0.u0$m$a> r2 = r7.f8677e
                java.util.Iterator r2 = r2.iterator()
            L_0x002e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r2.next()
                h0.u0$m$a r3 = (h0.u0.m.a) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.l()
                r0.addMessage(r3)
                goto L_0x002e
            L_0x0042:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L_0x0062
                java.util.List<h0.u0$m$a> r2 = r7.f8678f
                java.util.Iterator r2 = r2.iterator()
            L_0x004e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0062
                java.lang.Object r3 = r2.next()
                h0.u0$m$a r3 = (h0.u0.m.a) r3
                android.app.Notification$MessagingStyle$Message r3 = r3.l()
                android.app.Notification$MessagingStyle unused = r0.addHistoricMessage(r3)
                goto L_0x004e
            L_0x0062:
                java.lang.Boolean r2 = r7.f8681i
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x006e
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0073
            L_0x006e:
                java.lang.CharSequence r2 = r7.f8680h
                r0.setConversationTitle(r2)
            L_0x0073:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 < r1) goto L_0x0080
                java.lang.Boolean r1 = r7.f8681i
                boolean r1 = r1.booleanValue()
                android.app.Notification$MessagingStyle unused = r0.setGroupConversation(r1)
            L_0x0080:
                android.app.Notification$Builder r8 = r8.a()
                r0.setBuilder(r8)
                goto L_0x012d
            L_0x0089:
                h0.u0$m$a r0 = r7.F()
                java.lang.CharSequence r1 = r7.f8680h
                if (r1 == 0) goto L_0x00a3
                java.lang.Boolean r1 = r7.f8681i
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x00a3
                android.app.Notification$Builder r1 = r8.a()
                java.lang.CharSequence r2 = r7.f8680h
            L_0x009f:
                r1.setContentTitle(r2)
                goto L_0x00c1
            L_0x00a3:
                if (r0 == 0) goto L_0x00c1
                android.app.Notification$Builder r1 = r8.a()
                java.lang.String r2 = ""
                r1.setContentTitle(r2)
                h0.l2 r1 = r0.g()
                if (r1 == 0) goto L_0x00c1
                android.app.Notification$Builder r1 = r8.a()
                h0.l2 r2 = r0.g()
                java.lang.CharSequence r2 = r2.f()
                goto L_0x009f
            L_0x00c1:
                if (r0 == 0) goto L_0x00d7
                android.app.Notification$Builder r1 = r8.a()
                java.lang.CharSequence r2 = r7.f8680h
                if (r2 == 0) goto L_0x00d0
                java.lang.CharSequence r0 = r7.O(r0)
                goto L_0x00d4
            L_0x00d0:
                java.lang.CharSequence r0 = r0.i()
            L_0x00d4:
                r1.setContentText(r0)
            L_0x00d7:
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r1 = r7.f8680h
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x00eb
                boolean r1 = r7.L()
                if (r1 == 0) goto L_0x00e9
                goto L_0x00eb
            L_0x00e9:
                r1 = r2
                goto L_0x00ec
            L_0x00eb:
                r1 = r3
            L_0x00ec:
                java.util.List<h0.u0$m$a> r4 = r7.f8677e
                int r4 = r4.size()
                int r4 = r4 - r3
            L_0x00f3:
                if (r4 < 0) goto L_0x011c
                java.util.List<h0.u0$m$a> r5 = r7.f8677e
                java.lang.Object r5 = r5.get(r4)
                h0.u0$m$a r5 = (h0.u0.m.a) r5
                if (r1 == 0) goto L_0x0104
                java.lang.CharSequence r5 = r7.O(r5)
                goto L_0x0108
            L_0x0104:
                java.lang.CharSequence r5 = r5.i()
            L_0x0108:
                java.util.List<h0.u0$m$a> r6 = r7.f8677e
                int r6 = r6.size()
                int r6 = r6 - r3
                if (r4 == r6) goto L_0x0116
                java.lang.String r6 = "\n"
                r0.insert(r2, r6)
            L_0x0116:
                r0.insert(r2, r5)
                int r4 = r4 + -1
                goto L_0x00f3
            L_0x011c:
                android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r8 = r8.a()
                r1.<init>(r8)
                r8 = 0
                android.app.Notification$BigTextStyle r8 = r1.setBigContentTitle(r8)
                r8.bigText(r0)
            L_0x012d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.u0.m.b(h0.w):void");
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void g(@m0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(u0.f8502c0);
            bundle.remove(u0.f8500b0);
            bundle.remove(u0.f8504d0);
            bundle.remove(u0.f8512h0);
            bundle.remove(u0.f8506e0);
            bundle.remove(u0.f8508f0);
            bundle.remove(u0.f8510g0);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @m0
        public String t() {
            return f8675j;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void y(@m0 Bundle bundle) {
            super.y(bundle);
            this.f8677e.clear();
            this.f8679g = bundle.containsKey(u0.f8502c0) ? l2.b(bundle.getBundle(u0.f8502c0)) : new l2.a().f(bundle.getString(u0.f8500b0)).a();
            CharSequence charSequence = bundle.getCharSequence(u0.f8504d0);
            this.f8680h = charSequence;
            if (charSequence == null) {
                this.f8680h = bundle.getCharSequence(u0.f8512h0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(u0.f8506e0);
            if (parcelableArray != null) {
                this.f8677e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(u0.f8508f0);
            if (parcelableArray2 != null) {
                this.f8678f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey(u0.f8510g0)) {
                this.f8681i = Boolean.valueOf(bundle.getBoolean(u0.f8510g0));
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface o {
    }

    public static abstract class p {
        @x0({x0.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a  reason: collision with root package name */
        public g f8696a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f8697b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f8698c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8699d = false;

        public static float h(float f10, float f11, float f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }

        @o0
        public static p i(@o0 String str) {
            if (str == null) {
                return null;
            }
            char c10 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals(i.f8671e)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals(d.f8595h)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals(l.f8673f)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals(e.f8599f)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals(m.f8675j)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new i();
                case 1:
                    return new d();
                case 2:
                    return new l();
                case 3:
                    return new e();
                case 4:
                    return new m();
                default:
                    return null;
            }
        }

        @o0
        public static p j(@o0 String str) {
            if (str == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new d();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new e();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new l();
            }
            if (i10 >= 24) {
                if (str.equals(Notification$MessagingStyle.class.getName())) {
                    return new m();
                }
                if (str.equals(Notification$DecoratedCustomViewStyle.class.getName())) {
                    return new i();
                }
            }
            return null;
        }

        @o0
        public static p k(@m0 Bundle bundle) {
            p i10 = i(bundle.getString(u0.V));
            return i10 != null ? i10 : (bundle.containsKey(u0.f8500b0) || bundle.containsKey(u0.f8502c0)) ? new m() : bundle.containsKey(u0.S) ? new d() : bundle.containsKey(u0.H) ? new e() : bundle.containsKey(u0.T) ? new l() : j(bundle.getString(u0.U));
        }

        @o0
        public static p l(@m0 Bundle bundle) {
            p k10 = k(bundle);
            if (k10 == null) {
                return null;
            }
            try {
                k10.y(bundle);
                return k10;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @o0
        public static p s(@m0 Notification notification) {
            Bundle n10 = u0.n(notification);
            if (n10 == null) {
                return null;
            }
            return l(n10);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void a(@m0 Bundle bundle) {
            if (this.f8699d) {
                bundle.putCharSequence(u0.G, this.f8698c);
            }
            CharSequence charSequence = this.f8697b;
            if (charSequence != null) {
                bundle.putCharSequence(u0.B, charSequence);
            }
            String t10 = t();
            if (t10 != null) {
                bundle.putString(u0.V, t10);
            }
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void b(w wVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0190  */
        @d.x0({d.x0.a.LIBRARY_GROUP_PREFIX})
        @d.m0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                h0.u0$g r0 = r12.f8696a
                android.content.Context r0 = r0.f8617a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                h0.u0$g r1 = r12.f8696a
                android.content.Context r1 = r1.f8617a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                h0.u0$g r14 = r12.f8696a
                r14.x()
                int r14 = android.os.Build.VERSION.SDK_INT
                h0.u0$g r1 = r12.f8696a
                android.graphics.Bitmap r2 = r1.f8626j
                r8 = 0
                if (r2 == 0) goto L_0x0060
                int r1 = e0.a.e.icon
                r7.setViewVisibility(r1, r8)
                h0.u0$g r2 = r12.f8696a
                android.graphics.Bitmap r2 = r2.f8626j
                r7.setImageViewBitmap(r1, r2)
                if (r13 == 0) goto L_0x0091
                h0.u0$g r13 = r12.f8696a
                android.app.Notification r13 = r13.T
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = e0.a.c.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r1 = e0.a.c.notification_small_icon_background_padding
                int r1 = r0.getDimensionPixelSize(r1)
                int r1 = r1 * 2
                int r1 = r13 - r1
                h0.u0$g r2 = r12.f8696a
                android.app.Notification r3 = r2.T
                int r3 = r3.icon
                int r2 = r2.r()
                android.graphics.Bitmap r13 = r12.q(r3, r13, r1, r2)
                int r1 = e0.a.e.right_icon
                r7.setImageViewBitmap(r1, r13)
                r7.setViewVisibility(r1, r8)
                goto L_0x0091
            L_0x0060:
                if (r13 == 0) goto L_0x0091
                android.app.Notification r13 = r1.T
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = e0.a.e.icon
                r7.setViewVisibility(r13, r8)
                int r1 = e0.a.c.notification_large_icon_width
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = e0.a.c.notification_big_circle_margin
                int r2 = r0.getDimensionPixelSize(r2)
                int r1 = r1 - r2
                int r2 = e0.a.c.notification_small_icon_size_as_large
                int r2 = r0.getDimensionPixelSize(r2)
                h0.u0$g r3 = r12.f8696a
                android.app.Notification r4 = r3.T
                int r4 = r4.icon
                int r3 = r3.r()
                android.graphics.Bitmap r1 = r12.q(r4, r1, r2, r3)
                r7.setImageViewBitmap(r13, r1)
            L_0x0091:
                h0.u0$g r13 = r12.f8696a
                java.lang.CharSequence r13 = r13.f8621e
                if (r13 == 0) goto L_0x009c
                int r1 = e0.a.e.title
                r7.setTextViewText(r1, r13)
            L_0x009c:
                h0.u0$g r13 = r12.f8696a
                java.lang.CharSequence r13 = r13.f8622f
                r9 = 1
                if (r13 == 0) goto L_0x00aa
                int r1 = e0.a.e.text
                r7.setTextViewText(r1, r13)
                r13 = r9
                goto L_0x00ab
            L_0x00aa:
                r13 = r8
            L_0x00ab:
                h0.u0$g r1 = r12.f8696a
                java.lang.CharSequence r2 = r1.f8627k
                r10 = 8
                if (r2 == 0) goto L_0x00be
                int r13 = e0.a.e.info
                r7.setTextViewText(r13, r2)
            L_0x00b8:
                r7.setViewVisibility(r13, r8)
                r13 = r9
                r11 = r13
                goto L_0x00f5
            L_0x00be:
                int r1 = r1.f8628l
                if (r1 <= 0) goto L_0x00ef
                int r13 = e0.a.f.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                h0.u0$g r1 = r12.f8696a
                int r1 = r1.f8628l
                if (r1 <= r13) goto L_0x00da
                int r13 = e0.a.e.info
                int r1 = e0.a.h.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r13, r1)
                goto L_0x00ec
            L_0x00da:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r1 = e0.a.e.info
                h0.u0$g r2 = r12.f8696a
                int r2 = r2.f8628l
                long r2 = (long) r2
                java.lang.String r13 = r13.format(r2)
                r7.setTextViewText(r1, r13)
            L_0x00ec:
                int r13 = e0.a.e.info
                goto L_0x00b8
            L_0x00ef:
                int r1 = e0.a.e.info
                r7.setViewVisibility(r1, r10)
                r11 = r8
            L_0x00f5:
                h0.u0$g r1 = r12.f8696a
                java.lang.CharSequence r1 = r1.f8634r
                if (r1 == 0) goto L_0x0115
                int r2 = e0.a.e.text
                r7.setTextViewText(r2, r1)
                h0.u0$g r1 = r12.f8696a
                java.lang.CharSequence r1 = r1.f8622f
                if (r1 == 0) goto L_0x0110
                int r2 = e0.a.e.text2
                r7.setTextViewText(r2, r1)
                r7.setViewVisibility(r2, r8)
                r1 = r9
                goto L_0x0116
            L_0x0110:
                int r1 = e0.a.e.text2
                r7.setViewVisibility(r1, r10)
            L_0x0115:
                r1 = r8
            L_0x0116:
                if (r1 == 0) goto L_0x0130
                if (r15 == 0) goto L_0x0126
                int r15 = e0.a.c.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = e0.a.e.text
                r7.setTextViewTextSize(r0, r8, r15)
            L_0x0126:
                int r2 = e0.a.e.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x0130:
                h0.u0$g r15 = r12.f8696a
                long r0 = r15.y()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0180
                h0.u0$g r15 = r12.f8696a
                boolean r15 = r15.f8631o
                if (r15 == 0) goto L_0x016f
                int r15 = e0.a.e.chronometer
                r7.setViewVisibility(r15, r8)
                h0.u0$g r0 = r12.f8696a
                long r0 = r0.y()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r15, r2, r0)
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r15, r0, r9)
                h0.u0$g r0 = r12.f8696a
                boolean r0 = r0.f8632p
                if (r0 == 0) goto L_0x0181
                r1 = 24
                if (r14 < r1) goto L_0x0181
                r7.setChronometerCountDown(r15, r0)
                goto L_0x0181
            L_0x016f:
                int r14 = e0.a.e.time
                r7.setViewVisibility(r14, r8)
                h0.u0$g r15 = r12.f8696a
                long r0 = r15.y()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
                goto L_0x0181
            L_0x0180:
                r9 = r11
            L_0x0181:
                int r14 = e0.a.e.right_side
                if (r9 == 0) goto L_0x0187
                r15 = r8
                goto L_0x0188
            L_0x0187:
                r15 = r10
            L_0x0188:
                r7.setViewVisibility(r14, r15)
                int r14 = e0.a.e.line3
                if (r13 == 0) goto L_0x0190
                goto L_0x0191
            L_0x0190:
                r8 = r10
            L_0x0191:
                r7.setViewVisibility(r14, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.u0.p.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @o0
        public Notification d() {
            g gVar = this.f8696a;
            if (gVar != null) {
                return gVar.h();
            }
            return null;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i10 = a.e.notification_main_column;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            remoteViews.setViewPadding(a.e.notification_main_column_container, 0, f(), 0, 0);
        }

        public final int f() {
            Resources resources = this.f8696a.f8617a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.notification_top_pad_large_text);
            float h10 = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - h10) * ((float) dimensionPixelSize)) + (h10 * ((float) dimensionPixelSize2)));
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void g(@m0 Bundle bundle) {
            bundle.remove(u0.G);
            bundle.remove(u0.B);
            bundle.remove(u0.V);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i10, int i11) {
            return n(i10, i11, 0);
        }

        public final Bitmap n(int i10, int i11, int i12) {
            return p(IconCompat.y(this.f8696a.f8617a, i10), i11, i12);
        }

        public Bitmap o(@m0 IconCompat iconCompat, int i10) {
            return p(iconCompat, i10, 0);
        }

        public final Bitmap p(@m0 IconCompat iconCompat, int i10, int i11) {
            Drawable L = iconCompat.L(this.f8696a.f8617a);
            int intrinsicWidth = i11 == 0 ? L.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = L.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            L.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                L.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            L.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        public final Bitmap q(int i10, int i11, int i12, int i13) {
            int i14 = a.d.notification_icon_background;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap n10 = n(i14, i13, i11);
            Canvas canvas = new Canvas(n10);
            Drawable mutate = this.f8696a.f8617a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n10;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        @o0
        public String t() {
            return null;
        }

        public final void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(a.e.title, 8);
            remoteViews.setViewVisibility(a.e.text2, 8);
            remoteViews.setViewVisibility(a.e.text, 8);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(w wVar) {
            return null;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(w wVar) {
            return null;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(w wVar) {
            return null;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void y(@m0 Bundle bundle) {
            if (bundle.containsKey(u0.G)) {
                this.f8698c = bundle.getCharSequence(u0.G);
                this.f8699d = true;
            }
            this.f8697b = bundle.getCharSequence(u0.B);
        }

        public void z(@o0 g gVar) {
            if (this.f8696a != gVar) {
                this.f8696a = gVar;
                if (gVar != null) {
                    gVar.x0(this);
                }
            }
        }
    }

    public static final class q implements j {
        public static final String A = "displayIntent";
        public static final String B = "pages";
        public static final String C = "background";
        public static final String D = "contentIcon";
        public static final String E = "contentIconGravity";
        public static final String F = "contentActionIndex";
        public static final String G = "customSizePreset";
        public static final String H = "customContentHeight";
        public static final String I = "gravity";
        public static final String J = "hintScreenTimeout";
        public static final String K = "dismissalId";
        public static final String L = "bridgeTag";
        public static final int M = 1;
        public static final int N = 2;
        public static final int O = 4;
        public static final int P = 8;
        public static final int Q = 16;
        public static final int R = 32;
        public static final int S = 64;
        public static final int T = 1;
        public static final int U = 8388613;
        public static final int V = 80;

        /* renamed from: o  reason: collision with root package name */
        public static final int f8700o = -1;
        @Deprecated

        /* renamed from: p  reason: collision with root package name */
        public static final int f8701p = 0;
        @Deprecated

        /* renamed from: q  reason: collision with root package name */
        public static final int f8702q = 1;
        @Deprecated

        /* renamed from: r  reason: collision with root package name */
        public static final int f8703r = 2;
        @Deprecated

        /* renamed from: s  reason: collision with root package name */
        public static final int f8704s = 3;
        @Deprecated

        /* renamed from: t  reason: collision with root package name */
        public static final int f8705t = 4;
        @Deprecated

        /* renamed from: u  reason: collision with root package name */
        public static final int f8706u = 5;
        @Deprecated

        /* renamed from: v  reason: collision with root package name */
        public static final int f8707v = 0;
        @Deprecated

        /* renamed from: w  reason: collision with root package name */
        public static final int f8708w = -1;

        /* renamed from: x  reason: collision with root package name */
        public static final String f8709x = "android.wearable.EXTENSIONS";

        /* renamed from: y  reason: collision with root package name */
        public static final String f8710y = "actions";

        /* renamed from: z  reason: collision with root package name */
        public static final String f8711z = "flags";

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<b> f8712a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f8713b = 1;

        /* renamed from: c  reason: collision with root package name */
        public PendingIntent f8714c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Notification> f8715d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f8716e;

        /* renamed from: f  reason: collision with root package name */
        public int f8717f;

        /* renamed from: g  reason: collision with root package name */
        public int f8718g = 8388613;

        /* renamed from: h  reason: collision with root package name */
        public int f8719h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f8720i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f8721j;

        /* renamed from: k  reason: collision with root package name */
        public int f8722k = 80;

        /* renamed from: l  reason: collision with root package name */
        public int f8723l;

        /* renamed from: m  reason: collision with root package name */
        public String f8724m;

        /* renamed from: n  reason: collision with root package name */
        public String f8725n;

        public q() {
        }

        public q(@m0 Notification notification) {
            Bundle n10 = u0.n(notification);
            Bundle bundle = n10 != null ? n10.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8710y);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        bVarArr[i10] = u0.b((Notification.Action) parcelableArrayList.get(i10));
                    }
                    Collections.addAll(this.f8712a, bVarArr);
                }
                this.f8713b = bundle.getInt("flags", 1);
                this.f8714c = (PendingIntent) bundle.getParcelable(A);
                Notification[] u10 = u0.u(bundle, B);
                if (u10 != null) {
                    Collections.addAll(this.f8715d, u10);
                }
                this.f8716e = (Bitmap) bundle.getParcelable(C);
                this.f8717f = bundle.getInt(D);
                this.f8718g = bundle.getInt(E, 8388613);
                this.f8719h = bundle.getInt(F, -1);
                this.f8720i = bundle.getInt(G, 0);
                this.f8721j = bundle.getInt(H);
                this.f8722k = bundle.getInt(I, 80);
                this.f8723l = bundle.getInt(J);
                this.f8724m = bundle.getString(K);
                this.f8725n = bundle.getString(L);
            }
        }

        @t0(20)
        public static Notification.Action i(b bVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat f10 = bVar.f();
            Notification.Action.Builder builder = new Notification.Action.Builder(f10 == null ? null : f10.Q(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean(w1.f8769c, bVar.b());
            if (i10 >= 24) {
                Notification.Action.Builder unused = builder.setAllowGeneratedReplies(bVar.b());
            }
            builder.addExtras(bundle);
            v2[] g10 = bVar.g();
            if (g10 != null) {
                for (RemoteInput addRemoteInput : v2.d(g10)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        public boolean A() {
            return (this.f8713b & 4) != 0;
        }

        @Deprecated
        @m0
        public List<Notification> B() {
            return this.f8715d;
        }

        public boolean C() {
            return (this.f8713b & 8) != 0;
        }

        @Deprecated
        @m0
        public q D(@o0 Bitmap bitmap) {
            this.f8716e = bitmap;
            return this;
        }

        @m0
        public q E(@o0 String str) {
            this.f8725n = str;
            return this;
        }

        @m0
        public q F(int i10) {
            this.f8719h = i10;
            return this;
        }

        @Deprecated
        @m0
        public q G(int i10) {
            this.f8717f = i10;
            return this;
        }

        @Deprecated
        @m0
        public q H(int i10) {
            this.f8718g = i10;
            return this;
        }

        @m0
        public q I(boolean z10) {
            N(1, z10);
            return this;
        }

        @Deprecated
        @m0
        public q J(int i10) {
            this.f8721j = i10;
            return this;
        }

        @Deprecated
        @m0
        public q K(int i10) {
            this.f8720i = i10;
            return this;
        }

        @m0
        public q L(@o0 String str) {
            this.f8724m = str;
            return this;
        }

        @Deprecated
        @m0
        public q M(@o0 PendingIntent pendingIntent) {
            this.f8714c = pendingIntent;
            return this;
        }

        public final void N(int i10, boolean z10) {
            int i11;
            if (z10) {
                i11 = i10 | this.f8713b;
            } else {
                i11 = (~i10) & this.f8713b;
            }
            this.f8713b = i11;
        }

        @Deprecated
        @m0
        public q O(int i10) {
            this.f8722k = i10;
            return this;
        }

        @Deprecated
        @m0
        public q P(boolean z10) {
            N(32, z10);
            return this;
        }

        @Deprecated
        @m0
        public q Q(boolean z10) {
            N(16, z10);
            return this;
        }

        @m0
        public q R(boolean z10) {
            N(64, z10);
            return this;
        }

        @Deprecated
        @m0
        public q S(boolean z10) {
            N(2, z10);
            return this;
        }

        @Deprecated
        @m0
        public q T(int i10) {
            this.f8723l = i10;
            return this;
        }

        @Deprecated
        @m0
        public q U(boolean z10) {
            N(4, z10);
            return this;
        }

        @m0
        public q V(boolean z10) {
            N(8, z10);
            return this;
        }

        @m0
        public g a(@m0 g gVar) {
            Bundle bundle = new Bundle();
            if (!this.f8712a.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f8712a.size());
                Iterator<b> it = this.f8712a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList(f8710y, arrayList);
            }
            int i10 = this.f8713b;
            if (i10 != 1) {
                bundle.putInt("flags", i10);
            }
            PendingIntent pendingIntent = this.f8714c;
            if (pendingIntent != null) {
                bundle.putParcelable(A, pendingIntent);
            }
            if (!this.f8715d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f8715d;
                bundle.putParcelableArray(B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f8716e;
            if (bitmap != null) {
                bundle.putParcelable(C, bitmap);
            }
            int i11 = this.f8717f;
            if (i11 != 0) {
                bundle.putInt(D, i11);
            }
            int i12 = this.f8718g;
            if (i12 != 8388613) {
                bundle.putInt(E, i12);
            }
            int i13 = this.f8719h;
            if (i13 != -1) {
                bundle.putInt(F, i13);
            }
            int i14 = this.f8720i;
            if (i14 != 0) {
                bundle.putInt(G, i14);
            }
            int i15 = this.f8721j;
            if (i15 != 0) {
                bundle.putInt(H, i15);
            }
            int i16 = this.f8722k;
            if (i16 != 80) {
                bundle.putInt(I, i16);
            }
            int i17 = this.f8723l;
            if (i17 != 0) {
                bundle.putInt(J, i17);
            }
            String str = this.f8724m;
            if (str != null) {
                bundle.putString(K, str);
            }
            String str2 = this.f8725n;
            if (str2 != null) {
                bundle.putString(L, str2);
            }
            gVar.t().putBundle("android.wearable.EXTENSIONS", bundle);
            return gVar;
        }

        @m0
        public q b(@m0 b bVar) {
            this.f8712a.add(bVar);
            return this;
        }

        @m0
        public q c(@m0 List<b> list) {
            this.f8712a.addAll(list);
            return this;
        }

        @Deprecated
        @m0
        public q d(@m0 Notification notification) {
            this.f8715d.add(notification);
            return this;
        }

        @Deprecated
        @m0
        public q e(@m0 List<Notification> list) {
            this.f8715d.addAll(list);
            return this;
        }

        @m0
        public q f() {
            this.f8712a.clear();
            return this;
        }

        @Deprecated
        @m0
        public q g() {
            this.f8715d.clear();
            return this;
        }

        @m0
        /* renamed from: h */
        public q clone() {
            q qVar = new q();
            qVar.f8712a = new ArrayList<>(this.f8712a);
            qVar.f8713b = this.f8713b;
            qVar.f8714c = this.f8714c;
            qVar.f8715d = new ArrayList<>(this.f8715d);
            qVar.f8716e = this.f8716e;
            qVar.f8717f = this.f8717f;
            qVar.f8718g = this.f8718g;
            qVar.f8719h = this.f8719h;
            qVar.f8720i = this.f8720i;
            qVar.f8721j = this.f8721j;
            qVar.f8722k = this.f8722k;
            qVar.f8723l = this.f8723l;
            qVar.f8724m = this.f8724m;
            qVar.f8725n = this.f8725n;
            return qVar;
        }

        @m0
        public List<b> j() {
            return this.f8712a;
        }

        @o0
        @Deprecated
        public Bitmap k() {
            return this.f8716e;
        }

        @o0
        public String l() {
            return this.f8725n;
        }

        public int m() {
            return this.f8719h;
        }

        @Deprecated
        public int n() {
            return this.f8717f;
        }

        @Deprecated
        public int o() {
            return this.f8718g;
        }

        public boolean p() {
            return (this.f8713b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f8721j;
        }

        @Deprecated
        public int r() {
            return this.f8720i;
        }

        @o0
        public String s() {
            return this.f8724m;
        }

        @o0
        @Deprecated
        public PendingIntent t() {
            return this.f8714c;
        }

        @Deprecated
        public int u() {
            return this.f8722k;
        }

        @Deprecated
        public boolean v() {
            return (this.f8713b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f8713b & 16) != 0;
        }

        public boolean x() {
            return (this.f8713b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f8713b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f8723l;
        }
    }

    @o0
    public static String A(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    @t0(19)
    public static boolean B(@m0 Notification notification) {
        return notification.extras.getBoolean(R);
    }

    @o0
    public static String C(@m0 Notification notification) {
        return notification.getSortKey();
    }

    @t0(19)
    @o0
    public static CharSequence D(@m0 Notification notification) {
        return notification.extras.getCharSequence(D);
    }

    public static long E(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    @t0(19)
    public static boolean F(@m0 Notification notification) {
        return notification.extras.getBoolean(O);
    }

    public static int G(@m0 Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@m0 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @o0
    public static b a(@m0 Notification notification, int i10) {
        return b(notification.actions[i10]);
    }

    @t0(20)
    @m0
    public static b b(@m0 Notification.Action action) {
        v2[] v2VarArr;
        int i10;
        Notification.Action action2 = action;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        IconCompat iconCompat = null;
        boolean z10 = false;
        if (remoteInputs == null) {
            v2VarArr = null;
        } else {
            v2[] v2VarArr2 = new v2[remoteInputs.length];
            for (int i11 = 0; i11 < remoteInputs.length; i11++) {
                RemoteInput remoteInput = remoteInputs[i11];
                v2VarArr2[i11] = new v2(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), (Set<String>) null);
            }
            v2VarArr = v2VarArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z11 = i12 >= 24 ? action.getExtras().getBoolean(w1.f8769c) || action.getAllowGeneratedReplies() : action.getExtras().getBoolean(w1.f8769c);
        boolean z12 = action.getExtras().getBoolean(b.f8560w, true);
        int a10 = i12 >= 28 ? action.getSemanticAction() : action.getExtras().getInt(b.f8561x, 0);
        if (i12 >= 29) {
            z10 = action.isContextual();
        }
        boolean z13 = z10;
        if (action.getIcon() == null && (i10 = action2.icon) != 0) {
            return new b(i10, action2.title, action2.actionIntent, action.getExtras(), v2VarArr, (v2[]) null, z11, a10, z12, z13);
        }
        if (action.getIcon() != null) {
            iconCompat = IconCompat.p(action.getIcon());
        }
        return new b(iconCompat, action2.title, action2.actionIntent, action.getExtras(), v2VarArr, (v2[]) null, z11, a10, z12, z13);
    }

    public static int c(@m0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static boolean e(@m0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @o0
    public static f g(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.a(notification.getBubbleMetadata());
        }
        return null;
    }

    @o0
    public static String h(@m0 Notification notification) {
        return notification.category;
    }

    @o0
    public static String i(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static int j(@m0 Notification notification) {
        return notification.color;
    }

    @t0(19)
    @o0
    public static CharSequence k(@m0 Notification notification) {
        return notification.extras.getCharSequence(F);
    }

    @t0(19)
    @o0
    public static CharSequence l(@m0 Notification notification) {
        return notification.extras.getCharSequence(C);
    }

    @t0(19)
    @o0
    public static CharSequence m(@m0 Notification notification) {
        return notification.extras.getCharSequence(A);
    }

    @o0
    public static Bundle n(@m0 Notification notification) {
        return notification.extras;
    }

    @o0
    public static String o(@m0 Notification notification) {
        return notification.getGroup();
    }

    public static int p(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static boolean q(@m0 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @t0(21)
    @m0
    public static List<b> r(@m0 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(h.f8643d);
        if (!(bundle2 == null || (bundle = bundle2.getBundle(h.f8647h)) == null)) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                arrayList.add(w1.g(bundle.getBundle(Integer.toString(i10))));
            }
        }
        return arrayList;
    }

    public static boolean s(@m0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @o0
    public static i0.m t(@m0 Notification notification) {
        LocusId a10;
        if (Build.VERSION.SDK_INT < 29 || (a10 = notification.getLocusId()) == null) {
            return null;
        }
        return i0.m.d(a10);
    }

    @m0
    public static Notification[] u(@m0 Bundle bundle, @m0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean v(@m0 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean w(@m0 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @m0
    public static List<l2> x(@m0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        Bundle bundle = notification.extras;
        if (i10 >= 28) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(X);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(l2.a((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = bundle.getStringArray(W);
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String g10 : stringArray) {
                    arrayList.add(new l2.a().g(g10).a());
                }
            }
        }
        return arrayList;
    }

    @o0
    public static Notification y(@m0 Notification notification) {
        return notification.publicVersion;
    }

    @o0
    public static CharSequence z(@m0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }
}
