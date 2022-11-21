package de.uni.koeln.sse.se;

public class InstructionGenerator implements Visitor {
private String dimension;
    public String getDimension() {
    return dimension;
}

public void setDimension(String dimension) {
    this.dimension = dimension;
}

    @Override
    public void visitGlass(Glass g) {
        dimension = (g.getLenght()+1) +"x"+(g.getHeight()+1) +"x"+ (g.getWidth()+1); 
        System.out.println(g.getName()+ "should be wrapped with bubble wraps and packed in a box with a dimension of "+dimension);
        
    }

    @Override
    public void visitFurniture(Furniture f) {
        dimension = f.getWidth()+"x"+f.getLenght();
    System.out.println(f.getName()+" should be covered with waterproof covers with an area of "+dimension);
        
    }

    @Override
    public void visitElectro(Electronic g) {
        dimension = (g.getLenght()+1) +"x"+(g.getHeight()+1) +"x"+ (g.getWidth()+1); 
    System.out.println(g.getName()+ " should be covered with Polyethylene foam film and packed in a box with a dimension of "+ dimension);
        
    }
    
}
