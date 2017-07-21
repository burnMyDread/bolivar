package org.burnmydread.bolivar.pageobjects.shared.manageplugins

import geb.Page

/**
 * Created by zach on 7/19/17.
 */
class RestartWithUpdates extends Page {
    static at = {
        waitFor(60,0.1) { restart_button.present }
    }
    static content = {
        restart_button { $('#scheduleRestartCheckbox') }
    }
}
