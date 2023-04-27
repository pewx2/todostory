package pewx2.todostory.core.data.repository

import kotlinx.coroutines.flow.Flow
import pewx2.todostory.core.data.model.Task

interface TasksRepository {
    fun tasksStream(): Flow<List<Task>>

    suspend fun refreshTasks()
}