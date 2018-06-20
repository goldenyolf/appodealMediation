package com.intowow.crystalexpress.demo;

import android.app.Activity;
import android.util.Log;

import com.appodeal.ads.InterstitialCallbacks;

class AppodealInterstitialCallbacks implements InterstitialCallbacks {
    private final Activity mActivity;

    AppodealInterstitialCallbacks(Activity activity) {
        mActivity = activity;
    }

    @Override
    public void onInterstitialLoaded(boolean isPrecache) {
        Utils.showToast(mActivity, String.format("onInterstitialLoaded, isPrecache: %s", isPrecache));
    }

    @Override
    public void onInterstitialFailedToLoad() {
        Log.d("TEST","----------onInterstitialFailedToLoad");
        Utils.showToast(mActivity, "onInterstitialFailedToLoad");
    }

    @Override
    public void onInterstitialShown() {
        Utils.showToast(mActivity, "onInterstitialShown");
    }

    @Override
    public void onInterstitialClicked() {
        Utils.showToast(mActivity, "onInterstitialClicked");
    }

    @Override
    public void onInterstitialClosed() {
        Utils.showToast(mActivity, "onInterstitialClosed");
    }
}
