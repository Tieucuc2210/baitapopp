public class sinhvien {
    private  String ma;
    private String name;
    private String lop;
    private String email;

    public sinhvien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public void ChuanHoa(){
        //StringBuilder ans = new StringBuilder();
        String[] arr = this.name.split(" ");
        for (int i =0 ;i < arr.length ;i++){
           String wok = arr[i];
           if (!wok.isEmpty()){
               String dau = wok.substring(0 , 1);
               String cuoi = wok.substring(1);
               arr[i] = dau.toUpperCase() + cuoi.toLowerCase();
           }
        }
        String res = String.join( " " , arr);
        this.name = res;
    }
    public String getLop() {
        return lop;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + lop + " " + email;
    }
}
