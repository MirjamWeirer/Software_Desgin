package at.campus02.swd;

public  class Tablet extends Computer {
    @Override
    public int getCPU() {
        return 2;
    }

    @Override
    public int getRAM() {
        return 2;
    }

    @Override
    public int getHDD() {
        return 64;
    }
}
