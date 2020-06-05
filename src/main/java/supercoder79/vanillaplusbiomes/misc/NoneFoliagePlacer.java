package supercoder79.vanillaplusbiomes.misc;

import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ModifiableTestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.Random;
import java.util.Set;

public class NoneFoliagePlacer extends FoliagePlacer {
    public NoneFoliagePlacer() {
        super(0, 0,0, 0);
    }

    @Override
    protected FoliagePlacerType<?> method_28843() {
        return null;
    }

    @Override
    protected void generate(ModifiableTestableWorld world, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, Set<BlockPos> leaves, int i, BlockBox box) {

    }

    @Override
    public int getHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 0;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int maxWaterDepth, int dx, int dy, int dz, boolean bl) {
        return false;
    }
}
