package pewx2.todostory.core.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import pewx2.todostory.core.data.db.dao.TasksDao
import pewx2.todostory.core.data.db.entity.TaskEntity
import pewx2.todostory.core.data.model.Task
import pewx2.todostory.core.data.network.Api
import pewx2.todostory.core.data.toEntity
import pewx2.todostory.core.data.toModel
import javax.inject.Inject

class TasksRepositoryImpl @Inject constructor(
    private val tasksDao: TasksDao,
    private val api: Api,
) : TasksRepository {
    override fun tasksStream(): Flow<List<Task>> =
        tasksDao.getAllFlow().map { it.map(TaskEntity::toModel) }

    override suspend fun refreshTasks() {
        val tasks = api.getTasks()
        tasksDao.insert(tasks.map { it.toEntity() })
    }
}