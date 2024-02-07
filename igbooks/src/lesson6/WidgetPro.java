package lesson6;
//always have extends first and then implements!
public class WidgetPro extends Widget implements WidgetSalesCalcs{
  private String type;
  
  public WidgetPro(double salesPrice, double cost, long quantity, String type){
    //inherits salesprice, cost, quantity from Widget
    super(salesPrice, cost, quantity);
    this.type = type;
  }
  
  public String getWidgetType(){
    return type;
  }
  
}
