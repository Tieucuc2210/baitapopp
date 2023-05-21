import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class BangDiem {
    private static  int dem =1;
    private String ma;
    private String name;
    private List<Double> v;

    public BangDiem(String name ,List<Double> v){
        this.ma = check();
        this.name = name;
        this.v = new ArrayList<>(v);
    }
    public String check(){
        String res = String.format("%02d" , dem);
        dem+=1;
        return "SV" + res;
    }
    public double tinhDien(){
        double tong = v.stream().mapToDouble(Double::doubleValue).sum() / 10;
        return tong;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString(){
        StringBuilder ans = new StringBuilder();
        double dtb = v.stream().mapToDouble(Double::doubleValue).sum() /10;
        if (dtb >= 9){
            ans.append("XUAT XAC");
        } else if (dtb >= 8){
            ans.append("GIOI");
        } else if (dtb >= 7){
            ans.append("KHA");
        } else if (dtb >= 5){
            ans.append("TRUNG BINH");
        } else{
            ans.append("YEU");
        }
        return ma + " " + name + " " + String.format("%.1f" , dtb) + " " + ans.toString();
    }
}
