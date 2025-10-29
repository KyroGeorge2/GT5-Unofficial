package gtPlusPlus.xmod.gregtech.registration.gregtech;

import static gregtech.api.enums.MetaTileEntityIDs.Isoflux_WireMatrix;

import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.processing.MTEIsofluxWireMatrix;

public class GregtechIsofluxWirematrix {

    public static void run() {
        GregtechItemList.Isoflux_WireMatrix.set(
            new MTEIsofluxWireMatrix(
                Isoflux_WireMatrix.ID,
                "isofluxwirematrix.controller.tier.single", // internal key
                "Isoflux Wire Matrix"                        // display name
            ).getStackForm(1L)
        );
    }
}
