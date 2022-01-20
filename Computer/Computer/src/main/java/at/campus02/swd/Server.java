package at.campus02.swd;

public  class Server extends Computer {
    @Override
    public int getCPU() {
        return 16;
    }

    @Override
    public int getRAM() {
        return 128;
    }

    @Override
    public int getHDD() {
        return 10240;
    }
}
