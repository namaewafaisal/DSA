# Java Number Operations Cheat Sheet

## 1. Extracting Digits from an Integer
```java
int a = 5748;
int tot = 0;
while(a > 0){
    tot = tot * 10 + a % 10;  // Takes the last digit
    a = a / 10;               // Removes the last digit
}
// tot = 8475
```
### Explanation

- `a % 10` gives the last digit of the number.
- `a / 10` removes the last digit from the number.
- The loop continues until `a` becomes 0.
### Use Cases

- **Counting the number of digits**:
```java
int n = 987;
int count = (int) (Math.log10(n) + 1);
```

---
## 2. Armstrong Numbers

### Definition

An **Armstrong number** (or **narcissistic number**) of order `k` is a number that is equal to the **sum of its digits each raised to the power of `k`**, where `k` is the total number of digits in the number.

### Examples

| Number | Calculation              | Armstrong? |
| ------ | ------------------------ | ---------- |
| 371    | 3³ + 7³ + 1³ = 371       | ✅          |
| 9474   | 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 | ✅          |
| 153    | 1³ + 5³ + 3³ = 153       | ✅          |
| 123    | 1³ + 2³ + 3³ = 36        | ❌          |
```java
int n = 371;
int sum = 0, temp = n;
int length = (int) (Math.log10(n) + 1);
while (temp > 0){
    sum += (int) Math.pow(temp % 10, length);
    temp /= 10;
}
if (n == sum){
    System.out.println("Armstrong Number");
}
```

---
## 3. Print All Divisors

### Definition

Divisors of a number `N` are all numbers between `1` and `N` that divide `N` completely (`N % i == 0`).

### Simple Approach
```java
int N = 36;
ArrayList<Integer> arr = new ArrayList<>();
for (int i = 1; i <= N; i++){
    if(N % i == 0){
        arr.add(i);
    }
}
System.out.println(arr);
```
Optimized Approach (Using Square Root)
```java
int N = 36;
int sqrtN = (int) Math.sqrt(N);
TreeSet<Integer> set = new TreeSet<>();
for (int i = 1; i <= sqrtN; i++){
    if (N % i == 0){
        set.add(i);
        if (N / i != i) set.add(N / i);
    }
}
System.out.println(set);
```

---
## 4. Check if Prime

A number is **prime** if it has exactly 2 divisors: 1 and itself.
```java
int N = 36;
int sqrtN = (int) Math.sqrt(N);
int count = 0;
for (int i = 1; i <= sqrtN; i++){
    if (N % i == 0) count++;
}
System.out.println(count == 1 ? "Prime" : "Not Prime");
```

---
## 5. GCD / HCF (Greatest Common Divisor / Highest Common Factor)

### Simple Approach

```java
int N = 10, M = 15;
int min = Math.min(N, M);
for (int i = min; i >= 1; i--){
    if (N % i == 0 && M % i == 0){
        System.out.println("GCD is " + i);
        break;
    }
}
```
### Euclidean Algorithm (Optimized)

- Recursive formula: `gcd(a, b) = gcd(a % b, b)`
```java
int gcd(int a, int b){
    if (b == 0) return a;
    return gcd(b, a % b);
}
```
- This method reduces multiple subtractions to a single modulo operation.
