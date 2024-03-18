public class PilnyUczen implements Uczen,Comparable<PilnyUczen>{


    private int punktyNauki =0;

    @Override
    public void uczSie() {
        System.out.println("Ucze sie pilnie");
        punktyNauki++;
    }

    @Override
    public void spij() {
        System.out.println("sen jest dla slabych");
    }
    public void bierzUdzialwSzybkiej20(){
        System.out.println("musze miec wynik 20/20");
    }

    @Override
    public int compareTo(PilnyUczen o) {
        return punktyNauki - o.punktyNauki;
    }

    @Override
    public String toString() {
        return String.format("punkty %d",punktyNauki);
    }
}
