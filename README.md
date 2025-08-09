# Time Complexity & Master Theorem — FAANG Prep

## Time Complexity Basics

- Measures how the runtime of an algorithm scales with input size **n**.
- Common complexities:  
  - **O(1)** — Constant time  
  - **O(log n)** — Logarithmic time  
  - **O(n)** — Linear time  
  - **O(n log n)** — Linearithmic time  
  - **O(n²)** — Quadratic time  
- Helps to predict algorithm efficiency and scalability.

## Master Theorem Overview

- Used to analyze **divide and conquer** recurrences of form:  
  \[
    T(n) = a \cdot T\left(\frac{n}{b}\right) + f(n)
  \]
- Where:  
  - **a** = number of recursive calls  
  - **b** = factor by which problem size is divided  
  - **f(n)** = cost of work outside recursion

## Master Theorem Cases

1. If \( f(n) = O(n^{\log_b a - \epsilon}) \) for some \(\epsilon > 0\):  
   \[
   T(n) = \Theta(n^{\log_b a})
   \]

2. If \( f(n) = \Theta(n^{\log_b a} \log^k n) \) for some \(k \geq 0\):  
   \[
   T(n) = \Theta(n^{\log_b a} \log^{k+1} n)
   \]

3. If \( f(n) = \Omega(n^{\log_b a + \epsilon}) \) for some \(\epsilon > 0\) and regularity condition holds:  
   \[
   T(n) = \Theta(f(n))
   \]

## Why It Matters for FAANG

- Many FAANG interview problems involve recursive algorithms.
- Master Theorem provides a **quick way to find time complexity** of such algorithms.
- Being able to analyze recurrence relations confidently is a key interview skill.
- Examples: Merge Sort, Binary Search variants, Quick Select, Divide & Conquer DP.

---

Phase One :-  Foundations & Big O Basics
Understand what time complexity measures (growth rate of runtime as input size grows)
Learn Big O notation: worst-case analysis
Study common complexities:

        O(1), O(log n), O(n), O(n log n), O(n²), O(2^n), O(n!)

      Practice identifying time complexity in simple loops and nested loops
Phase Two : - Analyzing Code Snippets
Analyze time complexity for recursive functions  
Master solving recurrence relations (like T(n) = 2T(n/2) + n)
Learn about Master Theorem for divide-and-conquer algorithms
Practice with classic recursive problems (e.g., Fibonacci, Merge Sort)

Phase Three : - Space Complexity & Amortized Analysis
Understand space complexity (extra memory used)
Learn about amortized time complexity (e.g., dynamic arrays, splay trees)
Practice examples like stack operations, hash maps resizing

    
