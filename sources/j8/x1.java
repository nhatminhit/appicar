package j8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import l8.a;
import l8.b;

public final class x1 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, getServiceRequest.O);
        b.F(parcel, 2, getServiceRequest.P);
        b.F(parcel, 3, getServiceRequest.Q);
        b.Y(parcel, 4, getServiceRequest.R, false);
        b.B(parcel, 5, getServiceRequest.S, false);
        b.c0(parcel, 6, getServiceRequest.T, i10, false);
        b.k(parcel, 7, getServiceRequest.U, false);
        b.S(parcel, 8, getServiceRequest.V, i10, false);
        b.c0(parcel, 10, getServiceRequest.W, i10, false);
        b.c0(parcel, 11, getServiceRequest.X, i10, false);
        b.g(parcel, 12, getServiceRequest.Y);
        b.F(parcel, 13, getServiceRequest.Z);
        b.g(parcel, 14, getServiceRequest.f5766a0);
        b.Y(parcel, 15, getServiceRequest.Z0(), false);
        b.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i02 = a.i0(parcel);
        Scope[] scopeArr = GetServiceRequest.f5764c0;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f5765d0;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < i02) {
            int X = a.X(parcel);
            switch (a.O(X)) {
                case 1:
                    i10 = a.Z(parcel2, X);
                    break;
                case 2:
                    i11 = a.Z(parcel2, X);
                    break;
                case 3:
                    i12 = a.Z(parcel2, X);
                    break;
                case 4:
                    str = a.G(parcel2, X);
                    break;
                case 5:
                    iBinder = a.Y(parcel2, X);
                    break;
                case 6:
                    scopeArr = (Scope[]) a.K(parcel2, X, Scope.CREATOR);
                    break;
                case 7:
                    bundle = a.g(parcel2, X);
                    break;
                case 8:
                    account = (Account) a.C(parcel2, X, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) a.K(parcel2, X, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) a.K(parcel2, X, Feature.CREATOR);
                    break;
                case 12:
                    z10 = a.P(parcel2, X);
                    break;
                case 13:
                    i13 = a.Z(parcel2, X);
                    break;
                case 14:
                    z11 = a.P(parcel2, X);
                    break;
                case 15:
                    str2 = a.G(parcel2, X);
                    break;
                default:
                    a.h0(parcel2, X);
                    break;
            }
        }
        a.N(parcel2, i02);
        return new GetServiceRequest(i10, i11, i12, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
