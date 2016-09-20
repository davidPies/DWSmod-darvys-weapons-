//reference: http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/custom-tools-swords/
package dwsmod;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item;

public class item1 extends ItemSword {
    public static Item item1;
    public static ToolMaterial SW1 = EnumHelper.addToolMaterial("SW1", 3, 1000, 15.0F, 4.0F, 30);
public ItemModSword(ToolMaterial material) {
    super(material);
      this.GameRegistry.registerItem(item1 = new item1(SW1), "item1");
      this.setUnlocalizedName("item1");
      this.setCreativeTab(CreativeTabs.MISC);
      
    }
    
}
