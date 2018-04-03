package com.gmail.runkevich8.domain.interactor;


import com.gmail.runkevich8.domain.entity.UserEntity;
import com.gmail.runkevich8.domain.executor.PostExecutionThread;
import com.gmail.runkevich8.domain.repository.UserRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class GetUserListUseCase extends BaseUseCase {
    private UserRepository userProfileRepository;

    @Inject
    public GetUserListUseCase(PostExecutionThread postExecutionThread, UserRepository userProfileRepository) {
        super(postExecutionThread);
        this.userProfileRepository = userProfileRepository;
    }

    public Observable<List<UserEntity>> getListUsers() {
        return userProfileRepository.getList()
                .subscribeOn(threadExecuteion)
                .observeOn(postExecuteionThread);
    }
}