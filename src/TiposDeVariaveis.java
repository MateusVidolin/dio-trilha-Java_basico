public class TiposDeVariaveis {
    public static void main(String[] args) {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;
        final double pi = 3.1415;
        String myName = "Mateus";
        System.out.println("myName = " + myName + " pi = " + pi);
    }
}