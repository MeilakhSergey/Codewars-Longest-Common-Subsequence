# Codewars-Longest-Common-Subsequence
https://www.codewars.com/kata/593ff8b39e1cc4bae9000070/train/java

The longest common subsequence (LCS) problem is the problem of finding the longest subsequence common to all sequences in a set of sequences.

It differs from problems of finding common substrings: unlike substrings, subsequences are not required to occupy consecutive positions within the original sequences.

Task

Write a function lcs that accepts two strings and returns their longest common subsequence as a string. Performance matters.

Examples

lcs( "abcdef", "abc" ) => "abc"

lcs( "abcdef", "acf" ) => "acf"

lcs( "132535365", "123456789" ) => "12356"

lcs( "abcdefghijklmnopq", "apcdefghijklmnobq" ) => "acdefghijklmnoq"

Notes

The subsequences of "abc" are "", "a", "b", "c", "ab", "ac", "bc", "abc".
"" is a valid subsequence in this kata, and a possible return value.
All inputs will be valid.
Two strings may have more than one longest common subsequence. When this occurs, return any of them.

lcs( string0, string1 ) === lcs( string1, string0 )
