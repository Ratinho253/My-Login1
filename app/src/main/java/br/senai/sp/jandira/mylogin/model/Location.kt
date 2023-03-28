package br.senai.sp.jandira.mylogin.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.Year

data class Location(
    var id : Int = 0,
    var image : Painter? = null,
    var name : String = "",
//    var year : Year = Year.now(),
    var year : String = "" ,
    var description : String = "",
    var data_start_final : String = ""
) {

}