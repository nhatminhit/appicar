package ci;

import ia.c;
import java.util.ArrayList;
import java.util.List;

public class a {
    @c("data")
    @ia.a
    private List<Object> data = null;
    @c("message")
    @ia.a
    private String message;
    @c("statusCode")
    @ia.a
    private Integer statusCode;

    public List<Object> getData() {
        List<Object> list = this.data;
        return list == null ? new ArrayList() : list;
    }

    public String getMessage() {
        String str = this.message;
        return str == null ? "" : str;
    }

    public Integer getStatusCode() {
        Integer num = this.statusCode;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void setData(List<Object> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public String toString() {
        return "DataServer{message='" + this.message + '\'' + ", data=" + this.data + ", statusCode=" + this.statusCode + '}';
    }
}
