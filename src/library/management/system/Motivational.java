
package library.management.system;

public class Motivational extends Book{
        
    private double discountRate = 0.10;

    public Motivational() {
    }

    public Motivational(String tittle, double purchasesCost) {
        super(tittle, purchasesCost);
    }

    @Override
    public double getPurchasesCost() {
        return super.getPurchasesCost() - super.getPurchasesCost() * discountRate;
        
    }
    
    @Override
    public String toString() {
        return "Motivational Book Tittle:" + getTittle() + ", purchase' Cost:" + super.getPurchasesCost() + ", cost after discount= " + getPurchasesCost();
    }
            
}


