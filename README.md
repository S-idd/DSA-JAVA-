# 🚀 DSA Practice - Java Implementation

Welcome to my Data Structures and Algorithms (DSA) practice repository! This project contains various DSA problems and their solutions implemented in Java, focusing on fundamental concepts and problem-solving techniques.

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
│   │   └── MaxAndMin.java       # Find maximum and minimum elements
│   └── module-info.java         # Java module configuration
├── .classpath                   # Eclipse classpath configuration
├── .project                     # Eclipse project configuration
├── .gitignore                   # Git ignore rules
└── README.md                    # Project documentation
```

## 🎯 Topics Covered

### 📊 Array Operations
- **Element Counting**: Efficiently count occurrences of specific elements
- **Array Validation**: Check if arrays are sorted in ascending order
- **Index Finding**: Locate the last occurrence of elements
- **Min/Max Finding**: Identify minimum and maximum values

### 🔤 String Operations
- **Anagram Detection**: Determine if two strings are anagrams of each other

## 💻 Problem Solutions

### 1. Count Elements (`CountElements.java`)
**Problem**: Count how many times a specific value appears in an array.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Use Case**: Statistical analysis, frequency counting

### 2. Count Occurrences (`CountOccurences.java`) 
**Problem**: Enhanced version of element counting with optimized approach.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Features**: Uses enhanced for-loop for cleaner code

### 3. Check if Sorted (`IsSorted.java`)
**Problem**: Verify if an array is sorted in ascending order.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Algorithm**: Single pass comparison with early termination

### 4. Anagram Checker (`Isanagram.java`)
**Problem**: Determine if two strings are anagrams.
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Algorithm**: Character array sorting and comparison

### 5. Last Occurrence (`LastOccurence.java`)
**Problem**: Find the last index where a specific element appears.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Return**: Index of last occurrence or -1 if not found

### 6. Max and Min Finder (`MaxAndMin.java`)
**Problem**: Find both maximum and minimum elements in a single traversal.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Return**: Array containing [max, min]

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
| Count Elements | O(n) | O(1) | Frequency analysis |
| Is Sorted | O(n) | O(1) | Data validation |
| Anagram Check | O(n log n) | O(n) | String comparison |
| Last Occurrence | O(n) | O(1) | Index finding |
| Max/Min Finder | O(n) | O(1) | Statistical operations |

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
