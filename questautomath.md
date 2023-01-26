---
title: "Quest for Automating Mathematics"
marp: true
math: mathjax
theme: gaia
---

# Quest for Automating Mathematics

---

# A proof: Sum of Angles in a Triangle

* Consider a triangle $ABC$.
* Draw a line through $A$ parallel to $BC$.
* Use equality of interior opposite angles for parallel lines.
* Use the result that angles on a line add up to 180 degrees.


![](angle_sum.png)

---

# Another proof: infinitude of primes

* For any $n$, we show that there exists a prime $p$ such that $p > n$.
* Consider the number $n!+1$ and let $p$ be the smallest prime factor of $n!+1$.
* If $p \leq n$ then $p | n!$ so $p \nmid n!+1$.
* Hence $p$ is a prime greater than $n$.

---

# What went into proofs

* Auxiliary Constructions:
    - the parallel line
    - the term $n! + 1$

* Theorems/Definitions to use.

* Deductions and Computations.

* The theorems and definitions needed both knowledge of the __precise statement__ and the ability to __recognize relevance__.

---

# Two systems for Thinking

Our thinking is based on two systems:

* System 1: Intuitive, Associative, Automatic.
    - handles language, vision, other sensorimotor tasks.
    - fast, but error prone.
* System 2: Analytical, Logical, Controlled.
    - handles reasoning, planning, problem solving.
    - slow, but accurate.

--- 

# Moravec Paradox

* System 1 needs far more raw computational power than System 2.
* Our brain can perform about 100 trillion operations per second (about 100 Teraflops) according to Moravec.
* Moravec predicted (in 1997) that computers will reach parity with this in 2040.
* Further, our brain has storage of about 100 terabytes.
* Another way to view this is that our accumulated knowledge, memory, experience, learning etc is stored in 100 trillion weights.

---

# Why aren't we supercomputers?

* A neuron completes between 1 and 200 operations in a second while a laptop completes about 3 billion.
* The 100 trillion operations per second the brain performs are achieved by massively parallel computation.
* Logic/Algorithms often cannot be parallelized, e.g. long division.
* With computers, the number of operations per second grew rapidly till about 15 years ago, but then have stopped growing.
* Instead the power has grown through more parallel computation.
* This is especially so with the use of _Graphics Processing Units_ (GPUs), which are used in machine learning.

---

# Computers today

* The NVIDIA A100 GPU delivers 312 Teraflops of performance.
* Renting a machine on Google cloud with this (and high CPU, RAM) for an year for 40 hours a week costs comparable to the salary of a mathematician in India.
* On the other hand, the RAM on such a GPU is 40 GB; though we can scale this by having parallel GPUs.
* The "accumulated knowledge" in the largest AI system (Google's PaLM) is about 540 billion weights, much less than our brain.

---
# Ingredients for doing mathematics

* Accumulation of knowledge
   - precise definitions, theorems (System 2).
   - associations, relevance (System 1).
* Learning to learn (System 1/System 2).
* Computations and Deductions (System 2).
* Recognition of relevance (System 1).
* Constructions based on __Analogy__ (System 1).
* Originality: going beyond the known (System 1/System 2).

---

# Sections from Talks

- Computer proofs in Mathematics
- Interactive Theorem Provers
- Formal Methods

---

# Artificial Intelligence: Limitations and Advances

---

# Common sense 

* We know a lot of things, which we call _common sense_.
* Further, these pieces of knowledge are organized in a way that they can be combined.
* __Expert Systems__ consist of:
  - a lot of knowledge encoded as structured data, functions, algorithms.
  - fast algorithms for reasoning.
---
# DeepBlue vs Kasparov

---

# Tacit knowledge

* Tacit knowledge is the kind of knowledge that is difficult to transfer to another person by means of writing it down or verbalizing it.
* Examples: riding a bicycle, speaking a language.
* Such knowledge cannot be communicated as programs or to expert systems, but computers can try to _learn_.
* The idea of computers learning goes back at least to Turing, or even regression in statistics.
* What was needed was hardware and a system that could learn efficiently.
---

# Deep Learning systems

* In a deep neural network the input is transformed into the output by passing through a series of layers.
* Each layer is typically a linear transformation, depending on weights, followed by a simple non-linear function.
* The weights of the layers can be learnt efficiently.

![](DeepNeuralNet.png)


---

* Starting about 2012, deep neural networks performed very well in image processing tasks, far above rule-based systems.

![](DeepNeuralNet.png)

* It turns out that as the image is processed by successive layers, the raw data gets modified to capture abstraction/meaning.
--- 

# Limitations as of about ten years ago

* Needed labelled data for training.
* Narrow: training specific to the task.
* Had difficulty with long range dependencies, in particular language.
* Hard to scale up, parallelize.
* Could not go beyond training data.


---

# Representation Learning

* In __Word2Vec__ we set up the problem of predicting a word given its neighbours.

* We look for solutions of this problem that involve mapping words into space, and predicting from neighbours using the points.

* We then retain only the mapping of words into space, so _geometry_ captures _associations_.

* Another lesson is that it is useful to solve synthetic problems:  play, solving exercises.

---

# Transfer learning

* A set of common layers was used for many tasks.
* Some of them could be synthetic.
* This resulted in networks trained for one task needing much less training for a related task.

--- 

# AlphaZero

---

# "Attention is all you need"

* The meaning of a word depends on the context, i.e., other words surrounding it.
* In the __transformer architecture__, this is captured by learning to which other words to pay attention.
*  The encoding of words includes position vectors, defined by using harmonics.
* This allowed parallelization and captured long-range dependencies.
* Transformers are used in AlphaFold 2 which predicts protein structures on par with experiments.

---
# Foundation Models

* With the transformer architecture training could be scaled up enormously.
* It was found that models kept improving as the number of parameters grew.
* Huge models such as GPT-3 and PaLM have been trained on essentially all of the internet, either by trying to predict the next word or by trying to fill in masked out parts.
* Applications: Dall-E 2, ChatGPT etc., have become sensations.

---

# The way ahead

* We have systems that are

  * System I and System II
  * Original and Scalable

  but not with the same system.

* We must make them work together

  - while doing mathematics
  - while learning
  - with each other __and with us.__ 