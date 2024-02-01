package hd;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final String f19541c = "TtsUtils";

    /* renamed from: d  reason: collision with root package name */
    public static c f19542d;

    /* renamed from: a  reason: collision with root package name */
    public Context f19543a;

    /* renamed from: b  reason: collision with root package name */
    public TextToSpeech f19544b;

    public interface a {
        void a(String str);

        void b();
    }

    public static c c() {
        if (f19542d == null) {
            f19542d = new c();
        }
        return f19542d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i10) {
        if (i10 == 0) {
            g(Locale.getDefault());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("error: ");
        sb2.append(i10);
    }

    public static /* synthetic */ void f(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public void d(Context context) {
        this.f19543a = context;
        this.f19544b = new TextToSpeech(context, new a(this));
    }

    public void g(Locale locale) {
        TextToSpeech textToSpeech = this.f19544b;
        if (textToSpeech != null) {
            textToSpeech.setLanguage(locale);
        }
    }

    public void h(String str) {
        TextToSpeech textToSpeech = this.f19544b;
        if (textToSpeech != null) {
            textToSpeech.speak(str, 0, (Bundle) null, (String) null);
        }
    }

    public void i(String str, a aVar) {
        long j10;
        long j11;
        TextToSpeech textToSpeech = this.f19544b;
        if (textToSpeech != null) {
            textToSpeech.speak(str, 0, (Bundle) null, (String) null);
            Handler handler = new Handler();
            b bVar = new b(aVar);
            int length = str.length();
            int length2 = str.length();
            if (length < 80) {
                j10 = (long) length2;
                j11 = 90;
            } else {
                j10 = (long) length2;
                j11 = 80;
            }
            handler.postDelayed(bVar, j10 * j11);
            return;
        }
        aVar.a("Chưa khởi tạo");
    }
}
