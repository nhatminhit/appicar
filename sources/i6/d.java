package i6;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import b6.n0;
import i6.b;
import i6.c;
import w7.a0;

public final class d implements b.d {

    /* renamed from: e  reason: collision with root package name */
    public static final int f9165e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final String f9166f = "ACTION_EXO_REPEAT_MODE";

    /* renamed from: a  reason: collision with root package name */
    public final int f9167a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f9168b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f9169c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f9170d;

    public d(Context context) {
        this(context, 3);
    }

    public d(Context context, int i10) {
        this.f9167a = i10;
        this.f9168b = context.getString(c.h.exo_media_action_repeat_all_description);
        this.f9169c = context.getString(c.h.exo_media_action_repeat_one_description);
        this.f9170d = context.getString(c.h.exo_media_action_repeat_off_description);
    }

    public void a(n0 n0Var, b6.d dVar, String str, Bundle bundle) {
        int k10 = n0Var.k();
        int a10 = a0.a(k10, this.f9167a);
        if (k10 != a10) {
            dVar.d(n0Var, a10);
        }
    }

    public PlaybackStateCompat.CustomAction b(n0 n0Var) {
        CharSequence charSequence;
        int i10;
        int k10 = n0Var.k();
        if (k10 == 1) {
            charSequence = this.f9169c;
            i10 = c.d.exo_media_action_repeat_one;
        } else if (k10 != 2) {
            charSequence = this.f9170d;
            i10 = c.d.exo_media_action_repeat_off;
        } else {
            charSequence = this.f9168b;
            i10 = c.d.exo_media_action_repeat_all;
        }
        return new PlaybackStateCompat.CustomAction.b(f9166f, charSequence, i10).a();
    }
}
