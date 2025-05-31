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

**Pro tip:** Practice identifying \(a\), \(b\), and \(f(n)\) in problems and apply Master Theorem to get complexity fast.
