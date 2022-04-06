fun main(args: Array<String>) {
    // Lists problems
    val sampleList: List<Int> = listOf(1, 1, 2, 3, 5, 8)
    val palindromeList: List<Int> = listOf(1, 2, 3, 2, 1)
    val listToFlat: List<Any> = listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))

//    println(Lists.last(sampleList))
//    println(Lists.penultimate(sampleList))
//    println(Lists.nth(2, sampleList))
//    println(Lists.nth(7, sampleList))
//    println(Lists.length(sampleList))
//    println(Lists.reverse(sampleList))
//    println(Lists.isPalindrome(sampleList))
//    println(Lists.isPalindrome(palindromeList))
//    println(Lists.flatten(listToFlat))
//    println(Lists.compress("aaaabccaadeeee".toList()))
//    println(Lists.pack("aaaabccaadeeee".toList()))
    println(Lists.encode("aaaabccaadeeee".toList()))
//    println(Lists.encodeModified("aaaabccaadeeee".toList()))
//    println(Lists.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
//    println(Lists.encodeDirect("aaaabccaadeeee".toList()))
//    println(Lists.duplicate("abccd".toList()))
//    println(Lists.duplicateN(3, "abccd".toList()))



}