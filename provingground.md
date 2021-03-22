# Overview of proving-ground and related stuff

For the talk "in" Edinburgh

## Preliminaries: before ProvingGround proper:

* What I mean by Automating Mathematics.
* About myself and lead up to PolyMath 14.
* PolyMath 14:
    * the question,
    * reformulation in terms of words, dropping some conditions.
    * the quest,
    * the computer proof,
    * the answer to the question.
    * __Follow-up 1:__ regenerating the proof.
    * __Follow-up 2:__ representing, formalizing the proof.
        * we used domain specific foundations, capable only of representing concrete inequalities (and with some runtime checks).
        * in the future, use Lean Theorem Prover.
        * as a follow up, formalized in ProvingGround.

## Components/phases of ProvingGround

* Representing Mathematics: Formal proof system
    * MLTT/HoTT
    * Symbolic Algebra
    * Use of scala's sub-typing, so scala types bound HoTT type
    * Indexed inductive types, complex implicit based calculations
    * E.g. $n | n + 1$ even, locally constant implies constant, Ackermann function
    * Import from the export format of the _lean theorem prover_.
* Generating terms, including proofs.
    * Example: $e_l = e_r$.
    * Recursive generative models; island and higher recursion.
    * Unification
    * Judging lemmas based on non-triviality
    * Backward reasoning, induction, heuristics
* Accumulating and blending knowledge
    * Captured in equation terms giving ways of generating a term; regenerate with fixed points.
    * Learning will be based on these.
* Autonomous dynamics
    * let one target problems, lots of performance tuning.
    * Czech-Slovak Olympiad example.
    * backward reasoning, instantiation, _Skolemization_, negation etc.
* (Future work): Machine learning
    * allows assimilation, reflection, intuition
    * based on structure of proofs, viewed as mathematical objects: not just success/failure or GPT mimics.
