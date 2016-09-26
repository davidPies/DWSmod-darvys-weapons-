package wheatycraft;

import net.minecraft.item.ItemFood;

public class wheatthinthrow extends ItemFood{
  public wheatthin(){
    this.maxStackSize = 64;
    this.setCreativeTab(creativeTabs.FOOD);
    this.setResourceLocation("wheatycraft:wheatthinfood");
  }
}
