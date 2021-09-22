public abstract class Dish
{
  private String cleanStatus;
  private String material;

  public String getMaterial(){
    return material;
  }

  public void setMaterial(String material){
    this.material=material;
  }

  public String getStatus(){
    return cleanStatus;
  }

  public void setStatus(String cleanStatus){
    this.cleanStatus=cleanStatus;
  }
}