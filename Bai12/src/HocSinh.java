public class HocSinh {
    private String ma;
    private String name;
    private float Toan;
    private float Li;
    private float Hoa;

    public HocSinh(String ma , String name , float Toan , Float Li , Float Hoa){
        this.ma = ma;
        this.name = name;
        this.Toan = Toan;
        this.Li = Li;
        this.Hoa = Hoa;
    }
    public int getDiem(){
        return Integer.parseInt(String.valueOf(this.ma.charAt(2)));
    }
    public void check(){
        System.out.print(this.ma + " " + this.name + " " + this.getDiem() + " ");
        float diem = this.Toan + this.Hoa + this.Li;
        int kv = getDiem();
        if (kv == 1){
            diem += 0.5;
        } else if(kv == 2){
            diem += 1;
        } else{
            diem += 1.5;
        }
        if (diem == (int) diem){
            System.out.print((int) diem + " ");
        } else{
            System.out.print(String.format("%.1f" , diem)  + " ");
        }

        if(diem >= 24){
            System.out.println("TRUNG TUYEN");
        } else {
            System.out.println("TRUOT");
        }
    }
}
