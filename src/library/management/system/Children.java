
package library.management.system;

public class Children extends Book{
    
    private double discountRate = 0.15;

    public Children() {
    }

    public Children(String tittle, double purchasesCost) {
        super(tittle, purchasesCost);
    }

    @Override
    public double getPurchasesCost() {
        return super.getPurchasesCost() - super.getPurchasesCost() * discountRate;
        
    }

    @Override
    public String toString() {
        return "Children Book Tittle:" + getTittle() + ", purchase' Cost:" + super.getPurchasesCost() + ", cost after discount= " + getPurchasesCost();
    }
    
    
            
}
