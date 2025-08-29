# Arrays

- **Definition**: Linear data structure, stores elements in **contiguous memory**.  
- **Access**: Direct using index → `arr[i]`.  
- **Size**: Fixed (static arrays), dynamic in some languages (ArrayList in Java, list in Python).
---
## 🔹 Basic Operations & Complexities

| Operation                            | Description                | Time Complexity |
| ------------------------------------ | -------------------------- | --------------- |
| [Create Array](#create\ array\ java) | Declare & initialize array | **O(1)**        |
| [Access](#access)                    | Direct index access        | **O(1)**        |
| [Linear Search](#linear-search)      | Search unsorted array      | **O(n)**        |
| [Binary Search](#binary-search)      | Search sorted array        | **O(log n)**    |
| [Add-Last](#add-last)                | Insert at end              | **O(1)/O(n)**   |
| [Add-First](#add-first)              | Insert at beginning        | **O(n)**        |
| [Add-Middle](#add-middle)            | Insert at middle           | **O(n)**        |
| [Delete-Last](#delete-last)          | Remove last element        | **O(1)**        |
| [Delete-First](#delete-first)        | Remove first element       | **O(n)**        |
| [Delete-Middle](#delete-middle)      | Remove middle element      | **O(n)**        |
| [Traverse](#traverse)                | Visit each element once    | **O(n)**        |

---

## 🔹 Space Complexity
- Array storage → **O(n)**  
- No extra space for operations (unless dynamic resize).

---

## 🔹 Applications
- Basis for higher data structures (strings, stacks, heaps, hash tables).
- Useful for problems needing fast random access.

---

## 🔹 Example Problems
- Reverse an array → Two-pointer swap.  
- Find maximum subarray sum → Kadane’s Algorithm (O(n)).  
- Rotate array → Cyclic replacement / reversal method.  

---

# Arrays – Operations Snippets

---
## Create Array Java
```java
int[] arr1 = {10,20,30}; // Known size and data
int[] arr2 = new int[3]; // Known size unknown data
int n = 5;               // Get size from user (example)
int[] arr3 = new int[n];
```
---
## Access 
```java
int[] arr = {1, 2 ,3};
System.out.println(arr[1]) // Output = 2
```
---
## Linear-Search
```java
int[] arr = {10, 20, 30, 40, 50};
int target = 30;
boolean found = false;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index " + i);
        found = true;
        break;
    }
}
if (!found) System.out.println("Not Found");
```
---
## Binary-Search

```java
int[] arr = {10, 20, 30, 40, 50};
int target = 40;
int low = 0, high = arr.length - 1;

while (low <= high) {
    int mid = low + (high - low) / 2;

    if (arr[mid] == target) {
        System.out.println("Found at index " + mid);
        break;
    } else if (arr[mid] < target) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}
```
---
## Add-Last
```java
int[] arr = new int[10];
arr[0] = 10; arr[1] = 20; arr[2] = 30;
int n = 3; // current size

arr[n] = 40; // add new element at end
n++;

```
---
## Add-Middle
```java
int[] arr = new int[10];
arr[0] = 10; arr[1] = 20; arr[2] = 30;
int n = 3; // current size
int pos = 1; // index where new element will be inserted
int value = 15;

// shift elements right
for (int i = n; i > pos; i--) {
    arr[i] = arr[i - 1];
}
arr[pos] = value;
n++;
```
---
## Add-First

```java
int[] arr = new int[10];
arr[0] = 20; arr[1] = 30; arr[2] = 40;
int n = 3; // current size
int value = 10;

// shift elements right
for (int i = n; i > 0; i--) {
    arr[i] = arr[i - 1];
}
arr[0] = value;
n++;
```
---
## Delete-Last
```java
int[] arr = {10, 20, 30, 40};
int n = 4;

n--; // just reduce size
System.out.println("Deleted last element: " + arr[n]);
```
---
## Delete-Middle
```java
int[] arr = {10, 20, 30, 40, 50};
int n = 5;
int pos = 2; // delete element at index 2 (value 30)

// shift elements left
for (int i = pos; i < n - 1; i++) {
    arr[i] = arr[i + 1];
}
n--;

System.out.println("Array after deletion:");
for (int i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");
}
```
---
## Delete-First
```java
int[] arr = {10, 20, 30, 40};
int n = 4;

// shift elements left
for (int i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
}
n--;

System.out.println("Array after deletion:");
for (int i = 0; i < n; i++) {
    System.out.print(arr[i] + " ");
}
```
---
## Traverse
```java
int[] arr = {20, 30,40,50};
int n = 4;
for (int i = 0; i < n; i++) {
	System.out.println(arr[i] + " ");
}
```
---

