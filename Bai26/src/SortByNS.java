import java.util.Comparator;

public class SortByNS implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1 , NhanVien o2){
        String a = o1.getNs();
        String b = o2.getNs();

        int result = a.compareTo(b);
        if (result != 0){
            return result;
        }


        int ma1 = Integer.parseInt(o1.getMa());
        int ma2 = Integer.parseInt(o2.getMa());
        if(ma1 < ma2){
            return -1;
        } else{
            return 1;
        }
    }
}
