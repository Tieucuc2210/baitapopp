public class ThuNhap {
    private String ma;
    private String name;
    private int luong;

    public ThuNhap(String ma , String name , int luong){
        this.ma = ma;
        this.name = name;
        this.luong = luong;

    }
    public int layluong(){
        return Integer.parseInt(ma.substring(2));
    }
    public int thunhap(){
        int res = layluong();
        int luong_co_ban = this.luong * res;
        if (this.ma.startsWith("HT")){
            return luong_co_ban + 2000000;
        } else if (this.ma.startsWith("HP")){
            return  luong_co_ban + 900000;
        } else {
            return luong_co_ban + 500000;
        }
    }

    public String toString(){

        return ma + " " + name + " " + layluong() + " " + thunhap();
    }
}
