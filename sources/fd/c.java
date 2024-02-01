package fd;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class c {
    public static boolean a(Context context) {
        return ((InputMethodManager) context.getSystemService("input_method")).isAcceptingText();
    }

    public static void b(Context context) {
        if (a(context)) {
            ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(1, 0);
        }
    }

    public static void c(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void d(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 1);
    }
}
