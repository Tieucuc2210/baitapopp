public class NV {
    private static  int dem =1;
    private String ma;
    private String name;
    private String gt;
    private String ns;
    private String dc;
    private String mst;
    private String nkhd;


    public NV(String name , String gt , String ns , String dc, String mst , String nkhd){
        this.ma = Check();
        this.name =name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }
    public String Check(){
        String res = String.format("%05d" , dem);
        dem +=1;
        return res;
    }

    public void ChuanHoa(){
        // chuan hoa ngay sinh
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }
        // ngay ki hop dong
        if (this.nkhd.charAt(1) == '/'){
            this.nkhd = '0' + this.nkhd;
        }
        if (this.nkhd.charAt(4) == '/'){
            this.nkhd = this.nkhd.substring(0, 3) + '0' + this.nkhd.substring(3);
        }
        StringBuilder ans = new StringBuilder();
        String[] pen = this.name.split(" " );
        for (String x : pen){
            ans.append(x.substring(0 , 1).toUpperCase()).append(x.substring(1).toLowerCase()).append(" ");
        }
        this.name = ans.toString().trim();
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + nkhd;
    }

}
