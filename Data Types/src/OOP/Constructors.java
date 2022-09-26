package src.OOP;

public class Constructors {
    int Width;
    int Depth;
    int Height;

    Constructors(int Width, int Depth, int Height) {
        this.Width = Width;
        this.Depth = Depth;
        this.Height = Height;
    }

    Constructors(int Width, int Depth) {
        this.Width = Width;
        this.Depth = Depth;
        this.Height = 10;
    }

    Constructors() {
        this.Height = 10;
        this.Depth = 10;
        this.Width = 10;
    }

    Constructors(int dimension) {
        this.Width = dimension;
        this.Height = dimension;
        this.Depth = dimension;
    }

    int volume() {
        return Width * Height * Depth;
    }

    public static void main(String[] args) {
        int volume;
        Constructors allCons = new Constructors(10, 20, 20);
        volume = allCons.volume();
        System.out.println("Volume for All Argument Constructor: " + volume);
        Constructors withDefaults = new Constructors(10, 20);
        volume = withDefaults.volume();
        System.out.println("Volume with Default Argument Constructor: " + volume);
        Constructors noArgs = new Constructors();
        volume = noArgs.volume();
        System.out.println("Volume for No Argument Constructor: " + volume);
        Constructors withSameValues=new Constructors(10);
        volume=withSameValues.volume();
        System.out.println("Volume with same Argument Constructor: "+volume);


    }
}
