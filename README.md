# 🚀 DSA Practice - Java Implementation

Welcome to my comprehensive Data Structures and Algorithms (DSA) practice repository! This project contains a wide variety of DSA problems and their solutions implemented in Java, covering fundamental to advanced concepts and problem-solving techniques.

## 📁 Project Structure

```
DSAPractice/
├── src/
│   ├── arrayQuestions/          # Array-based DSA problems
│   │   ├── CountElements.java   # Count occurrences of an element
│   │   ├── CountOccurences.java # Count occurrences (enhanced version)
│   │   ├── IsSorted.java        # Check if array is sorted
│   │   ├── Isanagram.java       # Check if two strings are anagrams
│   │   ├── LastOccurence.java   # Find last occurrence of element
│   │   ├── Main.java            # Count elements with two-pointer approach
│   │   ├── MajorityElement.java # Find majority element using HashMap
│   │   └── MaxAndMin.java       # Find maximum and minimum elements
│   ├── Twopointers/            # Two Pointers technique problems
│   │   ├── BinaryArray.java    # Sort binary array (0s and 1s)
│   │   ├── Moveelments.java    # Move even/odd elements
│   │   ├── Q1.java             # Find last occurrence using two pointers
│   │   ├── Q2.java             # Find unique element using XOR
│   │   └── Q3.java             # Square and sort array elements
│   ├── HashMapQuestions/       # HashMap-based problem solutions
│   │   └── Q1.java             # Find unique characters in string
│   ├── PerfixSum/             # Prefix Sum technique problems
│   │   └── Q1.java            # Calculate range sum using prefix sum
│   ├── GCD/                   # Mathematical algorithms
│   │   └── Main.java          # Greatest Common Divisor calculation
│   └── module-info.java       # Java module configuration
├── .classpath                 # Eclipse classpath configuration
├── .project                   # Eclipse project configuration
├── .gitignore                # Git ignore rules
└── README.md                 # Project documentation
```

## 🎯 Topics Covered

### 📊 Array Operations
- **Element Counting**: Efficiently count occurrences of specific elements
- **Array Validation**: Check if arrays are sorted in ascending order
- **Index Finding**: Locate the last occurrence of elements
- **Min/Max Finding**: Identify minimum and maximum values
- **Majority Element**: Find the element that appears more than n/2 times

### ↔️ Two Pointers Technique
- **Binary Array Sorting**: Sort arrays containing only 0s and 1s
- **Element Rearrangement**: Move even/odd elements to specific positions
- **Unique Element Finding**: Find single unique element using XOR
- **Array Squaring**: Square elements and maintain sorted order
- **Last Occurrence**: Alternative approach using two pointers

### 🗺️ HashMap & Hashing
- **Character Frequency**: Count character occurrences in strings
- **Unique Character Detection**: Find characters that appear only once
- **Majority Element Detection**: Use HashMap for frequency counting

### ➕ Prefix Sum Technique
- **Range Sum Queries**: Calculate sum of elements in given range efficiently
- **Cumulative Sum**: Build prefix sum arrays for optimized queries

### 🔢 Mathematical Algorithms
- **GCD Calculation**: Find Greatest Common Divisor using Euclidean algorithm
- **Number Theory**: Mathematical problem solving

### 🔤 String Operations
- **Anagram Detection**: Determine if two strings are anagrams of each other
- **Character Analysis**: String manipulation and character operations

## 💻 Problem Solutions

### 🏠 Array Questions Package

#### 1. Count Elements (`CountElements.java`)
**Problem**: Count how many times a specific value appears in an array.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Use Case**: Statistical analysis, frequency counting

#### 2. Count Occurrences (`CountOccurences.java`) 
**Problem**: Enhanced version of element counting with optimized approach.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Features**: Uses enhanced for-loop for cleaner code

#### 3. Check if Sorted (`IsSorted.java`)
**Problem**: Verify if an array is sorted in ascending order.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Single pass comparison with early termination

#### 4. Anagram Checker (`Isanagram.java`)
**Problem**: Determine if two strings are anagrams.
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Algorithm**: Character array sorting and comparison

#### 5. Last Occurrence (`LastOccurence.java`)
**Problem**: Find the last index where a specific element appears.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Return**: Index of last occurrence or -1 if not found

#### 6. Max and Min Finder (`MaxAndMin.java`)
**Problem**: Find both maximum and minimum elements in a single traversal.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Return**: Array containing [max, min]

#### 7. Main (`Main.java`)
**Problem**: Count elements using two-pointer approach.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Technique**: Two pointers from both ends of array

#### 8. Majority Element (`MajorityElement.java`)
**Problem**: Find the majority element (appears > n/2 times).
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)
- **Data Structure**: HashMap for frequency counting
- **LeetCode**: Problem #169

### ↔️ Two Pointers Package

#### 1. Binary Array Sort (`BinaryArray.java`)
**Problem**: Sort binary array containing 0s and 1s.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Two pointers from both ends
- **Input**: [1,0,1,0,1,0,1,0,1,0,1,0,1]
- **Output**: [0,0,0,0,0,0,1,1,1,1,1,1,1]

#### 2. Move Elements (`Moveelments.java`)
**Problem**: Rearrange array to move even numbers to specific positions.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Techniques**: Two different approaches with two pointers
- **MoveElements()**: Standard two-pointer approach
- **MoveElementsII()**: Alternative positioning approach

#### 3. Last Occurrence (`Q1.java`)
**Problem**: Find last occurrence of an element using two pointers.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Input**: [1,2,3,4,5,6,7,8,9,9], target = 9
- **Output**: "The Last Index Of The Value :9 is :9"

#### 4. Unique Element (`Q2.java`)
**Problem**: Find the unique element in array where all others appear twice.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: XOR operation (a ⊕ a = 0, a ⊕ 0 = a)
- **Input**: [1,1,2,2,3,3,4,4,5,6,6,7,7,8,8,9,9]
- **Output**: "The Unique Element Is:5"

#### 5. Square and Sort (`Q3.java`)
**Problem**: Square array elements and return in sorted order.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)
- **Algorithm**: Two pointers on sorted array with absolute value comparison
- **Input**: [-2,-8,-7,5,6]
- **Output**: [4, 25, 36, 49, 64]

### 🗺️ HashMap Questions Package

#### 1. Unique Characters (`Q1.java`)
**Problem**: Find characters that appear only once in a string.
- **Time Complexity**: O(n)
- **Space Complexity**: O(k) where k is unique characters
- **Input**: "swiss"
- **Output**: "w i" (characters appearing only once)
- **Data Structure**: HashMap with frequency counting

### ➕ Prefix Sum Package

#### 1. Range Sum Query (`Q1.java`)
**Problem**: Calculate sum of elements in given range using prefix sum.
- **Time Complexity**: O(n) preprocessing, O(1) per query
- **Space Complexity**: O(1) additional space
- **Algorithm**: Build prefix sum array, then answer range queries
- **Use Case**: Multiple range sum queries efficiently
- **Example**: For range [l,r], sum = prefixSum[r] - prefixSum[l-1]

### 🔢 GCD Package

#### 1. Greatest Common Divisor (`Main.java`)
**Problem**: Calculate GCD of two numbers using Euclidean algorithm.
- **Time Complexity**: O(log(min(a,b)))
- **Space Complexity**: O(1)
- **Algorithm**: Euclidean algorithm with remainder
- **Input**: a = 18, b = 10
- **Output**: GCD = 2
- **Mathematical Principle**: gcd(a,b) = gcd(b, a%b)

## 🛠️ Setup & Installation

### Prerequisites
- **Java**: JDK 23 or higher
- **IDE**: Eclipse IDE (project configured) or any Java IDE
- **Git**: For version control

### Clone the Repository
```bash
git clone https://github.com/S-idd/DSA-JAVA-.git
cd DSA-JAVA-
```

### Running the Code
1. **Using Eclipse IDE**:
   - Import the project into Eclipse
   - Navigate to `src/arrayQuestions/`
   - Right-click on any Java file → Run As → Java Application

2. **Using Command Line**:
   ```bash
   # Compile
   javac -d bin src/arrayQuestions/*.java
   
   # Run (example with CountElements)
   java -cp bin arrayQuestions.CountElements
   ```

3. **Using Module System**:
   ```bash
   javac -d bin --module-source-path src src/module-info.java src/arrayQuestions/*.java
   java --module-path bin -m DSA/arrayQuestions.CountElements
   ```

## 📈 Performance Analysis

| Algorithm | Time Complexity | Space Complexity | Best For |
|-----------|----------------|------------------|-----------|
| **Array Operations** |||||
| Count Elements | O(n) | O(1) | Frequency analysis |
| Is Sorted | O(n) | O(1) | Data validation |
| Anagram Check | O(n log n) | O(n) | String comparison |
| Last Occurrence | O(n) | O(1) | Index finding |
| Max/Min Finder | O(n) | O(1) | Statistical operations |
| Majority Element | O(n) | O(n) | Finding dominant element |
| **Two Pointers** |||||
| Binary Array Sort | O(n) | O(1) | Sorting binary arrays |
| Move Elements | O(n) | O(1) | Array rearrangement |
| Unique Element (XOR) | O(n) | O(1) | Finding single occurrence |
| Square and Sort | O(n) | O(n) | Sorted squared arrays |
| **HashMap Operations** |||||
| Character Frequency | O(n) | O(k) | String analysis |
| **Prefix Sum** |||||
| Range Sum Query | O(n) + O(1) | O(1) | Multiple range queries |
| **Mathematical** |||||
| GCD (Euclidean) | O(log(min(a,b))) | O(1) | Number theory |

## 🎓 Learning Objectives

- ✅ Master fundamental array operations
- ✅ Understand time and space complexity analysis
- ✅ Practice problem-solving techniques
- ✅ Learn efficient algorithm implementation
- ✅ Develop clean, readable code practices

## 🚧 Future Enhancements

- [ ] Add more complex data structures (LinkedList, Trees, Graphs)
- [ ] Implement sorting and searching algorithms
- [ ] Add unit tests for all solutions
- [ ] Include algorithm visualization
- [ ] Add performance benchmarking
- [ ] Expand to dynamic programming problems

## 📚 Study Resources

- **Books**: "Introduction to Algorithms" by CLRS
- **Online**: LeetCode, HackerRank, GeeksforGeeks
- **Practice**: Regular coding challenges and contests

## 🤝 Contributing

Feel free to contribute by:
1. Adding new DSA problems and solutions
2. Optimizing existing algorithms
3. Improving documentation
4. Adding test cases

## 📄 License

This project is open source and available for educational purposes.

## 👨‍💻 Author

**Siddarth Kanamadi**
- GitHub: [@S-idd](https://github.com/S-idd)
- Repository: [DSA-JAVA-](https://github.com/S-idd/DSA-JAVA-)

---

*Happy Coding! 🎉*

> "The best way to learn algorithms is to implement them yourself." - Programming Wisdom

## 📊 Repository Stats

![GitHub last commit](https://img.shields.io/github/last-commit/S-idd/DSA-JAVA-)
![GitHub repo size](https://img.shields.io/github/repo-size/S-idd/DSA-JAVA-)
![GitHub language count](https://img.shields.io/github/languages/count/S-idd/DSA-JAVA-)
![GitHub top language](https://img.shields.io/github/languages/top/S-idd/DSA-JAVA-)
