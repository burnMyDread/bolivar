package org.burnmydread.bolivar.pageobjects.shared.manageplugins

import geb.Page
import org.burnmydread.bolivar.pageobjects.shared.Header

/**
 * Created by zach on 7/19/17.
 */
class AdvancedPlugins extends Page {
    static at = {
        //wait for all the items in the header
        waitFor(60,0.1) { header.bread_crum_trail.present }
        waitFor(10,0.01) { header.jenkins_home.present }
        //waitFor(10,0.01) { header.active_alerts.present }
        waitFor(10,0.01) { header.search.present }
        waitFor(10,0.01) { header.search_help.present }
        waitFor(10,0.01) { header.user_profile.present }
        waitFor(10,0.01) { header.log_out.present }
        //Left side options
        waitFor(60,0.1) { back_to_dashboard.present }
        waitFor(10,0.01) { manage_jenkins.present }
        waitFor(10,0.01) { update_center.present }
        //plugins tabs
        waitFor(10,0.01) { updates_tab.present }
        waitFor(10,0.01) { avalible_tab.present }
        waitFor(10,0.01) { installed_tab.present }
        waitFor(10,0.01) { advanced_tab.present }


    }
    static content = {
        header { module Header }

        back_to_dashboard { $('#tasks > div:nth-child(1) > a.task-link') }
        manage_jenkins { $('#tasks > div:nth-child(2) > a.task-link') }
        update_center { $('#tasks > div:nth-child(3) > a.task-link') }

        updates_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div.tab.active > a') }
        avalible_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div:nth-child(2) > a') }
        installed_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div:nth-child(3) > a') }
        advanced_tab { $('#main-panel > form > div.tabBarFrame > div.tabBar > div:nth-child(4) > a') }

        //http proxy details
        proxy_label { $('#pluginsAdv > tbody > tr > td > h1:nth-child(1)') }
        proxy_server { $('#pluginsAdv > tbody > tr > td > form:nth-child(2) > table > tbody > tr:nth-child(1) > td.setting-main > input') }
        proxy_port { $('#pluginsAdv > tbody > tr > td > form:nth-child(2) > table > tbody > tr:nth-child(4) > td.setting-main > input') }
        proxy_username { $('#pluginsAdv > tbody > tr > td > form:nth-child(2) > table > tbody > tr:nth-child(7) > td.setting-main > input') }
        proxy_password { $('#pluginsAdv > tbody > tr > td > form:nth-child(2) > table > tbody > tr:nth-child(10) > td.setting-main > input') }
        no_proxy_host { $('#pluginsAdv > tbody > tr > td > form:nth-child(2) > table > tbody > tr:nth-child(12) > td.setting-main > textarea') }
        submit_proxy { $('#yui-gen2-button') }

        //upload plugin
        upload_plugin_label { $('#pluginsAdv > tbody > tr > td > h1:nth-child(3)') }
        upload_instructions { $('#pluginsAdv > tbody > tr > td > form:nth-child(4) > table > tbody > tr:nth-child(1) > td > div') }
        upload_file { $('#pluginsAdv > tbody > tr > td > form:nth-child(4) > table > tbody > tr:nth-child(2) > td > input') }
        submit_upload { $('#yui-gen3-button') }

        //Update site
        update_site_label { $('#pluginsAdv > tbody > tr > td > h1:nth-child(5)') }
        update_url { $('#pluginsAdv > tbody > tr > td > form:nth-child(6) > table > tbody > tr:nth-child(1) > td.setting-main > input') }
        update_submit { $('#yui-gen4-button') }
        other_sites { $('#pluginsAdv > tbody > tr > td > h2') }

        //misc
        check_now { $('#main-panel > div:nth-child(4) > a > button') }
    }
}
