import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        List<Oto> a  = new ArrayList<>();
        List<XeMay> b = new ArrayList<>();
        int n = Integer.parseInt(cs.nextLine());
        for (int i = 0 ; i<n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("OT")){
                String name = cs.nextLine();
                String ten = cs.nextLine();
                String hang = cs.nextLine();
                int maluc = Integer.parseInt(cs.nextLine());
                int giaban = Integer.parseInt(cs.nextLine());

                Oto z = new Oto(ma , name , ten , hang , maluc , giaban);
                a.add(z);
            } else{
                String name = cs.nextLine();
                String ten = cs.nextLine();
                String hang = cs.nextLine();
                int giaban = Integer.parseInt(cs.nextLine());
                int giamua = Integer.parseInt(cs.nextLine());

                XeMay m = new XeMay(ma , name , ten , hang , giaban , giamua);
                b.add(m);
            }

        }
        int po1 = cs.nextInt();
        int po2 = cs.nextInt();
        System.out.println("DANH SACH OTO : ");
        Collections.sort(a, new Comparator<Oto>() {
            @Override
            public int compare(Oto o1, Oto o2) {
                if (o1.getGiaban() == o1.getGiaban()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getGiaban() - o1.getGiaban();
            }
        });
        for (Oto x : a){
            if (x.getGiaban() >= po1 && x.getGiaban() <= po2){
                System.out.println(x);
            }
        }

        System.out.println("DANH SACH XE MAY LA : ");
        Collections.sort(b, new Comparator<XeMay>() {
            @Override
            public int compare(XeMay o1, XeMay o2) {
                if (o1.getGiamua() == o2.getGiamua()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getGiamua() - o1.getGiamua();
            }
        });
        for (XeMay x : b){
            if (x.getGiamua() >= po1 && x.getGiamua() <= po2){
                System.out.println(x);
            }
        }
    }
}