public class SinhVien1 {
    private String Ma;
    private String name;
    private String lop;
    private  String ns;
    private float gpa;
    public SinhVien1(){}
    public SinhVien1(String Ma , String name ,String lop, String ns , float gpa){
        this.Ma = Ma;
        this.name =name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public void ChuanHoa(){
        if (this.ns.charAt(1) == '/'){
            this.ns = "0" + this.ns;
        }
        if(this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }
    }
    public String toString(){
        return String.format("%s %s %s %s %.1f" , Ma , name  ,lop, ns , gpa);
    }
}
