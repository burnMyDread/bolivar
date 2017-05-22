package org.burnmydread.bolivar.pageobjects.shared

import geb.Module

/**
 * TODO Make this parameterize the number of executors
 */
class BuildExecutors extends Module {
    static content = {
        status  { $('#executors > div:nth-child(1) > div > a:nth-child(2)')}
    }
}
