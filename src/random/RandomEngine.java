package random;

/**
 * <p>
 * A wrapper class of <i>RandomEngine</i> class as defined by <a href="http://acs.lbl.gov/software/colt/">Colt</a>
 * numerical library.
 *
 * @deprecated  Use RandomGenerator instead
 * @author Ben Hui
 */
public abstract class RandomEngine extends cern.jet.random.engine.RandomEngine  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7796499834289775399L;

	public abstract int nextInt(int b);
}
