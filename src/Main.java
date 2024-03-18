import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Formattable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PilnyUczen zygmund = new PilnyUczen();
        PilnyUczen przemek = new PilnyUczen();


        // Ja nie odpowiadam za nazwy

        KiepskiUczen tymon = new KiepskiUczen();
        KiepskiUczen adrian = new KiepskiUczen();

        ArrayList<Uczen> uczeniowie = new ArrayList<>();
        uczeniowie.add(zygmund);
        uczeniowie.add(przemek);
        uczeniowie.add(tymon);
        uczeniowie.add(adrian);


        for(Uczen u: uczeniowie ){
            System.out.println(u.getClass().getName());
            u.uczSie();
            System.out.println("----------------------------------");
            u.spij();
        }
        zygmund.bierzUdzialwSzybkiej20();

        ArrayList<PilnyUczen> pilniUczniowie = new ArrayList<>();
        pilniUczniowie.add(zygmund);
        pilniUczniowie.add(przemek);

        zygmund.uczSie();
        zygmund.uczSie();


        Collections.sort(pilniUczniowie);
        System.out.println(pilniUczniowie);

    }
}