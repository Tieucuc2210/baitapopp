public class SInhVien {
    private String ma;
    private String name;
    private String lop;
    private String email;

    public SInhVien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }

}
