package commandv3;
//Alle Kommandos implementieren gleiches Interface
public interface Kommando {
    public void ausfuehren();
    public void undo();

}
