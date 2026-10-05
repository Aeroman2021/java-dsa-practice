# DSA Practice — مسیر الگوریتم برای مصاحبه

## روش کار برای هر مسئله
1. صورت مسئله رو توی Javadoc کلاس بخون.
2. **قبل از کد:** راه‌حل brute force و Big-O ش رو بنویس.
3. دنبال بهینه‌سازی بگرد: کدوم کار تکراریه؟
4. کد بزن، تست رو اجرا کن (`Ctrl+Shift+F10` روی کلاس تست).
5. Time و Space نهایی رو بالای کلاس بنویس.
6. خلاصه‌ی الگو رو توی `notes/` ثبت کن.

> اجرای همه‌ی تست‌ها: `mvn test`
> تست‌های مسئله‌هایی که هنوز حل نشدن طبیعتاً fail می‌شن (`UnsupportedOperationException`).

## ساختار
```
src/main/java/dsa/
  common/            ListNode و TreeNode برای مسئله‌های لیست و درخت
  p01_hashing/       ← از اینجا شروع
  p02_two_pointers/  ...
src/test/java/dsa/   تست هر مسئله کنار پکیج خودش
notes/               یادداشت‌های الگوها
```

## مراحل (57 مسئله)
| پکیج | الگو | سطح | تعداد | وضعیت |
|---|---|---|---|---|
| `p01_hashing` | Hashing (HashMap / HashSet) | 1 | 5 | 🟢 باز |
| `p02_two_pointers` | Two Pointers | 1 | 4 | 🟢 باز|
| `p03_sliding_window` | Sliding Window | 1 | 4 | 🔒 |
| `p04_stack` | Stack / Monotonic Stack | 1 | 3 | 🔒 |
| `p05_binary_search` | Binary Search | 1 | 3 | 🔒 |
| `p06_linked_list` | Linked List | 1 | 4 | 🔒 |
| `p07_trees` | Trees (DFS / BFS on trees) | 1 | 4 | 🔒 |
| `p08_heap` | Heap / PriorityQueue | 1 | 3 | 🔒 |
| `p09_backtracking` | Recursion & Backtracking | 1 | 3 | 🔒 |
| `p10_graphs` | Graphs (BFS / DFS) | 1 | 3 | 🔒 |
| `p11_dp_1d` | Dynamic Programming (1D) | 1 | 4 | 🔒 |
| `p12_dp_2d` | Dynamic Programming (2D) | 2 | 3 | 🔒 |
| `p13_intervals` | Intervals | 2 | 3 | 🔒 |
| `p14_prefix_sum` | Prefix Sum | 2 | 2 | 🔒 |
| `p15_greedy` | Greedy | 2 | 2 | 🔒 |
| `p16_trie` | Trie | 2 | 2 | 🔒 |
| `p17_advanced_graphs` | Topological Sort, Dijkstra, Union-Find | 2 | 3 | 🔒 |
| `p18_bit_manipulation` | Bit Manipulation | 2 | 2 | 🔒 |
