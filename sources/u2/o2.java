package u2;

import d.x0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13578a = "room_master_table";

    /* renamed from: b  reason: collision with root package name */
    public static final String f13579b = "room_master_table";

    /* renamed from: c  reason: collision with root package name */
    public static final String f13580c = "id";

    /* renamed from: d  reason: collision with root package name */
    public static final String f13581d = "identity_hash";

    /* renamed from: e  reason: collision with root package name */
    public static final String f13582e = "42";

    /* renamed from: f  reason: collision with root package name */
    public static final String f13583f = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* renamed from: g  reason: collision with root package name */
    public static final String f13584g = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    public static String a(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
