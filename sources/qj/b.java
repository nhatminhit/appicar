package qj;

public class b {
    private String idVideo;
    private String nameChannelVideo;
    private String nameVideo;
    private String thumb;
    private float timeVideo;

    public b(String str, float f10, String str2, String str3, String str4) {
        this.idVideo = str;
        this.timeVideo = f10;
        this.nameVideo = str2;
        this.nameChannelVideo = str3;
        this.thumb = str4;
    }

    public String getIdVideo() {
        return this.idVideo;
    }

    public String getNameChannelVideo() {
        return this.nameChannelVideo;
    }

    public String getNameVideo() {
        return this.nameVideo;
    }

    public String getThumb() {
        return this.thumb;
    }

    public float getTimeVideo() {
        return this.timeVideo;
    }

    public void setIdVideo(String str) {
        this.idVideo = str;
    }

    public void setNameChannelVideo(String str) {
        this.nameChannelVideo = str;
    }

    public void setNameVideo(String str) {
        this.nameVideo = str;
    }

    public void setThumb(String str) {
        this.thumb = str;
    }

    public void setTimeVideo(float f10) {
        this.timeVideo = f10;
    }
}
