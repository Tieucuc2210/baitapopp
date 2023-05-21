import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner cs = new Scanner(System.in);
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            float gpa = cs.nextFloat();

            SinhVien1 a = new SinhVien1("SV001" ,  name ,lop ,  ns ,  gpa);
            a.ChuanHoa();
            System.out.println(a);
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("chay thanh cong");
        }
    }
}