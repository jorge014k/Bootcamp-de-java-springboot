public class Main {
    public static void main(String[] args) {
        String nuevoPassword = generarPassword();
        System.out.println(nuevoPassword);
    }
    private static String generarPassword(){
        double aleatorio = Math.random()*1000000;
        long numeroAleatorio =Math.round(aleatorio);

        String passWord="JDg" + numeroAleatorio;
        return passWord;

    }
}