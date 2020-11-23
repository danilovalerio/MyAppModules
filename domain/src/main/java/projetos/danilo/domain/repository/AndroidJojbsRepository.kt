package projetos.danilo.domain.repository

import io.reactivex.Observable
import projetos.danilo.domain.entities.AndroidJob

interface AndroidJojbsRepository {
    fun getJobs(forceUpdate: Boolean) : Observable<List<AndroidJob>>
}