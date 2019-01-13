//package concurrent;
//
//import java.math.BigInteger;
//
//public class CachedFactorizer {
//    private BigInteger lastNumber;
//    private BigInteger[] lastFactors;
//    private long hits;
//    private long cacheHits;
//
//    public void factors(BigInteger i) {
//        BigInteger[] factors = null;
//        synchronized (this) {
//            ++hits;
//            if (i.equals(lastNumber)) {
//                ++cacheHits;
//                factors = lastFactors.clone();
//            }
//        }
//        if (factors == null) {
//            factors = factor(i);
//            synchronized (this) {
//                lastNumber = i;
//                lastFactors = factors.clone();
//            }
//        }
//        return factors;
//    }
//}