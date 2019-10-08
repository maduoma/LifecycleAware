package com.dodemy.android.lifecycleaware

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MainActivityObserver: DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        //super.onCreate(owner)
        Log.i(TAG, "Observer ON_CREATE")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.i(TAG, "Observer ON_RESUME")
        //super.onResume(owner)
    }

    override fun onPause(owner: LifecycleOwner) {
        //super.onPause(owner)

    }

    override fun onStart(owner: LifecycleOwner) {
        //super.onStart(owner)
    }

    override fun onStop(owner: LifecycleOwner) {
        //super.onStop(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        //super.onDestroy(owner)
    }

    companion object{
        private val TAG: String = MainActivityObserver::class.java.simpleName
    }
}