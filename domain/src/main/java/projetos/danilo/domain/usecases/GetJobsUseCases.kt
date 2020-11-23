package projetos.danilo.domain.usecases

import io.reactivex.Observable
import io.reactivex.Scheduler
import projetos.danilo.domain.entities.AndroidJob
import projetos.danilo.domain.repository.AndroidJojbsRepository
import kotlin.properties.ObservableProperty

class GetJobsUseCases (
    private val repository: AndroidJojbsRepository,
    private val scheduler: Scheduler
) {
    fun execute(forceUpdate: Boolean) : Observable<List<AndroidJob>> {
        return repository.getJobs(forceUpdate)
            .subscribeOn(scheduler)
    }
}