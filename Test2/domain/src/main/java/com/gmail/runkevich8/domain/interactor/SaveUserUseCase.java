package com.gmail.runkevich8.domain.interactor;

import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import com.gmail.runkevich8.domain.repository.UserRepository;

import javax.inject.Inject;

import io.reactivex.Completable;



public class SaveUserUseCase extends BaseUseCase{

    private UserRepository userRepository;

    @Inject
    public SaveUserUseCase(PostExecutionThread postExecuteionThread,
                              UserRepository userRepository) {
        super(postExecuteionThread);
        this.userRepository = userRepository;
    }

    //в usecase один публичный метод, если два ,то уже неправильно

    public Completable save (UserEntity userEntity){

        //эти метода решают кто в каком потоке будет запускаться
        return  userRepository
                .save(userEntity)
                .subscribeOn(threadExecuteion)           //в каком потоке выполнится
                .observeOn(postExecuteionThread) ;       // observeOn ---- в каком потоке получить результат

    }
}