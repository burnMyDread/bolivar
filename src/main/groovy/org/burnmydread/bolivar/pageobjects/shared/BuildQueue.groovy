package org.burnmydread.bolivar.pageobjects.shared

import geb.Module

/**
 * Created by zach on 5/21/17.
 */
class BuildQueue extends Module{
    static content = {
        build_queue { $('#buildQueue > div:nth-child(1) > div')}
        collapse_button { $('#buildQueue > div:nth-child(1) > div > a > img')}
    }
}
