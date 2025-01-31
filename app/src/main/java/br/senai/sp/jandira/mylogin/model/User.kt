package br.senai.sp.jandira.mylogin.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_user")
data class User(
    @PrimaryKey(autoGenerate = true) var id : Long = 0,
    var userName : String = "",
    var phone : String = "",
    var email : String = "",
    var passoword : String = "",
    var isOver18 : Boolean = false
)
