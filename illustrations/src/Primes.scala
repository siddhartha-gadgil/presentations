package illustrations
import scala.scalajs.js.annotation.JSExportTopLevel
import scala.scalajs.js.annotation.JSExport
import scala.concurrent._


@JSExportTopLevel("Primes")
object Primes{
    def recSieve(remaining: List[Int], accum: Vector[Int]) : Vector[Int] = 
        remaining match {
            case Nil => accum
            case head :: tl => recSieve(tl.filterNot(_ % head == 0), accum :+ head)
        }

    @JSExport
    def sieve(n: Int): Vector[Int] = recSieve((2 to n).toList, Vector())

    def ap(first: Int, second: Int): Stream[Int] = Stream.from(0).map{j => first + (j * (second - first))}

    val pc = new Primes(100000)

    lazy val progressions =  pc.primeArithmeticProgressions.take(1000000).groupBy(_.size)

    @JSExport
    lazy val progressionSizes = progressions.mapValues(_.size).toArray.sortBy(_._1).map(_._2).mkString(", ")

    def primeLI(n: Int) = 
       if (pc.primeSet.contains(n)) s"""<li class="prime">$n</li>""" else s"<li>$n</li>" 
    
    def primesBetween(n: Int, m: Int): String = (n to m).toVector.map(primeLI(_)).mkString(" ")

    def twinPrime(n: Int) = pc.primeSet.contains(n) && (pc.primeSet.intersect(Set(n -2, n + 2)).nonEmpty)

    def twinPrimeLI(n: Int) = 
       if (twinPrime(n)) s"""<li class="twin-prime">$n</li>""" else s"<li>$n</li>" 

    def twinPrimesBetween(n: Int, m: Int): String = (n to m).toVector.map(twinPrimeLI(_)).mkString(" ")

}

class Primes(val max: Int){
    lazy val primeVec : Vector[Int] = Primes.sieve(max)

    lazy val primeSet : Set[Int ]= primeVec.toSet

    lazy val primes : Stream[Int] = primeVec.toStream

    lazy val twinPrimes : Stream[(Int, Int)] = 
        primes.filter(p => primeSet.contains(p + 2)).map(p => (p, p + 2))
    
    def primeAp(first: Int, second: Int): Vector[Int] = Primes.ap(first, second).takeWhile(primeSet.contains(_)).toVector

    lazy val primeArithmeticProgressions : Stream[Vector[Int]] = 
        primes.flatMap(y =>
            primes.takeWhile(_ < y).map(x => primeAp(x, y))
            ) 

}