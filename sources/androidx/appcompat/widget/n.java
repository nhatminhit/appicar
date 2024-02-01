package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.t0;

public final class n {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public TextView f1374a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1375b;

    public n(@m0 TextView textView) {
        this.f1374a = (TextView) e1.n.g(textView);
    }

    @t0(api = 26)
    @m0
    public TextClassifier a() {
        TextClassifier textClassifier = this.f1375b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1374a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    @t0(api = 26)
    public void b(@o0 TextClassifier textClassifier) {
        this.f1375b = textClassifier;
    }
}
