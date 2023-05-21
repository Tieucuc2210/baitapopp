public class nhanvien {
    private String ma;
    private String name;
    private int luong;
    private int ngay;
    private String chucvu;


    public nhanvien(String ma , String name , int luong , int ngay , String chucvu){
        this.ma =ma;
        this.name = name;
        this.luong = luong;
        this.ngay = ngay;
        this.chucvu =  chucvu;
    }
    public int luong_co_ban(){
        return this.luong * this.ngay;
    }
    public int thuong(){
        int res = luong_co_ban();
        if (this.ngay >= 25){
            return (int) (0.2 * res);
        } else if(this.ngay >= 22){
            return (int) (0.1 * res);
        } else{
            return  0;
        }
    }
    public int getPhuCap(){
        if (this.chucvu.startsWith("GD")){
            return 250000;
        } else if(this.chucvu.startsWith("PGD")){
            return 200000;
        } else if (this.chucvu.startsWith("TP")){
            return 180000;
        } else{
            return 150000;
        }
    }
    public int tongluong(){
        return luong_co_ban() + getPhuCap() + thuong();
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + luong_co_ban() + " " + " " + thuong() + " " + getPhuCap() + " " + tongluong();
    }

}
