package vn.tw.service.xt;

import android.os.Bundle;
import vn.tw.service.xt.aidl.ITWCommandCallbackAidl;

public interface TWCommandInterface {
    void OpenProject(String str);

    void back();

    void btAccept();

    void btCall(String str);

    void btGetConnectedStatus();

    void btGetPhoneStatus();

    void btHangUP();

    void btNext();

    void btOpenMusic();

    void btPlayMusic();

    void btPre();

    void btSetCallStatus(int i10, String str, String str2);

    void btSetConnectedStatus(int i10);

    void closeScreen();

    void extendedInterface(Bundle bundle);

    void getReverseStatus();

    void getSleepStatus();

    void getVolume();

    void getVolumeStatus();

    void goHome();

    void killProject(String str);

    void lightDown();

    void lightMax();

    void lightMin();

    void lightUp();

    void lightValue(int i10);

    void mediaNext();

    void mediaPause();

    void mediaPlay();

    void mediaPre();

    void musicMode(int i10);

    void musicNext();

    void musicPause();

    void musicPlay();

    void musicPre();

    void openScreen();

    void radioBand(int i10);

    void radioBandChange();

    void radioNext();

    void radioOpenChannel(String str);

    void radioPre();

    void radioSearchNext();

    void radioSearchPre();

    void radioSetChannel(int i10);

    void registerTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl);

    void setVolumeMute(boolean z10);

    void setWifi(boolean z10);

    void unRegisterTWCommandCallback();

    void videoNext();

    void videoPause();

    void videoPlay();

    void videoPre();

    void volumeDown();

    void volumeMax();

    void volumeMin();

    void volumeMute();

    void volumeUp();

    void volumeValue(int i10);
}
