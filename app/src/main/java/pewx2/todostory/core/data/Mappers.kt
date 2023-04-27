package pewx2.todostory.core.data

import pewx2.todostory.core.data.db.entity.TaskEntity
import pewx2.todostory.core.data.model.Task
import pewx2.todostory.core.data.network.dto.TaskDto

fun TaskEntity.toModel() = Task(
    id,
    title,
    status,
    createdDateTime,
    updatedDateTime,
    completedDateTime
)

fun TaskDto.toEntity() = TaskEntity(
    id,
    title,
    status,
    createdDateTime,
    updatedDateTime,
    completedDateTime
)