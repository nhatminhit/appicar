package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.t0;
import f1.c;
import f1.w1;
import i1.g;
import i1.h;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1344a = "ReceiveContent";

    /* renamed from: b  reason: collision with root package name */
    public static final String f1345b = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    public class a implements g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1346a;

        public a(View view) {
            this.f1346a = view;
        }

        public boolean a(h hVar, int i10, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
                try {
                    hVar.e();
                    InputContentInfo inputContentInfo = (InputContentInfo) hVar.f();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable(k.f1345b, inputContentInfo);
                } catch (Exception unused) {
                    return false;
                }
            }
            return w1.k1(this.f1346a, new c.a(new ClipData(hVar.b(), new ClipData.Item(hVar.a())), 2).e(hVar.c()).c(bundle).a()) == null;
        }
    }

    @t0(24)
    public static final class b {
        /* JADX INFO: finally extract failed */
        public static boolean a(@m0 DragEvent dragEvent, @m0 TextView textView, @m0 Activity activity) {
            DragAndDropPermissions unused = activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                w1.k1(textView, new c.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        public static boolean b(@m0 DragEvent dragEvent, @m0 View view, @m0 Activity activity) {
            DragAndDropPermissions unused = activity.requestDragAndDropPermissions(dragEvent);
            w1.k1(view, new c.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    @m0
    public static g.c a(@m0 View view) {
        return new a(view);
    }

    public static boolean b(@m0 View view, @m0 DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && w1.f0(view) != null) {
            Activity d10 = d(view);
            if (d10 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't handle drop: no activity: view=");
                sb2.append(view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? b.a(dragEvent, (TextView) view, d10) : b.b(dragEvent, view, d10);
                }
            }
        }
        return false;
    }

    public static boolean c(@m0 TextView textView, int i10) {
        int i11 = 0;
        if ((i10 != 16908322 && i10 != 16908337) || w1.f0(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            c.a aVar = new c.a(primaryClip, 1);
            if (i10 != 16908322) {
                i11 = 1;
            }
            w1.k1(textView, aVar.d(i11).a());
        }
        return true;
    }

    @o0
    public static Activity d(@m0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
