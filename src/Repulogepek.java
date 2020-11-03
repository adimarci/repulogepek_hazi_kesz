import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repulogepek {
    public static void main(String[] args) {
        ArrayList<Repulogep> varakozoGepek = new ArrayList();
        KatonaiRepulogep katonairepcsi = new KatonaiRepulogep(1, 200);
        varakozoGepek.add(katonairepcsi);
        UtasSzallitoRepulo utasszallito=new UtasSzallitoRepulo(2,100);
        varakozoGepek.add(utasszallito);
        CsomagSzallitoRepulo csomiszallito=new CsomagSzallitoRepulo(3,300);
        varakozoGepek.add(csomiszallito);
        int max=0;
        for (int i = 0; i < varakozoGepek.stream().count(); i++) {
            if (max< varakozoGepek.get(i).tankMeret){
                max=varakozoGepek.get(i).tankMeret;
            }
        }
        System.out.println("Legnagyobb tank:"+max);
    }



}
