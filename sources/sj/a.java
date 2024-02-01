package sj;

import android.os.Environment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23030a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static final String f23031b = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/.icar_config.icv");

    /* renamed from: c  reason: collision with root package name */
    public static final String f23032c = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/.icar_config_client_icarE.icv");

    /* renamed from: d  reason: collision with root package name */
    public static final String f23033d = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/.icar_config_device.icv");

    /* renamed from: e  reason: collision with root package name */
    public static a f23034e = null;

    public static a b() {
        if (f23034e == null) {
            synchronized (a.class) {
                if (f23034e == null) {
                    f23034e = new a();
                }
            }
        }
        return f23034e;
    }

    public String a(String str) {
        String str2 = "";
        FileInputStream fileInputStream = null;
        try {
            if (str.equals("MAC")) {
                fileInputStream = new FileInputStream(f23031b);
            } else if (str.equals("CLIENT")) {
                fileInputStream = new FileInputStream(f23032c);
            } else if (str.equals("DEVICE")) {
                fileInputStream = new FileInputStream(f23033d);
            }
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty(str);
            if (property == null) {
                property = str2;
            }
            try {
                if (!str.equals("MAC") || property.equals(str2)) {
                    return property;
                }
                return property.substring(10) + property.substring(0, 6);
            } catch (IOException e10) {
                e = e10;
                str2 = property;
                e.printStackTrace();
                return str2;
            }
        } catch (IOException e11) {
            e = e11;
            e.printStackTrace();
            return str2;
        }
    }

    public String c() {
        long time = new Date().getTime();
        Random random = new Random();
        int nextInt = random.nextInt(26);
        int nextInt2 = random.nextInt(999999999);
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        return charArray[nextInt] + "" + nextInt + nextInt2 + time;
    }

    public boolean d(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            if (str.equals("CLIENT")) {
                fileOutputStream = new FileOutputStream(f23032c);
                str2 = c();
            } else if (str.equals("DEVICE")) {
                fileOutputStream = new FileOutputStream(f23033d);
            } else {
                str2 = "";
                fileOutputStream = null;
            }
            Properties properties = new Properties();
            properties.setProperty(str, str2);
            properties.store(fileOutputStream, (String) null);
            return true;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
