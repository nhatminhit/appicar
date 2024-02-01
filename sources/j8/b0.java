package j8;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.m0;
import d.o0;
import e8.a;

@a
public class b0 {
    @a
    @o0
    public static String a(@m0 String str, @m0 String str2, @m0 Context context, @m0 AttributeSet attributeSet, boolean z10, boolean z11, @m0 String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z10) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                resources.getValue(packageName + ":string/" + substring, typedValue, true);
            } catch (Resources.NotFoundException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not find resource for ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(attributeValue);
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String obj = typedValue.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Resource ");
                sb3.append(str2);
                sb3.append(" was not a string: ");
                sb3.append(obj);
            }
        }
        if (z11 && attributeValue == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Required XML attribute \"");
            sb4.append(str2);
            sb4.append("\" missing");
        }
        return attributeValue;
    }
}
