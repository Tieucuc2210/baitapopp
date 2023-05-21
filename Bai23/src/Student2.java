public class Student2 {
    private static int dem =1;
    private String ma;
    private String name;
    private String lop;
    private String ns;
    private float gpa;


    public Student2(){
        ma = check();
        name = "";
        lop = "";
        ns = "";
        gpa = 0;
    }
    public Student2(String name , String lop , String ns , float gpa){
        this.ma = check();
        this.name = name;
        this.lop =lop;
        this.ns =ns;
        this.gpa = gpa;
    }

    private String check(){
        String res = String.format("%03d" , dem);
        dem++;
        return "SV" + res;
    }





    public void chuanHoa(){
        // chuan hoa ten
        String[] arr = this.name.split(" ");
        for (int i = 0 ;i < arr.length ; i++){
            String wok = arr[i];
            String Dau = wok.substring(0 , 1);
            String Cuoi = wok.substring(1);
            arr[i] = Dau.toUpperCase() + Cuoi.toLowerCase();
        }
        String res = String.join(" " , arr);
        this.name = res;

        // chuan hoa ngay sinh
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 ,3) + '0' + this.ns.substring(3);
        }
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f" , ma , name , lop , ns , gpa);
    }
}
