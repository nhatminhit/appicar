package vn.tw.service.xt.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vn.tw.service.xt.aidl.IBTCallBack;
import vn.tw.service.xt.aidl.IMusicCallBack;
import vn.tw.service.xt.aidl.IRadioCallBack;
import vn.tw.service.xt.aidl.ITWCommandCallbackAidl;
import vn.tw.service.xt.aidl.IVideoCallBack;

public interface ITWCommandAidl extends IInterface {

    public static class Default implements ITWCommandAidl {
        public void OpenProject(String str) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        public void back() throws RemoteException {
        }

        public void btAccept() throws RemoteException {
        }

        public void btCall(String str) throws RemoteException {
        }

        public void btGetConnectedStatus() throws RemoteException {
        }

        public void btGetPhoneStatus() throws RemoteException {
        }

        public void btHangUP() throws RemoteException {
        }

        public void btNext() throws RemoteException {
        }

        public void btOpenMusic() throws RemoteException {
        }

        public void btPlayMusic() throws RemoteException {
        }

        public void btPre() throws RemoteException {
        }

        public void btSetCallStatus(int i10, String str, String str2) throws RemoteException {
        }

        public void btSetConnectedStatus(int i10) throws RemoteException {
        }

        public void btSetPhoneStatus(int i10) throws RemoteException {
        }

        public void closeScreen() throws RemoteException {
        }

        public void extendedInterface(Bundle bundle) throws RemoteException {
        }

        public void getReverseStatus() throws RemoteException {
        }

        public void getSleepStatus() throws RemoteException {
        }

        public void getVolume() throws RemoteException {
        }

        public void getVolumeStatus() throws RemoteException {
        }

        public void goHome() throws RemoteException {
        }

        public void killProject(String str) throws RemoteException {
        }

        public void lightDown() throws RemoteException {
        }

        public void lightMax() throws RemoteException {
        }

        public void lightMin() throws RemoteException {
        }

        public void lightUp() throws RemoteException {
        }

        public void lightValue(int i10) throws RemoteException {
        }

        public void mediaNext() throws RemoteException {
        }

        public void mediaPause() throws RemoteException {
        }

        public void mediaPlay() throws RemoteException {
        }

        public void mediaPre() throws RemoteException {
        }

        public void musicMode(int i10) throws RemoteException {
        }

        public void musicNext() throws RemoteException {
        }

        public void musicPause() throws RemoteException {
        }

        public void musicPlay() throws RemoteException {
        }

        public void musicPre() throws RemoteException {
        }

        public void openScreen() throws RemoteException {
        }

        public void radioBand(int i10) throws RemoteException {
        }

        public void radioBandChange() throws RemoteException {
        }

        public void radioNext() throws RemoteException {
        }

        public void radioOpenChannel(String str) throws RemoteException {
        }

        public void radioPre() throws RemoteException {
        }

        public void radioSearchNext() throws RemoteException {
        }

        public void radioSearchPre() throws RemoteException {
        }

        public void radioSetChannel(int i10) throws RemoteException {
        }

        public void registerBTCallBack(IBTCallBack iBTCallBack) throws RemoteException {
        }

        public void registerMusicCallBack(IMusicCallBack iMusicCallBack) throws RemoteException {
        }

        public void registerRadioCallBack(IRadioCallBack iRadioCallBack) throws RemoteException {
        }

        public void registerTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) throws RemoteException {
        }

        public void registerVideoCallBack(IVideoCallBack iVideoCallBack) throws RemoteException {
        }

        public void setVolumeMute(boolean z10) throws RemoteException {
        }

        public void setWifi(boolean z10) throws RemoteException {
        }

        public void unRegisterBTCallBack(IBTCallBack iBTCallBack) throws RemoteException {
        }

        public void unRegisterMusicCallBack(IMusicCallBack iMusicCallBack) throws RemoteException {
        }

        public void unRegisterRadioCallBack(IRadioCallBack iRadioCallBack) throws RemoteException {
        }

        public void unRegisterTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) throws RemoteException {
        }

        public void unRegisterVideoCallBack(IVideoCallBack iVideoCallBack) throws RemoteException {
        }

        public void videoNext() throws RemoteException {
        }

        public void videoPause() throws RemoteException {
        }

        public void videoPlay() throws RemoteException {
        }

        public void videoPre() throws RemoteException {
        }

        public void volumeDown() throws RemoteException {
        }

        public void volumeMax() throws RemoteException {
        }

        public void volumeMin() throws RemoteException {
        }

        public void volumeMute() throws RemoteException {
        }

        public void volumeUp() throws RemoteException {
        }

        public void volumeValue(int i10) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITWCommandAidl {
        public static final int A0 = 38;
        public static final int B0 = 39;
        public static final int C0 = 40;
        public static final int D0 = 41;
        public static final int E0 = 42;
        public static final int F0 = 43;
        public static final int G0 = 44;
        public static final int H0 = 45;
        public static final int I0 = 46;
        public static final int J0 = 47;
        public static final int K0 = 48;
        public static final int L0 = 49;
        public static final int M0 = 50;
        public static final int N0 = 51;
        public static final String O = "com.tw.service.xt.aidl.ITWCommandAidl";
        public static final int O0 = 52;
        public static final int P = 1;
        public static final int P0 = 53;
        public static final int Q = 2;
        public static final int Q0 = 54;
        public static final int R = 3;
        public static final int R0 = 55;
        public static final int S = 4;
        public static final int S0 = 56;
        public static final int T = 5;
        public static final int T0 = 57;
        public static final int U = 6;
        public static final int U0 = 58;
        public static final int V = 7;
        public static final int V0 = 59;
        public static final int W = 8;
        public static final int W0 = 60;
        public static final int X = 9;
        public static final int X0 = 61;
        public static final int Y = 10;
        public static final int Y0 = 62;
        public static final int Z = 11;
        public static final int Z0 = 63;

        /* renamed from: a0  reason: collision with root package name */
        public static final int f23936a0 = 12;

        /* renamed from: a1  reason: collision with root package name */
        public static final int f23937a1 = 64;

        /* renamed from: b0  reason: collision with root package name */
        public static final int f23938b0 = 13;

        /* renamed from: b1  reason: collision with root package name */
        public static final int f23939b1 = 65;

        /* renamed from: c0  reason: collision with root package name */
        public static final int f23940c0 = 14;

        /* renamed from: c1  reason: collision with root package name */
        public static final int f23941c1 = 66;

        /* renamed from: d0  reason: collision with root package name */
        public static final int f23942d0 = 15;

        /* renamed from: d1  reason: collision with root package name */
        public static final int f23943d1 = 67;

        /* renamed from: e0  reason: collision with root package name */
        public static final int f23944e0 = 16;

        /* renamed from: f0  reason: collision with root package name */
        public static final int f23945f0 = 17;

        /* renamed from: g0  reason: collision with root package name */
        public static final int f23946g0 = 18;

        /* renamed from: h0  reason: collision with root package name */
        public static final int f23947h0 = 19;

        /* renamed from: i0  reason: collision with root package name */
        public static final int f23948i0 = 20;

        /* renamed from: j0  reason: collision with root package name */
        public static final int f23949j0 = 21;

        /* renamed from: k0  reason: collision with root package name */
        public static final int f23950k0 = 22;

        /* renamed from: l0  reason: collision with root package name */
        public static final int f23951l0 = 23;

        /* renamed from: m0  reason: collision with root package name */
        public static final int f23952m0 = 24;

        /* renamed from: n0  reason: collision with root package name */
        public static final int f23953n0 = 25;

        /* renamed from: o0  reason: collision with root package name */
        public static final int f23954o0 = 26;

        /* renamed from: p0  reason: collision with root package name */
        public static final int f23955p0 = 27;

        /* renamed from: q0  reason: collision with root package name */
        public static final int f23956q0 = 28;

        /* renamed from: r0  reason: collision with root package name */
        public static final int f23957r0 = 29;

        /* renamed from: s0  reason: collision with root package name */
        public static final int f23958s0 = 30;

        /* renamed from: t0  reason: collision with root package name */
        public static final int f23959t0 = 31;

        /* renamed from: u0  reason: collision with root package name */
        public static final int f23960u0 = 32;

        /* renamed from: v0  reason: collision with root package name */
        public static final int f23961v0 = 33;

        /* renamed from: w0  reason: collision with root package name */
        public static final int f23962w0 = 34;

        /* renamed from: x0  reason: collision with root package name */
        public static final int f23963x0 = 35;

        /* renamed from: y0  reason: collision with root package name */
        public static final int f23964y0 = 36;

        /* renamed from: z0  reason: collision with root package name */
        public static final int f23965z0 = 37;

        public static class a implements ITWCommandAidl {
            public static ITWCommandAidl P;
            public IBinder O;

            public a(IBinder iBinder) {
                this.O = iBinder;
            }

            public String D() {
                return Stub.O;
            }

            public void OpenProject(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeString(str);
                    if (this.O.transact(51, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().OpenProject(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.O;
            }

            public void back() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(49, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().back();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btAccept() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(20, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btAccept();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btCall(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeString(str);
                    if (this.O.transact(19, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btCall(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btGetConnectedStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(28, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btGetConnectedStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btGetPhoneStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(26, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btGetPhoneStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btHangUP() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(21, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btHangUP();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(25, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btOpenMusic() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(22, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btOpenMusic();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btPlayMusic() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(23, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btPlayMusic();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(24, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btSetCallStatus(int i10, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.O.transact(30, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btSetCallStatus(i10, str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btSetConnectedStatus(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(29, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btSetConnectedStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void btSetPhoneStatus(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(27, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().btSetPhoneStatus(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void closeScreen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(65, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().closeScreen();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void extendedInterface(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.O.transact(67, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().extendedInterface(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getReverseStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(52, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getReverseStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getSleepStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(53, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getSleepStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getVolume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(46, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getVolume();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getVolumeStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(47, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getVolumeStatus();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void goHome() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(48, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().goHome();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void killProject(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeString(str);
                    if (this.O.transact(50, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().killProject(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void lightDown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(60, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().lightDown();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void lightMax() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(61, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().lightMax();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void lightMin() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(62, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().lightMin();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void lightUp() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(59, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().lightUp();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void lightValue(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(63, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().lightValue(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mediaNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(55, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().mediaNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mediaPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(58, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().mediaPause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mediaPlay() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(57, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().mediaPlay();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mediaPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(56, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().mediaPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicMode(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(35, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().musicMode(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(31, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().musicNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(34, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().musicPause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicPlay() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(33, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().musicPlay();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(32, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().musicPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void openScreen() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(66, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().openScreen();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioBand(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(17, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioBand(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioBandChange() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(18, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioBandChange();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioOpenChannel(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeString(str);
                    if (this.O.transact(16, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioOpenChannel(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioSearchNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioSearchNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioSearchPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioSearchPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void radioSetChannel(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(15, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().radioSetChannel(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerBTCallBack(IBTCallBack iBTCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iBTCallBack != null ? iBTCallBack.asBinder() : null);
                    if (this.O.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerBTCallBack(iBTCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerMusicCallBack(IMusicCallBack iMusicCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iMusicCallBack != null ? iMusicCallBack.asBinder() : null);
                    if (this.O.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerMusicCallBack(iMusicCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerRadioCallBack(IRadioCallBack iRadioCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iRadioCallBack != null ? iRadioCallBack.asBinder() : null);
                    if (this.O.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerRadioCallBack(iRadioCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iTWCommandCallbackAidl != null ? iTWCommandCallbackAidl.asBinder() : null);
                    if (this.O.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerTWCommandCallback(iTWCommandCallbackAidl);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerVideoCallBack(IVideoCallBack iVideoCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iVideoCallBack != null ? iVideoCallBack.asBinder() : null);
                    if (this.O.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().registerVideoCallBack(iVideoCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setVolumeMute(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(z10 ? 1 : 0);
                    if (this.O.transact(54, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setVolumeMute(z10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setWifi(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(z10 ? 1 : 0);
                    if (this.O.transact(64, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setWifi(z10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unRegisterBTCallBack(IBTCallBack iBTCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iBTCallBack != null ? iBTCallBack.asBinder() : null);
                    if (this.O.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unRegisterBTCallBack(iBTCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unRegisterMusicCallBack(IMusicCallBack iMusicCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iMusicCallBack != null ? iMusicCallBack.asBinder() : null);
                    if (this.O.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unRegisterMusicCallBack(iMusicCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unRegisterRadioCallBack(IRadioCallBack iRadioCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iRadioCallBack != null ? iRadioCallBack.asBinder() : null);
                    if (this.O.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unRegisterRadioCallBack(iRadioCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unRegisterTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iTWCommandCallbackAidl != null ? iTWCommandCallbackAidl.asBinder() : null);
                    if (this.O.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unRegisterTWCommandCallback(iTWCommandCallbackAidl);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unRegisterVideoCallBack(IVideoCallBack iVideoCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeStrongBinder(iVideoCallBack != null ? iVideoCallBack.asBinder() : null);
                    if (this.O.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().unRegisterVideoCallBack(iVideoCallBack);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(36, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().videoNext();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(39, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().videoPause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoPlay() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(38, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().videoPlay();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void videoPre() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(37, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().videoPre();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void volumeDown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(41, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().volumeDown();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void volumeMax() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(43, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().volumeMax();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void volumeMin() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(44, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().volumeMin();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void volumeMute() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(42, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().volumeMute();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void volumeUp() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    if (this.O.transact(40, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().volumeUp();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void volumeValue(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.O);
                    obtain.writeInt(i10);
                    if (this.O.transact(45, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().volumeValue(i10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, O);
        }

        public static ITWCommandAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(O);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITWCommandAidl)) ? new a(iBinder) : (ITWCommandAidl) queryLocalInterface;
        }

        public static ITWCommandAidl getDefaultImpl() {
            return a.P;
        }

        public static boolean setDefaultImpl(ITWCommandAidl iTWCommandAidl) {
            if (a.P != null || iTWCommandAidl == null) {
                return false;
            }
            a.P = iTWCommandAidl;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1598968902) {
                boolean z10 = false;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(O);
                        registerTWCommandCallback(ITWCommandCallbackAidl.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 2:
                        parcel.enforceInterface(O);
                        unRegisterTWCommandCallback(ITWCommandCallbackAidl.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 3:
                        parcel.enforceInterface(O);
                        registerRadioCallBack(IRadioCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 4:
                        parcel.enforceInterface(O);
                        unRegisterRadioCallBack(IRadioCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 5:
                        parcel.enforceInterface(O);
                        registerMusicCallBack(IMusicCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 6:
                        parcel.enforceInterface(O);
                        unRegisterMusicCallBack(IMusicCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 7:
                        parcel.enforceInterface(O);
                        registerVideoCallBack(IVideoCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 8:
                        parcel.enforceInterface(O);
                        unRegisterVideoCallBack(IVideoCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 9:
                        parcel.enforceInterface(O);
                        registerBTCallBack(IBTCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 10:
                        parcel.enforceInterface(O);
                        unRegisterBTCallBack(IBTCallBack.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 11:
                        parcel.enforceInterface(O);
                        radioNext();
                        break;
                    case 12:
                        parcel.enforceInterface(O);
                        radioPre();
                        break;
                    case 13:
                        parcel.enforceInterface(O);
                        radioSearchNext();
                        break;
                    case 14:
                        parcel.enforceInterface(O);
                        radioSearchPre();
                        break;
                    case 15:
                        parcel.enforceInterface(O);
                        radioSetChannel(parcel.readInt());
                        break;
                    case 16:
                        parcel.enforceInterface(O);
                        radioOpenChannel(parcel.readString());
                        break;
                    case 17:
                        parcel.enforceInterface(O);
                        radioBand(parcel.readInt());
                        break;
                    case 18:
                        parcel.enforceInterface(O);
                        radioBandChange();
                        break;
                    case 19:
                        parcel.enforceInterface(O);
                        btCall(parcel.readString());
                        break;
                    case 20:
                        parcel.enforceInterface(O);
                        btAccept();
                        break;
                    case 21:
                        parcel.enforceInterface(O);
                        btHangUP();
                        break;
                    case 22:
                        parcel.enforceInterface(O);
                        btOpenMusic();
                        break;
                    case 23:
                        parcel.enforceInterface(O);
                        btPlayMusic();
                        break;
                    case 24:
                        parcel.enforceInterface(O);
                        btPre();
                        break;
                    case 25:
                        parcel.enforceInterface(O);
                        btNext();
                        break;
                    case 26:
                        parcel.enforceInterface(O);
                        btGetPhoneStatus();
                        break;
                    case 27:
                        parcel.enforceInterface(O);
                        btSetPhoneStatus(parcel.readInt());
                        break;
                    case 28:
                        parcel.enforceInterface(O);
                        btGetConnectedStatus();
                        break;
                    case 29:
                        parcel.enforceInterface(O);
                        btSetConnectedStatus(parcel.readInt());
                        break;
                    case 30:
                        parcel.enforceInterface(O);
                        btSetCallStatus(parcel.readInt(), parcel.readString(), parcel.readString());
                        break;
                    case 31:
                        parcel.enforceInterface(O);
                        musicNext();
                        break;
                    case 32:
                        parcel.enforceInterface(O);
                        musicPre();
                        break;
                    case 33:
                        parcel.enforceInterface(O);
                        musicPlay();
                        break;
                    case 34:
                        parcel.enforceInterface(O);
                        musicPause();
                        break;
                    case 35:
                        parcel.enforceInterface(O);
                        musicMode(parcel.readInt());
                        break;
                    case 36:
                        parcel.enforceInterface(O);
                        videoNext();
                        break;
                    case 37:
                        parcel.enforceInterface(O);
                        videoPre();
                        break;
                    case 38:
                        parcel.enforceInterface(O);
                        videoPlay();
                        break;
                    case 39:
                        parcel.enforceInterface(O);
                        videoPause();
                        break;
                    case 40:
                        parcel.enforceInterface(O);
                        volumeUp();
                        break;
                    case 41:
                        parcel.enforceInterface(O);
                        volumeDown();
                        break;
                    case 42:
                        parcel.enforceInterface(O);
                        volumeMute();
                        break;
                    case 43:
                        parcel.enforceInterface(O);
                        volumeMax();
                        break;
                    case 44:
                        parcel.enforceInterface(O);
                        volumeMin();
                        break;
                    case 45:
                        parcel.enforceInterface(O);
                        volumeValue(parcel.readInt());
                        break;
                    case 46:
                        parcel.enforceInterface(O);
                        getVolume();
                        break;
                    case 47:
                        parcel.enforceInterface(O);
                        getVolumeStatus();
                        break;
                    case 48:
                        parcel.enforceInterface(O);
                        goHome();
                        break;
                    case 49:
                        parcel.enforceInterface(O);
                        back();
                        break;
                    case 50:
                        parcel.enforceInterface(O);
                        killProject(parcel.readString());
                        break;
                    case 51:
                        parcel.enforceInterface(O);
                        OpenProject(parcel.readString());
                        break;
                    case 52:
                        parcel.enforceInterface(O);
                        getReverseStatus();
                        break;
                    case 53:
                        parcel.enforceInterface(O);
                        getSleepStatus();
                        break;
                    case 54:
                        parcel.enforceInterface(O);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        }
                        setVolumeMute(z10);
                        break;
                    case 55:
                        parcel.enforceInterface(O);
                        mediaNext();
                        break;
                    case 56:
                        parcel.enforceInterface(O);
                        mediaPre();
                        break;
                    case 57:
                        parcel.enforceInterface(O);
                        mediaPlay();
                        break;
                    case 58:
                        parcel.enforceInterface(O);
                        mediaPause();
                        break;
                    case 59:
                        parcel.enforceInterface(O);
                        lightUp();
                        break;
                    case 60:
                        parcel.enforceInterface(O);
                        lightDown();
                        break;
                    case 61:
                        parcel.enforceInterface(O);
                        lightMax();
                        break;
                    case 62:
                        parcel.enforceInterface(O);
                        lightMin();
                        break;
                    case 63:
                        parcel.enforceInterface(O);
                        lightValue(parcel.readInt());
                        break;
                    case 64:
                        parcel.enforceInterface(O);
                        if (parcel.readInt() != 0) {
                            z10 = true;
                        }
                        setWifi(z10);
                        break;
                    case 65:
                        parcel.enforceInterface(O);
                        closeScreen();
                        break;
                    case 66:
                        parcel.enforceInterface(O);
                        openScreen();
                        break;
                    case 67:
                        parcel.enforceInterface(O);
                        extendedInterface(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(O);
            return true;
        }
    }

    void OpenProject(String str) throws RemoteException;

    void back() throws RemoteException;

    void btAccept() throws RemoteException;

    void btCall(String str) throws RemoteException;

    void btGetConnectedStatus() throws RemoteException;

    void btGetPhoneStatus() throws RemoteException;

    void btHangUP() throws RemoteException;

    void btNext() throws RemoteException;

    void btOpenMusic() throws RemoteException;

    void btPlayMusic() throws RemoteException;

    void btPre() throws RemoteException;

    void btSetCallStatus(int i10, String str, String str2) throws RemoteException;

    void btSetConnectedStatus(int i10) throws RemoteException;

    void btSetPhoneStatus(int i10) throws RemoteException;

    void closeScreen() throws RemoteException;

    void extendedInterface(Bundle bundle) throws RemoteException;

    void getReverseStatus() throws RemoteException;

    void getSleepStatus() throws RemoteException;

    void getVolume() throws RemoteException;

    void getVolumeStatus() throws RemoteException;

    void goHome() throws RemoteException;

    void killProject(String str) throws RemoteException;

    void lightDown() throws RemoteException;

    void lightMax() throws RemoteException;

    void lightMin() throws RemoteException;

    void lightUp() throws RemoteException;

    void lightValue(int i10) throws RemoteException;

    void mediaNext() throws RemoteException;

    void mediaPause() throws RemoteException;

    void mediaPlay() throws RemoteException;

    void mediaPre() throws RemoteException;

    void musicMode(int i10) throws RemoteException;

    void musicNext() throws RemoteException;

    void musicPause() throws RemoteException;

    void musicPlay() throws RemoteException;

    void musicPre() throws RemoteException;

    void openScreen() throws RemoteException;

    void radioBand(int i10) throws RemoteException;

    void radioBandChange() throws RemoteException;

    void radioNext() throws RemoteException;

    void radioOpenChannel(String str) throws RemoteException;

    void radioPre() throws RemoteException;

    void radioSearchNext() throws RemoteException;

    void radioSearchPre() throws RemoteException;

    void radioSetChannel(int i10) throws RemoteException;

    void registerBTCallBack(IBTCallBack iBTCallBack) throws RemoteException;

    void registerMusicCallBack(IMusicCallBack iMusicCallBack) throws RemoteException;

    void registerRadioCallBack(IRadioCallBack iRadioCallBack) throws RemoteException;

    void registerTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) throws RemoteException;

    void registerVideoCallBack(IVideoCallBack iVideoCallBack) throws RemoteException;

    void setVolumeMute(boolean z10) throws RemoteException;

    void setWifi(boolean z10) throws RemoteException;

    void unRegisterBTCallBack(IBTCallBack iBTCallBack) throws RemoteException;

    void unRegisterMusicCallBack(IMusicCallBack iMusicCallBack) throws RemoteException;

    void unRegisterRadioCallBack(IRadioCallBack iRadioCallBack) throws RemoteException;

    void unRegisterTWCommandCallback(ITWCommandCallbackAidl iTWCommandCallbackAidl) throws RemoteException;

    void unRegisterVideoCallBack(IVideoCallBack iVideoCallBack) throws RemoteException;

    void videoNext() throws RemoteException;

    void videoPause() throws RemoteException;

    void videoPlay() throws RemoteException;

    void videoPre() throws RemoteException;

    void volumeDown() throws RemoteException;

    void volumeMax() throws RemoteException;

    void volumeMin() throws RemoteException;

    void volumeMute() throws RemoteException;

    void volumeUp() throws RemoteException;

    void volumeValue(int i10) throws RemoteException;
}
