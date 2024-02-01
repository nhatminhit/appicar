package lj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import java.util.Locale;

public class a implements RecognitionListener {

    /* renamed from: e  reason: collision with root package name */
    public static a f20992e;

    /* renamed from: a  reason: collision with root package name */
    public Context f20993a;

    /* renamed from: b  reason: collision with root package name */
    public SpeechRecognizer f20994b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f20995c;

    /* renamed from: d  reason: collision with root package name */
    public C0363a f20996d;

    /* renamed from: lj.a$a  reason: collision with other inner class name */
    public interface C0363a {
        void a(Bundle bundle);

        void b(Bundle bundle);

        void onBeginningOfSpeech();

        void onError(int i10);
    }

    public a(Context context) {
    }

    public static a a(Context context) {
        if (f20992e == null) {
            f20992e = new a(context);
        }
        return f20992e;
    }

    public void b(Context context) {
    }

    public void c(C0363a aVar) {
        this.f20996d = aVar;
    }

    public void d(Context context) {
        this.f20993a = context;
        this.f20994b = SpeechRecognizer.createSpeechRecognizer(context);
        this.f20995c = new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("calling_package", context.getPackageName()).putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form").putExtra("android.speech.extra.LANGUAGE", Locale.getDefault()).putExtra("android.speech.extra.PARTIAL_RESULTS", true).putExtra("android.speech.extra.WEB_SEARCH_ONLY", true);
        this.f20994b.setRecognitionListener(this);
        this.f20994b.startListening(this.f20995c);
    }

    public void e() {
        SpeechRecognizer speechRecognizer = this.f20994b;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }

    public void onBeginningOfSpeech() {
        C0363a aVar = this.f20996d;
        if (aVar != null) {
            aVar.onBeginningOfSpeech();
        }
    }

    public void onBufferReceived(byte[] bArr) {
    }

    public void onEndOfSpeech() {
    }

    public void onError(int i10) {
        C0363a aVar = this.f20996d;
        if (aVar != null) {
            aVar.onError(i10);
        }
    }

    public void onEvent(int i10, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
        C0363a aVar = this.f20996d;
        if (aVar != null) {
            aVar.a(bundle);
        }
    }

    public void onReadyForSpeech(Bundle bundle) {
    }

    public void onResults(Bundle bundle) {
        C0363a aVar = this.f20996d;
        if (aVar != null) {
            aVar.b(bundle);
        }
    }

    public void onRmsChanged(float f10) {
    }
}
