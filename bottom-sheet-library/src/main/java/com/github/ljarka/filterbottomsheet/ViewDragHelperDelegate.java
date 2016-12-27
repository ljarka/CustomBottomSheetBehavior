package com.github.ljarka.filterbottomsheet;

import android.support.annotation.NonNull;
import android.view.MotionEvent;

interface ViewDragHelperDelegate {

    void ifEmpty(@NonNull Runnable runnable);

    boolean shouldInterceptTouchEvent(MotionEvent event);

    void processTouchEvent(MotionEvent event);

    float getTouchSlop();

    void captureChildView(BottomSheetView child, int pointerId);

    boolean smoothSlideViewTo(BottomSheetView child, int left, int top);

    boolean settleCapturedViewAt(int left, int top);

    boolean continueSettling(boolean deferCallbacks);
}
