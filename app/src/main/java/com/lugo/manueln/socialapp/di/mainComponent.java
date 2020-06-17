package com.lugo.manueln.socialapp.di;

import android.content.Context;

import com.lugo.manueln.socialapp.domain.interactors.postCompleteInteractor.InteractorPostCompleteImpl;
import com.lugo.manueln.socialapp.domain.interactors.postInteractor.PostsInteractorImpl;
import com.lugo.manueln.socialapp.domain.interactors.profileInteractor.ProfileInteractorImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = moduleApi.class)
public interface mainComponent {

    void inject(PostsInteractorImpl postsInteractorImpl);
    void inject(InteractorPostCompleteImpl modulePostComplete);
    void inject(ProfileInteractorImpl profileInteractorImpl);

    Context context();

}