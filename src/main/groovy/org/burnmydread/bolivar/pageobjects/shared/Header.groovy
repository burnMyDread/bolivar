package org.burnmydread.bolivar.pageobjects.shared

import geb.Module

/**
 * Created by zach on 5/21/17.
 */
class Header extends Module {
    static content = {
        bread_crum_trail { $'#breadcrumbs > li.item > a'}
        jenkins_home { $('#jenkins-home-link')}
        active_alerts { $('#visible-am-button')}
        search { $('#search-box')}
        search_help { $('#search-box')}
        user_profile { $('#header > div.login > span > a.model-link.inside.inverse > b')}
        log_out { $('#header > div.login > span > a:nth-child(2) > b')}
    }
}
