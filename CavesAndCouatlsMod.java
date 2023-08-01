package caves_and_couatls;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("caves_and_couatls")
public class CavesAndCouatlsMod {
    public CavesAndCouatlsMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Common setup code here
    }
}
