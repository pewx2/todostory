package pewx2.todostory.core.data.network.dto

import pewx2.todostory.core.UUID
import pewx2.todostory.core.data.db.entity.TaskStatus
import java.time.Instant

/**
 * Model for network
 */
data class TaskDto(
    val id: UUID,
    val title: String,
    val status: TaskStatus,
    val createdDateTime: Instant,
    val updatedDateTime: Instant?,
    val completedDateTime: Instant?,
)
