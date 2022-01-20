package at.campus02.swd;

public class AndroidFactory extends Factory{
    @Override
    Computer assembleComputer(ComputerType type) {
       switch (type){
           case TABLET:
               return new Tablet();
           case SMARTPHONE:
               return new Smartphone();
           default:
               return null;
       }
    }
}
