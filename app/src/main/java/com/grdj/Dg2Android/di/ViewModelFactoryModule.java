package com.grdj.Dg2Android.di;

import androidx.lifecycle.ViewModelProvider;

import com.grdj.Dg2Android.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}
