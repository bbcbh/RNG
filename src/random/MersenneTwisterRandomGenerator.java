
package random;

import java.io.Serializable;
import org.apache.commons.math3.random.MersenneTwister;

public class MersenneTwisterRandomGenerator extends RandomGenerator implements Serializable {

    MersenneTwister rngApache;

    public MersenneTwisterRandomGenerator(long seed) {
        rngApache = new MersenneTwister(seed);
    }

    @Override
    public void setSeed(int i) {
        rngApache.setSeed(i);
    }

    @Override
    public void setSeed(int[] ints) {
        rngApache.setSeed(ints);
    }

    @Override
    public void setSeed(long seed) {
        rngApache.setSeed(seed);
    }

    @Override
    public void nextBytes(byte[] bytes) {
        rngApache.nextBytes(bytes);
    }

    @Override
    public int nextInt() {
        return rngApache.nextInt();
    }

    @Override
    public int nextInt(int i) {
        return rngApache.nextInt(i);
    }

    @Override
    public long nextLong() {
        return rngApache.nextLong();
    }

    @Override
    public boolean nextBoolean() {
        return rngApache.nextBoolean();
    }

    @Override
    public float nextFloat() {
        return rngApache.nextFloat();
    }

    @Override
    public double nextDouble() {
        return rngApache.nextDouble();
    }

    @Override
    public double nextGaussian() {
        return rngApache.nextGaussian();
    }
}
