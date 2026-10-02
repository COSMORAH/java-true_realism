package net.cosmorah.truerealism.item;

import net.cosmorah.truerealism.TrueRealism;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TrueRealism.MOD_ID);

	public static final DeferredItem<Item> AK47 = ITEMS.register("ak47",
			() -> new Item(new Item.Properties()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
