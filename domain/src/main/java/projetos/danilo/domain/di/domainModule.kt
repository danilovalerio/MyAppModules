package projetos.danilo.domain.di

import io.reactivex.schedulers.Schedulers
import org.koin.dsl.module.module
import projetos.danilo.domain.usecases.GetJobsUseCases

val useCaseModule = module {

    factory {
        GetJobsUseCases(
            repository = get(),
            scheduler = Schedulers.io()
        )
    }
}

val domainModule = listOf(useCaseModule)