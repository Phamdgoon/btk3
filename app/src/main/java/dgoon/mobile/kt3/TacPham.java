package dgoon.mobile.kt3;

public class TacPham {
    private String nameTP, sao;

    public TacPham(String nameTP, String sao) {
        this.nameTP = nameTP;
        this.sao = sao;
    }

    public String getNameTP() {
        return nameTP;
    }

    public void setNameTP(String nameTP) {
        this.nameTP = nameTP;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }
}
