package org.burnmydread.bolivar.pageobjects.shared

import geb.Module

/**
 * Created by zach on 5/21/17.
 */
class SideBar extends Module{
    static content = {
        new_item { $("#tasks > div:nth-child(1) > a.task-link") }
        people { $("#tasks > div:nth-child(2) > a.task-link")}
        build_history { $('#tasks > div:nth-child(3) > a.task-link')}
        edit_view { $('#tasks > div:nth-child(4) > a.task-link')}
        manage_jenkins { $('#tasks > div:nth-child(5) > a.task-link')}
        alets { $('#tasks > div:nth-child(6) > a.task-link')}
        support { $('#tasks > div:nth-child(7) > a.task-link')}
        analytics_dashboard { $('#tasks > div:nth-child(8) > a.task-link')}
        my_views { $('#tasks > div:nth-child(9) > a.task-link')}
        blue_ocean { $('#tasks > div:nth-child(10) > a.task-link')}
        credentials { $('#tasks > div:nth-child(11) > a.task-link')}
        cluster_operations { $('#tasks > div:nth-child(12) > a.task-link')}
    }
}
