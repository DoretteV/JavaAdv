package lesson6;

public interface SalesCalcs {
  //constant variables
  public static final String reportTitle="\n==Static List Report==";

  //by default they are all abstract and are all public
  
  public String getName();
  public double calcSalesPrice();
  public double calcCost();
  public double calcProfit();
  
  public static void printItemArray(SalesCalcs[] items){
    System.out.println(reportTitle);
      for(SalesCalcs item:items){
        item.printItemReport();
      }
  }
  
  public default void printItemReport(){
    System.out.println("--" + this.getName() + " Report--");
    System.out.println("Sales Price: " + this.calcSalesPrice());
    System.out.println("Cost: " + this.calcCost());
    System.out.println("Profit: " + this.calcProfit());    
  }
}
