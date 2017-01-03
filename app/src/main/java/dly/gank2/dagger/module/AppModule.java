package dly.gank2.dagger.module;
/*
 * Copyright (C) 2016 Johnny Shieh Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dly.gank2.MyApplication;
import dly.gank2.RxFlux;
import dly.gank2.action.SubscriptionManager;
import dly.gank2.dispatcher.Dispatcher;

/**
 * description
 *
 * @author Johnny Shieh (JohnnyShieh17@gmail.com)
 * @version 1.0
 */
@Module
public class AppModule {

    private final MyApplication mApplication;
    private final RxFlux mRxFlux;

    public AppModule(MyApplication application) {
        mApplication = application;
        mRxFlux = RxFlux.init(mApplication);
    }

    @Provides
    @Singleton
    Context provideAppContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    Dispatcher provideDispatcher() {
        return mRxFlux.getDispatcher();
    }

    @Provides
    @Singleton
    SubscriptionManager provideSubscriptManager() {
        return mRxFlux.getSubscriptionManager();
    }

}
