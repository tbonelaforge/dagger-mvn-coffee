package com.tford.coffee;

import dagger.Binds;
import dagger.Module;

@Module
abstract class PumpModule {
    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
