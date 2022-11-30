package dgoon.mobile.kt3;

public class Tacgia {
    String name, mota, sao;
    int img;

    public Tacgia(String name, String mota, String sao, int img) {
        this.name = name;
        this.mota = mota;
        this.sao = sao;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
