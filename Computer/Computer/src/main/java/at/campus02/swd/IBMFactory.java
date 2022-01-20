package at.campus02.swd;

public class IBMFactory extends Factory{
    @Override
    Computer assembleComputer(ComputerType type) {
        if (type == ComputerType.DESKTOP){
            return new Desktop();
        }else if (type == ComputerType.SERVER){
            return new Server();
        }else{
            return null;
        }
    }
}
