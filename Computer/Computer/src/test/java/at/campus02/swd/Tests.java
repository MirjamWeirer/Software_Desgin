package at.campus02.swd;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
// DO NOT CHANGE
public class Tests {

    @Test
    public void testDesktopIBMFactory() {
        Computer c = new IBMFactory().getComputer(ComputerType.DESKTOP);
        assertEquals(Desktop.class, c.getClass());
    }

    @Test
    public void testServerIBMFactory() {
        Computer c = new IBMFactory().getComputer(ComputerType.SERVER);
        assertEquals(Server.class, c.getClass());
    }

    @Test
    public void testTabletAndroidFactory() {
        Computer c = new AndroidFactory().getComputer(ComputerType.TABLET);
        assertEquals(Tablet.class, c.getClass());
    }
    @Test
    public void testSmartphoneAndroidFactory() {
        Computer c = new AndroidFactory().getComputer(ComputerType.SMARTPHONE);
        assertEquals(Smartphone.class, c.getClass());
    }

    @Test
    public void testDesktopComputerValues() {
        Computer c = new IBMFactory().getComputer(ComputerType.DESKTOP);
        assertEquals(4, c.getCPU());
        assertEquals(8, c.getRAM());
        assertEquals(2048, c.getHDD());
    }



    @Test
    public void testServerComputerValues() {
        Computer c = new IBMFactory().getComputer(ComputerType.SERVER);
        assertEquals(Server.class, c.getClass());
        assertEquals(16, c.getCPU());
        assertEquals(128, c.getRAM());
        assertEquals(10240, c.getHDD());
    }


    @Test
    public void testTabletComputerValues() {
        Computer c = new AndroidFactory().getComputer(ComputerType.TABLET);
        assertEquals(Tablet.class, c.getClass());
        assertEquals(2, c.getCPU());
        assertEquals(2, c.getRAM());
        assertEquals(64, c.getHDD());
    }
    @Test
    public void testSmartphoneComputerValues() {
        Computer c = new AndroidFactory().getComputer(ComputerType.SMARTPHONE);
        assertEquals(Smartphone.class, c.getClass());
        assertEquals(1, c.getCPU());
        assertEquals(1, c.getRAM());
        assertEquals(32, c.getHDD());
    }
}

