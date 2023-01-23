---
title: "Quest for Automating Mathematics"
marp: true
math: katex
theme: gaia
---

# Quest for Automating Mathematics

---

# A proof: Sum of Angles in a Triangle

* Consider a triangle $ABC$.
* Draw a line through $A$ parallel to $BC$.
* Use equality of interior opposite angles for parallel lines.


![](angle_sum.png)

---

# Another proof: infinitude of primes

* For any $n$, we show that there exists a prime $p$ such that $p > n$.
* Consider the number $n!+1$ and let $p$ be the smallest prime factor of $n!+1$.
* If $p \leq n$ then $p | n!$ so $p \not| n!+1$.
* Hence $p$ is a prime greater than $n$.

---

# What went into proofs

* Auxiliary Constructions:
    - the parallel line
    - the term $n! + 1$

* Theorems/Definitions to use

* Deductions and Computations.

* The theorems and definitions needed both knowledge of the result and the ability to recognize relevance.

---

# Two systems for Thinking

Our thinking is based on two systems:

* System 1: Intuitive, Associative, Automatic
    - handles language, vision, other sensorimotor tasks
    - fast, but error prone
* System 2: Analytical, Logical, Controlled
    - handles reasoning, planning, problem solving
    - slow, but accurate

--- 

# Moravec Paradox

* System 1 needs far more raw computational power than System 2.
* Our brain can perform about 100 trillion operations per second (about 100 Teraflops).
* Moravec predicted (in 1997) that computers will reach parity with this in 2040.
* Further, our brain has storage of about 100 terabytes.
* Another way to view this is that our accumulated knowledge, memory, experience, learning etc is stored in 100 trillion weights.

---

# Computers today

* The NVIDIA A100 GPU delivers 312 Teraflops of performance.
* Renting a machine on Google cloud with this (and high CPU, RAM) for an year for 40 hours a week costs comparable to the salary of a mathematician in India.
* On the other hand, the RAM on such a GPU is 40 GB, though we can scale this by having parallel GPU.
* The "accumulated knowledge" in the largest AI system (Google's PaLM) is about 540 billion weights, far short of our brain.

---
# Ingredients for doing mathematics

* Accumulation of knowledge
   - precise definitions, theorems (System 2)
   - associations, "digested knowledge" (System 1)
* Computations and Deductions (System 2)
* Recognition of relevance (System 1)
* Constructions, definitions etc based on __Analogy__ (System 1)
* Originality: going beyond the known (Sytem 1/System 2)