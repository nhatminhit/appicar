package qj;

import ia.a;

public class c {
    public boolean click = false;
    @ia.c("tab")
    @a
    private String tab;

    public c(String str) {
        this.tab = str;
    }

    public String getTab() {
        return this.tab;
    }

    public boolean isClick() {
        return this.click;
    }

    public void setClick(boolean z10) {
        this.click = z10;
    }

    public void setTab(String str) {
        this.tab = str;
    }

    public String toString() {
        return "Tab{tab='" + this.tab + '\'' + ", click=" + this.click + '}';
    }
}
