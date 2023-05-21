public class sinhvien {
    private String ma;
    private String name;
    private String lop;
    private String email;


    public sinhvien(String ma , String name , String lop , String email){
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public int getMa() {
        int res = Integer.parseInt(this.ma.substring(0 , 4));
        return res;
    }

    public void ChuanHoa(){
        String[] arr = this.name.split(" ");
        for (int i = 0 ;i < arr.length ; i++){
            String wok = arr[i];
            if (!wok.isEmpty()){
                String dau = wok.substring(0 , 1);
                String qcuoi = wok.substring(1);
                arr[i] = dau.toUpperCase() + qcuoi.toLowerCase();
            }
        }
        String res = String.join(" " , arr);
        this.name = res;
    }
    @Override
    public  String toString(){
        return  ma + " " + name + " " + lop + " " + email;
    }
}
