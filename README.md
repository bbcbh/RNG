A simple random number generator (RNG) shared across multiple IBM models and others. 

Initially, I implemented the RNG manually, but it now functions as a wrapper for the MersenneTwister object provided by the Commons Math library, available at https://commons.apache.org/proper/commons-math/. 

Since most (if not all) of the models I developed for Kirby and IBM already use the Commons Math package as a dependency, the wrapper isn't strictly necessary. However, it is maintained for backward compatibility. 
