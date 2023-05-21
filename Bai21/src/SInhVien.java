import java.util.Scanner;

public class SInhVien {
    private String name;
    private String ns;
    private float a;
    private float b;
    private float c;


    public SInhVien(String name , String ns , float a , float b , float c){
        this.name = name;
        this.ns = ns;
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public String toString(){
        float tong = a + b + c;
        return String.format("%s %s %.1f" , name , ns , tong);
    }
}
