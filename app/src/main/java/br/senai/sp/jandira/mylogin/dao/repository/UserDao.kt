package br.senai.sp.jandira.mylogin.dao.repository

import androidx.room.*
import br.senai.sp.jandira.mylogin.model.User


@Dao
interface UserDao {

    @Insert
    fun save(user: User): Long

    @Update
    fun uptade(user: User): Int

    @Delete
    fun delete(user: User): Int

    @Query("SELECT * from tbl_user WHERE email = :email " )
    fun findUserByEmail(email:String): User
}