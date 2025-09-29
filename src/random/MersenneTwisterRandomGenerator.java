
package random;

import java.io.Serializable;
import org.apache.commons.math3.random.MersenneTwister;

public class MersenneTwisterRandomGenerator extends RandomGenerator implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -588076367683612932L;
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
    	int ent = rngApache.nextInt();     	
        return ent;
    }

    @Override
    public int nextInt(int i) {
    	int ent = rngApache.nextInt(i);
		return ent;
    }

    
    @Override
    public long nextLong() {    	
    	long ent = rngApache.nextLong();   
        return ent;
    }

    @Override
    public boolean nextBoolean() {
        return rngApache.nextBoolean();
    }

    @Override
    public float nextFloat() {
    	float ent = rngApache.nextFloat();    
        return ent;
    }

    @Override
    public double nextDouble() {
    	double ent = rngApache.nextDouble();  
        return ent;
    }

    @Override
    public double nextGaussian() {
        return rngApache.nextGaussian();
    }
}
