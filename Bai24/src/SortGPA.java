import java.util.Comparator;

public class SortGPA implements Comparator<SapXep> {
    @Override
    public int compare(SapXep o1  , SapXep o2){
       if (o1.getGpa() != o2.getGpa()) {
           if (o1.getGpa() > o2.getGpa()) return -1;
           else return 1;
       } else{
           return o1.getName().compareTo(o2.getName());
       }
    }
}
