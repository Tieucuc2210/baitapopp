public class kethua {
    private String name;
    private String ns;
    private String dc;

    public kethua(){
        name = ns = dc = "";

    }
    public kethua(String name , String ns , String dc){
        this.name = name;
        this.ns = ns;
        this.dc = dc;
    }
    public void ChuanHoa(){
        // ngay sinh
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' +this.ns.substring(3);
        }
        // chuan hoa ten

        String[] arr = this.name.split("\\s+");
        for (int i =0 ;i < arr.length ; i++){
            String wok = arr[i];
            String dau = wok.substring(0 , 1);
            String cuoi = wok.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
    }

    @Override
    public String toString(){
        return name + " " + ns + " " + dc;
    }

}


class studen extends kethua{
    private static int dem = 1;
    private String ma , lop;
    private double gpa;

    public studen( String name , String ns , String dc , String lop , double gpa){
        super(name , ns , dc);
        this.ma = check();
        this.lop = lop;
        this.gpa = gpa;
    }

    public String check(){
        String res = String.format("%05d" , dem);
        dem += 1;
        return res;
    }
    @Override
    public String toString(){
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f" , gpa);
    }
}
