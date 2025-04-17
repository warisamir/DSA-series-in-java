# 🛸 Ancient Inscription  - Reconstructing an Unknown Language Order

You are working as a **linguist** and have discovered a set of inscriptions from an alien civilization that uses the **Latin alphabet ('a' to 'z')**, but their alphabetical order is **different** from English.

You're given a list of words that are **already sorted** according to this alien language. Your task is to **reconstruct the correct character order** in this new language.

If **no valid ordering exists** (i.e., the given sequence contradicts itself), return an **empty string**. If there are **multiple valid orderings**, return **any** of them.

---

## 📌 Rules

- The words are sorted according to the alien inscription.
- You must **derive the character order** from the given word list.
- Return a string containing the **unique characters** in the alien language in their **correct order**.
- If it is **impossible** to determine a valid order, return an **empty string**.

---

### 🔤 Lexicographical Comparison Rules

A string `a` is considered **lexicographically smaller** than a string `b` if **either** of the following is true:

1. The first character where they differ comes **before** in `a` than in `b` according to the alien order.
2. All characters in `a` match the beginning of `b`, and **`a` is shorter** than `b`.

👉 _(In other words, `a` is a prefix of `b`)_

---

## 🧪 Examples

### Example 1:
```plaintext
Input: ["z", "o"]
Output: "zo"
Explanation: 'z' comes before 'o' in the inscription.
```
### Example 2:
```plaintext
Input: ["hrn","hrf","er","enn","rfnn"]
Output: "hernf"
Explanation:
- "hrn" vs "hrf" → 'n' < 'f'
- "hrf" vs "er" → 'h' < 'e'
- "er" vs "enn" → 'r' < 'n'
- "enn" vs "rfnn" → 'e' < 'r'

So, one possible valid character order is: **"hernf"**
```
🔒 Constraints: 
```
The input words will contain only lowercase English letters ('a' to 'z').
1 <= words.length <= 100
1 <= words[i].length <= 100
```

