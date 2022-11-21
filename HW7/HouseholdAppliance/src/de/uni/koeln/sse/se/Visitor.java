package de.uni.koeln.sse.se;

public interface Visitor {
    public void visitGlass(Glass g);
    public void visitFurniture(Furniture g);
    public void visitElectro(Electronic e);
}
