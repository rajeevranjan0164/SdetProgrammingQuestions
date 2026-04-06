# 🚀 SDET 2 String Interview Roadmap

This guide contains the top 5 String interview questions specifically for SDET 2 / Senior SDET levels. At this level, interviewers look for **O(n) Time Complexity**, **Space Optimization**, and **Edge Case Handling**.

## 1. Longest Substring Without Repeating Characters
*   **Concept:** Sliding Window Pattern.
*   **Why Senior?** It avoids $O(n^2)$ nested loops.
*   **File:** `src/com/program/sdet2/SlidingWindowLongestSubstring.java`

## 2. Optimal String Compression (Run-Length Encoding)
*   **Concept:** Two-pointer approach.
*   **Why Senior?** It handles *consecutive* counts (aabcc -> a2b1c2) rather than just total counts. It also checks if the compression actually saves space.
*   **File:** `src/com/program/sdet2/OptimalStringCompression.java`

## 3. String Rotation Check
*   **Concept:** String concatenation trick.
*   **Why Senior?** It solves a seemingly complex problem in one line using `(s1 + s1).contains(s2)`.
*   **File:** `src/com/program/sdet2/StringRotationCheck.java`

## 4. Group Anagrams
*   **Concept:** Categorization using `HashMap<String, List<String>>`.
*   **Why Senior?** It moves from a simple "is this an anagram?" to grouping large datasets efficiently.
*   **File:** `src/com/program/sdet2/GroupAnagrams.java`

## 5. First Unique Character (Single Pass)
*   **Concept:** Frequency Array or `LinkedHashMap`.
*   **Why Senior?** Optimized for performance and assumes the data might be a stream.
*   **File:** `src/com/program/sdet2/FirstUniqueCharacterStream.java`

---

### 🔥 Interview Golden Rules for SDET 2:
1.  **Always use StringBuilder** for string manipulation in loops.
2.  **State Time/Space Complexity** ($O(n)$ time, $O(1)$ or $O(k)$ space).
3.  **Validate Inputs** (null check, empty string, case sensitivity).
4.  **Discuss Character Sets** (ASCII vs Unicode).
