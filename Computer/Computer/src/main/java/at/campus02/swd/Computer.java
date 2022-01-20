package at.campus02.swd;

// DO NOT CHANGE
public abstract class Computer {
    public abstract int getCPU();

    public abstract int getRAM();

    public abstract int getHDD();

    public void dust()
    {
        System.out.println("Remove dust from " + toString());
    }

    @Override
    public String toString() {
        return String.format("%s: CPU:%dGHz RAM: %dGB HDD: %dGB", this.getClass().getName(), getCPU(), getRAM(),
                getHDD());
    }

}
