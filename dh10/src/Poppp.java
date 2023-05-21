public class Poppp {
    private String ma , name , ten , hang;

    public Poppp(String ma , String name , String ten , String hang){
        this.ma = ma;
        this.name = name;
        this.ten = ten;
        this.hang = hang;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString(){
        return ma + " " + name + " " + ten + " " + hang;
    }
}


class XeMay extends Poppp{
    private int giaban , giamua;

    public int getGiamua() {
        return giamua;
    }

    public XeMay(String ma , String name , String ten , String hang , int giaban , int giamua){
        super(ma , name , ten , hang);
        this.giaban = giaban;
        this.giamua = giamua;
    }
    @Override
    public String toString(){
        return super.toString() + " " + giaban + " " + giamua;
    }
}

class Oto extends Poppp{
    private int maluc , giaban;
    public Oto(String ma , String name , String ten , String hang , int maluc ,int giaban){
        super(ma , name , ten , hang);
        this.maluc = maluc;
        this.giaban = giaban;
    }

    public int getGiaban() {
        return giaban;
    }

    @Override
    public String toString(){
        return super.toString() + " " + maluc + " " + giaban;
    }

}