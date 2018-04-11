package com.gmail.runkevich8.domain.interactor;

import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import com.gmail.runkevich8.domain.repository.UserRepository;

import javax.inject.Inject;

import io.reactivex.Completable;



public class RemoveUserUseCase extends BaseUseCase{

    private UserRepository userRepository;

    @Inject
    public RemoveUserUseCase(PostExecutionThread postExecuteionThread,
                           UserRepository userRepository) {
        super(postExecuteionThread);
        this.userRepository = userRepository;
    }

    //в usecase один публичный метод, если два ,то уже неправильно

    public Completable remove (String id){

        //эти метода решают кто в каком потоке будет запускаться
        return  userRepository
                .remove(id)
                .subscribeOn(threadExecuteion)           //в каком потоке выполнится
                .observeOn(postExecuteionThread) ;       // observeOn ---- в каком потоке получить результат

    }
}