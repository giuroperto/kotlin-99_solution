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
    }
}

//P32 (*) Determine the greatest common divisor of two positive integer numbers.
//Use Euclid's algorithm.
//
//> gcd(36, 63)
//9
