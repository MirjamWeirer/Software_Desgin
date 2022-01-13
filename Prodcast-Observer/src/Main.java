public class Main {
    public static void main(String[] args) {
        ProdcastServer prodcastServer = new ProdcastServer();
        Notebook n = new Notebook(prodcastServer);
        prodcastServer.setProdcast("Neue Studie","www.prodcast.at",10.30);
        prodcastServer.notifyObserver();
        System.out.println("------------");
        Smartphone sp = new Smartphone(prodcastServer);
        prodcastServer.setProdcast("Anstieg an Coronazahlen","www.prodcast.at",4.00);
        prodcastServer.notifyObserver();
        System.out.println("------------");
        Smartwatch sw = new Smartwatch(prodcastServer);
        prodcastServer.setProdcast("T-Tellen","www.prodcast.at",2.05);
        prodcastServer.notifyObserver();
    }
}
