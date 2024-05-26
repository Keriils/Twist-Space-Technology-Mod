package com.Nxer.TwistSpaceTechnology.common.modularizedMachine.modularHatches.ExecutionCores;

import com.Nxer.TwistSpaceTechnology.common.modularizedMachine.ModularizedMachineLogic.ModularizedMachineBase;
import com.Nxer.TwistSpaceTechnology.common.modularizedMachine.modularHatches.IStaticModularHatch;

import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;

public class ExecutionCore extends ExecutionCoreBase implements IStaticModularHatch {

    public ExecutionCore(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier);
    }

    public ExecutionCore(String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, aDescription, aTextures);
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new ExecutionCore(this.mName, this.mTier, this.mDescriptionArray, this.mTextures);
    }

    @Override
    public void onCheckMachine(ModularizedMachineBase<?> machine) {
        // do nothing
    }
}
