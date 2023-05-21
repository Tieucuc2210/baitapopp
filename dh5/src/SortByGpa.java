import java.util.Comparator;

public class SortByGpa implements Comparator<hocsinh> {
    @Override
    public int compare(hocsinh o1 , hocsinh o2){
        if (o1.getGpa() != o2.getGpa()){
            if (o1.getGpa() > o2.getGpa()) return -1;
            return 1;
        }
        return o1.getMa().compareTo(o2.getMa());
    }
}
