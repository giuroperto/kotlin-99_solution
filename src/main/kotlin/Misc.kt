class Misc {
    companion object {
        /**
         * P90 (**) Eight queens.
         * This is a classical problem in computer science. The objective is to place eight queens on a chessboard
         * so that no two queens are attacking each other, i.e. no two queens are in the same row, column or diagonal.
         * Hint: it might be easier to represent positions of the queens as a list of numbers 1..N.
         * For example, listOf(4, 2, 7, 3, 6, 8, 5, 1) meaning that queen in the first column is in row 4,
         * the queen in the second column is in row 2, etc. Otherwise, feel free to use a data class for queen position.
         */
        public fun Int.eightQueens() : Int {
            return 0
        }

        /**
         * P91 (**) Knight's tour.
         * This is another classical problem in computer science. How can a knight jump on an N×N
         * chessboard in such a way that it visits every square exactly once?
         * Write a function knightsTours(N, (X, Y)) to list all knight tours that be made from (X, Y)
         * on a N×N chessboard. Hints: It might help to represent squares by pairs of their coordinates
         * of the form Pair(X, Y), where X and Y are integers between 0 and N-1. Alternatively,
         * define a Point data class for this purpose.
         * Can you find only "closed tours", where the knight can jump from its final position
         * back to its starting position? Can you make a lazy list that only calculates the tours as needed?
         */
        public fun Int.kingsTour() : Int {
            return 0
        }

        /**
         * P92 (***) Von Koch's conjecture (see also graceful labeling).
         * Several years ago I met a mathematician who was intrigued by a problem for which he didn't know a solution.
         * His name was Von Koch, and I don't know whether the problem has been solved since. (The "I" here
         * refers to the author of the Prolog problems.)
         * Anyway the puzzle goes like this: Given a tree with N nodes (and hence N-1 edges), find
         * a way to enumerate the nodes from 1 to N and, accordingly, the edges from 1 to N-1 in such
         * a way, that for each edge K the difference of its node numbers is equal to K. The conjecture
         * is that this is always possible.
         * (tree image)
         * For small trees the problem is easy to solve by hand. However, for larger trees, and 14
         * is already very large, it is extremely difficult to find a solution. And remember, we don't
         * know for sure whether there is always a solution!
         * Write a function that calculates a numbering scheme for a given tree. What is the solution
         * for the larger tree pictured below?
         * (tree image)
         *
         */
        public fun Int.vkconjec() : Int {
            return 0
        }

        /**
         * P93 (***) An arithmetic puzzle.
         * Given a list of integer numbers, find a correct way of inserting arithmetic operators
         * +-x/() such that the result is a correct equation. Example: With the list of numbers
         * 2, 3, 5, 7, 11 we can form the equations 2 - 3 + 5 + 7 = 11, 2 = (3 * 5 + 7) / 11 and others.
         */
        public fun Int.aritPuzzle() : Int {
            return 0
        }

        /**
         * P94 (***) Regular graphs with N nodes.
         * In a K-regular graph all nodes have a degree of K, i.e. the number of edges incident
         * in each node is K. Write a function to find all non-isomorphic 3-regular graphs with 6 nodes.
         */
        public fun Int.regGraphs() : Int {
            return 0
        }

        /**
         * P95 (**) English number words.
         * On financial documents, like checks, numbers must sometimes be written in full words.
         * For example, 175 will be written as one hundred seventy five. Write a function
         * Int.toWords() to convert (non-negative) integer numbers to words.
         */
        public fun Int.englishNumber() : Int {
            return 0
        }
    }
}
