package pewx2.todostory.core.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
import pewx2.todostory.core.data.db.entity.TaskEntity

@Dao
interface TasksDao {
    @Query("SELECT * FROM TaskEntity")
    fun getAllFlow(): Flow<List<TaskEntity>>

    @Insert
    fun create(task: TaskEntity)

    @Delete
    fun delete(task: TaskEntity)

    @Upsert
    fun insert(tasks: Collection<TaskEntity>)
}