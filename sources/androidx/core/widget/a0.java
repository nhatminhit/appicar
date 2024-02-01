package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import f1.c;
import f1.q0;

@x0({x0.a.Q})
public final class a0 implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2285a = "ReceiveContent";

    @t0(16)
    public static final class a {
        public static CharSequence a(@m0 Context context, @m0 ClipData.Item item, int i10) {
            if ((i10 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    public static final class b {
        public static CharSequence a(@m0 Context context, @m0 ClipData.Item item, int i10) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i10 & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    public static CharSequence b(@m0 Context context, @m0 ClipData.Item item, int i10) {
        return a.a(context, item, i10);
    }

    public static void c(@m0 Editable editable, @m0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @o0
    public c a(@m0 View view, @m0 c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onReceive: ");
            sb2.append(cVar);
        }
        if (cVar.g() == 2) {
            return cVar;
        }
        ClipData c10 = cVar.c();
        int e10 = cVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < c10.getItemCount(); i10++) {
            CharSequence b10 = b(context, c10.getItemAt(i10), e10);
            if (b10 != null) {
                if (!z10) {
                    c(editable, b10);
                    z10 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b10);
                }
            }
        }
        return null;
    }
}
