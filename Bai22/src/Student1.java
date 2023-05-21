import com.sun.source.tree.WhileLoopTree;

public class Student1 {
    private static int dem =1;
    private String Ma;
    private String Name;
    private String Ns;
    private String lop;
    private float gpa;

    public Student1(String Name ,String Ns , String lop , float gpa){
        this.Ma = Check();

        this.Name =Name;
        this.Ns = Ns;
        this.lop = lop;
        this.gpa = gpa;
    }
    private String Check(){
        String ma = String.format("%03d" , dem);
        dem++;
        return "SV" + ma;
    }
    public void ChuanHoa(){
        if (this.Ns.charAt(1) == '/'){
            this.Ns = '0' + this.Ns;
        }
        if(this.Ns.charAt(4) == '/'){
            this.Ns = this.Ns.substring(0 , 3) + '0' + this.Ns.substring(3);
        }
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f" , Ma , Name , lop , Ns , gpa);
    }
}
