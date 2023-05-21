public class Peson {
    private String ma ,name , ns , dc;
    public Peson(String ma , String name , String ns , String dc){
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
        return ma + " " + name + " " + ns + " " + dc;
    }
}

class hocsinh extends Peson{
    private String lop;
    private double gpa;

    public String layLop() {
        return lop;
    }

    public hocsinh(String ma , String name , String ns , String dc , String lop , double gpa){
        super(ma , name , ns , dc);
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return super.toString() + " " + lop + " " + String.format("%.2f" , gpa);
    }

}


class giaovien extends  Peson{
    private String khoa , lop , luong;

    public giaovien(String ma , String name , String ns , String dc , String khoa , String luong ,String lop){
        super(ma , name , ns , dc);
        this.khoa = khoa;
        this.luong = luong;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return super.toString() + " " + khoa + " " + luong + "  " + lop;
    }
}
