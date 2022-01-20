package at.campus02.swd;

public class Main {
    public static void main(String[] args) {
        Factory ibm = new IBMFactory();
        Factory android = new AndroidFactory();

        Computer c = ibm.assembleComputer(ComputerType.DESKTOP);
        Computer c1 = ibm.assembleComputer(ComputerType.TABLET);
        Computer c2 = ibm.assembleComputer(ComputerType.SERVER);
        Computer c3 = android.assembleComputer(ComputerType.TABLET);
        Computer c4 = android.assembleComputer(ComputerType.SMARTPHONE);
        System.out.println(c + ", " + c1 + ", " + c2+ ", " + c3+ ", " + c4);
    }
}
