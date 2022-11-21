package de.uni.koeln.sse.se;

public class MovingCostCalculator implements Visitor{
private double movingCost;
    public double getMovingCost() {
    return movingCost;
}

public void setMovingCost(double movingCost) {
    this.movingCost = movingCost;
}
    

    @Override
    public void visitGlass(Glass g) {
       
        if(g.tickness==1){
            movingCost = 2*g.getLenght();
        }
        else if(g.tickness==2){
            movingCost = 1.20*g.getLenght();
        }
        else{
            movingCost = 0.7*g.getLenght();
        }
        System.out.println("Total cost for moving "+ g.getName() +": " +movingCost + "Euros");
    }

    @Override
    public void visitFurniture(Furniture f) {

        movingCost= 0.25*f.getWeight();
        System.out.println("Total cost for moving "+ f.getName() +": " +movingCost + "Euros");
    }

    @Override
    public void visitElectro(Electronic e) {
        
        if(e.getFragile()){
            movingCost = (double)0.5*e.getWeight();
        }
        if(!e.getFragile()){
            movingCost = (double)1/3*e.getWeight();
        }
        System.out.println("Total cost for moving "+ e.getName() +": " +movingCost +"Euros");
    }
    
}
