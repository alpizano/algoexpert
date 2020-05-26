# Intro
I will document the questions in the algo expert course here in this readme, and will provide solutions in the source directories above.

## Easy
### `Two Number Sum`
Q: Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order. If no two numbers sum up to the target sum, the function should return an empty array.

Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer to itself in order to obtain the target sum.

You can assume that there will be at msot one pair of numbers summing up to the target sum.

#### Sample Input
```
array = [3, 5, -4, 8, 11, 1, -1, 6]
targetSum = 10
```

#### Sample Output
`[-1, 11] // the numbers could be in reverse order`

### `Palindrome Check`
Write a function that takes in a non-empty string and that returns a boolean representing whether the string is a palindrome.

A palindrome is defined as a string that's written the same forward and backward. Note that single-character strings are palindromes.


#### Sample input
`string = "abcdcba"`

#### Sample Output
`true // it's written the same forward and backward`


### `Caesar Cipher Encryptor`
Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.

Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a.

#### Sample Input
```
string = "xyz"
key = 2
```

#### Sample Output
`"zab"`

### `Nth Fibonacci`
The Fibonacci sequence is defined as follows: the first number of the sequence is `0`, the second number is `1`, and the nth number is the sum of the (n - 1)th and (n - 2)th numbers. Write a function that takes in an integer `n` and returns the nth Fibonacci number.

Important note: the Fibonacci sequence is often defined with its first two numbers as `F0 = 0` and `F1 = 1`. For the purpose of this question, the first Fibonacci number is `F0`; therefore, `getNthFib(1)` is equals to `F0`, `getNthFib(2)` is equals to `F1`, etc...

#### Sample Input #1
`n = 2`

#### Sample Output #1
`1 // 0, 1`

#### Sample Input #2
`n = 6`

#### Sample Output #2
`5 // 0, 1, 1, 2, 3, 5`

### `Validate Subsequence`
Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that are in the same order as they appear in the array. For instance, the numbers `[1, 3, 4]` form a subsequence of the array `[1, 2, 3, 4]`, and so do the numbers `[2, 4]`. Noe that a single number in an array and the array itself are both valid subsequences of the array.

#### Sample Input
```
array = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]

#### Sample Output
`true`

### `BubbleSort`
Write a function that takes in an array of inteegers and returns a sorted version of that array. Use the Bubble Sort algorithm to sort the array.

If you're unfamiliar with Bubble Sort, we recommend watching the Conceptual Overview section of this question's video explanation before starting to code.

#### Sample Input
`array = [8, 5, 2, 9, 5, 6, 3]`

#### Sample Output
`[2, 3, 5, 5, 6, 8, 9]`

### `Binary Search`
Write a function that takes in a sorted array of integers as well as a target integer. The function should use the Binary Search algorithm to determine if the target integer is contained in the array and should return its index if it exists, otherwise `-1`.

If you're unfamiliar with Binary Search, we recommend watching the Conceptual Overview section of this question's video explanation before starting to code.

#### Sample Input
```
array = [0, 1, 21, 33, 45, 45, 61, 71, 72, 73]
target = 33
```

#### Sample Output
`3`
