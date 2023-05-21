public class SinhVien {
    private String ma , name , ns , dc;

    public SinhVien(String ma , String name , String ns , String dc){
        this.ma = ma;
        this.name = name;
        this.ns = ns;
        this.dc = dc;
    }
    public void ChuanHoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }

        // chuan hoa ten
        String[] arr = this.name.split("\\s+");
        for (int i =0 ;i < arr.length ; i++){
            String wok = arr[i];
            String dau = wok.substring(0 , 1);
            String cuoi = wok.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        String res = String.join(" " , arr);
        this.name = res;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + ns + " " + dc;
    }
}

class hocsinh extends  SinhVien{
    private String lop;
    private double gpa;

    public hocsinh(String ma , String name , String ns , String dc , String lop , double gpa){
        super(ma , name , ns , dc);
        this.lop = lop;
        this.gpa = gpa;

    }
    @Override
    public String toString(){
        return super.toString() + " " + lop + " " + gpa;
    }

}

class giavien extends  SinhVien{
    private String khoa;
    private String luong;

    public giavien(String ma , String name , String ns , String dc  , String khoa , String luong){
        super(ma , name , ns , dc);
        this.khoa = khoa;
        this.luong = luong;
    }
    @Override
    public String toString(){
        return  super.toString() + " " + khoa + " " + luong;
    }
}

