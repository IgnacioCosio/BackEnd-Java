public class Visualizacion {
    public static void main(String[] args) throws InterruptedException{
        VisSpridermnan();
    }

    private static void VisSpridermnan() throws InterruptedException {
        Screen screen = new Screen();
        Variante spid0 = new Variante("Spiderman", "Peter Parker", "Masculino", "Tierra 616", "Soltero", "Fotógrafo");
        Variante spid1 = new Variante("Spiderman 2099", "Miguel O'Hara", "Masculino", "Tierra 928", "Soltero", "Ingeniero genético, empleado de Alchemax");
        Variante spid2 = new Variante("Cosmic Spiderman", "Peter Parker", "Masculino", "Tierra 91110", "Soltero", "Fotógrafo");
        Variante spid3 = new Variante("Spiderham", "Peter Porker", "Porcino", "Tierra 8311", "Casado", "Aventurero");
        Variante spid4 = new Variante("Spiderman", "Miles Mrales", "Masculino", "Tierra 1610", "Soltero,", "Estudiante de Ciencias");

        Runnable poderes = new Runnable() {
            @Override
            public void run() {
                try {
                    spid0.RemolinoTelarana(screen);
                    Thread.sleep(8000);

                    spid0.SentidoAracnido(screen);
                    Thread.sleep(8000);

                    spid3.MartilloHam(screen);
                    Thread.sleep(8000);

                    spid1.Agilidad(screen);
                    Thread.sleep(8000);

                    spid4.Superfuerza(screen);
                    Thread.sleep(8000);

                    spid0.Telarana(screen);
                    Thread.sleep(8000);

                    spid0.TrepaMuros(screen);
                    Thread.sleep(8000);

                    spid2.Cosmico(screen);
                    Thread.sleep(8000);

                }catch(InterruptedException ie) {
                    ie.printStackTrace();

                }
            }
        };

        Thread pod = new Thread(poderes);
        pod.start();
    }
}
