package illustrations

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.annotation.JSExportTopLevel

@js.native
trait SpeechSynthesisVoice extends js.Object {
  val voiceURI: String = js.native
}

@js.native
@JSGlobal("SpeechSynthesisUtterance")
class SpeechSynthesisUtterance(var text: String) extends js.Object {
  var voice: SpeechSynthesisVoice = js.native
  var lang: String = js.native
}

@js.native
@JSGlobal("speechSynthesis")
object SpeechSynthesis extends js.Object {
  def speak(msg: SpeechSynthesisUtterance): Unit = js.native
  def getVoices(): js.Array[SpeechSynthesisVoice] = js.native
}

@JSExportTopLevel("Invariance")
object InvarianceSpeech{
    @JSExport
    def load() = {
        val msg = new SpeechSynthesisUtterance("conjugacy invariance and homogeneity")
        msg.lang = "en-GB"
        SpeechSynthesis.speak(msg)       
    }
}