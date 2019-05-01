package com.nilhcem.blenamebadge.ui.main

import android.content.Intent
import android.net.Uri

interface MainNavigator {
    fun setupFabListener(bluetoothPresent: Boolean)

    fun setupPreviewObserver()

    fun inject()

    fun ensureBluetoothEnabled()

    fun startFabAnimation()

    fun endFabAnimation()

    fun setupViewPager()

    fun setupBottomNavigationMenu()

    fun prepareForScan()

    fun importFile(data: Intent?)

    fun showImportDialog(uri: Uri?)

    fun saveImportFile(uri: Uri?)

    fun showOverrideDialog(uri: Uri?)

    fun showAlertDialog(bluetoothDialog: Boolean)

    fun checkManifestPermission()

    fun isBleSupported(): Boolean
}
