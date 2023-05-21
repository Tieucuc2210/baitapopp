import java.util.Comparator;

public class SortByName implements Comparator<SInhVien> {
    @Override
    public int compare(SInhVien o1 , SInhVien o2){
        if (o1.getLop().equals(o2.getLop())){
            return o1.getMa().compareTo(o2.getMa());
        }
        return o1.getLop().compareTo(o2.getLop());
    }
}
