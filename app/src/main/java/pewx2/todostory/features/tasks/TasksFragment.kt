package pewx2.todostory.features.tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import pewx2.todostory.base.BaseFragment
import pewx2.todostory.databinding.FragmentTasksBinding


class TasksFragment : BaseFragment<FragmentTasksBinding>() {
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentTasksBinding.inflate(inflater, container, false)
}