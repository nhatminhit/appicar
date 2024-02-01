package j;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import d.x0;
import java.util.Locale;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class a implements TransformationMethod {
    public Locale O;

    public a(Context context) {
        this.O = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.O);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }
}
