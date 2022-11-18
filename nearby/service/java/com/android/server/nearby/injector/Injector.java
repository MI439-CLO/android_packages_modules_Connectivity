/*
 * Copyright (C) 2021 The Android Open Source Project
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

package com.android.server.nearby.injector;

import android.app.AppOpsManager;
import android.bluetooth.BluetoothAdapter;
import android.hardware.location.ContextHubManager;

/**
 * Nearby dependency injector. To be used for accessing various Nearby class instances and as a
 * handle for mock injection.
 */
public interface Injector {

    /** Get the BluetoothAdapter for BleDiscoveryProvider to scan. */
    BluetoothAdapter getBluetoothAdapter();

    /** Get the ContextHubManagerAdapter for ChreDiscoveryProvider to scan. */
    ContextHubManager getContextHubManager();

    /** Get the AppOpsManager to control access. */
    AppOpsManager getAppOpsManager();
}
