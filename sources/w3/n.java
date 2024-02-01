package w3;

import android.content.res.AssetManager;
import d.m0;
import java.io.IOException;
import java.io.InputStream;

public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @m0
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream e(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
