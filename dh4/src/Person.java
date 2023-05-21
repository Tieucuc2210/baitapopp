public class Person {
    private String ma , name , ns , dc;

    public Person(String ma , String name , String ns , String dc){
        this.ma = ma;
        this.name = name;
        this.ns = ns;
        this.dc = dc;
    }

    public String getDc() {
        return dc;
    }

    public void ChuanHoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }

        String[] arr = this.name.split("\\s+");
        String res = "";
        for (String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < arr.length ; j++){
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        this.name = res.substring(0 , res.length() - 1);
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + ns + " "  + dc;
    }
}


class hocsinh extends Person{
    private String lop;
    private double gpa;
    public hocsinh(String ma , String name , String ns , String dc , String lop , Double gpa){
        super(ma , name , ns , dc);
        this.lop = lop;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return  super.toString() + " " + lop + " " + String.format("%.2f" , gpa);
    }
}

class giaovien extends Person{
    private String khoa;
    private int luong;
    private String lop;
    public giaovien(String ma , String name , String ns , String dc , String khoa , int luong , String lop){
        super(ma , name , ns , dc);
        this.khoa = khoa;
        this.luong = luong;
        this.lop = lop;
    }
    @Override
    public  String toString(){
        return super.toString() + " " + khoa + " " + luong + " " + lop;
    }
}