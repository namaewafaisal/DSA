## Extracting the digits in an integer

```java
int a = 5748;
int tot = 0;
while(a > 0){
	tot = tot * 10 +  a % 10;  // Takes the last digit
	a = a / 10;  // stores without the last digit
}
// tot = 8475
```
### Explanation
 - a % 10 takes the reminder which is the last digit
 - a / 10 takes the integer part after the division which is number without the last digit
 - At last when a becomes less than 0 (*0.5*) then the loop is stopped
### Use Cases
- To count the no of digits ( increment count in each loop )
```java
	int count, n = 987;
	count = Math.log10(n)+1 
``` 
