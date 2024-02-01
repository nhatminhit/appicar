package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.d;
import d.m0;
import d.o0;
import d8.e;
import j8.s;
import w8.d0;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @d0
    public int O = 0;

    @m0
    public static Intent a(@m0 Context context, @m0 PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    public final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.O = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    d.z(this).M(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.O = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        } else {
            e.x().B(this, ((Integer) s.l(num)).intValue(), 2, this);
            this.O = 1;
        }
    }

    public final void onActivityResult(int i10, int i11, @m0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.O = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d z10 = d.z(this);
                if (i11 == -1) {
                    z10.b();
                } else if (i11 == 0) {
                    z10.M(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.O = 0;
            setResult(i11, intent);
        }
        finish();
    }

    public final void onCancel(@m0 DialogInterface dialogInterface) {
        this.O = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.O = bundle.getInt("resolution");
        }
        if (this.O != 1) {
            b();
        }
    }

    public final void onSaveInstanceState(@m0 Bundle bundle) {
        bundle.putInt("resolution", this.O);
        super.onSaveInstanceState(bundle);
    }
}
