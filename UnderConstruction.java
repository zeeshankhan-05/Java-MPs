public class UnderConstruction {

    public static void main(String[] args) {
        ToolLibrary.needle();
        ToolLibrary.topDisk();
        ToolLibrary.bottomDisk();
        ToolLibrary.shaft();
        ToolLibrary.structure();
        ToolLibrary.topDisk();
    }
}

class ToolLibrary {
    public static void needle() {
        System.out.println("             ||");
        System.out.println("             ||");
        System.out.println("             ||");
        System.out.println("             ||");
    }

    public static void topDisk() {
        System.out.println("          __/||\\__");
        System.out.println("       __/:::||:::\\__");
        System.out.println("    __/::::::||::::::\\__");
        System.out.println(" __/:::::::::||:::::::::\\__");
        System.out.println(" |\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
    }

    public static void bottomDisk() {
        System.out.println(" \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println("   \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println("     \\_/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println("       \\_/\\/\\/\\/\\/\\_/");
    }

    public static void shaft() {
        System.out.println("          |%%||%%|");
        System.out.println("          |%%||%%|");
        System.out.println("          |%%||%%|");
        System.out.println("          |%%||%%|");
    }

    public static void structure() {
        reinforcedchain();
        reinforcedchain();
        reinforcedchain();
        reinforcedchain();
    }

    public static void reinforcedchain() {
        System.out.println("          |--||--|");
        System.out.println("          |--||--|");
        System.out.println("          |--||--|");
        System.out.println("          |--||--|");
    }
}
