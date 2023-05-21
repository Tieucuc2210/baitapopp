import java.util.Comparator;

public class SortByLuong implements Comparator<giaovien> {
    @Override
    public int compare(giaovien o1 , giaovien o2){
        if (o1.getLuong() == o2.getLuong()){
            return o1.getMa().compareTo(o2.getMa());
        }
        return o2.getLuong() - o1.getLuong();
    }
}
