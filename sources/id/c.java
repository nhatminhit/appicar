package id;

import android.app.Activity;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class c {

    public class a implements Runnable {
        public final /* synthetic */ View O;

        public a(View view) {
            this.O = view;
        }

        public void run() {
            this.O.setEnabled(true);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ View O;

        public b(View view) {
            this.O = view;
        }

        public void run() {
            this.O.setEnabled(true);
        }
    }

    /* renamed from: id.c$c  reason: collision with other inner class name */
    public class C0324c implements View.OnTouchListener {
        public final /* synthetic */ Activity O;

        public C0324c(Activity activity) {
            this.O = activity;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            fd.c.b(this.O.getApplicationContext());
            return false;
        }
    }

    public class d implements View.OnTouchListener {
        public final /* synthetic */ Activity O;
        public final /* synthetic */ TextView P;
        public final /* synthetic */ EditText Q;

        public d(Activity activity, TextView textView, EditText editText) {
            this.O = activity;
            this.P = textView;
            this.Q = editText;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            fd.c.b(this.O.getApplicationContext());
            this.P.setVisibility(0);
            this.Q.setVisibility(8);
            return false;
        }
    }

    public static void a(View view) {
        view.setEnabled(false);
        view.postDelayed(new a(view), 550);
    }

    public static void b(View view, int i10) {
        view.setEnabled(false);
        view.postDelayed(new b(view), (long) i10);
    }

    public static String c() {
        return Build.MODEL;
    }

    public static void d(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static void e(Activity activity, View view) {
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(new C0324c(activity));
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 < viewGroup.getChildCount()) {
                    e(activity, viewGroup.getChildAt(i10));
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public static void f(Activity activity, View view, TextView textView, EditText editText) {
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(new d(activity, textView, editText));
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 < viewGroup.getChildCount()) {
                    f(activity, viewGroup.getChildAt(i10), textView, editText);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }
}
