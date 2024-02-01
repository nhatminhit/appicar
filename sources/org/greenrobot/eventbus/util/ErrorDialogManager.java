package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import org.greenrobot.eventbus.EventBus;

public class ErrorDialogManager {
    public static final String KEY_EVENT_TYPE_ON_CLOSE = "de.greenrobot.eventbus.errordialog.event_type_on_close";
    public static final String KEY_FINISH_AFTER_DIALOG = "de.greenrobot.eventbus.errordialog.finish_after_dialog";
    public static final String KEY_ICON_ID = "de.greenrobot.eventbus.errordialog.icon_id";
    public static final String KEY_MESSAGE = "de.greenrobot.eventbus.errordialog.message";
    public static final String KEY_TITLE = "de.greenrobot.eventbus.errordialog.title";
    public static final String TAG_ERROR_DIALOG = "de.greenrobot.eventbus.error_dialog";
    public static final String TAG_ERROR_DIALOG_MANAGER = "de.greenrobot.eventbus.error_dialog_manager";
    public static ErrorDialogFragmentFactory<?> factory;

    @TargetApi(11)
    public static class HoneycombManagerFragment extends Fragment {
        public EventBus O;
        public Object P;
        public Bundle argumentsForErrorDialog;
        public boolean finishAfterDialog;

        public static void attachTo(Activity activity, Object obj, boolean z10, Bundle bundle) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            HoneycombManagerFragment honeycombManagerFragment = (HoneycombManagerFragment) fragmentManager.findFragmentByTag(ErrorDialogManager.TAG_ERROR_DIALOG_MANAGER);
            if (honeycombManagerFragment == null) {
                honeycombManagerFragment = new HoneycombManagerFragment();
                fragmentManager.beginTransaction().add(honeycombManagerFragment, ErrorDialogManager.TAG_ERROR_DIALOG_MANAGER).commit();
                fragmentManager.executePendingTransactions();
            }
            honeycombManagerFragment.finishAfterDialog = z10;
            honeycombManagerFragment.argumentsForErrorDialog = bundle;
            honeycombManagerFragment.P = obj;
        }

        public void onEventMainThread(ThrowableFailureEvent throwableFailureEvent) {
            if (ErrorDialogManager.b(this.P, throwableFailureEvent)) {
                ErrorDialogManager.checkLogException(throwableFailureEvent);
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.executePendingTransactions();
                DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(ErrorDialogManager.TAG_ERROR_DIALOG);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                DialogFragment dialogFragment2 = (DialogFragment) ErrorDialogManager.factory.prepareErrorFragment(throwableFailureEvent, this.finishAfterDialog, this.argumentsForErrorDialog);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, ErrorDialogManager.TAG_ERROR_DIALOG);
                }
            }
        }

        public void onPause() {
            this.O.unregister(this);
            super.onPause();
        }

        public void onResume() {
            super.onResume();
            EventBus a10 = ErrorDialogManager.factory.config.a();
            this.O = a10;
            a10.register(this);
        }
    }

    public static class SupportManagerFragment extends androidx.fragment.app.Fragment {
        public EventBus Y0;
        public boolean Z0;

        /* renamed from: a1  reason: collision with root package name */
        public Object f21912a1;
        public Bundle argumentsForErrorDialog;
        public boolean finishAfterDialog;

        public static void attachTo(Activity activity, Object obj, boolean z10, Bundle bundle) {
            androidx.fragment.app.FragmentManager X = ((FragmentActivity) activity).X();
            SupportManagerFragment supportManagerFragment = (SupportManagerFragment) X.q0(ErrorDialogManager.TAG_ERROR_DIALOG_MANAGER);
            if (supportManagerFragment == null) {
                supportManagerFragment = new SupportManagerFragment();
                X.r().g(supportManagerFragment, ErrorDialogManager.TAG_ERROR_DIALOG_MANAGER).m();
                X.l0();
            }
            supportManagerFragment.finishAfterDialog = z10;
            supportManagerFragment.argumentsForErrorDialog = bundle;
            supportManagerFragment.f21912a1 = obj;
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            EventBus a10 = ErrorDialogManager.factory.config.a();
            this.Y0 = a10;
            a10.register(this);
            this.Z0 = true;
        }

        public void onEventMainThread(ThrowableFailureEvent throwableFailureEvent) {
            if (ErrorDialogManager.b(this.f21912a1, throwableFailureEvent)) {
                ErrorDialogManager.checkLogException(throwableFailureEvent);
                androidx.fragment.app.FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.l0();
                androidx.fragment.app.DialogFragment dialogFragment = (androidx.fragment.app.DialogFragment) fragmentManager.q0(ErrorDialogManager.TAG_ERROR_DIALOG);
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                androidx.fragment.app.DialogFragment dialogFragment2 = (androidx.fragment.app.DialogFragment) ErrorDialogManager.factory.prepareErrorFragment(throwableFailureEvent, this.finishAfterDialog, this.argumentsForErrorDialog);
                if (dialogFragment2 != null) {
                    dialogFragment2.show(fragmentManager, ErrorDialogManager.TAG_ERROR_DIALOG);
                }
            }
        }

        public void onPause() {
            this.Y0.unregister(this);
            super.onPause();
        }

        public void onResume() {
            super.onResume();
            if (this.Z0) {
                this.Z0 = false;
                return;
            }
            EventBus a10 = ErrorDialogManager.factory.config.a();
            this.Y0 = a10;
            a10.register(this);
        }
    }

    public static void attachTo(Activity activity) {
        attachTo(activity, false, (Bundle) null);
    }

    public static void attachTo(Activity activity, Object obj, boolean z10, Bundle bundle) {
        if (factory == null) {
            throw new RuntimeException("You must set the static factory field to configure error dialogs for your app.");
        } else if (c(activity)) {
            SupportManagerFragment.attachTo(activity, obj, z10, bundle);
        } else {
            HoneycombManagerFragment.attachTo(activity, obj, z10, bundle);
        }
    }

    public static void attachTo(Activity activity, boolean z10) {
        attachTo(activity, z10, (Bundle) null);
    }

    public static void attachTo(Activity activity, boolean z10, Bundle bundle) {
        attachTo(activity, activity.getClass(), z10, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.getExecutionScope();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.Object r0, org.greenrobot.eventbus.util.ThrowableFailureEvent r1) {
        /*
            if (r1 == 0) goto L_0x0010
            java.lang.Object r1 = r1.getExecutionScope()
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.util.ErrorDialogManager.b(java.lang.Object, org.greenrobot.eventbus.util.ThrowableFailureEvent):boolean");
    }

    public static boolean c(Activity activity) {
        String name;
        Class cls = activity.getClass();
        do {
            cls = cls.getSuperclass();
            if (cls != null) {
                name = cls.getName();
                if (name.equals("androidx.fragment.app.FragmentActivity")) {
                    return true;
                }
                if (name.startsWith("com.actionbarsherlock.app") && (name.endsWith(".SherlockActivity") || name.endsWith(".SherlockListActivity") || name.endsWith(".SherlockPreferenceActivity"))) {
                    throw new RuntimeException("Please use SherlockFragmentActivity. Illegal activity: " + name);
                }
            } else {
                throw new RuntimeException("Illegal activity type: " + activity.getClass());
            }
        } while (!name.equals("android.app.Activity"));
        return false;
    }

    public static void checkLogException(ThrowableFailureEvent throwableFailureEvent) {
        ErrorDialogConfig errorDialogConfig = factory.config;
        if (errorDialogConfig.f21908f) {
            if (errorDialogConfig.f21909g == null) {
                String str = EventBus.TAG;
            }
            Throwable th2 = throwableFailureEvent.throwable;
        }
    }
}
