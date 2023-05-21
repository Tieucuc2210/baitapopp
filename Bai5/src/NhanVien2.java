public class NhanVien2 {
    private String ma;
    private String name;
    private String gt;
    private String ns;
    private String dc;
    private String mst;
    private String nkhd;


    public NhanVien2(String ma , String name , String gt , String ns , String dc , String mst , String nkhd){
        this.ma = ma;
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }

    public void chuanhoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }
        // chuan hoa ten
        String[] arr = this.name.split("\\s+");
        for (int i =0 ;i < arr.length ; i++){
            String wok = arr[i];
            String Dau =  wok.substring(0 ,1);
            String Cuoi = wok.substring(1);
            arr[i] = Dau.toUpperCase() + Cuoi.toLowerCase();
        }
        String res = String.join(" ",arr);
        this.name = res;


        if (this.nkhd.charAt(1) == '/'){
            this.nkhd = "0" + this.nkhd;
        }
        if (this.nkhd.charAt(4) == '/'){
            this.nkhd = this.nkhd.substring(0 , 3) + '0' + this.nkhd.substring(3);
        }
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }
}
