public class SapXep {
    private static int dem =1;
    private String ma;
    private String name;
    private String ns;
    private String lop;
    private float gpa;

    public SapXep(String name , String ns , String lop , float gpa){
        this.ma = check();
        this.name = name;
        this.ns = ns;
        this.lop = lop;
        this.gpa = gpa;

    }

    public String getName() {
        return name;
    }

    public String check(){
        String res = String.format("%03d" , dem);
        dem+=1;
        return "SV" + res;
    }

    public float getGpa() {
        return gpa;
    }
    public String getMa(){
        return ma;
    }

    public void ChuanHoa(){
        // chuan hoa ten
        String[] arr = this.name.split(" ");
        for (int i =0 ;i < arr.length ; i++){
            String wok = arr[i];
            String Dau = wok.substring(0 , 1);
            String Cuoi = wok.substring(1);
            arr[i] = Dau.toUpperCase() + Cuoi.toLowerCase();
        }
        String tool = String.join(" ", arr);
        this.name = tool;
        // chuan hoa ngay sinh
        if(this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }
    }
    public String toString(){
        return ma +" " + name + " " + lop + " " + String.format("%.2f" , gpa);
    }
}
