package qj;

import java.util.List;

public class a {
    private C0395a message;
    private String name;
    private String target;
    private double time;

    /* renamed from: qj.a$a  reason: collision with other inner class name */
    public static class C0395a {
        private String action;
        private boolean content;
        private List<C0396a> data;
        private List<b> videos;

        /* renamed from: qj.a$a$a  reason: collision with other inner class name */
        public static class C0396a {
            private String category;
            private String channel;
            private String current;

            /* renamed from: id  reason: collision with root package name */
            private String f22404id;
            private String name;
            private boolean selected;
            private boolean status;
            private String tab;
            private String thumb;
            private String thumbnail;
            private String total;
            private int volume;
            private int volume_max;

            public String getCategory() {
                return this.category;
            }

            public String getChannel() {
                return this.channel;
            }

            public String getCurrent() {
                return this.current;
            }

            public String getId() {
                return this.f22404id;
            }

            public String getName() {
                return this.name;
            }

            public String getTab() {
                return this.tab;
            }

            public String getThumb() {
                return this.thumb;
            }

            public String getThumbnail() {
                return this.thumbnail;
            }

            public String getTotal() {
                return this.total;
            }

            public int getVolume() {
                return this.volume;
            }

            public int getVolume_max() {
                return this.volume_max;
            }

            public boolean isSelected() {
                return this.selected;
            }

            public boolean isStatus() {
                return this.status;
            }

            public void setCategory(String str) {
                this.category = str;
            }

            public void setChannel(String str) {
                this.channel = str;
            }

            public void setCurrent(String str) {
                this.current = str;
            }

            public void setId(String str) {
                this.f22404id = str;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setSelected(boolean z10) {
                this.selected = z10;
            }

            public void setStatus(boolean z10) {
                this.status = z10;
            }

            public void setTab(String str) {
                this.tab = str;
            }

            public void setThumb(String str) {
                this.thumb = str;
            }

            public void setThumbnail(String str) {
                this.thumbnail = str;
            }

            public void setTotal(String str) {
                this.total = str;
            }

            public void setVolume(int i10) {
                this.volume = i10;
            }

            public void setVolume_max(int i10) {
                this.volume_max = i10;
            }
        }

        /* renamed from: qj.a$a$b */
        public static class b {
            private String channel;
            private String channelThumb;

            /* renamed from: id  reason: collision with root package name */
            private String f22405id;
            private String name;
            private String since;
            private String thumbnail;
            private String time;

            public b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.name = str;
                this.f22405id = str2;
                this.thumbnail = str3;
                this.channel = str4;
                this.since = str5;
                this.time = str6;
                this.channelThumb = str7;
            }

            public String getChannel() {
                return this.channel;
            }

            public String getChannelThumb() {
                return this.channelThumb;
            }

            public String getId() {
                return this.f22405id;
            }

            public String getName() {
                return this.name;
            }

            public String getSince() {
                return this.since;
            }

            public String getThumbnail() {
                return this.thumbnail;
            }

            public String getTime() {
                return this.time;
            }

            public void setChannel(String str) {
                this.channel = str;
            }

            public void setChannelThumb(String str) {
                this.channelThumb = str;
            }

            public void setId(String str) {
                this.f22405id = str;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setSince(String str) {
                this.since = str;
            }

            public void setThumbnail(String str) {
                this.thumbnail = str;
            }

            public void setTime(String str) {
                this.time = str;
            }
        }

        public C0395a(String str, boolean z10, List<b> list, List<C0396a> list2) {
            this.action = str;
            this.content = z10;
            this.videos = list;
            this.data = list2;
        }

        public String getAction() {
            return this.action;
        }

        public boolean getContent() {
            return this.content;
        }

        public List<C0396a> getData() {
            return this.data;
        }

        public List<b> getVideos() {
            return this.videos;
        }

        public void setAction(String str) {
            this.action = str;
        }

        public void setContent(boolean z10) {
            this.content = z10;
        }

        public void setData(List<C0396a> list) {
            this.data = list;
        }

        public void setVideos(List<b> list) {
            this.videos = list;
        }
    }

    public a(double d10, String str, String str2, C0395a aVar) {
        this.time = d10;
        this.name = str;
        this.target = str2;
        this.message = aVar;
    }

    public C0395a getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public String getTarget() {
        return this.target;
    }

    public double getTime() {
        return this.time;
    }

    public void setMessage(C0395a aVar) {
        this.message = aVar;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTarget(String str) {
        this.target = str;
    }

    public void setTime(double d10) {
        this.time = d10;
    }
}
