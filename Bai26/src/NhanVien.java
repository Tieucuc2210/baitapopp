public class NhanVien {
    private static int dem =1;
    private String ma;
    private String name;
    private String gt;
    private String ns;
    private String dc;
    private String mst;



    private String nkdh;

    public NhanVien(String name , String gt ,String ns ,String dc , String mst  , String nkdh){
        this.ma = check();
        this.name= name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkdh = nkdh;
    }
    public void chuanHoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if(this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(0 , 3);
        }

        if (this.nkdh.charAt(1) == '/'){
            this.nkdh = '0' + this.nkdh;
        }
        if (this.nkdh.charAt(4) == '/'){
            this.nkdh = this.nkdh.substring(0 , 3) + '0' + this.nkdh.substring(3);
        }
    }
    public String check(){
        String res = String.format("%03d" , dem);
        dem+=1;
        return res;
    }
    public String getNs() {
        return ns;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkdh;
    }
}
