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
    public abstract int nextInt(int b);
}
