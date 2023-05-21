public class NhanVien {
    private String ma;
    private String name;
    private String gt;
    private String ns;
    private String dc;
    private String mst;
    private String nkhd;


    public  NhanVien(){}
    public NhanVien(String ma , String name , String gt ,String ns, String dc , String mst , String nkhd){
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + dc + " " + mst + " " + nkhd;
    }
}
