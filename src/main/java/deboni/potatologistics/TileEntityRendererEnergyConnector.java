package deboni.potatologistics;

import deboni.potatologistics.blocks.entities.TileEntityEnergyConnector;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.tileentity.TileEntityRenderer;
import net.minecraft.core.world.World;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererEnergyConnector extends TileEntityRenderer<TileEntityEnergyConnector> {

    @Override
    public void onWorldChanged(World world) {
        super.onWorldChanged(world);
    }
    @Override
    public void doRender(TileEntityEnergyConnector tileEntity, double x, double y, double z, float g) {
        if (tileEntity.connections.isEmpty()) return;

        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5f, (float) y + 0.5f, (float) z + 0.5f);

        Tessellator tessellator = Tessellator.instance;
        for (TileEntityEnergyConnector.Connection c : tileEntity.connections){
            double x2 = c.x - tileEntity.x;
            double y2 = c.y - tileEntity.y;
            double z2 = c.z - tileEntity.z;

            if (x2 > 0 || x2 == 0 && y2 > 0 || x2 == 0 && y2 == 0 && z2 > 0) continue;

            double dist = Math.sqrt(x2*x2 + y2*y2 + z2*z2);
            double yOff = Math.log(dist + 0.15);

            boolean b = false;

            double t_increment = 0.25 / dist;
            for (double t = 0.0; t < 1.0 - t_increment * 0.5; t += t_increment) {
                double tx = t * x2;
                double ty = t * y2;
                double tz = t * z2;

                double yOff0 = -0.8*((t-0.5)*(t-0.5)) + 0.2f;
                double yOff1 = -0.8*((t-0.5 + t_increment)*(t-0.5 + t_increment)) + 0.2f;
                yOff0 *= yOff;
                yOff1 *= yOff;

                b = !b;
                float r_col = 0.88f;
                float g_col = 0.22f;
                float b_col = 0.22f;
                if (b) {
                    r_col = 1.0f;
                    g_col = 0.57f;
                    b_col = 0.57f;
                }

                float bright = 1f;

                Util.draw3dLine(0.05,
                        tx, ty - yOff0 , tz,
                        tx + x2 * t_increment, ty + y2 * t_increment - yOff1, tz + z2 * t_increment,
                        r_col * bright, g_col * bright, b_col * bright);
            }
        }

        GL11.glPopMatrix();
    }
}
