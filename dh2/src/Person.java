public class Person {
    private String name , ns , dc;
    public Person(){
        name = ns = dc = "";
    }

    public String getName() {
        return name;
    }
    public String getSortName(){
        String[] arr = this.name.split("\\s+");
        String res = arr[arr.length - 1];
        for (int i =0 ; i < arr.length -1; i++){
            res += arr[i] + " ";
        }
        return res;
    }

    public Person(String name , String ns , String dc){
        this.name = name;
        this.ns = ns;
        this.dc = dc;
    }
    public void ChuanHoa(){
        String[] arr = this.name.split("\\s+");
        for (int i =0 ;i < arr.length ; ++i){
            String wok = arr[i];
            String dau = wok.substring(0 , 1);
            String cuoi = wok.substring(1);
            arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
        }
        String res = String.join(" " , arr);
        this.name = res;


        // chuan hoa hop ten :
        if (this.ns.charAt(1) == '/'){
            this.ns = '0' + this.ns;
        }
        if (this.ns.charAt(4) == '/'){
            this.ns = this.ns.substring(0 , 3) + '0' + this.ns.substring(3);
        }
    }
    @Override
    public String toString(){
        return name + " " + ns + " " + dc;
    }
}

class Student extends Person{
    private static int dem =1;
    private String ma , lop;
    double gpa;
    public Student(String name , String ns , String dc , String lop , double gpa){
        super(name , ns , dc);
        this.ma = dheck();
        this.lop = lop;
        this.gpa = gpa;
    }
    public String dheck(){
        String res = String.format("%05d" , dem);
        dem++;
        return res;
    }
    @Override
    public String toString(){
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f" , gpa);
    }
}
