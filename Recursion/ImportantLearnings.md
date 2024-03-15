# 15.03.2024

# Different types of Recursion

# Tail Recursion
In `Tail recursion``, the recursive call is the last operation executed by the function.
After the recursive call, there are no pending operations to be performed by the calling function.
Tail recursive functions can usually be optimized by compilers or interpreters to avoid stack overflow errors through a technique known as "tail call optimization" or "tail call elimination."
Tail recursion can often be converted into an iterative form (loop) without stack growth.


# NonTail Recursion
In `non-tail recursion`, there are some operations to be performed after the recursive call before returning a result.
This means that the recursive call is not the last operation performed by the function.
Non-tail recursive functions cannot be easily optimized by compilers or interpreters to avoid stack overflow errors.
Converting non-tail recursion to an iterative form often requires maintaining a stack explicitly

# function to convert character to lowercase
char ch='A'
`Character.toLowerCase(ch)`

# function to convert the string t0 lowercase
 s = `s.toLowerCase()`

# function to check whether the character is alphanumeric character or not.
`Character.isLetterOrDigit(ch)``