package org.burnmydread.bolivar.pageobjects.bluesteel

import geb.Module

/**
 * Created by zach on 8/11/17.
 */
class Team extends Module {
    String name
    static content = {
        team { $("#job_$name") }
        manage { $("#job_$name > td:nth-child(4) > a > img")}
        link_to_master { $("#job_$name > td:nth-child(3) > a")}
        master_version { $("#job_$name > td:nth-child(8)") }
    }
}
