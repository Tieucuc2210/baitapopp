import java.util.Comparator;

public class SortByGpa implements Comparator<BangDiem> {
    @Override
    public int compare(BangDiem o1 , BangDiem o2){
        double s1 = o1.tinhDien();
        double s2 = o2.tinhDien();

        if (s1 == s2){
            return o1.getMa().compareTo(o2.getMa());
        }
        return -Double.compare(s1 , s2);
    }
}
