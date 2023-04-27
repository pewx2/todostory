package pewx2.todostory.core.data.network

import pewx2.todostory.core.data.network.dto.TaskDto
import retrofit2.http.GET

interface Api {
    @GET("/tasks")
    suspend fun getTasks() : List<TaskDto>
}