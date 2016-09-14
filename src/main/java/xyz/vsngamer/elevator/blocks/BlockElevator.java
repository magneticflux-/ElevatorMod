package xyz.vsngamer.elevator.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xyz.vsngamer.elevator.ElevatorMod;
import xyz.vsngamer.elevator.Ref;
import xyz.vsngamer.elevator.tileentity.TileEntityElevator;

public class BlockElevator extends Block implements ITileEntityProvider{

	public BlockElevator() {
		super(Material.cloth);
		setUnlocalizedName(Ref.EBlocks.ELEVATOR.getUnlocalizedName());
		setRegistryName(Ref.EBlocks.ELEVATOR.getRegistryName());
		setHardness(0.8F);
		setStepSound(soundTypeCloth);
		setCreativeTab(ElevatorMod.CREATIVE_TAB);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityElevator();
	}
}