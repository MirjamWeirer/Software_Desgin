package at.campus02.swd;

public abstract class Factory {

    // HERE YOU CAN ADD METHODS
    abstract Computer assembleComputer (ComputerType type);

    // DO NOT CHANGE METHOD SIGNATURE
    public Computer getComputer (ComputerType type) {

        // HERE YOU CAN ADD YOUR CODE
        Computer c = assembleComputer(type);
        if (c == null){
            return null;
        }

        // DO NOT CHANGE - WE WANT CLEAN COMPUTERS
        c.dust();

        return c;
    }


}
