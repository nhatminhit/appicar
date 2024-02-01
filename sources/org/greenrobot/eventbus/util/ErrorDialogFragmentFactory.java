package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import org.greenrobot.eventbus.util.ErrorDialogFragments;

public abstract class ErrorDialogFragmentFactory<T> {
    public final ErrorDialogConfig config;

    @TargetApi(11)
    public static class Honeycomb extends ErrorDialogFragmentFactory<Fragment> {
        public Honeycomb(ErrorDialogConfig errorDialogConfig) {
            super(errorDialogConfig);
        }

        public Fragment createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
            ErrorDialogFragments.Honeycomb honeycomb = new ErrorDialogFragments.Honeycomb();
            honeycomb.setArguments(bundle);
            return honeycomb;
        }
    }

    public static class Support extends ErrorDialogFragmentFactory<androidx.fragment.app.Fragment> {
        public Support(ErrorDialogConfig errorDialogConfig) {
            super(errorDialogConfig);
        }

        public androidx.fragment.app.Fragment createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
            ErrorDialogFragments.Support support = new ErrorDialogFragments.Support();
            support.setArguments(bundle);
            return support;
        }
    }

    public ErrorDialogFragmentFactory(ErrorDialogConfig errorDialogConfig) {
        this.config = errorDialogConfig;
    }

    public abstract T createErrorFragment(ThrowableFailureEvent throwableFailureEvent, Bundle bundle);

    public String getMessageFor(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
        return this.config.f21903a.getString(this.config.getMessageIdForThrowable(throwableFailureEvent.throwable));
    }

    public String getTitleFor(ThrowableFailureEvent throwableFailureEvent, Bundle bundle) {
        ErrorDialogConfig errorDialogConfig = this.config;
        return errorDialogConfig.f21903a.getString(errorDialogConfig.f21904b);
    }

    public T prepareErrorFragment(ThrowableFailureEvent throwableFailureEvent, boolean z10, Bundle bundle) {
        int i10;
        Class<?> cls;
        if (throwableFailureEvent.isSuppressErrorUi()) {
            return null;
        }
        Bundle bundle2 = bundle != null ? (Bundle) bundle.clone() : new Bundle();
        if (!bundle2.containsKey(ErrorDialogManager.KEY_TITLE)) {
            bundle2.putString(ErrorDialogManager.KEY_TITLE, getTitleFor(throwableFailureEvent, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_MESSAGE)) {
            bundle2.putString(ErrorDialogManager.KEY_MESSAGE, getMessageFor(throwableFailureEvent, bundle2));
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_FINISH_AFTER_DIALOG)) {
            bundle2.putBoolean(ErrorDialogManager.KEY_FINISH_AFTER_DIALOG, z10);
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_EVENT_TYPE_ON_CLOSE) && (cls = this.config.f21911i) != null) {
            bundle2.putSerializable(ErrorDialogManager.KEY_EVENT_TYPE_ON_CLOSE, cls);
        }
        if (!bundle2.containsKey(ErrorDialogManager.KEY_ICON_ID) && (i10 = this.config.f21910h) != 0) {
            bundle2.putInt(ErrorDialogManager.KEY_ICON_ID, i10);
        }
        return createErrorFragment(throwableFailureEvent, bundle2);
    }
}
