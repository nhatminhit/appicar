package w0;

import android.net.Uri;
import d.m0;
import gc.t;

public final class i {
    @m0
    public static String a(@m0 Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase(d.f14358c) || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(scheme);
                sb2.append(':');
                if (schemeSpecificPart != null) {
                    for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                        char charAt = schemeSpecificPart.charAt(i10);
                        if (!(charAt == '-' || charAt == '@' || charAt == '.')) {
                            charAt = 'x';
                        }
                        sb2.append(charAt);
                    }
                }
                return sb2.toString();
            } else if (scheme.equalsIgnoreCase(t.f19110d) || scheme.equalsIgnoreCase(t.f19111e) || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("//");
                String str = "";
                sb3.append(uri.getHost() != null ? uri.getHost() : str);
                if (uri.getPort() != -1) {
                    str = ":" + uri.getPort();
                }
                sb3.append(str);
                sb3.append("/...");
                schemeSpecificPart = sb3.toString();
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
