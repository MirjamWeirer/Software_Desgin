package entensimulation_v2;

public abstract class Ente {
    private String name;
    private int flugVerhalten;

    public Ente (String name, int fV){
        this.name = name;
        flugVerhalten = fV;
    }

    public void quacken(){
        System.out.println("Ente " + name + " quackt");
    }

    public void fliegen(){
        switch (flugVerhalten){
            case 1:
                System.out.println("Ente " + name + " flattert.");
                break;
            case 2:
                System.out.println("Ente " + name + " segelt durch den Wind.");
                break;
            case 3:
                System.out.println("Ente " + name + " kommt nicht vom Boden.");
                break;
        }
    }
    public void schwimmen(){
        System.out.println("Ente " + name + " schwimmt");
    }
    public abstract void anzeigen();

}
