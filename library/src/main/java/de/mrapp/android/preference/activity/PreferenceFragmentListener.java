/*
 * Copyright 2014 - 2017 Michael Rapp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package de.mrapp.android.preference.activity;

import android.app.Fragment;
import android.support.annotation.NonNull;

/**
 * Defines the interface, a class, which should be notified when the currently shown preference
 * fragment of a {@link PreferenceActivity} has been changed, must implement.
 *
 * @author Michael Rapp
 * @since 2.1.1
 */
public interface PreferenceFragmentListener {

    /**
     * The method, which is invoked, when a preference fragment has been shown.
     *
     * @param position
     *         The position of the preference header, the fragment, which has been shown, belongs
     *         to, as an {@link Integer} value
     * @param preferenceHeader
     *         The preference header, the fragment, which has been shown, belongs to, as an instance
     *         of the class {@link PreferenceHeader}
     * @param fragment
     *         The fragment, which has been shown, as an instance of the class {@link Fragment}
     */
    void onPreferenceFragmentShown(int position, @NonNull PreferenceHeader preferenceHeader,
                                   @NonNull Fragment fragment);

    /**
     * The method, which is invoked, when a previously preference fragment has been hidden. This
     * method is only invoked, when the preference headers are shown on a device with a small screen
     * or when all preference headers have been removed.
     */
    void onPreferenceFragmentHidden();

}