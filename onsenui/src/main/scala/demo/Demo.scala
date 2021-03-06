package demo

import typings.jquery.{JQueryEventObject, jqueryMod => $}
import typings.onsenui.{onsenuiMod => ons}

import scala.scalajs.js

object Demo {
  def main(args: Array[String]): Unit = {
    /** Note, using `on` with the jquery typings is very frustrating.
      * It'll be fixed eventually, but for now I would copy/paste the facade and delete a bunch of lines to make it simpler
      */
    val f: js.Function1[JQueryEventObject, Unit] = _ => ons.notification.alert("Button is tapped!")

    $("ons-button").on("click", f)
  }
}

