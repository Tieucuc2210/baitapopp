public class PhanSO {
    private int tu;
    private  int mau;
    public PhanSO(int tu , int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public void ans(){
        int uc = gdc(this.tu , this.mau);
        this.mau /= uc;
        this.tu /= uc;
    }

    @Override
    public String toString(){
        return this.tu + "/" + this.mau;
    }
    private int gdc(int a, int b){
        if ( b== 0) return a;
        else return gdc(b , a % b);
    }
}
