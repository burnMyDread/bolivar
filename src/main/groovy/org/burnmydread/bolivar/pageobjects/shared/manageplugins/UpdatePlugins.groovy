package org.burnmydread.bolivar.pageobjects.shared.manageplugins

import geb.Page
import org.burnmydread.bolivar.pageobjects.shared.Header

/**
 * Created by zach on 7/19/17.
 */
class UpdatePlugins extends Page {
    static at = {
        //wait for all the items in the header
        waitFor(60,0.1) { header.bread_crum_trail.present }
        waitFor(10,0.01) { header.jenkins_home.present }
        //waitFor(10,0.01) { header.active_alerts.present }
        waitFor(10,0.01) { header.search.present }
        waitFor(10,0.01) { header.search_help.present }
        waitFor(10,0.01) { header.user_profile.present }
        waitFor(10,0.01) { header.log_out.present }

        waitFor(60,0.1) { back_to_dashboard.present }
        waitFor(10,0.01) { manage_jenkins.present }
        waitFor(10,0.01) { update_center.present }
        waitFor(60,0.1) { updates_tab.present }
        waitFor(10,0.01) { avalible_tab.present }
        waitFor(10,0.01) { installed_tab.present }
        waitFor(10,0.01) { advanced_tab.present }
        waitFor(10,0.01) { update_information.present }
        waitFor(10,0.01) { check_now.present }
        waitFor(10,0.01) { description.present }
    }
    static content = {
        header { module Header }
        back_to_dashboard { $('#tasks > div:nth-child(1) > a.task-link') }
        manage_jenkins { $('#tasks > div:nth-child(2) > a.task-link') }
        update_center { $('#tasks > div:nth-child(3) > a.task-link') }
        updates_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div.tab.active ') }
        avalible_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div:nth-child(2)') }
        installed_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div:nth-child(3)') }
        advanced_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div:nth-child(4)') }
        update_information { $('#bottom-sticker > div.bottom-sticker-inner') }
        check_now { $('#bottom-sticker > div.bottom-sticker-inner > a > button') }
        description { $('#main-panel > form > div:nth-child(5)') }
    }
}
