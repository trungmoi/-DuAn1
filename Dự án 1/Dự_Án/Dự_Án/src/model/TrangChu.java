
package model;


public class TrangChu {
    private int IdSP;
    private String tenSP;
    private float giaSP;
    private int slSP;
    private String colorSP;
    private String chatlieuSP;
    private String tenNhanHang;

    public TrangChu() {
    }

    public TrangChu(int IdSP, String tenSP, float giaSP, int slSP, String colorSP, String chatlieuSP, String tenNhanHang) {
        this.IdSP = IdSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.slSP = slSP;
        this.colorSP = colorSP;
        this.chatlieuSP = chatlieuSP;
        this.tenNhanHang = tenNhanHang;
    }

    public int getIdSP() {
        return IdSP;
    }

    public void setIdSP(int IdSP) {
        this.IdSP = IdSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public int getSlSP() {
        return slSP;
    }

    public void setSlSP(int slSP) {
        this.slSP = slSP;
    }

    public String getColorSP() {
        return colorSP;
    }

    public void setColorSP(String colorSP) {
        this.colorSP = colorSP;
    }

    public String getChatlieuSP() {
        return chatlieuSP;
    }

    public void setChatlieuSP(String chatlieuSP) {
        this.chatlieuSP = chatlieuSP;
    }

    public String getTenNhanHang() {
        return tenNhanHang;
    }

    public void setTenNhanHang(String tenNhanHang) {
        this.tenNhanHang = tenNhanHang;
    }
    
     public Object[] data() {
        return new Object[]{
            this.IdSP,this.tenSP,this.giaSP,this.slSP,this.colorSP,this.chatlieuSP,this.tenNhanHang
        };
    }
}
