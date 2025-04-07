public interface Metallurgy {
    String smelt();
} 

class Copper implements Metallurgy {
    @Override
    public String smelt() {
        return "Copper";
    }
}

class CuproNickel implements Metallurgy {
    @Override
    public String smelt() {
        return "Cupro-Nickel";
    }
}