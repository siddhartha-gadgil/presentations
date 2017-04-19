```scala
import shapeless._
import TLImplicits._
val A = "A" :: Type
  val B = "B" :: Type
val f = "f" :: A ->: B
val a = "a" :: A
f(a).typ
Type
Type.Type
Type.typ
Type.typ.typ
val idA = a :-> a
val a1 = "a1" :: A
idA(a1)
val id = A :~> idA
id(B).typ
id(A).typ
f(a1).typ
id.typ
id.typ.fansi
val b = "b" :: B
val constAB = a :-> (b :-> a)
constAB.typ
val mpAB = a :-> (f :-> f(a))
mpAB.typ.fansi
val mp = A :~> (B :~> (a :-> (f :-> f(a))))
mp(B)(A).typ.fansi
idA.typ.fansi
mpAB.typ.fansi
constAB.typ.fansi

  val Bool = "Boolean" :: Type
  val BoolInd = ("true" ::: Bool) |: ("false" ::: Bool) =: Bool
val tt :: ff :: HNil = BoolInd.intros
  val recBoolBool = BoolInd.rec(Bool)
val not = recBoolBool(ff)(tt)
not(tt)
not(tt) == ff
val Nat = "Nat" :: Type
  val NatInd = ("0" ::: Nat) |: ("succ" ::: Nat -->>: Nat) =: Nat
  val zero :: succ :: HNil = NatInd.intros
val recNN = NatInd.rec(Nat)
  val n = "n" :: Nat
  val m = "m" :: Nat
val double = recNN(zero)(m :-> (n :-> (succ(succ(n)))))
val N = Stream.iterate(zero)(succ)
N map (_.fansi)
double(N(5)) == N(10)
double(N(5)).fansi
double(succ(m)) == succ(succ(double(m)))

val recNNN = NatInd.rec(Nat ->: Nat)
val addn = "add(n)" :: Nat ->: Nat
val add = recNNN(m :-> m)(n :-> (addn :-> (m :-> succ(addn(m)) )))
add(N(2))(N(3)).fansi

val recNNNN = NatInd.rec(Nat ->: Nat ->: Nat)
add(succ(n))(m)
add(succ(n))(m).fansi

    val ackmp1n = "ack(m+1)(n)" :: Nat
    val ackm = "ack(m)" :: Nat ->: Nat
    val ack = recNNN(succ)(
      m :-> (ackm :-> recNN(ackm(one))(n :-> (ackmp1n :-> (ackm(ackmp1n))))))
    val ack = recNNN(succ)(
      m :-> (ackm :-> recNN(ackm(N(1)))(n :-> (ackmp1n :-> (ackm(ackmp1n))))))
ack(N(3))(N(1)) == N(13)

val isEven = "isEven" :: Nat ->: Type
val zeroEven = "0even" :: isEven(zero)
val plusTwoEven = "_+2even" :: (n ~>: (isEven(n) ->: isEven(succ(succ(n)))))
val TwoEven = plusTwoEven(zero)(zeroEven) !: isEven(N(2))
TwoEven.fansi
val thmDoubleEven = n ~>: isEven(double(n))
val inducDoubleEven = NatInd.induc(n :-> isEven(double(n)))
val pfDoubleEven =
  inducDoubleEven(
    zeroEven){
      n :~> (
        hyp :-> (
          plusTwoEven(double(n))(hyp)
          )
          )
    }  !: thmDoubleEven
val hyp = "isEven(double(n))" :: isEven(double(n))
val pfDoubleEven =
  inducDoubleEven(
    zeroEven){
      n :~> (
        hyp :-> (
          plusTwoEven(double(n))(hyp)
          )
          )
    }  !: thmDoubleEven
pfDoubleEven.fansi
val AorB = A || B
AorB.incl1(a) !: AorB
AorB.incl2(b) !: AorB
val usef = AorB.rec(B)(f)(id(B))
usef.typ.fansi
val succEven = n :-> (isEven(n) || isEven(succ(n)))
val thmSuccEven = n ~>: (succEven(n))
val inducSuccEven = NatInd.induc(succEven)
val hyp1 = "n-is-Even" :: isEven(n)
val hyp2 = "(n+1)-is-Even" :: isEven(succ(n))
val base = succEven(zero).incl1(zeroEven) !: succEven(zero)
val step = (succEven(n).rec(succEven(succ(n)))){hyp1 :-> (succEven(succ(n)).incl2(plusTwoEven(n)(hyp1)))}{hyp2 :-> (succEven(succ(n)).incl1((hyp2)))}
step.typ.fansi
val pfSuccEven = inducSuccEven(base)(n :~> step) !: thmSuccEven
```
