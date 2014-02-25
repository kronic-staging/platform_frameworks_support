/*
 * Copyright (C) 2014 The Android Open Source Project
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

package android.support.v7.app;

import android.view.Window;

class ActionBarActivityDelegateApi20 extends ActionBarActivityDelegateJBMR2 {

    ActionBarActivityDelegateApi20(ActionBarActivity activity) {
        super(activity);
    }

    @Override
    Window.Callback createWindowCallbackWrapper(Window.Callback cb) {
        return new WindowCallbackWrapperApi20(cb);
    }

    class WindowCallbackWrapperApi20 extends WindowCallbackWrapper {

        WindowCallbackWrapperApi20(Window.Callback wrapped) {
            super(wrapped);
        }

        @Override
        public void onWindowDismissed() {
            mWrapped.onWindowDismissed();
        }

    }

}
