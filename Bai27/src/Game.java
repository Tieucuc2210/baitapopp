public class Game {
    private String user;
    private String pass;
    private String Name;
    private String den;
    private String di;

    public Game(String user , String pass , String Name  , String den , String di){
        this.user = user;
        this.pass = pass;
        this.Name = Name;
        this.den = den;
        this.di = di;
    }
    public int Choi(){
        int h1 = Integer.parseInt(this.den.substring(0 , 2));
        int h2 = Integer.parseInt(this.den.substring(3));
        int c1 = Integer.parseInt(this.di.substring(0 , 2));
        int c2 = Integer.parseInt(this.di.substring(3));
        int time1 = h1 * 60 + h2;
        int time2 = c1 * 60 + c2;
        return time2 - time1;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString(){
        int ans = Choi();
        int h = ans / 60;
        int m = ans % 60;
        return user + " " + pass + " " + Name + " " + h + " gio " +" " + m + " phut ";
    }
}
