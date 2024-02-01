package i0;

import android.content.ContentProvider;
import android.content.Context;
import d.m0;

public final class a {
    @m0
    public static Context a(@m0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
