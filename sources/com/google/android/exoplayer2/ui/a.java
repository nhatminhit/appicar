package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ui.d;
import java.util.Locale;
import r7.k;
import w7.q0;
import w7.s;

public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f5531a;

    public a(Resources resources) {
        this.f5531a = (Resources) w7.a.g(resources);
    }

    public static int i(Format format) {
        int g10 = s.g(format.W);
        if (g10 != -1) {
            return g10;
        }
        if (s.j(format.T) != null) {
            return 2;
        }
        if (s.a(format.T) != null) {
            return 1;
        }
        if (format.f5069b0 == -1 && format.f5070c0 == -1) {
            return (format.f5077j0 == -1 && format.f5078k0 == -1) ? -1 : 1;
        }
        return 2;
    }

    public String a(Format format) {
        int i10 = i(format);
        String j10 = i10 == 2 ? j(h(format), g(format), c(format)) : i10 == 1 ? j(e(format), b(format), c(format)) : e(format);
        return j10.length() == 0 ? this.f5531a.getString(d.h.exo_track_unknown) : j10;
    }

    public final String b(Format format) {
        Resources resources;
        int i10;
        int i11 = format.f5077j0;
        if (i11 == -1 || i11 < 1) {
            return "";
        }
        if (i11 == 1) {
            resources = this.f5531a;
            i10 = d.h.exo_track_mono;
        } else if (i11 == 2) {
            resources = this.f5531a;
            i10 = d.h.exo_track_stereo;
        } else if (i11 == 6 || i11 == 7) {
            resources = this.f5531a;
            i10 = d.h.exo_track_surround_5_point_1;
        } else if (i11 != 8) {
            resources = this.f5531a;
            i10 = d.h.exo_track_surround;
        } else {
            resources = this.f5531a;
            i10 = d.h.exo_track_surround_7_point_1;
        }
        return resources.getString(i10);
    }

    public final String c(Format format) {
        int i10 = format.S;
        if (i10 == -1) {
            return "";
        }
        return this.f5531a.getString(d.h.exo_track_bitrate, new Object[]{Float.valueOf(((float) i10) / 1000000.0f)});
    }

    public final String d(Format format) {
        return TextUtils.isEmpty(format.P) ? "" : format.P;
    }

    public final String e(Format format) {
        String j10 = j(f(format), h(format));
        return TextUtils.isEmpty(j10) ? d(format) : j10;
    }

    public final String f(Format format) {
        String str = format.f5082o0;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        return (q0.f14786a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
    }

    public final String g(Format format) {
        int i10 = format.f5069b0;
        int i11 = format.f5070c0;
        if (i10 == -1 || i11 == -1) {
            return "";
        }
        return this.f5531a.getString(d.h.exo_track_resolution, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)});
    }

    public final String h(Format format) {
        String string = (format.R & 2) != 0 ? this.f5531a.getString(d.h.exo_track_role_alternate) : "";
        if ((format.R & 4) != 0) {
            string = j(string, this.f5531a.getString(d.h.exo_track_role_supplementary));
        }
        if ((format.R & 8) != 0) {
            string = j(string, this.f5531a.getString(d.h.exo_track_role_commentary));
        }
        if ((format.R & 1088) == 0) {
            return string;
        }
        return j(string, this.f5531a.getString(d.h.exo_track_role_closed_captions));
    }

    public final String j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f5531a.getString(d.h.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }
}
