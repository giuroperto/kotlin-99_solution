class Arithmetic {
    companion object {
        /**
         * P31 (*) Determine whether a given integer number is prime.
         * Example: 7.isPrime()
         * Returns true
         */
        public fun Int.isPrime() : Boolean {
            var divisionTimes = 0;
            var i = 1;

            if (this == 0) return false

            while (i <= this) {
                if (this % i == 0) {
                    divisionTimes++;
                }
                i++
            }

            return divisionTimes == 2
        }

        /**
         * P32 (*) Determine the greatest common divisor of two positive integer numbers.
         * Use Euclid's algorithm.
         * Example: gcd(36, 63)
         * Returns 9
         */
        public fun Int.gcd() : Int {
            return 0
        }

        /**
         * P33 (*) Determine whether two positive integer numbers are coprime.
         * Two numbers are coprime if their greatest common divisor equals 1.
         * Example: 35.isCoprimeTo(64)
         * Returns true
         */
        public fun Int.coprime() : Int {
            return 0
        }

        /**
         * P34 (*) Calculate Euler's totient function phi(m).
         * Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m)
         * that are coprime to m.
         * Example: 10.totient()
         * Returns 4
         */
        public fun Int.totient() : Int {
            return 0
        }

        /**
         * P35 (*) Determine prime factors of a given positive integer.
         * Construct a list containing prime factors in ascending order.
         * Example: 315.primeFactors()
         * Returns [3, 3, 5, 7]
         */
        public fun Int.primeFactors() : Int {
            return 0
        }

        /**
         * P36 (*) Determine the prime factors of a given positive integer (2).
         * Construct a list containing prime factors and their multiplicity.
         * Example: 315.primeFactorMultiplicity()
         * Returns [(3, 2), (5, 1), (7, 1)]
         */
        public fun Int.primeFactorMultiplicity() : Int {
            return 0
        }
    }
}
