package vn.tw.service.xt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import vn.tw.service.xt.aidl.ITWCommandAidl;
import vn.tw.service.xt.aidl.ITWCommandCallbackAidl;

public class TWCommand implements TWCommandInterface {

    /* renamed from: k  reason: collision with root package name */
    public static final String f23924k = "TWCommand";

    /* renamed from: a  reason: collision with root package name */
    public final String f23925a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23926b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23927c;

    /* renamed from: d  reason: collision with root package name */
    public ITWCommandAidl f23928d;

    /* renamed from: e  reason: collision with root package name */
    public OnServiceStatus f23929e;

    /* renamed from: f  reason: collision with root package name */
    public OnCommandCallback f23930f;

    /* renamed from: g  reason: collision with root package name */
    public Context f23931g;

    /* renamed from: h  reason: collision with root package name */
    public ServiceConnection f23932h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23933i;

    /* renamed from: j  reason: collision with root package name */
    public ITWCommandCallbackAidl.Stub f23934j;

    public interface OnCommandCallback {
        void onBtCallStatus(int i10, String str, String str2);

        void onBtConnectedStatus(int i10);

        void onBtPhoneStatus(int i10);

        void onExtendedInterface(Bundle bundle);

        void onReverseStatus(int i10);

        void onSleepStatus(int i10);

        void onSystemVolume(int i10);

        void onVolumeStatus(int i10);
    }

    public interface OnServiceStatus {
        void serviceConnectStatus(boolean z10);
    }

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ITWCommandAidl unused = TWCommand.this.f23928d = ITWCommandAidl.Stub.asInterface(iBinder);
            boolean unused2 = TWCommand.this.f23933i = true;
            TWCommand.this.e();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            boolean unused = TWCommand.this.f23933i = false;
            TWCommand.this.e();
        }
    }

    public class b extends ITWCommandCallbackAidl.Stub {
        public b() {
        }

        public void onBtCallStatus(int i10, String str, String str2) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onBtCallStatus(i10, str, str2);
            }
        }

        public void onBtConnectedStatus(int i10) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onBtConnectedStatus(i10);
            }
        }

        public void onBtPhoneStatus(int i10) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onBtPhoneStatus(i10);
            }
        }

        public void onExtendedInterface(Bundle bundle) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onExtendedInterface(bundle);
            }
        }

        public void onReverseStatus(int i10) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onReverseStatus(i10);
            }
        }

        public void onSleepStatus(int i10) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onSleepStatus(i10);
            }
        }

        public void onSystemVolume(int i10) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onSystemVolume(i10);
            }
        }

        public void onVolumeStatus(int i10) throws RemoteException {
            if (TWCommand.this.f23930f != null) {
                TWCommand.this.f23930f.onVolumeStatus(i10);
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final TWCommand f23935a = new TWCommand((a) null);
    }

    public TWCommand() {
        this.f23925a = "com.tw.service.xt";
        this.f23926b = "com.tw.service.xt.CommandService";
        this.f23927c = "com.tw.service.xt.CommandService.Bind";
        this.f23932h = new a();
        this.f23933i = false;
        this.f23934j = new b();
    }

    public /* synthetic */ TWCommand(a aVar) {
        this();
    }

    public static TWCommand getInstance() {
        return c.f23935a;
    }

    public void OpenProject(String str) {
        if (this.f23933i) {
            try {
                this.f23928d.OpenProject(str);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void airConditioningControl(int i10, int i11) {
        if (this.f23933i) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("project", "air");
                bundle.putInt("data0", i10);
                bundle.putInt("data1", i11);
                this.f23928d.extendedInterface(bundle);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void back() {
        if (this.f23933i) {
            try {
                this.f23928d.back();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void btAccept() {
        if (this.f23933i) {
            try {
                this.f23928d.btAccept();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btCall(String str) {
        if (this.f23933i) {
            try {
                this.f23928d.btCall(str);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btGetConnectedStatus() {
        if (this.f23933i) {
            try {
                this.f23928d.btGetConnectedStatus();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btGetPhoneStatus() {
        if (this.f23933i) {
            try {
                this.f23928d.btGetPhoneStatus();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btHangUP() {
        if (this.f23933i) {
            try {
                this.f23928d.btHangUP();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btNext() {
        if (this.f23933i) {
            try {
                this.f23928d.btNext();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btOpenMusic() {
        if (this.f23933i) {
            try {
                this.f23928d.btOpenMusic();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btPlayMusic() {
        if (this.f23933i) {
            try {
                this.f23928d.btPlayMusic();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btPre() {
        if (this.f23933i) {
            try {
                this.f23928d.btPre();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btSetCallStatus(int i10, String str, String str2) {
        if (this.f23933i) {
            try {
                this.f23928d.btSetCallStatus(i10, str, str2);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void btSetConnectedStatus(int i10) {
        if (this.f23933i) {
            try {
                this.f23928d.btSetConnectedStatus(i10);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void closeCamera360() {
        control360State("close360");
    }

    public void closeScreen() {
        if (this.f23933i) {
            try {
                this.f23928d.closeScreen();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void control360State(String str) {
        Intent intent = new Intent();
        intent.setAction("com.percherry.roundadas.ALLROUND_LOOKING_3D");
        intent.putExtra("audioControl", str);
        this.f23931g.sendBroadcast(intent);
    }

    public final void e() {
        OnServiceStatus onServiceStatus = this.f23929e;
        if (onServiceStatus != null) {
            onServiceStatus.serviceConnectStatus(this.f23933i);
        }
    }

    public void extendedInterface(Bundle bundle) {
        if (this.f23933i) {
            try {
                this.f23928d.extendedInterface(bundle);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void getReverseStatus() {
        if (this.f23933i) {
            try {
                this.f23928d.getReverseStatus();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void getSleepStatus() {
        if (this.f23933i) {
            try {
                this.f23928d.getSleepStatus();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void getVolume() {
        if (this.f23933i) {
            try {
                this.f23928d.getVolume();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void getVolumeStatus() {
        if (this.f23933i) {
            try {
                this.f23928d.getVolumeStatus();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void goHome() {
        if (this.f23933i) {
            try {
                this.f23928d.goHome();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void init(Context context, OnServiceStatus onServiceStatus) {
        this.f23929e = onServiceStatus;
        Intent intent = new Intent();
        intent.setClassName("com.tw.service.xt", "com.tw.service.xt.CommandService");
        intent.setAction("com.tw.service.xt.CommandService.Bind");
        this.f23931g = context;
        context.bindService(intent, this.f23932h, 1);
    }

    public void killProject(String str) {
        if (this.f23933i) {
            try {
                this.f23928d.killProject(str);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void lightDown() {
        if (this.f23933i) {
            try {
                this.f23928d.lightDown();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void lightMax() {
        if (this.f23933i) {
            try {
                this.f23928d.lightMax();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void lightMin() {
        if (this.f23933i) {
            try {
                this.f23928d.lightMin();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void lightUp() {
        if (this.f23933i) {
            try {
                this.f23928d.lightUp();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void lightValue(int i10) {
        if (this.f23933i) {
            try {
                this.f23928d.lightValue(i10);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void mediaNext() {
        if (this.f23933i) {
            try {
                this.f23928d.mediaNext();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void mediaPause() {
        if (this.f23933i) {
            try {
                this.f23928d.mediaPause();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void mediaPlay() {
        if (this.f23933i) {
            try {
                this.f23928d.mediaPlay();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void mediaPre() {
        if (this.f23933i) {
            try {
                this.f23928d.mediaPre();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void musicMode(int i10) {
        if (this.f23933i) {
            try {
                this.f23928d.musicMode(i10);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void musicNext() {
        if (this.f23933i) {
            try {
                this.f23928d.musicNext();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void musicPause() {
        if (this.f23933i) {
            try {
                this.f23928d.musicPause();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void musicPlay() {
        if (this.f23933i) {
            try {
                this.f23928d.musicPlay();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void musicPre() {
        if (this.f23933i) {
            try {
                this.f23928d.musicPre();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void openCamera360() {
        control360State("open360");
    }

    public void openFrontViewCamera360() {
        control360State("frontView");
    }

    public void openLeftViewCamera360() {
        control360State("leftView");
    }

    public void openNarrowViewCamera360() {
        control360State("narrowView");
    }

    public void openRearViewCamera360() {
        control360State("rearView");
    }

    public void openRightViewCamera360() {
        control360State("rightView");
    }

    public void openScreen() {
        if (this.f23933i) {
            try {
                this.f23928d.openScreen();
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void radioBand(int i10) {
        if (this.f23933i) {
            try {
                this.f23928d.radioBand(i10);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioBandChange() {
        if (this.f23933i) {
            try {
                this.f23928d.radioBandChange();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioNext() {
        if (this.f23933i) {
            try {
                this.f23928d.radioNext();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioNextChannel() {
        if (this.f23933i) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("project", "radio");
                bundle.putString("action", "nextChannel");
                this.f23928d.extendedInterface(bundle);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void radioOpenChannel(String str) {
        if (this.f23933i) {
            try {
                this.f23928d.radioOpenChannel(str);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioPre() {
        if (this.f23933i) {
            try {
                this.f23928d.radioPre();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioPreChannel() {
        if (this.f23933i) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("project", "radio");
                bundle.putString("action", "preChannel");
                this.f23928d.extendedInterface(bundle);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void radioSearchNext() {
        if (this.f23933i) {
            try {
                this.f23928d.radioSearchNext();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioSearchPre() {
        if (this.f23933i) {
            try {
                this.f23928d.radioSearchPre();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void radioSetChannel(int i10) {
        if (this.f23933i) {
            try {
                this.f23928d.radioSetChannel(i10);
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void registerTWCommandCallback(OnCommandCallback onCommandCallback) {
        this.f23930f = onCommandCallback;
        registerTWCommandCallback((ITWCommandCallbackAidl) this.f23934j);
    }

    public void registerTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) {
        try {
            this.f23928d.registerTWCommandCallback(iTWCommandCallbackAidl);
        } catch (Exception unused) {
            e();
        }
    }

    public void setVolumeMute(boolean z10) {
        if (this.f23933i) {
            try {
                this.f23928d.setVolumeMute(z10);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void setWifi(boolean z10) {
        if (this.f23933i) {
            try {
                this.f23928d.setWifi(z10);
            } catch (Exception unused) {
                this.f23929e.serviceConnectStatus(false);
            }
        }
    }

    public void unRegisterTWCommandCallback() {
        this.f23930f = null;
        try {
            this.f23931g.unbindService(this.f23932h);
            this.f23928d.unRegisterTWCommandCallback(this.f23934j);
        } catch (Exception unused) {
            e();
        }
    }

    public void videoNext() {
        if (this.f23933i) {
            try {
                this.f23928d.videoNext();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void videoPause() {
        if (this.f23933i) {
            try {
                this.f23928d.videoPause();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void videoPlay() {
        if (this.f23933i) {
            try {
                this.f23928d.videoPlay();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void videoPre() {
        if (this.f23933i) {
            try {
                this.f23928d.videoPre();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void volumeDown() {
        if (this.f23933i) {
            try {
                this.f23928d.volumeDown();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void volumeMax() {
        if (this.f23933i) {
            try {
                this.f23928d.volumeMax();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void volumeMin() {
        if (this.f23933i) {
            try {
                this.f23928d.volumeMin();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void volumeMute() {
        if (this.f23933i) {
            try {
                this.f23928d.volumeMute();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void volumeUp() {
        if (this.f23933i) {
            try {
                this.f23928d.volumeUp();
            } catch (Exception unused) {
                e();
            }
        }
    }

    public void volumeValue(int i10) {
        if (this.f23933i) {
            try {
                this.f23928d.volumeValue(i10);
            } catch (Exception unused) {
                e();
            }
        }
    }
}
