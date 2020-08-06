package noobanidus.mods.grindr.init;

import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.tileentity.TileEntityType;
import noobanidus.mods.grindr.tiles.GrinderTile;

import static noobanidus.mods.grindr.Grindr.REGISTRATE;

public class ModTiles {
  public static final RegistryEntry<TileEntityType<GrinderTile>> GRINDER = REGISTRATE.tileEntity("grinder", GrinderTile::new).validBlock(NonNullSupplier.of(ModBlocks.GRINDER)).register();

  public static void load() {

  }
}

