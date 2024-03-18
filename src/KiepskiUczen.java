public class KiepskiUczen implements Uczen,Comparable<KiepskiUczen>{
    private int punktysnu=0;
    @Override
    public void uczSie() {
        System.out.println("nauka jest dla slabych");
    }

    @Override
    public void spij() {
        System.out.println("spie caly czas :");
        punktysnu++;
    }

    public void graj(){
        System.out.println("Gram w gre.");
    }

    @Override
    public int compareTo(KiepskiUczen o) {
        return punktysnu - o.punktysnu;
    }
}
