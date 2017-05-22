package org.burnmydread.bolivar.pageobjects.shared

import geb.Module

/**
 * Created by zach on 5/21/17.
 */
class CurentBuildsInQueue extends Module {
    int buildNumber
    static content = {
        build { $("#executors > div.row.pane-content > table > tbody > tr:nth-child(${ buildNumber + 1})") }
    }
}
