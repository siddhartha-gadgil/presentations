package illustrations

import org.scalajs.dom
import org.scalajs.dom._
import scala.scalajs.js

import scala.scalajs.js.annotation._

@JSExportTopLevel("Illustrations")
object Illustrations{
    @JSExport
    def load() : Unit = {
        import mhtml._
        import scala.xml.Node

        val testDiv: Node = <div><em>(plus a computer)</em>
            <p>{ Primes.progressionSizes }</p>
            </div>

        val positionOpt = Option(dom.document.querySelector("#test-div"))
        positionOpt.foreach{(position)=>
          val div = document.createElement("div")
          position.appendChild(div)
          mount(div, testDiv)
      }
    }
}
