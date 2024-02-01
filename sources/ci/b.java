package ci;

import java.util.List;

public class b {
    private List<String> data = null;
    private String message;
    private int statusCode;

    public List<String> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setData(List<String> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatusCode(int i10) {
        this.statusCode = i10;
    }

    public String toString() {
        return "QRAuth{message='" + this.message + '\'' + ", data=" + this.data + ", statusCode='" + this.statusCode + '\'' + '}';
    }
}
