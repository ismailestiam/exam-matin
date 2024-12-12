
// UserDao.java (Étape 1 : DAO)
package com.example.finalexam;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User")
    List<User> getAll();

    @Insert
    void insert(User user);
}
