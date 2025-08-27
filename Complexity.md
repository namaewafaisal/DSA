## Types of complexity
1. Time Complexity 
2. Space Complexity
---
# Time Complexity
## Definition
- Growth of time taken to do an operation as input N grows
- Less is Better
- Expressed in Big-O (upper bound), Big-Ω (lower bound), Big-Θ (tight bound).
## Common Complexities
- O(1): Constant → array access [[Arrays]]
- O(log n): Logarithmic → binary search
- O(n): Linear → linear search
- O(n log n): Linearithmic → merge sort, quick-sort avg.
- O(n^2): Quadratic → bubble sort, nested loops
- O(2^n): Exponential → subset generation
- O(n!): Factorial → permutations
---
# Space Complexities
## Definition 
- Extra memory used by algorithm (apart from input).
- Includes variables, data structures, recursion stack.
## Common Cases
- O(1): No extra storage → in-place algorithms
- O(n): Extra array/hash-map
- O(n^2): DP table for grids
- O(h): Recursion depth (h = height of recursion tree)
