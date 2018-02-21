package tc.meetup

import doodle.core._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object Doodle extends App {

  /**
    * This will create 2^n squares in a row.
    */
  def row(n: Int): Image = {
    n match {
      case 0 => Image.rectangle(30, 30).lineColor(Color.black)
      case _ =>
        val unit = row(n-1)
        unit.beside(unit)
    }
  }

  // Call the implicit draw to draw this image.
  row(4).draw
}
