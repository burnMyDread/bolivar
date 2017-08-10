package org.burnmydread.bolivar.tests.setup

import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import org.burnmydread.bolivar.pageobjects.Login
import org.burnmydread.bolivar.pageobjects.cjoc.BuildAnalytics
import org.burnmydread.bolivar.pageobjects.cjoc.MastersTab
import org.burnmydread.bolivar.pageobjects.shared.ManageJenkins
import org.burnmydread.bolivar.pageobjects.shared.manageplugins.AdvancedPlugins
import org.burnmydread.bolivar.pageobjects.shared.manageplugins.AvaliblePlugins
import org.burnmydread.bolivar.pageobjects.shared.manageplugins.RestartWithUpdates
import org.burnmydread.bolivar.pageobjects.shared.manageplugins.UpdatePlugins

/**
 * Created by zach on 7/19/17.
 */
class InstallPlugins extends GebReportingSpec {

    def blueSteelPlugins() {
        when:
            to Login
        then:
            at Login
        when:
            username_textbox = Login.correct_username
            password_textbox = Login.correct_password
            login_button.click()
        then:
            at MastersTab
        when:
            side_bar.manage_jenkins.click()
        then:
            at ManageJenkins
        when:
            manage_plugins.click()
        then:
            at UpdatePlugins
        when:
            avalible_tab.click()
        then:
            at AvaliblePlugins
        when:
            filter = 'Experience'
            report 'plugins avalible'
            blue_steel_plugin.click()
            install_w_restart.click()
        then:
            at RestartWithUpdates
        when:
            restart_button.click()
            report 'after restart'
            sleep( 60000)
            to Login
        then:
            at Login
        when:
            username_textbox = Login.correct_username
            password_textbox = Login.correct_password
            login_button.click()
        then:
            report 'post login'
            at BuildAnalytics
        when:
            tabs.masters.click()
        then:
            at MastersTab
            report 'masters tab'
            assert side_bar.blue_ocean.present
    }
}
