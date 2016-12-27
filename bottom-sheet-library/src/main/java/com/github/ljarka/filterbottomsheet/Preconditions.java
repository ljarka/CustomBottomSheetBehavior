package com.github.ljarka.filterbottomsheet;

import android.support.annotation.NonNull;

final class Preconditions {

    @NonNull
    static <T> T checkNotNull(@NonNull T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    private Preconditions() {
    }
}
