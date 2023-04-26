package pewx2.todostory.core.domain

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import pewx2.todostory.core.data.Task

@Dao
interface TasksDao {
    @Query("SELECT * FROM Task")
    fun getAll(): List<Task>

    @Insert
    fun insert(task: Task)

    @Delete
    fun delete(task: Task)
}